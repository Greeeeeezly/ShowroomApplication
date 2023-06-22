package com.example.sweater.domain;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String address;
    private String email;
    private String phone;
    private String city;

    @ManyToOne
    @JoinColumn(name = "showroom_id")
    private CarShowroom showroom;

    public Employee(Integer id, CarShowroom showroom, Integer area, String address, String email, String phone, String city) {
        this.id = id;
        this.showroom = showroom;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CarShowroom getShowroom() {
        return showroom;
    }

    public void setShowroom(CarShowroom showroom_id) {
        this.showroom = showroom_id;
    }
}
