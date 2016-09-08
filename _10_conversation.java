package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 10) Написать программу вычисления стоимости переговоров, если по суббо-
 там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
 ность разговора и день недели (цифра от 1 до 7).
 */
public class _10_conversation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("State the conversation price per hour:");
        double conversationHrPrice = sc.nextDouble();

        System.out.println("State the conversation length in hours:");
        int conversationHrLength = sc.nextInt();

        System.out.println("Enter the day of the week (1-7):");
        byte dayOfWeek = sc.nextByte();

        double finalPrice;
        double discount = 20;

        if(dayOfWeek > 5){
            finalPrice = conversationHrPrice * conversationHrLength * (1 - discount / 100);
            System.out.println("Checkout:" + finalPrice);
        } else {
            finalPrice = conversationHrPrice * conversationHrLength;
            System.out.println("Checkout:" + finalPrice);
        }

    }
}
