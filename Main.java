import static java.lang.System.out;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main n = new Main();
        out.println("Введите номер блока задач: ");
        out.println("Блок 1 : Методы");
        out.println("Блок 2 : Условия");
        out.println("Блок 3 : Циклы");
        out.println("Блок 4 : Массивы");
        Scanner sc = new Scanner(System.in);
        int Blok = sc.nextInt();


        if (Blok == 1) {
            out.println("Мой вариант 13, поэтому здесь присутствуют только задачи под нечетными номерами");
            out.println("Введите номер задачи: ");
            out.println("Задача 1 : Дробная часть.");
            out.println("Задача 2 : Букву в число.");
            out.println("Задача 3 : Двузначное.");
            out.println("Задача 4 : Диапазон.");
            out.println("Задача 5 : Равенство.");
            int Zadacha1 = sc.nextInt();
            if ((Zadacha1 < 1) || (Zadacha1 > 5)) {
                out.println("Такой задачи нет");
            }
            switch (Zadacha1) {

                case 1:
                    out.println("Введите значение x:");
                    double x = sc.nextDouble();
                    double y = n.fraction(x);
                    out.println(y);
                    break;

                case 2:
                    out.println("Введите символ(0 1 2 3 4 5 6 7 8 9), который будет преобразован в число: ");
                    char a = sc.next().charAt(0);
                    n.charToNum(a);
                    break;

                case 3:
                    out.println("Введите число x: ");
                    int b = sc.nextInt();
                    boolean B = n.is2Digits(b);
                    out.println(B);
                    break;

                case 4:
                    out.println("Введите диапозон");
                    int d = sc.nextInt();
                    int D = sc.nextInt();
                    out.println("Введите число");
                    int num = sc.nextInt();
                    boolean NUM = n.isInRange(d, D, num);
                    out.println(NUM);
                    break;

                case 5:
                    out.println("Введите три числа: ");
                    int f = sc.nextInt();
                    int g = sc.nextInt();
                    int h = sc.nextInt();
                    boolean F = n.isEqual(f, g, h);
                    break;
            }
        }


        else if (Blok == 2) {
            out.println("Мой вариант 13, поэтому здесь присутствуют только задачи под нечетными номерами");
            out.println("Введите номер задачи: ");
            out.println("Задача 1 : Модуль числа.");
            out.println("Задача 2 : Тридцать пять.");
            out.println("Задача 3 : Тройной максимум.");
            out.println("Задача 4 : Двойная сумма.");
            out.println("Задача 5 : День недели.");
            int Zadacha2 = sc.nextInt();
            if ((Zadacha2<1)||(Zadacha2>5)){
                out.println("Такой задачи нет");
            }
            switch (Zadacha2) {
                case 1:
                    out.println("Введите число: ");
                    int c = sc.nextInt();
                    int C = n.abs(c);
                    out.println("Полученное число: " + C);
                    break;
                case 2:
                    out.println("Введите число: ");
                    int v = sc.nextInt();
                    boolean V = n.is35(v);
                    out.println(V);
                    break;
                case 3:
                    out.println("Введите три числа: ");
                    int q1 = sc.nextInt();
                    int q2 = sc.nextInt();
                    int q3 = sc.nextInt();
                    int Q = n.max3(q1, q2, q3);
                    out.println("Наибольшее число: " + Q);
                    break;
                case 4:
                    out.println("Введите 2 числа: ");
                    int g1 = sc.nextInt();
                    int g2 = sc.nextInt();
                    int G = n.sum2(g1, g2);
                    out.println("Полученная сумма: ");
                    out.println(G);
                    break;

                case 5:
                    out.println("Введите день недели: ");
                    int day1 = sc.nextInt();
                    String Day1 = n.day(day1);
                    out.println(Day1);
                    break;
            }
        }


        else if (Blok==3) {
            out.println("Мой вариант 13, поэтому здесь присутствуют только задачи под нечетными номерами");
            out.println("Введите номер задачи: ");
            out.println("Задача 1 : Числа подряд.");
            out.println("Задача 2 : Четные числа.");
            out.println("Задача 3 : Длина числа.");
            out.println("Задача 4 : Квадрат.");
            out.println("Задача 5 : Правый треугольник.");
            int Zadacha3 = sc.nextInt();
            if ((Zadacha3<1)||(Zadacha3>5)){
                out.println("Такой задачи нет");
            }
            switch (Zadacha3) {
                case 1:
                    out.println("Введите число: ");
                    int k = sc.nextInt();
                    String K = n.listNums(k);
                    out.println("Полученная строка: " + K);
                    break;
                case 2:
                    out.println("Введите число: ");
                    int l = sc.nextInt();
                    String L = n.chet(l);
                    out.println("Полученная строка: " + L);
                    break;
                case 3:
                    out.println("Введите число: ");
                    long p = sc.nextLong();
                    int P = n.numLen(p);
                    out.println("Количество знаков в числе: " + P);
                    break;
                case 4:
                    out.println("Введите число: ");
                    int w = sc.nextInt();
                    n.square(w);
                    break;
                case 5:
                    out.println("Введите число: ");
                    int e = sc.nextInt();
                    n.rightTriangle(e);
                    break;
            }
        }


        else if (Blok==4){
            out.println("Мой вариант 13, поэтому здесь присутствуют только задачи под нечетными номерами");
            out.println("Введите номер задачи: ");
            out.println("Задача 1 : Поиск первого значения.");
            out.println("Задача 2 : Поиск максимального.");
            out.println("Задача 3 : Добавление массива в массив.");
            out.println("Задача 4 : Возвратный реверс.");
            out.println("Задача 5 : Все вхождения.");
            int Zadacha4 = sc.nextInt();
            if ((Zadacha4<1)||(Zadacha4>5)){
                out.println("Такой задачи нет");
            }
            switch (Zadacha4) {
                case 1:
                    out.println("Введите размер массива: ");
                    int a = sc.nextInt();
                    int[] A = new int[a];
                    out.println("Введите значения массива: ");
                    for (int i = 0; i<a; i++){
                        int a1 = sc.nextInt();
                        A[i] = a1;
                    }
                    out.println("Ваш массив: ");
                    for (int i = 0; i<a; i++){
                        out.print(A[i] + " ");
                    }
                    out.println();
                    out.println("Введите число х: ");
                    int a2 = sc.nextInt();
                    int a3 = n.findFirst(A,a2);
                    out.println(a3);
                    break;
                case 2:
                    out.println("Введите размер массива: ");
                    int t = sc.nextInt();
                    int[] T = new int[t];
                    out.println("Введите значения массива: ");
                    for (int i = 0; i<t; i++){
                        int t1 = sc.nextInt();
                        T[i] = t1;
                    }
                    out.println("Ваш массив: ");
                    for (int i = 0; i<t; i++){
                        out.print(T[i] + " ");
                    }
                    out.println();
                    int t2 = n.maxAbs(T);
                    out.println("Максимальный элемент массива: " + t2);
                    break;
                case 3:
                    out.println("Введите размер исходного массива: ");
                    int u = sc.nextInt();
                    int[] U = new int[u];
                    out.println("Введите значения исходного массива: ");
                    for (int i = 0; i<u; i++){
                        int u1 = sc.nextInt();
                        U[i] = u1;
                    }
                    out.println("Ваш исходный массив: ");
                    for (int i = 0; i<u; i++){
                        out.print(U[i] + " ");
                    }
                    out.println();
                    out.println("Введите размер массива, который необходимо вставить: ");
                    int u2 = sc.nextInt();
                    int[] U1 = new int[u2];
                    out.println("Введите значения массива, который необходимо вставить: ");
                    for (int i = 0; i<u2; i++){
                        int u3 = sc.nextInt();
                        U1[i] = u3;
                    }
                    out.println("Ваш массив для вставки: ");
                    for (int i = 0; i<u2; i++){
                        out.print(U1[i] + " ");
                    }
                    out.println();
                    out.println("Введите позицию для вставки массива: ");
                    int u4 = sc.nextInt();
                    int[] u5 = n.add(U,U1,u4);
                    out.println("Новый массив: ");
                    for (int i=0; i< u5.length;i++){
                        out.print(u5[i] + " ");
                    }
                    break;
                case 4:
                    out.println("Введите размер массива: ");
                    int r = sc.nextInt();
                    int[] R = new int[r];
                    out.println("Введите значения массива: ");
                    for (int i = 0; i<r; i++){
                        int t1 = sc.nextInt();
                        R[i] = t1;
                    }
                    out.println("Ваш массив: ");
                    for (int i = 0; i<r; i++){
                        out.print(R[i] + " ");
                    }
                    out.println();
                    int[] R1 = n.reverseBack(R);
                    out.println("Перевернутый массив: ");
                    for (int i=0; i< R1.length;i++){
                        out.print(R1[i] + " ");
                    }
                    break;
                case 5:
                    out.println("Введите размер массива: ");
                    int o = sc.nextInt();
                    int[] O = new int[o];
                    out.println("Введите значения массива: ");
                    for (int i = 0; i< o; i++){
                        int t1 = sc.nextInt();
                        O[i] = t1;
                    }
                    out.println("Ваш массив: ");
                    for (int i = 0; i< o; i++){
                        out.print(O[i] + " ");
                    }
                    out.println();
                    out.println("Введите значение х: ");
                    int o2 = sc.nextInt();
                    int[] O1 = n.findAll(O,o2);
                    out.println("Массив индексов всех вхождений числа x: ");
                    for (int i=0; i< O1.length;i++){
                        out.print(O1[i] + " ");
                    }
                    break;
            }
        }


        else {
            out.println("Такого блока не существует");
        }
    }


    public double fraction(double x) {
        x = x % 1;
        out.println("Дробная часть числа x: ");
        return x;
    }


    public int charToNum(char x) {
        int num = Character.getNumericValue(x);
        out.println("Полученное число: ");
        out.println(num);
        return 0;
    }


    public boolean is2Digits(int x) {
        if ((x >= 10) && (x <= 99)) {
            out.println("Число двузначное");
            return true;
        } else {
            out.println("Число не двузначное");
            return false;
        }
    }


    public boolean isInRange(int a, int b, int num) {
        if (a > b) {
            if ((num <= a) && (num >= b)) {
                out.println("Число входит в указанный диапозон");
                return true;
            } else {
                out.println("Число не входит в указанный диапозон");
                return false;
            }
        } else {
            if ((num <= b) && (num >= a)) {
                out.println("Число входит в указанный диапозон");
                return true;
            } else {
                out.println("Число не входит в указанный диапозон");
                return false;
            }
        }
    }


    public boolean isEqual(int a, int b, int c) {
        if ((a == c) && (a == b) && (b == c)) {
            out.println("Числа равны");
            return true;
        } else {
            out.println("Числа не равны");
            return false;
        }
    }


    public int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            x = x * (-1);
            return x;
        }
    }


    public boolean is35(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) {
            out.println("Число x делится нацело и на 3 и на 5");
            return false;
        } else if ((x % 3 == 0) || (x % 5 == 0)) {
            out.println("Число x делится нацело на 3 или 5");
            return true;
        } else {
            out.println("Число x не делится нацело на 3 и 5");
            return false;
        }
    }


    public int max3(int x, int y, int z) {
        if ((x >= y) && (x >= z)) {
            return x;
        } else if ((y >= x) && (y >= z)) {
            return y;
        } else {
            return z;
        }
    }


    public int sum2(int x, int y) {
        int summa;
        summa = x + y;
        if ((summa >= 10) && (summa <= 19)) {
            out.println("Сумма попала в диапозон от 10 до 19");
            return 20;
        } else {
            return summa;
        }
    }


    public String day(int x) {
            switch (x) {
                case 1:
                    return "Понедельник";
                case 2:
                    return "Вторник";
                case 3:
                    return "Среда";
                case 4:
                    return "Четверг";
                case 5:
                    return "Пятница";
                case 6:
                    return "Суббота";
                case 7:
                    return "Воскресенье";
                default:
                    return "Это не день недели";
            }
    }


    public String listNums (int x) {
        String a = "";
        String b = "";
        for (int i = 0;i<=x;i++){
            a = i + "";
            b = b + a + " " ;
        }
        return b;
    }


    public String chet (int x){
        String a = "";
        String b = "";
        for (int i = 0;i<=x;i+=2){
            a = i + "";
            b = b + a + " " ;
        }
        return b;
    }


    public int numLen (long x){
        int a = 0;
        while (x>0){
            x = x/10;
            a++;
        }
        return a;
    }


    public void square (int x){
        for (int i = 0; i<x; i++){
            for (int j = 0; j<x; j++) {
                out.print("*");
            }
            out.println();
        }
    }


    public void rightTriangle (int x){
        for (int i = 1; i <= x; i++){
            for (int j=1; j <= x-i; j++){
                out.print(" ");
            }
            for (int k=1; k <= i; k++){
                out.print("*");
            }
            out.println();
        }
    }


    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                out.println("Индекс первого вхождения числа х в массив:");
                return i;
            }

        }
        out.println("Число не входит в массив");
        return -1;
    }


    public int maxAbs (int[] arr){
        int max = arr[0];
        for (int i=0; i < arr.length; i++){
            if (Math.abs(arr[i])>Math.abs(max)){
                max=arr[i];
            }
        }
        return max;
    }


    public int[] add (int[] arr, int[] ins, int pos){
        int[] result = new int[arr.length + ins.length];
        for (int i=0; i < arr.length + ins.length; i++) {
            for (int j=0;j < arr.length; j++) {
                if (i==pos){
                    for(int k = 0;k < ins.length; k++){
                        result[i]=ins[k];
                        i++;
                    }
                }
                result[i] = arr[j];
                i++;
            }
        }
        return result;
    }


    public int[] reverseBack (int[] arr){
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i>=0;i--){
            result[j] = arr[i];
            j++;
        }
        return result;
    }


    public int[] findAll (int[] arr, int x){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                a++;
            }
        }
        int[] result = new int[a];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}
