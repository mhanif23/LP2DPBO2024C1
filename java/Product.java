public class Product {
    private int idProduct;
    private String name;
    private String brand;
    private int price;

    public Product(){
    }

    public void setId(int idProduct){
        this.idProduct = idProduct;
    }

    public int getId(){
        return this.idProduct;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
