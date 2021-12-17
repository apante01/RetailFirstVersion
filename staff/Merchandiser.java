package staff;

public class Merchandiser extends Staff{

    public Merchandiser(String name,String position){
        super(name,position,0);
    }
    public void layoutGood(){
        System.out.println("Выкладывает товар на полки");
    }
    public void facingGood (){
        System.out.println("Поправляет товар");
    }
    public void priceCheck (){
        System.out.println("Сверяет цены");
    }
    public void printPriceTag(){
        System.out.println("Распечатывает ценники");
    }
    public void replaceOfPriceTag(){
        System.out.println("Производит замену цен на полках");
    }

}
