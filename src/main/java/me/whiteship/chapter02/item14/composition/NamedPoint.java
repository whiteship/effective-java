package me.whiteship.chapter02.item14.composition;

public class NamedPoint implements Comparable<NamedPoint> {

    private final Point point;
    private final String name;

    public NamedPoint(Point point, String name) {
        this.point = point;
        this.name = name;
    }

    public Point getPoint() {
        return this.point;
    }

    @Override
    public int compareTo(NamedPoint namedPoint) {
        int result = this.point.compareTo(namedPoint.point);
        if (result == 0) {
            result = this.name.compareTo(namedPoint.name);
        }
        return result;
    }
}
