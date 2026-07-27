import java.util.Arrays;
import java.util.Scanner;

public class VideoStreamingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] videos = new String[10];
        String[] category = new String[10];

        videos[0] = "Java Tutorial";
        category[0] = "Education";

        videos[1] = "Python Course";
        category[1] = "Education";

        videos[2] = "Movie Trailer";
        category[2] = "Entertainment";

        videos[3] = "Music Video";
        category[3] = "Music";

        videos[4] = "HTML Basics";
        category[4] = "Education";

        int count = 5;
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
                    System.out.println("\nAvailable Videos");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + videos[i] + " - " + category[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter Video Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (videos[i].toLowerCase().contains(search.toLowerCase())) {
                            System.out.println("Found: " + videos[i] + " - " + category[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Video Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Video Number: ");
                    int video = sc.nextInt();

                    if (video >= 1 && video <= count) {
                        System.out.println("Now Playing: " + videos[video - 1]);
                    } else {
                        System.out.println("Invalid Video Number");
                    }
                    break;

                case 4:
                    if (count < videos.length) {
                        System.out.print("Enter Video Name: ");
                        videos[count] = sc.nextLine();

                        System.out.print("Enter Category: ");
                        category[count] = sc.nextLine();

                        count++;

                        System.out.println("Video Added Successfully.");
                    } else {
                        System.out.println("Storage Full.");
                    }
                    break;

                case 5:
                    Arrays.sort(videos, 0, count);
                    System.out.println("Videos Sorted Successfully.");
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