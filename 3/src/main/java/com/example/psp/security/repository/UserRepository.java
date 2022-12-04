package com.example.psp.security.repository;

import com.example.psp.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.userNumber = :userNumber")
    UserDetails loadByUserNumber(String userNumber);

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.userNumber = :userNumber")
    User findByUserNumber(String userNumber);

    @Query(value = "SELECT CAST(user_number as integer) From users", nativeQuery = true)
    int getBiggestUserNumber();
}
