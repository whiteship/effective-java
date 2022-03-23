package me.whiteship.chapter02.item11.guava;

import com.google.common.hash.Funnel;
import com.google.common.hash.Hashing;
import com.google.common.hash.PrimitiveSink;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

// equals를 재정의하면 hashCode로 재정의해야 함을 보여준다. (70-71쪽)
public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix   = rangeCheck(prefix,   999, "prefix");
        this.lineNum  = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        return Hashing.goodFastHash(32)
                .hashObject(this, PhoneNumberFunnel.INSTANCE)
                .hashCode();
    }

    private static class PhoneNumberFunnel implements Funnel<PhoneNumber> {

        private static final PhoneNumberFunnel INSTANCE = new PhoneNumberFunnel();

        @Override
        public void funnel(PhoneNumber from, PrimitiveSink into) {
            into.putShort(from.areaCode).putShort(from.prefix).putShort(from.lineNum);
        }
    }

}
