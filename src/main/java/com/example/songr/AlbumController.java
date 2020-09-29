package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String showAlbums(Model model) {
        ArrayList<Album> albumsList = new ArrayList();
        albumsList.add(new Album("Album 1", "Artist 1", 10, 8099, "[album 1 URL]"));
        albumsList.add(new Album("Album 2", "Artist 2", 15, 9751, "[album 2 URL]"));
        albumsList.add(new Album("Album 3", "Artist 3", 17,10056, "[album 3 URL]"));
        model.addAttribute("albumsList", albumsList);
        return "albums";
    }
}
