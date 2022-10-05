package com.sse2022.datingdemo.core.mapper;

import com.sse2022.datingdemo.core.dto.UserCreateRequest;
import com.sse2022.datingdemo.core.dto.UserDto;
import com.sse2022.datingdemo.core.dto.UserUpdateRequest;
import com.sse2022.datingdemo.core.entity.User;
import com.sse2022.datingdemo.core.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);

    User createEntity(UserCreateRequest userCreateRequest);

    User updateEntity(@MappingTarget User user, UserUpdateRequest userUpdateRequest);
}
