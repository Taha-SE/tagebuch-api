package com.tahase.tagebuch.tagebuch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/tagebuch")
public class TagebuchController {
    private final TagebuchService tagebuchService ;

    @Autowired
    public TagebuchController(TagebuchService tagebuchService) {
        this.tagebuchService = tagebuchService;
    }

    @GetMapping
    public List<Tagebuch> getAllTagebuchEntries(){
        return tagebuchService.getAllTagebuchEntries();
    }

    @PostMapping
    public void addTagebuch(@RequestBody Tagebuch tagebuch){
        tagebuchService.addNewTagebuch(tagebuch);
    }

    @DeleteMapping(path="tagebuchId")
    public void deleteTagebuch(@PathVariable("tagebuchId") long tagebuchId){
        tagebuchService.deleteTagebuch(tagebuchId);
    }
}
