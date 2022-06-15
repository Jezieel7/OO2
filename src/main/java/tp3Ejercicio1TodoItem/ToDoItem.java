package tp3Ejercicio1TodoItem;

import java.time.Duration;
import java.time.LocalDate;

public class ToDoItem {
	
	private String name;
	private String comment;
	private ToDoItemState state;
	private LocalDate startToDo;

	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
	}

	public void start() {
		this.startToDo = LocalDate.now();
		this.state.start();
	}

	public void togglePause() {
		this.state.togglePause();
	}

	public void finish() {
		this.state.finish();
	}

	public Duration workedTime() {
		return Duration.between(this.startToDo, LocalDate.now());
	}

	public void addComment(String comment) {
		this.state.addComment(comment);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ToDoItemState getState() {
		return state;
	}

	public void setState(ToDoItemState state) {
		this.state = state;
	}

	public LocalDate getStartToDo() {
		return startToDo;
	}

	public void setStartToDo(LocalDate startToDo) {
		this.startToDo = startToDo;
	}
	
}
