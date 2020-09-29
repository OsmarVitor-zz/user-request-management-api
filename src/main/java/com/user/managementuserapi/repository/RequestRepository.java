package com.user.managementuserapi.repository;

import com.user.managementuserapi.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RequestRepository extends JpaRepository<Request, UUID> {

    public List<Request> findAllByUserUuid(UUID uuid);

}
