package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTypeJpaRepository extends JpaRepository<TicketType,String> {
}
