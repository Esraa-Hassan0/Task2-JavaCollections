package Fawry.JavaCollections;

import java.util.Set;
import java.time.*;

public class Main {
        public static void main(String[] args) {
                PhotoManager manager = new PhotoManager();

                manager.uploadPhoto(new Photo("1", "pyramids.jpg", LocalDate.of(2023, 3, 10),
                                29.9792, 31.1342, Set.of("pyramids", "egypt")));

                manager.uploadPhoto(new Photo("2", "nile.jpg", LocalDate.of(2023, 4, 22),
                                30.2001, 31.2333, Set.of("nile", "egypt")));

                // Search by single tag
                System.out.println("Photos with tag 'egypt':");
                manager.searchByTag("egypt").forEach(System.out::println);

                // Search by date
                System.out.println("Photos taken on 2023-04-22:");
                manager.searchByDate(LocalDate.of(2023, 4, 22)).forEach(System.out::println);

                // Search by multiple tags
                System.out.println("Photos with tags [egypt, museum]:");
                manager.searchByMultipleTags(Set.of("egypt",
                                "museum")).forEach(System.out::println);

                System.out.println("Photos in Cairo zone:");
                manager.searchByLocation("Cairo").forEach(System.out::println);

                System.out.println("Photos in Alexandria zone:");
                manager.searchByLocation("Alexandria").forEach(System.out::println);

                // Search by multiple tags
                System.out.println("Photos with tags [egypt, museum]:");
                manager.searchByMultipleTags(Set.of("egypt",
                                "museum")).forEach(System.out::println);
        }
}
