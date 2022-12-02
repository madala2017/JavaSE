package com.java.se.design.solid.isp;


public interface ParkingLot {

    void parkCar();
    void unParkCar();
    void getCapacity();
    double calculateFee(Car car);
    void  doPayment(Car car) throws Exception;
}
