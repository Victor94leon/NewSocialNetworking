public class MessagePost extends Post
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
}
