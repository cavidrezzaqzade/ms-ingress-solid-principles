package o.bad;

/**
 * If we want to add another subclass named arts, simply, we add one more if statement that violates the open-closed principle.
 * @author caci
 */

public class StudentInfo {
    public String streamName(Student st) {
        if (st instanceof Science) {
            return st.getStream();
        }
        if (st instanceof Commerce) {
            return st.getStream();
        }
        return "";
    }
}
interface Student{
    String getStream();
}
class Commerce implements Student{
    public String getStream(){
        return "commerce";
    }
}
class Science implements Student{
    public String getStream(){
        return "science";
    }
}
