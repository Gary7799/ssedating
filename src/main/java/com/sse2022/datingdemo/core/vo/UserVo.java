package com.sse2022.datingdemo.core.vo;

import com.sse2022.datingdemo.core.enums.Gender;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {

    private String id;

    private String username;

    private String nickname;

    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private List<RoleVo> roles;
}
