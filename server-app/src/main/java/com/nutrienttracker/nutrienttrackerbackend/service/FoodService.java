package com.nutrienttracker.nutrienttrackerbackend.service;

import com.nutrienttracker.nutrienttrackerbackend.model.Food;
import com.nutrienttracker.nutrienttrackerbackend.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(int id) {
        return foodRepository.findById(id).orElse(null);
    }

    public Food saveFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteFood(int id) {
        foodRepository.deleteById(id);
    }
}
