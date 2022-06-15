package tp3Ejercicio1TodoItem;

public abstract class ToDoItemState {

	protected ToDoItem toDo;
	
	public abstract void start();

	public abstract void togglePause();

	public abstract void finish();

	public abstract void addComment(String comment);
	
}
