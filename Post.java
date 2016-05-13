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
     * Devuelve un String que representa el momento de creación del post
     */
    public String timeString(long time) {
        int segundos = (int)(time - timestamp)/1000;
        String cadena = segundos + " segundos";
        if(segundos>=60) {
            int minutos = segundos/60;
            segundos = segundos%60;
            cadena = minutos + " minutos " + segundos + " segundos";
            if(minutos>=60) {
                int horas = minutos/60;
                minutos = minutos%60;
                cadena = horas + " horas " + minutos + " minutos " + segundos + " segundos";
            }
        }
        return cadena;
    } 
}
