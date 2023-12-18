package com.example.aninterface.entity;

public class Helicopter implements Transport{

    private byte capacity;
    private int maxSpeed;
    private int consumptionPerHour;

    public Helicopter(byte capacity, int maxSpeed, int consumptionPerHour){
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.consumptionPerHour = consumptionPerHour;
    }

    @Override
    public int consumption(int distance){
        return (distance / 100) * consumptionPerHour;
    }
    @Override
    public long time(int distance){
        return distance / maxSpeed;
    }

}
