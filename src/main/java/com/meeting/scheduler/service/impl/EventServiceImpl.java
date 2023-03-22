package com.meeting.scheduler.service.impl;

import com.meeting.scheduler.dto.EventResponseDto;
import com.meeting.scheduler.entity.Event;
import com.meeting.scheduler.repo.EventRepo;
import com.meeting.scheduler.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {

    private EventRepo eventRepo;


    @Override
    public EventResponseDto getEvents() {

        List<Event> events = eventRepo.findAll();
        EventResponseDto eventResponseDto = new EventResponseDto();
        return eventResponseDto;
    }
}
