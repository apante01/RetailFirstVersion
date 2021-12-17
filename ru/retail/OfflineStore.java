package ru.retail;

public class OfflineStore {



    //описание класса
   private String name = "VESNA";
   private String workHours = "10:00 - 22:00";
   private int square = 1000;
   private String adress = "Blvd 12, London";
   private String phone = "897 765 876";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getWorkHours(){
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public void openStore(String name, String workHours){ // метод
      System.out.println("Магазин - "+name+ " работает с - "+workHours);



   }
   public void closeStore(String name){ // метод
      System.out.println("Магазин - "+name+" закрыт");


   }
   public OfflineStore (String name,String workHours,int square,String adress,String phone) { // конструктор
     this.name = name;
     this.workHours = workHours;
     this.square = square;
     this.adress = adress;
     this.phone = phone;

      System.out.println("Магазин называется - " + name);
      System.out.println("Режим работы - " + workHours);
      System.out.println("Площадь магазина - " + name + " - " + square + " квадратных метров");
      System.out.println("Адрес магазина - " + name + " - " + adress);
      System.out.println("Телефон магазина - " + name + " - " + phone);



   }





}
