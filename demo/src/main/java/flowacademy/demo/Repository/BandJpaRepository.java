package flowacademy.demo.Repository;


import flowacademy.demo.model.BandModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository {

    List<BandModel> findByBandNameContainingOrAlbumNameContaining(String name);


}
