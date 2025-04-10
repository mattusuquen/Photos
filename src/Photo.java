package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.text.html.HTML.Tag;

public class Photo {

    private String filePath;
    private String caption;
    private LocalDateTime dateTaken;
    private List<Tag> tags;

    public Photo(String filePath, LocalDateTime dateTaken) {
        this.filePath = filePath;
        this.dateTaken = dateTaken;
        this.caption = "";
        this.tags = new ArrayList<>();
    }

    public String getFilePath() 
    {
        return filePath;
    }

    public String getCaption() 
    {
        return caption;
    }

    public LocalDateTime getDateTaken() 
    {
        return dateTaken;
    }

    public List<Tag> getTags() 
    {
        return tags;
    }

    public void setCaption(String caption) 
    {
        this.caption = caption;
    }

    public void addTag(Tag tag) 
    {
        if (!tags.contains(tag)) 
        {
            tags.add(tag);
        }
    }

    public void removeTag(Tag tag) 
    {
        tags.remove(tag);
    }

    public boolean hasTag(Tag tag) 
    {
        return tags.contains(tag);
    }

 
    public boolean Equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;
        
        Photo photo = (Photo) o;
        return filePath.equals(photo.filePath);
    }

    public int hash_Code() 
    {
        return Objects.hash(filePath);
    }

    public String to_String() 
    {
        return "Photo: " + filePath + ", caption: " + caption;
    }
    
}
