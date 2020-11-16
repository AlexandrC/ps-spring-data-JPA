package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SessionJpaRepository extends JpaRepository<Session,Long> {
    @Query(value = "session_name", nativeQuery = true)
    public List<Session> getSessionsThatHaveName();
}
