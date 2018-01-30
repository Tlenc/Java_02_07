package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite savo svorį ir ūgį");
        Scanner sc = new Scanner(System.in);
        float kg = sc.nextFloat();
        float m = sc.nextFloat();

        System.out.println("KMI :" + kmi(kg,m));
    }
    public static float kmi(float kg,float m){
        return kg/(m*m);
    }
}