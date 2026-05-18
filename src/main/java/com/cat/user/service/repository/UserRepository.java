package com.cat.user.service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.user.service.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

	boolean existsByCorreo(String correo);

	User save(User user);

	Optional<User> findById(UUID id);
}
