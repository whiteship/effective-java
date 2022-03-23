package me.whiteship.chapter02.item10.autovalue;

import com.google.auto.value.AutoValue;

/**
 * AutoValue 참고
 *
 * https://github.com/google/auto/blob/master/value/userguide/index.md
 */
@AutoValue
abstract class Point {
    static Point create(int x, int y) {
        return new AutoValue_Point(x, y);
    }

    abstract int x();
    abstract int y();
}
