
public class Post
{
    private String username;
    private long timestamp;
    private int likes;


    /**
     * Constructor de objetos de la clase Post
     */
    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0; 
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
        System.out.println(info);
    }
}
