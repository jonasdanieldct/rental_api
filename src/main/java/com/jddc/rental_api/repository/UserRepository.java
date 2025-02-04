package com.jddc.rental_api.repository;

import com.jddc.rental_api.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
