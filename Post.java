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
     * Devuelve el username
     */
    public String getUsername() {
        return username;
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

    /**
     * Metodo que muestra toda la info del post
     */
    public void display(){
        String info = "";
        long time = System.currentTimeMillis() - getTimeStamp();
        info += username + "\n=====================\n" + "Posted: ";
        info += timeString(time);
        info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
        if(comments.size() != 0)
            for(int i=0; i<comments.size(); i++)
                info += comments.get(i) + "\n_____________________\n";
        else
            info += "Sin comentarios";
        System.out.println(info);
    }
}
