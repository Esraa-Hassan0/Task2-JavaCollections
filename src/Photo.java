
import java.time.*;
import java.util.Set;

public class Photo {
    private String id;
    private String fileName;
    private LocalDate date;
    private double latitude;
    private double longitude;
    private Set<String> tags;

    public Photo(String id, String fileName, LocalDate date, double latitude, double longitude, Set<String> tags) {
        this.id = id;
        this.fileName = fileName;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
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
               ", lat=" + latitude + ", lon=" + longitude + ", tags=" + tags + "}";
    }
}
