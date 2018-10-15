package com.company;

public class ComparableRectangle extends Rectangle implements IComparable<ComparableRectangle>{

    ComparableRectangle(){}

    ComparableRectangle(double width, double length){
        super(width, length);
    }

    ComparableRectangle(double width, double length, String color, boolean fiiled){
        super(width, length, color, fiiled);
    }

    @Override
    public int compareTo(ComparableRectangle comparableRectangle) {
        if(this.getArea() > comparableRectangle.getArea()){
            return 2;
        }
        return 1;
    }
}
