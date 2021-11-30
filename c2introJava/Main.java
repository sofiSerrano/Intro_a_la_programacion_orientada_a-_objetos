package com.company;
import java.util.Scanner;
public class Main {
    Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("¿el num es primo?" + esPrimo(num));
    };

    public static boolean esPrimo(int num){
        Boolean band= true ;
        for (int i =2;i<num;i++){
            if(num%i==0){
                band=false;
            }
        }
        return band;
    }

}
