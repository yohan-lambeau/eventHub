package yohan.lambeau.com.eventhub.eventservice.controller;

import org.springframework.web.bind.annotation.*;
import yohan.lambeau.com.eventhub.eventservice.model.Event;
import yohan.lambeau.com.eventhub.eventservice.service.EventService;

import java.util.List;

@RestController
@RequestMapping("events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }
}
