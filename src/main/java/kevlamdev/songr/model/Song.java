package kevlamdev.songr.model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String title;


    int length;
    int trackNumber;

    // Relationship: there are MANY songs to ONE album
    @ManyToOne
    Album featuredOnAlbum;

    public Song() {
        // default constructor
    }

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getFeaturedOnAlbum() {
        return featuredOnAlbum;
    }

    public void setFeaturedOnAlbum(Album featuredOnAlbum) {
        this.featuredOnAlbum = featuredOnAlbum;
    }
    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", length='" + length + '\'' +
                ", trackNumber='" + trackNumber + '\'' +
                ", featuredOnAlbum=" + featuredOnAlbum +
                '}';
    }
}
