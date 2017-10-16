package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishesRepository extends JpaRepository<Dish, Long>{
}
