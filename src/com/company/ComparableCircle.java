package com.company;
public class ComparableCircle extends Circle implements IComparable<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        if(this.getArea() > comparableCircle.getArea()){
            return 2;
        }
        return 1;
    }
}
