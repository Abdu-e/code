// Surname: <Esau>
// Name: <Abdu-Raziq>
// Student no: <4270797>
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: <Track>

public class Track
{
    //1.1
    private String id; 
    private String title; 
    private String artist;   
    private String album;
    private int minutes;
    private int seconds;
    private Track left;
    private Track right;
    
    //1.2
    public Track()
    {
        id = "";
        title = "";
        artist = "";
        album = "";
        minutes = 0;
        seconds = 0;
        left = null;
        right = null;
    }

    //1.3
    public Track(String id, String title, String artist, String album, int minute, int seconds)
    {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //1.4
    public String getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getAlbum()
    {
        return album;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public int getSeconds()
    {
        return seconds;
    }
    public Track getLeft()
    {
        return left;
    }
    public Track getRight()
    {
        return right;
    }

    //1.5
    public void setId(String id)
    {
        this.id = id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    public void setAlbum(String album)
    {
        this.album = album;
    }
    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }
    public void setLeft(Track left)
    {
        this.left = left;
    }
    public void setRight(Track right)
    {
        this.right = right;
    }

    //1.6
    public String toString()
    {
        return "Track title: " + title + "\n" + "Artist name: " + artist + "\n" + "Album title: " + "Track time: " + minutes + seconds;
    }
}