package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 * перевірка: 100 км/год => 27-28 m/sec
 *
 * 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
 ду. Какая из них больше?
 */
public class _4_two_speed {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a,b;

        System.out.println("Enter velocity value in kilometers per hour:");
        a = sc.nextInt();
        System.out.println(a + "km/h");

        System.out.println("Enter velocity value in meters per second:");
        b = sc.nextInt();
        System.out.println(b + "m/sec");

        if(a * 1000 > b * 3600) {
            System.out.println(a + " km/h is faster.");
        } else if (a * 1000 < b * 3600) {
            System.out.println(b + " m/sec is faster.");
        } else {
            System.out.println(a + " km/h and " + b + " m/sec are equal.");
        }



    }
}
