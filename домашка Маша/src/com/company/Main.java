package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// посмотри на примере 1 машины- то, что я заметила я тебе отметила коментариями или //
        Siemens siemens = new Siemens(400, 200, "Siemens");
        Delonghi delonghi = new Delonghi(470, 180, "Delonghi");
        Saeco saeco = new Saeco(430, 190, "Saeco");

        System.out.println("Выбрать кофемашину:");
        System.out.println("1. Siemens");
        System.out.println("2. Delonghi");
        System.out.println("3. Saeco");
        int input = sc.nextInt();

        while (input !=8) { // if (input == 1) {
            //Siemens siemens1 = new Siemens(400, 200, "siemens");
            System.out.println("Ваш выбор Siemens");
            System.out.println("Siemens menu:");
            System.out.println("1. Объем кофе и воды");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить двойной эспрессо");
            System.out.println("5. Заполнить бак водой");
            System.out.println("6. Заполнить бак кофе");
            System.out.println("7. Информация");
            System.out.println("8. Выключить кофемашину");
            int input1 = sc.nextInt();
            // у тебя нет условия, при котором в случае нехватки воды для приготовления выводится надпись-
            // недостаточно воды в баке или недостатоно кофе в баке или обе сразу, если не хватает обоих

            if (input == 1) { // while (input != 8) {
                switch (input1) {
                    case 1:
                        // ты указала неверный метод для вывода текущего остатка воды и кофе за минусом приготовленного кофе
                        // поменяй во всех циклах
                        System.out.println("Кол-во кофе " + siemens.coffeeRemainder(siemens.volCoffee,siemens.coffeeCount) + " гр.");
                        System.out.println("Кол-во воды " + siemens.volWater + " гр.");
                        break;
                    case 2:
                        siemens.makeAmericano(Recipes.waterAmericano, Recipes.coffeeAmericano);
                        System.out.println("Американо готов.");
                        break;
                    case 3:
                        siemens.makeEspresso(Recipes.waterEspresso, Recipes.coffeeEspresso);
                        System.out.println("Эспрессо готов.");
                        break;
                    case 4:
                        siemens.makeDoubleEspresso(Recipes.waterDoubleEspresso, Recipes.coffeeDoubleEspresso);
                        System.out.println("Двойной Эспрессо готов");
                        break;
                    case 5:
                        siemens.resetWaterCount();//
                        System.out.println("Бак с водой заполнен на " + siemens.volWater + "мл.");
                        break;
                    case 6:
                        siemens.resetCoffeeCount();//
                        System.out.println("Бак с кофе заполнен на " + siemens.volCoffee + "гр.");
                        break;
                    case 7:
                        System.out.println("Кофемашина " + siemens.name + "  Кол-во воды: "
                                + siemens.volWater + "мл."
                                + "  Кол-во кофе: " + siemens.volCoffee + "гр.");
                        break;
                  //  case 8:
                    //    System.out.println("Кофемашина выключена");
                    //    break;
                   // default:
                }

                }
                if(input1 == 8){// данная вставка выходит из цикла- ее необходимо добавить после каждого цикла
                    System.out.println("Кофемашина выключена");//
                    break;//

            }

     }

        if (input == 2) {
            Delonghi delonghi1 = new Delonghi(470, 180, "Delonghi");
            System.out.println("Delonghi menu:");
            System.out.println("1. Объем кофе и воды");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить двойной эспрессо");
            System.out.println("5. Заполнить бак водой");
            System.out.println("6. Заполнить бак кофе");
            System.out.println("7. Информация");
            System.out.println("8. Выключить кофемашину");
            int input2 = sc.nextInt();

        //  while (input2 != 8) {
                switch (input2) {
                    case 1:
                        System.out.println("Кол-во кофе " + delonghi1.volCoffee + " гр.");
                        System.out.println("Кол-во воды " + delonghi1.volWater + " гр.");
                        break;
                    case 2:
                        delonghi1.makeAmericano(Recipes.waterAmericano, Recipes.coffeeAmericano);
                        System.out.println("Американо готов.");
                        break;
                    case 3:
                        delonghi1.makeEspresso(Recipes.waterEspresso, Recipes.coffeeEspresso);
                        System.out.println("Эспрессо готов.");
                        break;
                    case 4:
                        delonghi1.makeDoubleEspresso(Recipes.waterDoubleEspresso, Recipes.coffeeDoubleEspresso);
                        System.out.println("Двойной Эспрессо готов");
                        break;
                    case 5:
                        delonghi1.resetWaterCount();//
                        System.out.println("Бак с водой заполнен на " + delonghi1.volWater + "мл.");
                        break;
                    case 6:
                        delonghi1.resetCoffeeCount();//
                        System.out.println("Бак с кофе заполнен на " + delonghi1.volCoffee + "гр.");
                        break;
                    case 7:
                        System.out.println("Кофемашина " + delonghi1.name + "  Кол-во воды: "
                                + delonghi1.volWater + "мл."
                                + "  Кол-во кофе: " + delonghi1.volCoffee + "гр.");
                        break;
                    case 8:
                        break;
                    default:
                }
         //   }
   }

        if (input == 3) {
            Saeco saeco1 = new Saeco(430, 190, "Saeco");
            System.out.println("Saeco menu:");
            System.out.println("1. Объем кофе и воды");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить двойной эспрессо");
            System.out.println("5. Заполнить бак водой");
            System.out.println("6. Заполнить бак кофе");
            System.out.println("7. Информация");
            System.out.println("8. Выключить кофемашину");
            int input3 = sc.nextInt();

          // while (input3 != 8) {
                switch (input3) {
                    case 1:
                        System.out.println("Кол-во кофе " + saeco1.volCoffee + " гр.");
                        System.out.println("Кол-во воды " + saeco1.volWater + " гр.");
                        break;
                    case 2:
                        saeco1.makeAmericano(Recipes.waterAmericano, Recipes.coffeeAmericano);
                        System.out.println("Американо готов.");
                        break;
                    case 3:
                        saeco1.makeEspresso(Recipes.waterEspresso, Recipes.coffeeEspresso);
                        System.out.println("Эспрессо готов.");
                        break;
                    case 4:
                        saeco1.makeDoubleEspresso(Recipes.waterDoubleEspresso, Recipes.coffeeDoubleEspresso);
                        System.out.println("Двойной Эспрессо готов");
                        break;
                    case 5:
                        saeco.resetWaterCount();//
                        System.out.println("Бак с водой заполнен на " + saeco1.volWater + "мл.");
                        break;
                    case 6:
                        saeco1.resetCoffeeCount();//
                        System.out.println("Бак с кофе заполнен на " + saeco1.volCoffee + "гр.");
                        break;
                    case 7:
                        System.out.println("Кофемашина " + saeco1.name + "  Кол-во воды: "
                                + saeco1.volWater + "мл."
                                + "  Кол-во кофе: " + saeco1.volCoffee + "гр.");
                        break;
                    case 8:
                        break;
                    default:
                }
            //}
        }
    }
}