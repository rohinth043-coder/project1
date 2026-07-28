import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VideoStreamingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> videos = new ArrayList<>();

        // Default Videos
        videos.add("Java Tutorial");
        videos.add("Python Course");
        videos.add("Movie Trailer");
        videos.add("Music Video");
        videos.add("HTML Basics");

        int choice;

        do {

            System.out.println("\n===== VIDEO STREAMING SYSTEM =====");
            System.out.println("1. View Videos");
            System.out.println("2. Search Video");
            System.out.println("3. Play Video");
            System.out.println("4. Add Video");
            System.out.println("5. Sort Videos");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Videos:");
                    for (int i = 0; i < videos.size(); i++) {
                        System.out.println((i + 1) + ". " + videos.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Enter Video Name: ");
                    String search = sc.nextLine();

                    if (videos.contains(search)) {
                        System.out.println("Video Found: " + search);
                    } else {
                        System.out.println("Video Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Video Name: ");
                    String play = sc.nextLine();

                    if (videos.contains(play)) {
                        System.out.println("Now Playing: " + play);
                    } else {
                        System.out.println("Video Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter New Video Name: ");
                    String newVideo = sc.nextLine();

                    videos.add(newVideo);

                    System.out.println("Video Added Successfully.");
                    break;

                case 5:
                    Collections.sort(videos);
                    System.out.println("Videos Sorted Successfully.");

                    System.out.println("\nSorted Video List:");
                    for (int i = 0; i < videos.size(); i++) {
                        System.out.println((i + 1) + ". " + videos.get(i));
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
