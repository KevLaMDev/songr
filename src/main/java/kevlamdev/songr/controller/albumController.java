package kevlamdev.songr.controller;

import kevlamdev.songr.Repository.AlbumRepository;
import kevlamdev.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class albumController {
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/albums")
    public String getAlbums(Model model)
    {
        //instantiate album objects
        Album formattedExcess = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
        Album commando = new Album("Commando", "Niska", "https://m.media-amazon.com/images/I/81F78K931LL._SL1400_.jpg", 18, 55);
        Album ballads1 = new Album("Ballads1", "Joji", "https://upload.wikimedia.org/wikipedia/en/6/6a/Joji_%E2%80%93_Ballads_1.png", 12, 35);
        // pass data via attributes
        ArrayList<Album> albumArrayList = new ArrayList<>();
        albumArrayList.add(formattedExcess);
        albumArrayList.add(commando);
        albumArrayList.add(ballads1);
        ArrayList<Album> dbAlbumArrayList = (ArrayList<Album>)  albumRepository.findAll();
        model.addAttribute("albumArrayList", albumArrayList);
        model.addAttribute("dbAlbumArrayList", dbAlbumArrayList);
        // return html page
        return "albums.html";
    }
    @PostMapping("/add-album")
    public RedirectView addAlbum(Model m, String title, String artist, String imageUrl, int songCount, int length) {
        Album newAlbum = new Album(title, artist, imageUrl, songCount, length);
        albumRepository.save(newAlbum);

        return new RedirectView("/albums");
    }

}
