public class Song {

    // YOUR CODE GOES HERE
    private String artist;
    private String title;
    private int duration;
    public static String collectionName;


    public Song(String artistp, String titlep, int durationp){
        this.artist = artistp;
        this.title = titlep;
        this.duration = durationp;
    }

    private String getArtist() {
        return artist;
    }

    private void setArtist(String artist) {
        this.artist = artist;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private int getDuration() {
        return duration;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void collectionName(String collectionName) {
        Song.collectionName = collectionName;
    }
    public String getMinutes(int duration){
        int temp = duration;
        int minutes = temp / 60;
        int seconds = temp % 60;
        return String.format("%d:%d", minutes, seconds);
    }
    public String toString(){
        return this.title + " (" + this.artist + ") - " + getMinutes(this.duration);
    }
}
