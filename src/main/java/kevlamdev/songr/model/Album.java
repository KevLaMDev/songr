package kevlamdev.songr.model;

import javax.persistence.*;
import java.util.List;


@Entity //add Entity annotation
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    String imageUrl;
    int songCount;
    int length;

    // map this by the Album property of Song Class Objects
    @OneToMany(mappedBy = "featuredOnAlbum", cascade = CascadeType.ALL)
    List<Song> songList;

    public Album() {
        // default constructor
    }

    public Album(String title, String artist, String imageUrl, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", songCount=" + songCount +
                ", length=" + length +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addSongToSongList(Song song) {
        songList.add(song);
    }

    public List<Song> getSongList() {
        return songList;
    }
}
