package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
 добавляет к нему слово "копейка" в правильной форме. Например, 1
 копейка, 5 копеек, 42 копейки .
 */
public class _11_cents {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ввести кількість копійок:");
        byte kop = sc.nextByte();

        String ending1 = "ка";
        String ending2 = "ки";
        String ending3 = "ок";

        if(kop % 10 == 1){
            System.out.println(kop + " копій" + ending1);
        } else if(kop % 10 == 2 || kop % 10 == 3 || kop % 10 == 4){
            System.out.println(kop + " копій" + ending2);
        } else {
            System.out.println(kop + " копій" + ending3);
        }



    }
}
