package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.Categories;
import com.qoobico.remindme.server.entity.Dish;
import com.qoobico.remindme.server.entity.Menu;
import com.qoobico.remindme.server.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private BasicService service;

    @RequestMapping(value = "/dishes", method = RequestMethod.GET)
    @ResponseBody
    public List<Dish> getAllDishes() {
        return service.getAllDishes();
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ResponseBody
    public List<Categories> getAllCategories() {
        return service.getAllCategories();
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> getAllMenu() {
        return service.getAllMenu();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Dish getReminder(@PathVariable("id") long remindId) {
        return service.getById(remindId);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Dish saveReminder(@RequestBody Dish dish) {
        return service.save(dish);
    }

    @RequestMapping (value = "/reminders{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
