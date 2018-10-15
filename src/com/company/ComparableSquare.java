package com.company;

public class ComparableSquare extends Square implements IComparable<ComparableSquare>{

    public ComparableSquare() {
    }

    public ComparableSquare(double side) {
        super(side);
    }

    public ComparableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public int compareTo(ComparableSquare comparableSquare) {
        if(this.getArea() > comparableSquare.getArea()){
            return 2;
        }
        return 1;
    }
}
