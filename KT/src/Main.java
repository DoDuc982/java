public class Main{
    public static void main(String args[]){
        Laptop laptop = new Laptop("Asus", "1120", 1000000, 50);
        PC pc = new PC("Asus", "1120", 1000000, "No description");
        laptop.showInfo();
        pc.showInfo();
    }
}

abstract class Computer{
    
    public String name;
    protected String id;
    int price;
    
    abstract void showInfo();
    Computer(){}
    Computer(String name, String id, int price){
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

class Laptop extends Computer{
    
    int weight;

    Laptop(){}
    Laptop(String name, String id, int price, int weight){
        super(name, id, price);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeigth(int weight) {
        this.weight = weight;
    }    

    @Override
    /**
     * Ham show thong tin
     * In ra cac thong tin cua doi tuong
     * Kieu tra ve la void
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Weight: " + getWeight());
    }
}

class PC extends Computer{
    
    private String description;

    PC(){}
    PC(String name, String id, int price, String description){
        super(name, id, price);
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    /**
     * Ham show thong tin
     * In ra cac thong tin cua doi tuong
     * Kieu tra ve la void
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
    }
}

