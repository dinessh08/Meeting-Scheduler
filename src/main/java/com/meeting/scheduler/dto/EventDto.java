package com.meeting.scheduler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    private Long id;
    private String status;
    private String createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime eventStartTime;
    private LocalDateTime eventEndTime;
    private boolean isRecursive;
    private String eventType;
}
