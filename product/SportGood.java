package product;

public class SportGood extends Product{
    private  String matter;
    private  String purposeOfGood;
    private  String color;
    private int guaranteePeriod;
    private  String manufacturer;

  public SportGood(String name,double price,int item,String matter,
                   String purposeOfGood,String color,int guaranteePeriod,String manufacturer){
      super(name,price,item);
      this.matter = matter;
      this.purposeOfGood = purposeOfGood;
      this.color = color;
      this.guaranteePeriod = guaranteePeriod;
      this.manufacturer = manufacturer;
  }
    public SportGood(String name,double price,int item,String color,int guaranteePeriod,
                     String manufacturer) {
        super(name, price, item);
        this.color = color;
        this.guaranteePeriod = guaranteePeriod;
        this.manufacturer = manufacturer;

  }
  public SportGood(){}


    public void testOfGood(){

      System.out.println("Протестировать товар");
    }




}
