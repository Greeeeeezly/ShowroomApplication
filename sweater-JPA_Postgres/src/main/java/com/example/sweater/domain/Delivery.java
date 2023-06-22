package com.example.sweater.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Delivery {
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
    @JoinColumn(name = "factory_id")
    private Factory factory;

    @OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Car> cars ;

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

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory_id) {
        this.factory = factory_id;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Delivery() {
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}


