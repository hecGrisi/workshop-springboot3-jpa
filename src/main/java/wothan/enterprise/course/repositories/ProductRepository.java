package wothan.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wothan.enterprise.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
