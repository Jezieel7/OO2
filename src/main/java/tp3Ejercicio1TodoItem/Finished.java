package tp3Ejercicio1TodoItem;

public class Finished extends ToDoItemState{

	@Override
	public void start() {}

	@Override
	public void togglePause() throws RuntimeException{
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void finish() {}

	@Override
	public void addComment(String comment) {}

}
