public class MessagePost extends CommentsPost
{
    private String message;
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author,String message)
    {
        super(author);
        this.message = message;
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
}