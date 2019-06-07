package Lesson8.Bai10;

public class Customer extends Person {
    String vehicle;
    double price;

    public Customer(String name, String address) {
        super(name, address);
    }

    public Customer() {
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println("\n===================================================================");
        return "\nName: " + this.name +
                "\nAddress: " + this.address +
                "\nVehicle: " + this.vehicle +
                "\nPrice: " + this.price ;
    }
}
