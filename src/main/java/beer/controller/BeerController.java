package beer.controller;

import beer.service.BeerService;
import beer.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @RequestMapping(value = "beers/{id}", method = RequestMethod.GET, produces = "application/json")
    public Beer getBeer(@PathVariable String id){
        return beerService.getBeer(id);
    }

//    @RequestMapping(value = "beers/", method = RequestMethod.GET, produces = "application/json")
//    public List<Beer> getBeersByBrewery(@PathVariable String breweryId){
//        return beerService.getBeersByBrewery(breweryId);
//    }
}
