package com.booeat.webroot.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booeat.data.entity.FoodEntity;
import com.booeat.data.entity.NutrientEntity;
import com.booeat.data.repository.FoodRepository;
import com.booeat.data.repository.NutrientRepository;
import com.booeat.domain.entities.Food;

@RestController
@RequestMapping(path = "datatables")
public class NutrientController {
	@Autowired
	NutrientRepository nutrientRepository;
	@Autowired
	FoodRepository foodRepository;
	@RequestMapping(method = RequestMethod.GET, path = "/nutrient")
	public List<NutrientEntity> fetch() {
		return (List<NutrientEntity>) nutrientRepository.findAll();
	}
	@RequestMapping(method = RequestMethod.GET, path = "/food")
	public List<Food> fetchFoods() {
		List<FoodEntity> list = (List<FoodEntity>) foodRepository.findAll();
		List<Food> foods = new LinkedList<>();
		for (FoodEntity foodEntity : list) {
			foods.add(foodEntity.toFood());
		}
		return foods;
	}
}
