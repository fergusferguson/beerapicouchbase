package beer.repository;

import beer.model.Beer;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BeerRepository extends CouchbaseRepository<Beer, String> {

    //Beer findOne(String id);

    @Query("#{#n1ql.selectEntity} WHERE type = 'beer' AND style = $1")
    List<Beer> findByStyle(String style);

}
