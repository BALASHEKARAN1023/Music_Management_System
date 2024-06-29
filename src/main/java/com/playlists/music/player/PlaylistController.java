package com.playlists.music.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistRepository playlistRepository;

    @GetMapping
    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    @PostMapping
    public Playlist createPlaylist(@RequestBody Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    @GetMapping("/{id}")
    public Playlist getPlaylistById(@PathVariable Integer id) {
        return playlistRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Playlist updatePlaylist(@PathVariable Integer id, @RequestBody Playlist playlistDetails) {
        Playlist playlist = playlistRepository.findById(id).orElse(null);
        if (playlist != null) {
            playlist.setPlaylistName(playlistDetails.getPlaylistName());
            playlist.setDescription(playlistDetails.getDescription());
            playlist.setUser(playlistDetails.getUser());
            playlist.setSong(playlistDetails.getSong());
            return playlistRepository.save(playlist);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void deletePlaylist(@PathVariable Integer id) {
        playlistRepository.deleteById(id);
    }
}
