import java.util.ArrayList;

public class Todo {
    private int DoingId;
    private String Doing;
    private ArrayList<Member> memberList=new ArrayList<Member>();
    public Todo(int DoingId,String Doing){
        this.DoingId=DoingId;
        this.Doing=Doing;

    }


    public int getDoingId() {
        return DoingId;
    }

    public void setDoingId(int doingId) {
        DoingId = doingId;
    }

    public String getDoing() {
        return Doing;
    }

    public void setDoing(String doing) {
        Doing = doing;
    }



}
