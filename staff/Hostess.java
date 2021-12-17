package staff;

public class Hostess {
    private String name;
    private String position;
    private double expirience;

    public Hostess(String name,String position,double expirience){
        this.name = name;
        this.position = position;
        this.expirience = expirience;
    }
    public Hostess(){}

    public void sayHello(){
        System.out.println("Здравствуйте");
    }
    public void offerABasket(){
        System.out.println("Предлагает покупательскую корзину");
    }
    public void escortsToTheDepartment(){
        System.out.println("Провожает до отдела");
    }
}
