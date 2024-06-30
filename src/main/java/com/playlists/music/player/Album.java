package com.playlists.music.player;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "AlbumID")
    private int albumId;

    @Column(nullable = false)
    private String albumTitle;

    @Column(nullable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date releaseDate;

    // Getters and setters

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }
}
