package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite savo ugi");

        float Ugis = sc.nextFloat();

        System.out.println("Iveskite savo svori");

        float Svoris = sc.nextFloat();

        System.out.println("Jusu KMI yra: " + KMI(Ugis, Svoris));

    }

    public static float KMI (float Ugis, float Svoris) {
        return Svoris/(Ugis*Ugis);
    }
}
