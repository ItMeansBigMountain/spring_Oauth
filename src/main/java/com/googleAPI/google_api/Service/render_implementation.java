package com.googleAPI.google_api.Service;

import com.googleAPI.google_api.Dao.AdminDao;
import com.googleAPI.google_api.Dao.UserDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;


import java.util.Map;

@Service
public class render_implementation implements RenderService {



    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserDao userDao;


    @Override
    public Map<String, Object> fetch_user_data(OAuth2User principal) {
        return principal.getAttributes();
    }



}