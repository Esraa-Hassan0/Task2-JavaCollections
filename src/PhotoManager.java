

import java.util.Set;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhotoManager {
    Set<Photo> repo;
    private Map<String, Zone> zones = new HashMap<>();

    public PhotoManager() {
        repo = new HashSet<>();
        zones.put("Cairo", new Zone("Cairo", 30.0444, 31.2357, 25));
        zones.put("Giza", new Zone("Giza", 29.987, 31.2118, 15));
        zones.put("Alexandria", new Zone("Alexandria", 31.2001, 29.9187, 20));
    }

    void uploadPhoto(Photo photo) {
        repo.add(photo);
    }

    public Set<Photo> searchByTag(String tag) {
        Set<Photo> tmp = new HashSet<>();
        for (Photo ph : repo)
            if (ph.getTags().contains(tag))
                tmp.add(ph);

        return tmp;
    }

    public Set<Photo> searchByMultipleTags(Set<String> tags) {
        Set<Photo> tmp = new HashSet<>();
        for (Photo ph : repo)
            for (String tg : ph.getTags()) {
                if (tags.contains(tg)) {
                    tmp.add(ph);
                    break;
                }
            }
        return tmp;
    }

    public Set<Photo> searchByDate(LocalDate date) {
        Set<Photo> tmp = new HashSet<>();
        for (Photo ph : repo)
            if (ph.getDate().equals(date))
                tmp.add(ph);

        return tmp;
    }

    public Set<Photo> searchByLocation(String loc) {
        Set<Photo> tmp = new HashSet<>();
        
        Zone zone = zones.get(loc);
        if (zone == null)
            return tmp;


        for (Photo p : repo) {
            if (zone.contains(p.getLatitude(), p.getLongitude())) {
                tmp.add(p);
            }
        }
        return tmp;
    }

    public void print() {
        for (Photo ph : repo) {
            for (String tg : ph.getTags()) {
                System.out.print(tg + "  ");
            }
            System.out.println();
        }
    }

}
