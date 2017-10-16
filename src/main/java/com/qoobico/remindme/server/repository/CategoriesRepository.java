package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
