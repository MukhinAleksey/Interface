package com.example.aninterface.entity;

public class Airplane implements Transport{

    private byte capacity;
    private int maxSpeed;
    private int consumptionPerHour;

    public Airplane(byte capacity, int maxSpeed, int consumptionPerHour){
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.consumptionPerHour = consumptionPerHour;
    }

    @Override
    public int consumption(int distance){
        return (distance / maxSpeed) * consumptionPerHour;
    }
    @Override
    public long time(int distance){
        return distance / maxSpeed;
    }

}
