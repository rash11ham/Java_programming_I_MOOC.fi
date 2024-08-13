
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared){
        Song compareSong = (Song)compared;
        if(this.artist.equals(compareSong.artist) && 
                this.name.equals(compareSong.name) && 
                this.durationInSeconds == compareSong.durationInSeconds){
            return true;
        }
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Song)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
