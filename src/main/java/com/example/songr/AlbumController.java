package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepository;

    @PostMapping("/album")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String showAlbums(Model model) {
        ArrayList<Album> albumsList = (ArrayList<Album>) albumRepository.findAll();
        model.addAttribute("albumsList", albumsList);
        return "albums";
    }
}
