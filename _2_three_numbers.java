package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.
 */
public class _2_three_numbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Please enter a:");
        a = sc.nextInt();
        if(a > 0){
            System.out.println("a ^ 3 = " + a*a*a);
        } else {
            System.out.println("Your number is < or = 0, therefore we assign it a value of " + a*0);
        }

        System.out.println("Please enter b:");
        b = sc.nextInt();
        if(b > 0){
            System.out.println("b ^ 3 = " + b*b*b);
        } else {
            System.out.println("Your number is < or = 0, therefore we assign it a value of " + b*0);
        }

        System.out.println("Please enter c:");
        c = sc.nextInt();
        if(c > 0){
            System.out.println("c ^ 3 = " + c*c*c);
        } else {
            System.out.println("Your number is < or = 0, therefore we assign it a value of " + c*0);
        }





    }
}
