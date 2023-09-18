package com.nutrienttracker.nutrienttrackerbackend.repository;

import com.nutrienttracker.nutrienttrackerbackend.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
}
