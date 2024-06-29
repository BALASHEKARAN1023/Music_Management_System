package com.playlists.music.player;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SongRepository extends JpaRepository<Song, Integer> {
}
