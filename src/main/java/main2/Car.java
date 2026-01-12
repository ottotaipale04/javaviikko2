package main2;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void status() {
        System.out.print("Auto: " + brand + " " + model + ", ");
        System.out.println("Nopeus: " + speed + " km/h");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
        }

    public void accelerate(int amount) {
        speed += amount;
    }

    public void decelerate(int amount) {
        if (amount >= speed) {
            speed = 0;
        } else {
            speed -= amount;
        }
    }
}