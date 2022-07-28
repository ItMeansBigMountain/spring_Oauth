package com.googleAPI.google_api.Dao;
import com.googleAPI.google_api.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<Admin, Integer> {
}