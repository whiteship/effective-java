package me.whiteship.chapter02.item14;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

// 코드 14-1 객체 참조 필드가 하나뿐인 비교자 (90쪽)
public final class CaseInsensitiveString
        implements Comparable<CaseInsensitiveString> {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // 수정된 equals 메서드 (56쪽)
    @Override public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    @Override public int hashCode() {
        return s.hashCode();
    }

    @Override public String toString() {
        return s;
    }

    // 자바가 제공하는 비교자를 사용해 클래스를 비교한다.
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }

    public static void main(String[] args) {
        Set<CaseInsensitiveString> s = new TreeSet<>();
        for (String arg : args)
            s.add(new CaseInsensitiveString(arg));
        System.out.println(s);
    }
}
