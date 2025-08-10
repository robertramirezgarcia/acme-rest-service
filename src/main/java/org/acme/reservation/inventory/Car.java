package org.acme.reservation.inventory;

public class Car {
    public Long id;
    public String licencePlateNumber;
    public String manufacturer;
    public String model;

    public Car(Long id, String licencePlateNumber, String manufacturer, String model) {
        this.id = id;
        this.licencePlateNumber = licencePlateNumber;
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
