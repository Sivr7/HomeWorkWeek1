package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 тавляется, если сумма покупки превышает 1000 гривен.
 */
public class _8_discount {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter final cheque:");
        double cheque = sc.nextInt();

        if(cheque > 1000){
            cheque *= 0.9;
            System.out.println(cheque);
        } else {
            System.out.println(cheque);
        }


    }
}
