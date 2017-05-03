package beer.service;

import beer.repository.BeerRepository;
import beer.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component("beerService")
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public Beer getBeer(String id){
        return beerRepository.findOne(id);
    }

//    @Override
//    public List<Beer> getBeersByBrewery(HttpServletRequest request){
//
//
//        return beerRepository.findByBreweryId(breweryId);
//    }

}
