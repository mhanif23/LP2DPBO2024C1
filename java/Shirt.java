import java.util.Scanner;

public class Shirt extends Clothing {
    private String color;
    private String sleeveType;

    public Shirt(){
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setSleeveType(String sleeveType){
        this.sleeveType = sleeveType;
    }

    public String getSleeveType(){
        return this.sleeveType;
    }

    public static Shirt inputDataShirt() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Shirt shirt = new Shirt();

        System.out.println("INPUT THE DETAIL OF SHIRT : ");
        System.out.print("ID Product: ");
        int id = sc.nextInt(); sc.nextLine(); 
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("Price: ");
        int price = sc.nextInt(); sc.nextLine(); 
        System.out.print("Size: ");
        String size = sc.nextLine();
        System.out.print("Material: ");
        String material = sc.nextLine();
        System.out.print("Gender: ");
        String gender = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Sleeve Type: ");
        String sleeveType = sc.nextLine();

        shirt.setId(id);
        shirt.setName(name);
        shirt.setBrand(brand);
        shirt.setPrice(price);
        shirt.setSize(size);
        shirt.setMaterial(material);
        shirt.setGender(gender);
        shirt.setColor(color);
        shirt.setSleeveType(sleeveType);
        
        return shirt;
    }

    public static void printTableHeader() {
        printRowBorder();
        System.out.format("| %-8s | %-18s | %-13s | %-8s | %-8s | %-13s | %-8s | %-8s | %-13s |%n", "ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");
        printRowBorder();
    }

    public static void printRowBorder() {
        System.out.println("+----------+--------------------+---------------+----------+----------+---------------+----------+----------+---------------+");
    }

    public void display() {
        System.out.format("| %-8d | %-18s | %-13s | %-8d | %-8s | %-13s | %-8s | %-8s | %-13s |%n", getId(), getName(), getBrand(), getPrice(), getSize(), getMaterial(), getGender(), getColor(), getSleeveType());
        printRowBorder();
    }

}
