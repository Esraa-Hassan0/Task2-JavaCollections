
import java.util.Set;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhotoManager {
    Set<Photo> repo;

    public PhotoManager() {
        repo = new HashSet<>();
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
        for (Photo ph : repo)
            if (ph.getlocation().equals(loc))
                tmp.add(ph);

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
