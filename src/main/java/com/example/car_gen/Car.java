package com.example.car_gen;

public class Car {

    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {

        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public int accelerateSpeed() {
        while(this.speed < this.maxSpeed) {
            this.speed = this.speed += 5;
        }
        return this.speed;
    }

    public int decelerateSpeed() {
        while(this.speed > 0) {
            this.speed = this.speed -= 5;
        }
        return this.speed;
    }

    public boolean convertToElectric() {
        if (this.isElectric == true) {
            return true;
//            System.out.println("This car is already electric");
        } else {
            return this.isElectric = true;
        }
    }


    


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
