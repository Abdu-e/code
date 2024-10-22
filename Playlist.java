// Surname: <Esau>
// Name: <Abdu-Raziq>
// Student no: <4270797>
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: <Playlist>

class Playlist
{
    //2.1
    private Track root;
    private int size;

    //2.2
    public Playlist()
    {
        root = null;
        size = 0;
    }

    //2.3
    public Track getRoot()
    {
        return root;
    }
    public int getSize()
    {
        return size;
    }

    //2.4
    public void setRoot(Track root)
    {
        this.root = root;
    }
    public void setSize(int size)
    {
        this.size = size;
    }

    //2.5
    public void clear()
    {
        root = null;
        size = 0;
    }

    //2.6
    private Boolean search(String title)
    {
        Track current = root;
        while (current != null) 
        {
            if (current.getTitle().equals(title)) 
            {
                return true;
            } else if (title.compareTo(current.getTitle()) < 0) 
            {
                current = current.getLeft();
            } else 
            {
                current = current.getRight();
            }
        }
        return false;
    }

    //2.7
    public void insert(String title, String artist, String album, int minutes, int seconds)
    {
        Track newTrack = new Track("", title, artist, album, seconds, minutes);

        if(root == null) 
        {

        }

    }
    public void delete(String title)
    {

    }
    public void displayInOrder(Track t)
    {

    }
    int height(Track t)
    
}
