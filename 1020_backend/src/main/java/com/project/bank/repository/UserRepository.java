package com.project.bank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.domain.User;
import com.project.bank.domain.RoleType;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String username);
	boolean existsByUsername(String username);
	List<User> findByRole(RoleType role);
}