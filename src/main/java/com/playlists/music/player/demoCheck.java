package com.playlists.music.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCheck {
    @GetMapping("/")
    public String check(){
        return "hello Bala it is stated";
    }

}
