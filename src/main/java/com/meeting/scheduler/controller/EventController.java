package com.meeting.scheduler.controller;

import com.meeting.scheduler.dto.EventResponseDto;
import com.meeting.scheduler.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
@AllArgsConstructor
public class EventController {

    private EventService eventService;

    @GetMapping("/hello")
    public ResponseEntity<String> sayHelloWorld() {

        return ResponseEntity.ok("Hello World!!");
    }

    @GetMapping
    public ResponseEntity<EventResponseDto> getAllEvents() {

        EventResponseDto eventResponseDto = eventService.getEvents();
        return ResponseEntity.ok(eventResponseDto);
    }
}
