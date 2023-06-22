package com.example.sweater.domain;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    Integer id;

    String vin_code;

    String brand;

    String model;

    String color;

    Integer price;

    String description;

    @OneToOne
    @JoinColumn(name = "type_id")
    private Type type;


    @ManyToOne
    @JoinColumn(name = "selling_id")
    private Selling selling;

    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVin_code() {
        return vin_code;
    }

    public void setVin_code(String vin_code) {
        this.vin_code = vin_code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type_id) {
        this.type = type_id;
    }

    public Selling getSelling() {
        return selling;
    }

    public void setSelling(Selling selling_id) {
        this.selling = selling_id;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery_id) {
        this.delivery = delivery_id;
    }


}
