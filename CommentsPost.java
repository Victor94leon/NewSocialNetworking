import java.util.ArrayList;
public class CommentsPost extends Post
{
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class Comments
     */
    public CommentsPost(String author)
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
