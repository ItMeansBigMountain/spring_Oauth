package com.googleAPI.google_api.Service;

import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Map;

public interface RenderService {
    Map<String, Object> fetch_user_data(OAuth2User principal);

}
