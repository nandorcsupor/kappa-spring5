package flowacademy.demo.Repository;

import flowacademy.demo.model.AlbumModel;
import flowacademy.demo.model.BandModel;
import flowacademy.demo.model.TrackModel;
import org.springframework.stereotype.Repository;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BandTreeRepository {
    private final List<BandModel> Banddata = new ArrayList<>();
    private final List<AlbumModel> Albumdata = new ArrayList<>();
    private final List<TrackModel> Trackdata = new ArrayList<>();

    public TrackModel addTracktoAlbum(TrackModel Track, String id) {
        Albumdata.stream().filter(e -> e.getId()==id);

        return Track;

    }




}
