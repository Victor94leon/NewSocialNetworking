import java.util.ArrayList;
public class Comments extends Post
{
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class Comments
     */
    public Comments(String author)
    {
        super(author);
        comments = new ArrayList<>();
    }
    
    /**
     * Añade un comentario
     */
    public void addComment(String comment) {
        comments.add(comment);
    }
}
