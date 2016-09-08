package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
 пара равных
 */
public class _5_two_pair {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b || a == c || b == c) {
            System.out.println("YES. At least 2 numbers are equal.");
        } else {
            System.out.println("NO equal numbers.");
        }






    }
}
