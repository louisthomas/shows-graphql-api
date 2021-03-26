package com.demo.showsgraphqlapi;

import org.springframework.data.annotation.Id;

public class Show {

  @Id
  private String id;
  private String title;
  private int releaseYear;
  private String posterUrl;

  public Show() {}

  public Show(String title, int releaseYear, String posterUrl) {
    this.title = title;
    this.releaseYear = releaseYear;
    this.posterUrl = posterUrl;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public String getPosterUrl() {
    return posterUrl;
  }

  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }

  @Override
  public String toString() {
    return "Show{" +
      "id='" + id + '\'' +
      ", title='" + title + '\'' +
      ", releaseYear=" + releaseYear +
      ", posterUrl='" + posterUrl + '\'' +
      '}';
  }
}
