package com.demo.showsgraphqlapi;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShowsService {

  private final ShowsRepository showsRepository;

  public ShowsService(ShowsRepository showsRepository) {
    this.showsRepository = showsRepository;
  }

  public List<Show> getShows(String titleFilter) {
    List<Show> shows = showsRepository.findAll();
    if(titleFilter == null) {
      return shows;
    }
    return shows.stream().filter(s -> s.getTitle().contains(titleFilter)).collect(Collectors.toList());
  }

  public Show addShow(String title, int releaseYear, String posterUrl) {
    Optional<Show> showOptional = showsRepository.findByTitle(title);
    if(showOptional.isPresent()) {
      throw new IllegalArgumentException("The Show \"" + title + "\" is already present");
    }
    Show show = new Show(title, releaseYear, posterUrl);
    showsRepository.save(show);
    return show;
  }

  public Show removeShow(String id) {
    Optional<Show> showOptional = showsRepository.findById(id);
    if(showOptional.isEmpty()) {
      throw new IllegalArgumentException("Show with id: \""+id+"\" doesn't exist.");
    }else {
      showsRepository.deleteById(id);
      return showOptional.get();
    }
  }

}
