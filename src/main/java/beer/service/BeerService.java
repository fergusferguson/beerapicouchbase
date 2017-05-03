package beer.service;

import beer.model.Beer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BeerService {
    Beer getBeer(String id);

//    List<Beer> getBeersByBrewery(HttpServletRequest request);
}
