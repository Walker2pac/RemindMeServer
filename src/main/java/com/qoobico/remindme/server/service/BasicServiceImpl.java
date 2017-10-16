package com.qoobico.remindme.server.service;


import com.qoobico.remindme.server.entity.Categories;
import com.qoobico.remindme.server.entity.Dish;
import com.qoobico.remindme.server.entity.Menu;
import com.qoobico.remindme.server.repository.CategoriesRepository;
import com.qoobico.remindme.server.repository.DishesRepository;
import com.qoobico.remindme.server.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicServiceImpl implements BasicService {

    @Autowired
    private DishesRepository dishesRepository;
    @Autowired
    private CategoriesRepository categoriesRepository;
    @Autowired
    private MenuRepository menuRepository;

    public List<Dish> getAllDishes() {
        return dishesRepository.findAll();
    }

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    public Dish getById(long id) {
        return dishesRepository.findOne(id);
    }

    public Dish save(Dish dish) {
        return dishesRepository.saveAndFlush(dish);
    }

    public void remove(long id) {
        dishesRepository.delete(id);
    }
}
