package com.itvillage.client.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class SignUpRequest {

    private String userId;

    private String username;

    private Set<RoleName> role;

    private String password;

    private String applicationName;

}
