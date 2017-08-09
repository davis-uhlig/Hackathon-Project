package com.TIYMay.Hackathon.service;

import com.TIYMay.Hackathon.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by duhlig on 8/9/17.
 */
public interface EventService {
    Event add(Event event);
    Event getById(int id);
    List<Event> get();
    Event update(Event event);
    void delete(int id);
}
