package task3;

import java.util.Scanner;

public class Main {

    //метод создает исключение
    public static void makerException () {
        try {
            throw new Exception("Exception ! Enter the correct value !");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //метод поиска магазина
    public static String findMarket(Price [] markets) {

        System.out.println("Input market`s name for find a product");
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (Price market : markets) {
            if (market.getMarket().equals(str)) {
                return market.getProduct();
            }
        }
        return "Not found";
    }

    //метод создания обьектов
    public static Price objectMaker () {
        Scanner in = new Scanner(System.in);
        System.out.println("Input alternately : name of market, name of product and product`s price");
        return new Price(in.nextLine(),in.nextLine(), in.nextInt());
    }

    public static void main(String[] args) {
        //создание обьектов
        Price [] markets = new Price[2];
        markets [0] = objectMaker();
        markets [1] = objectMaker();

        //запись результата метода поиска магазина
        String str = findMarket(markets);

        /*
        далее если магазин не найден вызывается метод ошибки
        а после этого, заново метод поиска магазина
        в ином случае выводит название продукта
         */
        if (str.equals("Not found")) {
            makerException();
            System.out.println(findMarket(markets));
        }
        else System.out.println(str);
    }
}

