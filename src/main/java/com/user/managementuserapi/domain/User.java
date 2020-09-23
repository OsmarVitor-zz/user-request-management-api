package com.user.managementuserapi.domain;

import com.user.managementuserapi.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private UUID uuid;

    private String name;

    private String email;

    private String password;

    private Role role;

    private List<Request> requestList = new ArrayList<Request>();

    private List<RequestStage> requestStageList = new ArrayList<RequestStage>();
}
