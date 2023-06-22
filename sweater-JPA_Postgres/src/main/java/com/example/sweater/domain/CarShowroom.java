package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class CarShowroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer showroomId;
    private Integer area;
    private String address;
    private String email;
    private String phone;
    private String city;
    @OneToMany(mappedBy = "showroom", cascade = CascadeType.ALL)
    private List<Employee> employees;
    @OneToMany(mappedBy = "showroom", cascade = CascadeType.ALL)
    private List<Selling> sellings ;


    public CarShowroom(Integer area, String address, String email, String phone, String city) {
        this.area = area;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public CarShowroom() {

    }

    public CarShowroom(Integer showroomId) {
        this.showroomId = showroomId;
    }


    public Integer getShowroomId() {
        return showroomId;
    }

    public void setShowroomId(Integer showroom_id) {
        this.showroomId = showroom_id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Selling> getSellings() {
        return sellings;
    }

    public void setSellings(List<Selling> sellings) {
        this.sellings = sellings;
    }
}
