package Playlist;

// song class can be converted to Record class -> so I did that! to get 0 warnings.
public record Song(String title, String duration) {

    @Override
    public String toString() {
        return String.format("%s - %s", title, duration);
    }
}
