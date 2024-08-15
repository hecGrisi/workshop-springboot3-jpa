package wothan.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wothan.enterprise.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
