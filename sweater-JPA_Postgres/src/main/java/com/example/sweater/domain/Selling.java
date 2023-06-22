package com.example.sweater.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Selling {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name = "date")
    Date date;

    Integer count_of_cars;

    @ManyToOne
    @JoinColumn(name = "showroom_id")
    private CarShowroom showroom;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "selling", cascade = CascadeType.ALL)
    private List<Car> cars;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCount_of_cars() {
        return count_of_cars;
    }

    public void setCount_of_cars(Integer count_of_cars) {
        this.count_of_cars = count_of_cars;
    }

    public CarShowroom getShowroom() {
        return showroom;
    }

    public void setShowroom(CarShowroom showroom_id) {
        this.showroom = showroom_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer_id) {
        this.customer = customer_id;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
