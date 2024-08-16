package wothan.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wothan.enterprise.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
