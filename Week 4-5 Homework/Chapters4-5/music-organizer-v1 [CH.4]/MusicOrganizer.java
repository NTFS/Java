import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    
    private ArrayList<String> Book;
    private MusicPlayer player;
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        player = new MusicPlayer();
    }
    
    private void checkIndex(int index)
{
  if(index >= 0 && files.size() >= -1)
    {
      files.get(index);
      System.out.println("valid");
    }
   else
    {
        
    }
}
    
private boolean validIndex(int index)
    {
        boolean valid;
        if(index < 0) {
            System.out.println("Index can't be a negative number: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index can't be bigger than the array size: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    } 

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    public void listAllFiles()
    {
        for(String filename : files) {
            System.out.println(filename);
        }
    }
    
    /**
     * List the names of files matching the given search string.
     * @param searchString The string to match.
     */
    public void listMatching(String listString)
    {
        for(String filename : files) {
            if(filename.contains(listString)) {
                System.out.println(filename);
            }
        }
    }
    
    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        //player.startPlaying(filename);
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
}
