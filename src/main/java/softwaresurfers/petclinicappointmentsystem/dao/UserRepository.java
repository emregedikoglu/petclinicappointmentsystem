package softwaresurfers.petclinicappointmentsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import softwaresurfers.petclinicappointmentsystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}