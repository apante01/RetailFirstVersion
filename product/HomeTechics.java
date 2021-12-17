package product;

public class HomeTechics extends SportGood {
    private String technicalSpecifications;
    private double rating;


 public HomeTechics(String name,double price,int item,String color,
                    int guaranteePeriod,String manufacturer,String techicalSpecifications,double rating){
     super(name,price,item,color,guaranteePeriod,manufacturer);
     this.technicalSpecifications = techicalSpecifications;
     this.rating = rating;

 }

 public HomeTechics(){}

public void visualInspection(){
    System.out.println("Проверить товар");
}


}
