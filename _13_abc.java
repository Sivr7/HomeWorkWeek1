package week1.week1Homework.addition;

import java.util.Scanner;
/**
 * Created by Andriy on 08.09.2016.
 *
 * 13) Даны три числа A,B,C. Увеличить числа в два
 раза, если A+B+C>0, в противном случае заменить
 на нули.
 */
public class _13_abc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter c:");
        int c = sc.nextInt();

        if(a + b + c > 0){
            a*=2;
            b*=2;
            c*=2;
        } else {
            a = 0;
            b = 0;
            c = 0;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
