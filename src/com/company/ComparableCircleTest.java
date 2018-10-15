package com.company;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args){
        ComparableCircle[] list = new ComparableCircle[3];
        list[0] = new ComparableCircle(4);
        list[1] = new ComparableCircle();
        list[2] = new ComparableCircle(3);

        for(int i = 0; i <  list.length-1; i++){
            if(list[i].compareTo(list[i+1])==2){
                ComparableCircle temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
            }

        }

        for(ComparableCircle i : list){
            System.out.println(i.getArea());
        }

        double[] circles = new double[3];
        circles[0] = new ComparableCircle().getArea();
        circles[1] = new ComparableCircle(4).getArea();
        circles[2] = new ComparableCircle(3).getArea();

        Arrays.sort(circles);

        for(double comparableCircle : circles){
            System.out.println(comparableCircle);
        }
    }
}
