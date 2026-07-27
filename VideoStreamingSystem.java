import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class VideoStreamingSystem extends JFrame implements ActionListener {

    ArrayList<String> videos = new ArrayList<>();

    JTextArea display;
    JTextField textField;

    JButton viewBtn, searchBtn, playBtn, addBtn, sortBtn, exitBtn;

    public VideoStreamingSystem() {

        setTitle("Video Streaming System");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        videos.add("Java Tutorial");
        videos.add("Python Course");
        videos.add("Movie Trailer");
        videos.add("Music Video");
        videos.add("HTML Basics");

        display = new JTextArea(15, 40);
        display.setEditable(false);

        textField = new JTextField(20);

        viewBtn = new JButton("View Videos");
        searchBtn = new JButton("Search Video");
        playBtn = new JButton("Play Video");
        addBtn = new JButton("Add Video");
        sortBtn = new JButton("Sort Videos");
        exitBtn = new JButton("Exit");

        add(new JLabel("Video Name:"));
        add(textField);

        add(viewBtn);
        add(searchBtn);
        add(playBtn);
        add(addBtn);
        add(sortBtn);
        add(exitBtn);

        add(new JScrollPane(display));

        viewBtn.addActionListener(this);
        searchBtn.addActionListener(this);
        playBtn.addActionListener(this);
        addBtn.addActionListener(this);
        sortBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == viewBtn) {
            display.setText("Available Videos\n\n");
            for (int i = 0; i < videos.size(); i++) {
                display.append((i + 1) + ". " + videos.get(i) + "\n");
            }
        }

        else if (e.getSource() == searchBtn) {
            String name = textField.getText();

            if (videos.contains(name)) {
                display.setText("Video Found : " + name);
            } else {
                display.setText("Video Not Found");
            }
        }

        else if (e.getSource() == playBtn) {
            String name = textField.getText();

            if (videos.contains(name)) {
                display.setText("Now Playing : " + name);
            } else {
                display.setText("Video Not Found");
            }
        }

        else if (e.getSource() == addBtn) {
            String name = textField.getText();

            if (!name.isEmpty()) {
                videos.add(name);
                display.setText("Video Added Successfully");
                textField.setText("");
            } else {
                display.setText("Enter Video Name");
            }
        }

        else if (e.getSource() == sortBtn) {
            Collections.sort(videos);
            display.setText("Videos Sorted Successfully");
        }

        else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new VideoStreamingSystem();
    }
}