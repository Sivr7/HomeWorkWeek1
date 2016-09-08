package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
 одинаковые; б) есть ли среди его цифр одинаковые.
 */
public class _3_three_digit_number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int wholeNumber;

        System.out.println("Please enter your 3-digit number here: ");

        wholeNumber = sc.nextInt();

        if(wholeNumber > 99 && wholeNumber < 1000){
            int a,b,c;
            a = wholeNumber / 100;
            b = (wholeNumber / 10) % 10;
            c = wholeNumber % 10;

            if(a == b && b == c){
                System.out.println("Yes. All digits are the same!.");
            } else if(a == b || a == c || b == c ) {
                System.out.println("At least two digits are the same!");
            } else {
                System.out.println("There are NO repeating digits!");
            }

        } else {
            System.out.println("Your number is invalid!");
        }




    }
}
