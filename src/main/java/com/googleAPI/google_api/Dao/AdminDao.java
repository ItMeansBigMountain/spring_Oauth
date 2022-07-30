package com.googleAPI.google_api.Dao;

import com.googleAPI.google_api.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
//        @Query(value = "SELECT u FROM User u")
        Optional<Admin> findByEmail(String email);

//        @Query(value = "SELECT u FROM User u")
        Boolean existsByEmail(String email);
}