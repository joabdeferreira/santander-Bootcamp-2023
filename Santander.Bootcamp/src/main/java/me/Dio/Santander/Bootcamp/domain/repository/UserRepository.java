package me.Dio.Santander.Bootcamp.domain.repository;

import me.Dio.Santander.Bootcamp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
