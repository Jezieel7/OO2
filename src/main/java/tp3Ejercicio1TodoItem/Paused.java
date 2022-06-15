package tp3Ejercicio1TodoItem;

public class Paused extends ToDoItemState{

	@Override
	public void start() {}

	@Override
	public void togglePause() {
		this.toDo.setState(new InProgress());
	}

	@Override
	public void finish() {
		this.toDo.setState(new Finished());
	}

	@Override
	public void addComment(String comment) {
		this.toDo.setComment(comment);
	}

}
