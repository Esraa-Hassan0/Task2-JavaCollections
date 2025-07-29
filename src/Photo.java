
import java.time.*;
import java.util.Set;

public class Photo {
    private String id;
    private String fileName;
    private LocalDate date;
    private String  location;
    private Set<String> tags;

    public Photo(String id, String fileName, LocalDate date, String location , Set<String> tags) {
        this.id = id;
        this.fileName = fileName;
        this.date = date;
        this.location = location;
        this.tags = tags;
    }

    public String getlocation() {
        return location;
    }


    public LocalDate getDate() {
        return date;
    }

    public Set<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Photo{id='" + id + "', fileName='" + fileName + "', date=" + date +
               ", lat=" + location + ", tags=" + tags + "}";
    }
}
