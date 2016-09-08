package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 * !!! додати перевірку значень і повідомлення про правильне значення!!!
 *
 * 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */
public class _1_right_triangle {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Please enter side a:");
        a = sc.nextInt();

        System.out.println("Please enter side b:");
        b = sc.nextInt();

        System.out.println("Please enter side c:");
        c = sc.nextInt();

        if (a * a == b * b + c * c
                || b * b == a * a + c * c
                || c * c == b * b + a * a){
            System.out.println("This is a right triangle!");
        } else {
            System.out.println("This is NOT a right triangle!");
        }



    }

}
