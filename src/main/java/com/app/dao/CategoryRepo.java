package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

	Category findByCategoryName(String categoryName);

}
