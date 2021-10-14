import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoList {
	List<Task> todoList = new ArrayList<Task>();
    String todosToString [] = new String[todoList.size()];
    
	public void AddTodos(Task todo) {
		todoList.add(todo);
	}
	
	public void getTodos() {
		for(Task i : todoList) {
			System.out.println(i);
		}
	}

	@Override
	public String toString() {
		return "TodoList [todoList=" + todoList + ", todosToString=" + Arrays.toString(todosToString) + "]";
	}
	
	
}
