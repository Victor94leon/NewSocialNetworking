import java.util.ArrayList;
public class NewsFeed
{   
    private ArrayList<Post> posts;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        posts = new ArrayList<>();
    }

    /**
     * Añade un Post
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     * Show the post
     */
    public void show(){
        for(Post postEnLista : posts){
            postEnLista.display();
        }
    }
}
