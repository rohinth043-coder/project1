import java.util.Scanner;

public class VideoStreamingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] videos = {
            "Java Tutorial",
            "Python Course",
            "Movie Trailer",
            "Music Video",
            "HTML Basics"
        };

        String[] category = {
            "Education",
            "Education",
            "Entertainment",
            "Music",
            "Education"
        };

        int choice;

        do {
            System.out.println("\n===== VIDEO STREAMING SYSTEM =====");
            System.out.println("1. View Videos");
            System.out.println("2. Search Video");
            System.out.println("3. Play Video");
            System.out.println("4. Sort Video");
            System.out.println("Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Videos");
                    for (int i = 0; i < videos.length; i++) {
                        System.out.println((i + 1) + ". " + videos[i] + " - " + category[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter Video Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < videos.length; i++) {
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

                    if (video >= 1 && video <= videos.length) {
                        System.out.println("Now Playing: " + videos[video - 1]);
                    } else {
                        System.out.println("Invalid Video Number");
                    }
                    break;
                 
                case 4:
                    System.out.println("sort video");
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}