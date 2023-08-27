package Exercise02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Note {
    private static int noteCounter = 1;
    private int id;
    private String text;
    private Date creationDate;
    private List<String> tags;

    public Note(String text) {
        this.id = noteCounter++;
        this.text = text;
        this.creationDate = new Date();
        this.tags = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public boolean match(String filter, List<String> searchTags) {
        if (text.contains(filter)) {
            for (String tag : searchTags) {
                if (tags.contains(tag)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", creationDate=" + creationDate +
                ", tags=" + tags +
                '}';
    }
}