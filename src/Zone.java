
public class Zone {
    public String name;
    public double latitude;
    public double longitude;
    public double radiusKm;

    public Zone(String name, double latitude, double longitude, double radiusKm) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radiusKm = radiusKm;
    }

    public boolean contains(double lat, double lon) {
        return haversine(latitude, longitude, lat, lon) <= radiusKm;
    }

    private static double haversine(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}
