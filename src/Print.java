import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class Print {
    Board board= Board.getInstance();
    public static final String TITLE ="회원님의 할일 리스트";
    public static final String HEADER="아이디 | 리스트 \n";
    public static final String LINE="----------------------------";
    private StringBuffer buffer=new StringBuffer();
    public void makeHeader(Todo todo){
        buffer.append(Print.TITLE);
        buffer.append(Print.HEADER);
        buffer.append(Print.LINE);

    }
    public void getTodoList(Todo todo){

    }
}
