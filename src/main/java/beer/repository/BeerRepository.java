package beer.repository;

import beer.model.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeerRepository extends CrudRepository<Beer, String>{

    Beer findOne(String id);

    List<Beer> findByBreweryId(String breweryName);
}
