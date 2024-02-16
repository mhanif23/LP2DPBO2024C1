
public class Main {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        
        System.out.println("INPUT PRODUCT 1 :");
        shirt1 = Shirt.inputDataShirt();
        System.out.println("INPUT PRODUCT 2 :");
        shirt2 = Shirt.inputDataShirt();
        System.out.println("INPUT PRODUCT 3 :");
        shirt3 = Shirt.inputDataShirt();
        
        Shirt.printTableHeader();

        shirt1.display();
        shirt2.display();
        shirt3.display();
    }
}
