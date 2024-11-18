package Enumerations;

enum Laptops{
    Macbook("Rs 1,20,000"), Dell("Rs 80,000"), HP("Rs 90,000"), ROG("Rs 1,00,000");

    private final String price;

    Laptops(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args){
        System.out.println("Following are the names and prices of available laptops");
        for (Laptops L: Laptops.values()){
            System.out.println(L + " : " + L.getPrice());
        }

        System.out.println("\nBest choice of Laptop would be " + Laptops.Macbook);
    }
}
