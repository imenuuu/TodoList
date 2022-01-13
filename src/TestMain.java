import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestMain {
    Board goodBoard=Board.getInstance();
    Print print=new Print();
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("회원 ID를 입력하시오");
        int index=Integer.parseInt(br.readLine());
        TestMain test=new TestMain();
        test.creatList();
    }

    private void creatList() {
        Todo todo1=new Todo(1,"밥먹기");
        Todo todo2=new Todo(2,"밥먹기");
        Todo todo3=new Todo(3,"밥먹기");
        Todo todo4=new Todo(4,"밥먹기");
        Todo todo5=new Todo(5,"밥먹기");
        Todo todo6=new Todo(6,"밥먹기");

        goodBoard.addMemberTodo(todo1);
        goodBoard.addMemberTodo(todo2);
        goodBoard.addMemberTodo(todo3);
        goodBoard.addMemberTodo(todo4);
        goodBoard.addMemberTodo(todo5);
        goodBoard.addMemberTodo(todo6);




    }
    public void addTodoList(Todo todo){}

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


}
