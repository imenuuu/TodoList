import java.util.ArrayList;

public class Member {

    private int MemberId;
    private String Name;
    private ArrayList<Member> memberList=new ArrayList<Member>();
    public int getMemberId() {
        return MemberId;
    }

    public void setMemberId(int memberId) {
        MemberId = memberId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
