package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.PricingCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingCategoryJpaRepository extends JpaRepository<PricingCategory,String> {
}
