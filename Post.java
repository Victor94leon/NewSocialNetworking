import java.util.ArrayList;
public class Post
{
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor de objetos de la clase Post
     */
    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();
    }

    /**
     * Incrementa en uno los likes
     */
    public void like() {
        likes++;
    }

    /**
     * Decrementa en uno los likes si son mayores que 0
     */
    public void unlike() {
        if(likes>=1) {
            likes--;
        }
    }

    /**
     * Añade un comentario
     */
    public void addComment(String text) {
        comments.add(text);
    }

    /**
     * Devuelve el tiempo
     */
    public long getTimeStamp() {
        return timestamp;
    }

    /**
     * Metodo para pasar el tiempo a minutos y segundos.
     */
    private String timeString(long time){
        String info = "";
        int sec =  (int)(time / 1000) % 60;
        int min =  (int)((time / (1000*60)) % 60);
        if(min > 0)
            info += min + " Minutes, ";
        info += sec + " Seconds\n";
        return info;
    }
}
