package ru.skypro;

import java.sql.SQLOutput;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        //task1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //task2
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        //task3
        int year = 2000;
        //int ost = year%4;
        //if (ost==0) {
        if (year%4==0&&year%100!=0) {
            System.out.println("Високосный год");
        } else if(year%400==0)
            System.out.println("Високосный год");
        else{
            System.out.println("Не високосный год");
        }
        //task4
        double deliveryDistance = 21;
        double x = deliveryDistance-20;
        x = x/40;
        x = Math.ceil(x);
        x +=1;
        if (deliveryDistance<=20)
            System.out.println("Потребуется 1 день");
        else {
            System.out.println("Потребуется дней: " + x);
        }
        //task5
        int month = 13;
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("имело место быть фиаско...");
        }
    }
}
