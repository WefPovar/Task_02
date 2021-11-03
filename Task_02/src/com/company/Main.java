package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static double readA() {
        double a;
        a = in.nextDouble();
        return a;
    }

    public static double readB() {
        double b;
        b = in.nextDouble();
        return b;
    }

    public static double readC() {
        double c;
        c = in.nextDouble();
        return c;
    }

    public static void solveEquation(double a, double b, double c) {
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        double A = readA();
        double B = readB();
        double C = readC();
        solveEquation(A, B, C);
    }
}

