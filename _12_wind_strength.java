package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 12) Написать программу, которая в зависимости от характера ветра выдает
 сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
 умеренный (2); от 11-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
 */
public class _12_wind_strength {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Speed of the wind in meters per second:");

        byte windSpeed = sc.nextByte();

        if(windSpeed > 19){
            System.out.println("Hurricane force.");
        } else if(windSpeed > 10){
            System.out.println("Strong wind.");
        } else if(windSpeed > 4){
            System.out.println("Moderate breeze.");
        } else {
            System.out.println("Light air.");
        }




    }
}
