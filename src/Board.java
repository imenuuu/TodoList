import java.util.ArrayList;

public class Board {
    private static Board instance=new Board();
    private static String BoardName="Good Board";



    private ArrayList<Todo>todolist=new ArrayList<Todo>();

    public static Board getInstance(){
        if(instance == null)
            instance = new Board();
        return instance;
    }
    public void addMemberTodo(Todo todo){
        todolist.add(todo);
    }

    public ArrayList<Todo> getTodolist() {
        return todolist;
    }

    public void setTodolist(ArrayList<Todo> todolist) {
        this.todolist = todolist;
    }

}
