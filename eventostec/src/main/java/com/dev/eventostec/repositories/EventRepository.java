package com.dev.eventostec.repositories;

import com.dev.eventostec.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
