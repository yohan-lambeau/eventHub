package yohan.lambeau.com.eventhub.eventservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yohan.lambeau.com.eventhub.eventservice.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
