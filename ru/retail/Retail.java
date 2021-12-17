package ru.retail;


import product.Ball;


public class Retail {



    public static void main(String[] args) {
       OfflineStore vesna =  new OfflineStore("VESNA","10:00 - 22:00", 1000,
               "Blvd 12, London","897 765 876"); // объект магазин
        vesna.openStore(vesna.getName(),vesna.getWorkHours());
        vesna.closeStore(vesna.getName());
        System.out.println(" ");

        //Product product = new Product();
       // product.takeFromTheShelf();
        Ball footBallBall = new Ball("Мяч",999.9,696969,"Кожа","Для игры на траве",
                "Бело-черный",2,"Фабрика спорт товаров, Россия",
                "для футбола", 5,0.56,"DIADORA","Круглый");
        System.out.println(" ");
        footBallBall.putOnTheShelf();
        footBallBall.choiceProduct();
        footBallBall.testOfGood();
        footBallBall.visualInspection();
        footBallBall.takeFromTheShelf();
        footBallBall.putOnBasket();
        footBallBall.takeFromBasket();
        footBallBall.buy();





    }
}
