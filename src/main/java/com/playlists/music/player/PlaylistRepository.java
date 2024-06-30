package com.playlists.music.player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.List;
import java.util.Optional;
@EnableJpaRepositories
public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{
//    Optional<Playlist> findAlbumByAlbumName(String name);
//    List<Playlist> findAlbumsByArtist_ArtistName(String artist_id);
}
