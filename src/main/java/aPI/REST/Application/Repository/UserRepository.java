package aPI.REST.Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aPI.REST.Application.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
