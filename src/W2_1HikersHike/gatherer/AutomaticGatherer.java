package W2_1HikersHike.gatherer;

import W2_1HikersHike.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {

    public List<Hiker> getConfirmedHikers() {
        List<Hiker> hikers = new ArrayList<>();
        hikers.add(new Hiker("Lola"));
        hikers.add(new Hiker("Tom"));
        hikers.add(new Hiker("Peter"));
        hikers.add(new Hiker("Maria"));
        hikers.add(new Hiker("Samantha"));
        return hikers;
    }

}