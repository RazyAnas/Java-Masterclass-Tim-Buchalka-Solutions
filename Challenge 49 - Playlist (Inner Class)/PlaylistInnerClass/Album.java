package PlaylistInnerClass;

import java.util.ArrayList;

// album class from playlist challenge
public class Album {

    public String albumName;

//    LinkedList<Song> songLinkedList = new LinkedList<>(); // "HAS A" SONG LIST

    public Album(String albumName, ArrayList<Song> songLinkedList) {
//        Album.albumName = albumName;
        SongList.setSongs(songLinkedList);
    }

    public void addSong(String title, String duration) {
        new Song(title, duration);
    }

    public void addToPlaylist(String playlistTitle, ArrayList<Song> playlist) {
//
//        SongList.add(new);
//
//        Album.SongList
    }


    // ---------------------------------------- inner class SongList ----------------------------------------

    public static class SongList {

        static ArrayList<Song> songs; // "HAS A" SONGS

        public SongList(ArrayList<Song> songs) {
            SongList.songs = songs;
        }

        //        public SongList(String... songs) {
//            this.songs = new ArrayList<>(List.of(songs));
//        }


        public static void setSongs(ArrayList<Song> songs) {
            SongList.songs = songs;
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

//        @Override
//        public String toString() {
//            return String.format("Album: {%s}: %s", Album.albumName, songs);
//        }

        // add() accepts type Song parameter.
        public static boolean add(Song song) {
            boolean flag = false;
            for (var s : songs) {
                if (s  != song) {
                    flag = true;
                    songs.add(song);
                }
            }
            return flag;
        }

        // findSong()
        public static Song findSong(Song title) {
            Song song = null;
            for (var s : songs) {
                if (s == title) {
                    song = s;
                }
            }
            return song;
        }

        public static Song findSong(int trackNumber) {

            if (songs.get(trackNumber) != null) {
                return songs.get(trackNumber);
            }
            else {
                return null;
            }
        }



    }
}
