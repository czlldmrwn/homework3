/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework3;

import java.util.Scanner;

/**
 *
 * @author НР
 */
public class Homework3 {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-04-21, Волженская Полина Александровна");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название магазина:");
        String nameOfTheStore = scan.nextLine();
        Store store = new Store(nameOfTheStore);
        Revisor revisor = new Revisor("Иван", "Петров", nameOfTheStore);
        revisor.closeStore(store);
        revisor.rebrand(store);
        System.out.println(store.toString());
    }
}
