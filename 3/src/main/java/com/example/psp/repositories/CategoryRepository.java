package com.example.psp.repositories;

import com.example.psp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>  {
}
