package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByEmail(String email);
}
