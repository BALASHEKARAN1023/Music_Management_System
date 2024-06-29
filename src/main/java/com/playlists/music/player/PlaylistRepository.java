package com.playlists.music.player;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{
}
