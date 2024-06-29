package com.playlists.music.player;
import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int songId;
    @Column(name = "release_date", nullable = false)
    private LocalDateTime releaseDate;
    @Column(nullable = false)
    private String songTitle;

    @Column(nullable = false)
    private Time duration;

    @ManyToOne
    @JoinColumn(name = "albumId")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "artistId")
    private Artist artist;

    // Getters and setters

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
}
