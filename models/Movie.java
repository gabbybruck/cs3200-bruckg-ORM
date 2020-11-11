package com.example.wap.models;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String poster;
    private String imdbID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String p) {
        this.poster = p;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String im) {
        this.imdbID = im;
    }


}
