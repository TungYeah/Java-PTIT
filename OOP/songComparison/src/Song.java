public class Song {
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }


    public boolean equals(Song song) {
        return this.name.equals(song.name) &&
                this.author.equals(song.author) &&
                this.duration == song.duration;
    }
}
