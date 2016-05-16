public class JoinGroupPost extends Post
{
    private String groupName;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author,String groupName)
    {
        super(author);
        this.groupName = groupName;
    }
    
    /**
     * Devuelve el nombre del grupo
     */
    public String getGroupName() {
        return groupName;
    }
}
