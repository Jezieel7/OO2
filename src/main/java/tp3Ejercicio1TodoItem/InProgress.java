package tp3Ejercicio1TodoItem;

public class InProgress extends ToDoItemState{

	@Override
	public void start() {}

	@Override
	public void togglePause() {
		this.toDo.setState(new Paused());
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
