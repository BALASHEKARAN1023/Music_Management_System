package com.playlists.music.player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
//    Optional<User> findAlbumByAlbumName(String name);
//    List<User> findAlbumsByArtist_ArtistName(String artistName);
}
