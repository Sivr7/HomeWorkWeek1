package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 14) Определить, является ли шестизначное число "счастливым" (сумма
 первых трех цифр равна сумме последних трех цифр).
 */
public class _14_lucky_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 6-digit number:");
        int yourNumber = sc.nextInt();

        if(yourNumber < 1000000 && yourNumber > 99000){

            int firstHalf, secondHalf;
            firstHalf = yourNumber / 1000;
            secondHalf = yourNumber % 1000;

            int n1, n2, n3, n4, n5, n6;

            n1 = firstHalf / 100;
            n2 = (firstHalf / 10) % 10;
            n3 = firstHalf % 10;

            n4 = secondHalf / 100;
            n5 = (secondHalf / 10) % 10;
            n6 = secondHalf % 10;

            if(n1 + n2 + n3 == n4 + n5 + n6){
                System.out.println("You have a LUCKY number!!!");
            } else {
                System.out.println("NOT lucky! Try more!");
            }


        } else {
            System.out.println("This is NOT a 6-digit number!");
        }
    }
}
