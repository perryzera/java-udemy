package m05_poo.exercicios.ex01;

public class product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return quantity * price;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return "data "
        + name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + "units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}
