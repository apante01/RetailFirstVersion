package product;

public class Alcohol extends Product{
    private String expirationDate;
    private double size;
    private double volume;
    private String manufacter;
    private String pack;

    public Alcohol(String name,double price,int item,String expirationDate,
                   double size,double volume,String manufacter,String pack ){
        super(name,price,item);
        this.expirationDate = expirationDate;
        this.size = size;
        this.volume = volume;
        this.manufacter = manufacter;
        this.pack = pack;
    }

  public Alcohol(){}

  public void visualInspection(){
      System.out.println("Проверить товар");
  }
}
