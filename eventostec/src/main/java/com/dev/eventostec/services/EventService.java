package com.dev.eventostec.services;

import com.dev.eventostec.dto.EventRequestDTO;
import com.dev.eventostec.entities.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {

    public Event createEvent(EventRequestDTO dto){
        String imgUrl = null;

        if(dto.image() != null){
            imgUrl = this.uploadImg(dto.image());
        }

        var event = new Event();
        event.setTitle(dto.title());
        event.setDescription(dto.description());
        event.setEventUrl(dto.eventUrl());
        event.setDate(new Date(dto.date()));
        event.setImgUrl(imgUrl);

        return new Event();
    }

    private String uploadImg(MultipartFile image) {
        return "";
    }
}
