package wothan.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wothan.enterprise.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
