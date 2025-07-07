package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Album> album = new ArrayList<>();
    public static LinkedList<String> playlist = new LinkedList<>();
    public static char previousChoice = '\0'; // no choice selected
    private static ListIterator<String> iterator = playlist.listIterator();

    public static void main(String[] args) {
        LinkedList<Song> songList1 = new LinkedList<>();
        // album1
        Album album1 = new Album("Midnight Vibes", songList1);
        // album1 songs
        songList1.add(new Song("Lost in the Night", "3:45"));
        songList1.add(new Song("City Lights", "4:02"));
        songList1.add(new Song("Echoes of Silence", "3:50"));

        LinkedList<Song> songList2 = new LinkedList<>();
        // album2
        Album album2 = new Album("Summer Beats", songList2);
        // album2 songs
        songList2.add(new Song("Ocean Eyes", "4:10"));
        songList2.add(new Song("Sunny Side Up", "3:30"));
        songList2.add(new Song("Beach Walk", "3:55"));

        LinkedList<Song> songList3 = new LinkedList<>();
        // album3
        Album album3 = new Album("Chill Storm", songList3);
        // album3 songs
        songList3.add(new Song("Raindrop Melody", "4:20"));
        songList3.add(new Song("Cold Breeze", "3:47"));
        songList3.add(new Song("Thunder Dreams", "4:05"));

        // storing albums in an ArrayList
        album.add(album1);
        album.add(album2);
        album.add(album3);
        System.out.println(album);

        // adding songs from different albums to a playlist
        addSongsToPlaylist(album1, 0);
        addSongsToPlaylist(album1, 2);
        addSongsToPlaylist(album2, 1);
        addSongsToPlaylist(album3, 0);
        addSongsToPlaylist(album3, 4);
        System.out.println();
        System.out.println("Playlist contains: " + playlist);
        iterator = playlist.listIterator();

        menu();
    }

    public static void addSongsToPlaylist(Album album, int index) {
        try {
            playlist.add(String.valueOf(album.getSongLinkedList().get(index)));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Some song(s) does not exist in the provided album! Hence cannot be added to the playlist...");
        }

    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Available actions (select word or letter):
                (F)orward to the next song
                (B)ackward to the previous song
                (R)eplay the current song
                (L)ist the playlist
                (M)enu
                (Q)uit
                """);
        boolean flag = true;
        while (flag) {
            char choice = Character.toUpperCase(sc.next().charAt(0));
            switch (choice) {
                case 'F' -> interaction('F'); // forward the pointer
                case 'B' -> interaction('B'); // backward the pointer
                case 'L' -> interaction('L'); // list the places
                case 'R' -> interaction('R'); // Repeat
                case 'M' -> {
                    flag = false; // quit previous menu, before starting a new menu
                    interaction('M');
                } // menu
                case 'Q' -> {
                    flag = false;
                    System.out.println("Exiting menu, Goodbye!");

                } // quit
                default -> System.out.println("Option doesn't exist"); // if no such options selected
            }
        }
    }

    // sorry for the boiler-plates :(
    private static void interaction(char choice) {


        if (choice == 'F') {
            if (iterator.hasNext()) {
                if (previousChoice == 'B') {
                    iterator.next();
                    previousChoice = 'F';
                    if (iterator.hasNext()) {
                        System.out.println("Now playing:" + iterator.next());
                        previousChoice = 'F';
                    } else {
                        System.out.println("Reached end of the list");
                        previousChoice = 'F';
                    }
                } else {
                    System.out.println("Now playing:" + iterator.next());
                    previousChoice = 'F';
                }
            } else {
                System.out.println("Reached end of the list");
                previousChoice = 'F';
            }
        } else if (choice == 'B') {
            if (iterator.hasPrevious()) {
                if (previousChoice == 'F') {
                    iterator.previous();
                    previousChoice = 'B';
                    if (iterator.hasPrevious()) {
                        previousChoice = 'B';
                        System.out.println("Now playing:" + iterator.previous());
                    } else {

                        System.out.println("Reached start of the list");
                        previousChoice = 'B';
                    }
                } else {
                    System.out.println("Now playing:" + iterator.previous());
                    previousChoice = 'B';
                }
            } else {
                System.out.println("Reached start of the list");
                previousChoice = 'B';
            }
        } else if (choice == 'L') {
            System.out.println(playlist);
        } else if (choice == 'R') {
            if (previousChoice == 'F') {
                if (iterator.hasPrevious()) {
                    String repeat = iterator.previous(); // go back
                    System.out.println("Replaying: " + repeat);
                    iterator.next(); // move forward again to stay at same song
                } else {
                    System.out.println("No song to repeat.");
                }
            } else if (previousChoice == 'B') {
                if (iterator.hasNext()) {
                    String repeat = iterator.next(); // go forward
                    System.out.println("Replaying: " + repeat);
                    iterator.previous(); // move back again to stay at same song
                } else {
                    System.out.println("No song to repeat.");
                }
            } else {
                System.out.println("No previous song played to repeat.");
            }
        } else {
            menu();
        }

    }


}


//    public static void main(String[] args) {
//        LinkedList<Song> iterator = new LinkedList<>();
//        Song clouds = new Song("Clouds by Sabrina Carpenter", "5min 6sec");
//        Song love = new Song("Lucy's love by Isac Ibrahim", "2min 0sec");
//        addSong(iterator, clouds);
//        addSong(iterator, love);
//        addSong(iterator, love);
//        System.out.println(iterator);
//    }
//    private static void addSong(LinkedList<Song> songList, Song song) {
//        // check if duplicate song exists
//        for (var songElement : songList) {
//            if (songElement.title().equalsIgnoreCase(song.title())) {
//                System.out.println("\"" + song + "\"" + " already exists in the playlist!");
//                return;
//            }
//        }
//        // if not duplicate, add
//        songList.add(song);
//    }