package com.playlists.music.player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Integer> {
//    Optional<Song> findAlbumByAlbumName(String name);
//    List<Song> findAlbumsByArtist_ArtistName(String artistName);
}
