package com.example.car_gen;

public class Main {


    public static void main(String[] args) {
        Honda civic = new Honda("Black", 2005, 160, true);

        Lexus rx350 = new Lexus("White", 2021, 180, false);

        Toyota supra = new Toyota("Blue", 1987, 120, true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        System.out.println(civic.accelerateSpeed());
        System.out.println(civic.decelerateSpeed());
        System.out.println(civic.convertToElectric());
    }
}
