import java.util.ArrayList;
public class PhotoPost extends Post
{
    private String filename;
    private String caption;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author,String filename,String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
        comments = new ArrayList<String>();
    }

    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }

    /**
     * Añade un comentario
     */
    public void addComment(String text) {
        comments.add(text);
    }
}
