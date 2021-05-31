package com.demo.showsgraphqlapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/shows")
public class ShowsController {

    private final ShowsService showsService;

    public ShowsController(ShowsService showsService) {
        this.showsService = showsService;
    }

    @GetMapping
    public List<Show> shows(@RequestParam(required = false) String title) {
        return showsService.getShows(title);
    }

    @PostMapping
    public Show addShow(@RequestBody ShowDto showDto) {
        return showsService.addShow(showDto.getTitle(), showDto.getReleaseYear(), showDto.getPosterUrl());
    }

    @DeleteMapping("/{id}")
    public Show removeShow(@PathVariable("id") String id) {
        return showsService.removeShow(id);
    }
}
