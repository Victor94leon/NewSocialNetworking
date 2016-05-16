import java.util.ArrayList;
public class MessagePost extends Post
{
    private String message;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author,String message)
    {
        super(author);
        this.message = message;
        comments = new ArrayList<String>();
    }

    /**
     * Devuelve el mensaje
     */
    public String getMessage() {
        return message;
    }

    /**
     * Muestra por pantalla quien es el autor del post
     */
    public void printShortSummary() {
        System.out.println("Esto es un post de texto creado por " + getUsername());
    }

    /**
     * Añade un comentario
     */
    public void addComment(String text) {
        comments.add(text);
    }
}