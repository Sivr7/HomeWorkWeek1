package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 времени года. Если пользователь введет недопустимое число, программа
 должна выдать сообщение об ошибке.

 */
public class _7_season {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter here number of the month:");

        byte month = sc.nextByte();

        if(month > 0 && month < 13){
            if(month > 11 || month < 3) {
                System.out.println("This is winter.");
            } else if(month > 8){
                System.out.println("This is fall.");
            } else if(month > 5) {
                System.out.println("This is summer.");
            } else {
                System.out.println("This is spring.");
            }
        } else {
            System.out.println("invalid number!");
        }

    }
}
