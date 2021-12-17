package product;

public class Product {
   private String name;
   private double price;
   private int item;

 public Product(String name,double price,int item) {// Конструктор
     this.name = name;
     this.price = price;
     this.item = item;
 }
 public Product(){}

     public void putOnTheShelf () {
         System.out.println("Товар выложили на полки");

     }
     public void takeFromTheShelf () {
         System.out.println("Товар забрали с полки");
     }

     public void choiceProduct () {
         System.out.println("Выбор товара");
     }

     public void putOnBasket () {
         System.out.println("Положить товар в корзину");
     }

     public void takeFromBasket () {
         System.out.println("Достать товар из корзины");
     }

     public void buy () {
         System.out.println("Оплатить товар");
     }

}
