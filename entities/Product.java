package entities;

public class Product {
    public String name;
    public double price;
    public int qntd;

    public double totalValueInStock(){
        return price * qntd;

    }

    public void addProducts(int qntd){
        this.qntd += qntd;
    }

    public void removeProducts(int qntd){
        this.qntd -= qntd;
    }

    public String toString(){
        return "Product data: " + name + ", $" + String.format("%.2f", price) + ", " + qntd + " units, " + "Total: $" + String.format("%.2f", totalValueInStock());
    }

}
