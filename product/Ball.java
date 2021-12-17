package product;

public class Ball extends SportGood{
    private String type;
    private int size;
    private double weight;
    private String brand;
    private String shape;

    public Ball(String name,double price, int item, String matter,String purposeOfGood,
                String color,int guaranteePeriod,String manufacturer,String type,int size,
                double weight,String brand,String shape) {

        super(name,price,item,matter,purposeOfGood,color,guaranteePeriod,manufacturer);
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.brand = brand;
        this.shape = shape;
        System.out.println("Наименование - " + name);
        System.out.println("Цена - " + price + " рублей");
        System.out.println("Артикул - " + item);
        System.out.println("Материал - " +  matter);
        System.out.println("Применение - " + purposeOfGood);
        System.out.println("Цвет - " + color);
        System.out.println("Гарантия - " + guaranteePeriod+ " года");
        System.out.println("Производитель - " + manufacturer);
        System.out.println("Тип мяча - " + type);
        System.out.println("Размер - " + size);
        System.out.println("Вес - " + weight);
        System.out.println("Фирма - " + brand);
        System.out.println("Форма - " + shape);

    }

    public void visualInspection(){

        System.out.println(" Проверить товар");
    }
}
