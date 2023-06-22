package com.example.sweater.repos;

import com.example.sweater.domain.Selling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellingRepo extends JpaRepository<Selling, Integer> {
    List<Selling> findAll();
}
