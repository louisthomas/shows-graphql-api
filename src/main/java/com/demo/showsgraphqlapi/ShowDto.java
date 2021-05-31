package com.demo.showsgraphqlapi;

public class ShowDto {

    private String title;
    private int releaseYear;
    private String posterUrl;

    public ShowDto(String title, int releaseYear, String posterUrl) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.posterUrl = posterUrl;
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
}
