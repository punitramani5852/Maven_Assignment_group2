public class StringFunction
{
    public void revString(String str)
    {
        StringBuffer strB = new StringBuffer(str);  // converting String to StringBuffer.
        strB.reverse(); // method to reverse a string.
        System.out.println(strB);
    }

    public void findLength(String str)
    {
        int len=str.length(); // method to find length of a string.
        System.out.println(len);
    }
}
