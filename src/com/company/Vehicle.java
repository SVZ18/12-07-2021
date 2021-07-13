package com.company;

public class Vehicle {
    private float length;
    private int seats;
    private int tyres;
    private int speed;
    private String brand;

    public float getLength() {
        return this.length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getTyres() {
        return this.tyres;
    }
    public void setTyres(int tyres) {
        this.tyres = tyres;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void startEngine(boolean readyToGo){
        if(readyToGo) {
            System.out.println("Start engine");
        } else {
            System.out.println("Stay parked");
        }
    }
    public void stopEngine(boolean vehicleParked) {
        if(vehicleParked) {
            System.out.println("Stop engine");
        } else {
            System.out.println("Vehicle is still driving");
        }
    }
    public void speedUp() {
        if(this.speed < 50) {
            System.out.println("Increase speed by 5");
        }
    }
    public void slowDown() {
        if(this.speed > 60) {
            System.out.println("Reduce speed by 5");
        }
    }
}
