package staff;

public class Cashier extends Staff{
    public Cashier(String name,String position,double expirience){
    super(name,position,expirience);
    }
    public Cashier(){}

    public void scanGoods(){
        System.out.println("Сканирование товара на кассе");
    }
    public void sayTheAmount(){
        System.out.println("Озвучивает сумму покупки");
    }
    public void printCheck(){
        System.out.println("Печать чека");
    }
    public void packGood(){
        System.out.println("Упаковывет товар в пакет");
    }
}
