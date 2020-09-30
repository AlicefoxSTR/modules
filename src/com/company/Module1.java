package com.company;

public class Module1 {
    public static void main(String[] args) {
        int [] ar = {3, 4, 5};
        System.out.println(remaider(1, 2)); //остаток от деления
        System.out.println(triArea(3, 2)); //площадь треугольника
        System.out.println(animal(2, 3, 5 )); //количество пар животных
        System.out.println(profitableGamble(0.2, 50, 9 )); //правда или ложь
        System.out.println(operation(24, 15, 9 )); // различные алгоритмические операции
        System.out.println(ctoa('A')); // приведение типов
        System.out.println(addUpTo(3)); // сумма всех чисел до него и включая его
        System.out.println(nextEdge(9, 2)); // максимальное значение третьего ребра треугольника
        System.out.println(sumOfCubes(ar)); //сумма кубов массива чисел
        System.out.println(abcMath(1, 2, 3)); // A к себе B раз
    }
    //задание 1
    public static double remaider(double a, double b){
        double c = a % b;
        return c;
    }
    //задание 2
    public static double triArea(int a, int h){
        double s = 0.5*(a*h);
        return s;
    }
    //задание 3
    public static int animal(int a, int b, int c ){
        int chic = 2;
        int  cows = 4;
        int pigs = 4;
        int anim = a * chic + b * cows + c * pigs;
        return anim;
    }
    //задание 4
    public static boolean profitableGamble(double prob, double prize, double pay){
        if (prob * prize > pay) {
            return  true;
        }
        else {
            return false;
        }
    }
    //задание 5
    public static String operation(int a, int b, double N){
        String s;
        if (a + b == N){
            s = "addition"; //сложение
            return s;
        }
        if (a - b == N){
            s = "subtraction"; //вычитание
            return s;
        }
        if (a * b == N){
            s = "multiplication"; //умножение
            return s;
        }
        if (a / b == N){
            s = "division"; // деление
            return s;
        }
        else {
            s = "None";
            return s;
        }

    }
    //задание 6
    public static int ctoa(char a){
        return (int) a;
    }
    //задание 7
    public static double addUpTo(int a){
        int sum = 0;
        for (int i=0; i<=a; i++){
            sum += i;
        }
        return sum;
    }
    //задание 8
    public static double nextEdge(int a, int b){
        int c = a + b - 1;
        return c;
    }
    //задание 9
    public static int sumOfCubes(int [] a){
        int sum = 0;
        for (int i = 0; i< a.length; i++) {
            sum += (a[i]*a[i]*a[i]);
        }
        return sum;
    }
    //задание 10
    public static boolean abcMath(int a, int b, int c){
        int d = 0;
        for (int i = 0; i < b; i++)
        {
            d += a;
        }
        return d % c == 0;
    }
}
