package yohan.lambeau.com.eventhub.eventservice.service;

import org.springframework.stereotype.Service;
import yohan.lambeau.com.eventhub.eventservice.model.Event;
import yohan.lambeau.com.eventhub.eventservice.repository.EventRepository;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
}
