package com.sse2022.datingdemo.core.repository;


import com.sse2022.datingdemo.core.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsername(String username);

    Page<User> findAll(Pageable pageable);
}
