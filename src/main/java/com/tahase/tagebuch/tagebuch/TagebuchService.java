package com.tahase.tagebuch.tagebuch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagebuchService {
    private final TagebuchRepository tagebuchRepository;

    @Autowired
    public TagebuchService(TagebuchRepository tagebuchRepository) {
        this.tagebuchRepository = tagebuchRepository;
    }

    public List<Tagebuch> getAllTagebuchEntries() { return tagebuchRepository.findAllByOrderByDateDesc();}

    public void addNewTagebuch (Tagebuch tagebuch){
        tagebuchRepository.save(tagebuch);
    }
    public void deleteTagebuch (long tagebuchId){
        tagebuchRepository.deleteById(tagebuchId);
    }



}
