package o.good;

/**
 * Instead of modifying(modification), we use inheritance for example(extension).
 * @author caci
 */

public class StudentInfo
{
    public String Streamname()
    {
        //functionality
        return "";
    }
}
class Science extends StudentInfo {
    public String Streamname() {
        return "science";
    }
}
class Commerce extends StudentInfo {
    public String Streamname() {
        return "commerce";
    }
}
class Arts extends StudentInfo {
    public String Streamname()
    {
        return "Arts";
    }
}