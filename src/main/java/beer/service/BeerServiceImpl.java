package beer.service;

import beer.repository.BeerRepository;
import beer.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Component("beerService") public class BeerServiceImpl implements BeerService {

    @Autowired private BeerRepository beerRepository;

    @Override public Beer getBeer(String id) {
        return beerRepository.findOne(id);
    }

    @Override public List<Beer> getBeersByStyle(String style) {
        String decodedStyle = null;

        decodedStyle = formatStyleText(style);
        return beerRepository.findByStyle(decodedStyle);
    }

    private String formatStyleText(String style) {
        String decodedStyle = null;

        try {
            decodedStyle = URLDecoder.decode(style, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return decodedStyle;
    }

}
