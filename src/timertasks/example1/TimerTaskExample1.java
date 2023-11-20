package timertasks.example1;

import java.util.Timer;

public class TimerTaskExample1 {
	
	private static final long FACTOR_MILI_SECONDS = 1000L;
	
	private Timer timer;
	
	private final Example1Task task;

	public Example1Task getTask() {
		return task;
	}

	public TimerTaskExample1(long seconds) {
		timer = new Timer();
		task = new Example1Task();
		timer.schedule(task, seconds * FACTOR_MILI_SECONDS);
	}
	
	public static void main(String[] args) throws InterruptedException {
		TimerTaskExample1 task = new TimerTaskExample1(5);
		System.out.println("Task scheduled.");
		Thread.sleep(6000);
		System.out.println(String.format("Execution time took %d nano seconds", task.getTask().getExecutionTime()));
	}
}
