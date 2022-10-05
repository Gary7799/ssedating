package com.sse2022.datingdemo.core.service;

import com.sse2022.datingdemo.core.dto.TokenCreateRequest;
import com.sse2022.datingdemo.core.dto.UserCreateRequest;
import com.sse2022.datingdemo.core.dto.UserDto;
import com.sse2022.datingdemo.core.dto.UserUpdateRequest;
import com.sse2022.datingdemo.core.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {

    UserDto create(UserCreateRequest userCreateRequest);

    @Override
    User loadUserByUsername(String username) throws UsernameNotFoundException;

    UserDto get(String id);

    UserDto update(String id, UserUpdateRequest userUpdateRequest);

    void delete(String id);

    Page<UserDto> search(Pageable pageable);

    String createToken(TokenCreateRequest tokenCreateRequest);

    UserDto getCurrentUser();
}
