package beer.controller;


import beer.model.Beer;

import java.util.HashMap;
import java.util.Map;

public class BeerStub {
    private static Map<Long, Beer> beers = new HashMap<Long, Beer>();
    private static Long idIndex = 3L;

    static {
//        Beer a = new Beer(1L,  5, "563 Stout", 0, "Deep black color, toasted black burnt coffee flavors and aroma. Dispensed with Nitrogen through a slow-flow faucet giving it the characteristic cascading effect, resulting in a rich dense creamy head.", "American-Style Stout","21st_amendment_brewery_cafe","beer", "North American Ale",0,   "2010-07-22 20:00:20", 0);
//        beers.put(1L, a);
//        Beer b = new Beer(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
//        beers.put(2L, b);
//        Beer c = new Beer(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
//        beers.put(3L, c);
    }

    public static Beer get(Long id) {
        return beers.get(id);
    }
}
