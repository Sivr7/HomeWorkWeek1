package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */
public class _6_velocity_distance {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in km:");
        int distanceKm = sc.nextInt();

        System.out.println("Enter velocity in km/h:");
        int velocityKmH = sc.nextInt();

        int hoursToDestination = distanceKm / velocityKmH;
        int minToDestination = distanceKm % velocityKmH * 60 / 100;

        System.out.println("Your time to reach the destination point is " + hoursToDestination + " HR. and "
                + minToDestination + " MIN.");

    }
}
