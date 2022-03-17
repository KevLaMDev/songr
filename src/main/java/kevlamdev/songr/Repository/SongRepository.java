package kevlamdev.songr.Repository;

import kevlamdev.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

interface SongRepository extends JpaRepository<Song, Long> {
}
