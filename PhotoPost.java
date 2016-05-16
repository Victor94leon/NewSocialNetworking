public class PhotoPost extends CommentsPost
{
    private String filename;
    private String caption;
    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author,String filename,String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
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
}
