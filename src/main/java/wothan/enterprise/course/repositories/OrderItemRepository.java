package wothan.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wothan.enterprise.course.entities.OrderItem;
import wothan.enterprise.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
