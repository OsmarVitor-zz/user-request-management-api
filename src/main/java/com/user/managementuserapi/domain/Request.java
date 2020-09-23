package com.user.managementuserapi.domain;

import com.user.managementuserapi.domain.enums.RequestState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private UUID uuid;

    private String subject;

    private String description;

    private Date createdAt;

    private RequestState state;

    private User user;

    private List<RequestStage> requestStages = new ArrayList<RequestStage>();
}
