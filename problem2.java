public class problem2
{
    static String findduplicateteam(String[] teamname)
    {
        for(int i = 0; i < teamname.length; i++)
        {
            for (int j = i + 1; j < teamname.length; j++)
            {
                if (teamname[i].equals(teamname[j]))
                {
                    return teamname[i];
                }
            }
        }
        return "No duplicate team found";
    }
    public static void main(String[] args)
    {
        String[] teamname = {"Byteforce", "codecrafter", "Byteforce", "coderx", "readx"};
        System.out.println(findduplicateteam(teamname));
    }    
}