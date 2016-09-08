package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 9) Написать программу вычисления идеального веса пользователя (рост-
 100). Выдать рекомендации о необходимости поправиться либо поху-
 деть.
 */
public class _9_ideal_weight {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kg.:");
        double weight = sc.nextDouble();

        System.out.println("Enter your height in m.:");
        double height = sc.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("your body mass index = " + bodyMassIndex);

        if(bodyMassIndex > 40){
            System.out.println("Obese Class III (Very severely obese)");
        } else if(bodyMassIndex > 35){
            System.out.println("Obese Class II (Severely obese)");
        } else if(bodyMassIndex > 30){
            System.out.println("Obese Class I (Moderately obese)");
        } else if(bodyMassIndex > 25){
            System.out.println("Overweight");
        } else if(bodyMassIndex > 18.5){
            System.out.println("Normal (healthy weight)");
        } else if(bodyMassIndex > 16){
            System.out.println("Underweight");
        } else if(bodyMassIndex > 15){
            System.out.println("Severely underweight");
        } else {
            System.out.println("Very severely underweight");
        }

    }
}
