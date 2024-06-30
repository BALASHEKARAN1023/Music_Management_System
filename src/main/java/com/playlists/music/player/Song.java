package com.playlists.music.player;
import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "Song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SongID")
    private int songId;
    @Column(name = "ReleaseDate")
    private String releaseDate;
    @Column(nullable = false)
    private String songTitle;

    @Column(nullable = false)
    private Time duration;

    @ManyToOne
    @JoinColumn(name = "AlbumID")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "ArtistID")
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


    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
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
