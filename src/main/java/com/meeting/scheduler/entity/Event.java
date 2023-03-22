package com.meeting.scheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventStatus;
    private String createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime eventStartTime;
    private LocalDateTime eventEndTime;
    private boolean isRecursive;
    private String eventType;
}
