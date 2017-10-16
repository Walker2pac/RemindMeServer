package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.Categories;
import com.qoobico.remindme.server.entity.Dish;
import com.qoobico.remindme.server.entity.Menu;

import java.util.List;

public interface BasicService {

    List<Dish> getAllDishes();
    List<Categories> getAllCategories();
    List<Menu> getAllMenu();
    Dish getById(long id);
    Dish save(Dish dish);
    void remove(long id);

}
