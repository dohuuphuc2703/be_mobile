package com.example.btl_mobile.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.btl_mobile.model.entity.Event;
import com.example.btl_mobile.model.service.EventService;
import com.example.btl_mobile.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
	@Override
	public Event updateEvent(int id, Event event) {
		event.setId(id);
        return eventRepository.save(event);
    }
	@Override
	public boolean deleteEvent(int id) {
        eventRepository.deleteById(id);
        return true;
    }
	@Override
	public Event getEventById(int id) {
		return eventRepository.findById(id).orElse(null);
	}
	@Override
	public List<Event> getAllEvent() {
        return eventRepository.findAll();
    }
}
