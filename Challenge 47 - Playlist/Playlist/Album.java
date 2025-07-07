package Playlist;

import java.util.LinkedList;

public class Album {
    private final String albumName;
//    private final Song song; // "HAS A" song
    LinkedList<Song> songLinkedList = new LinkedList<>(); // "HAS A" SONG LIST

    public Album(String albumName, LinkedList<Song> songLinkedList) {
        this.albumName = albumName;
        this.songLinkedList = songLinkedList;
    }

    public String getAlbumName() {
        return albumName;
    }

    public LinkedList<Song> getSongLinkedList() {
        return songLinkedList;
    }

    @Override
    public String toString() {
        return String.format("Album: {%s}: %s", albumName, songLinkedList);
    }
}
