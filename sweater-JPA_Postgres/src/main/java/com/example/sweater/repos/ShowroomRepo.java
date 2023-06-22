package com.example.sweater.repos;

import com.example.sweater.domain.CarShowroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ShowroomRepo extends JpaRepository<CarShowroom, Integer> {
    List<CarShowroom> findByShowroomId(Integer id);

}
