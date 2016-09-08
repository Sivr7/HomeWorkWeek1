package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
 квадрат; б) уместится ли квадрат в круге.
 */
public class _15_square_circle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter area of the square:");
        int squareArea = sc.nextInt();

        System.out.println("Enter area of the circle:");
        int circleArea = sc.nextInt();

        if(circleArea > squareArea * Math.PI / 2){
            System.out.println("This square is going to fit into this circle.");
        } else {
            System.out.println("This square is NOT going to fit into this circle.");
        }

        if(circleArea * Math.PI / 4 < squareArea){
            System.out.println("This circle is going to fit into this square.");
        } else {
            System.out.println("This circle is NOT going to fit into this square.");
        }

    }
}
