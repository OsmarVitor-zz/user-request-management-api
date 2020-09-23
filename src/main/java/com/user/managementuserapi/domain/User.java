package com.user.managementuserapi.domain;

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

    private List<Request> requestList = new ArrayList<Request>();

    private List<RequestStage> requestStageList = new ArrayList<RequestStage>();
}
