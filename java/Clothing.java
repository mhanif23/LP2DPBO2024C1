public class Clothing extends Product {
    private String size;
    private String material;
    private String gender;

    public Clothing(){
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return this.material;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }
}
