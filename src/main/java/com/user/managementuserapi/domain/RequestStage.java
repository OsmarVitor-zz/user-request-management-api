package com.user.managementuserapi.domain;

import com.user.managementuserapi.domain.enums.RequestState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestStage {

    private UUID uuid;

    private String description;

    private Date createdAt;

    private RequestState state;

    private Request request;

    private User user;
}
