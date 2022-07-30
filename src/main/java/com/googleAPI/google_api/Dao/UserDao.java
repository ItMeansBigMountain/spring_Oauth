package com.googleAPI.google_api.Dao;
import com.googleAPI.google_api.Entity.Admin;
import com.googleAPI.google_api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {
//    @Query(value = "SELECT u FROM User u")
    Optional<User> findByEmail(String email);

//    @Query(value = " SELECT * FROM tbl_users WHERE email = ?#{@UserDao.existsByEmail(#param1)} ")
    Optional<User> existsByEmail(String email);
}