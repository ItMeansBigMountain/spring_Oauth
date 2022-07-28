package com.projectGroup.mySQL_REST.Service;

import com.googleAPI.google_api.Dao.AdminDao;
import com.googleAPI.google_api.Dao.UserDao;
import com.googleAPI.google_api.Service.render_Service;
import com.googleAPI.google_api.Entity.Admin;
import com.googleAPI.google_api.Entity.User;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class render_implementation implements render_Service {



    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserDao userDao;



}