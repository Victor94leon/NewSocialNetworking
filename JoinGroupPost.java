public class JoinGroupPost
{
    private String groupName;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String groupName)
    {
        this.groupName = groupName;
    }
    
    /**
     * Devuelve el nombre del grupo
     */
    public String getGroupName() {
        return groupName;
    }
}
