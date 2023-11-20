package timertasks.exampl2;

import java.util.Timer;

public class TimerTaskExample2 {

private static final long FACTOR_MILI_SECONDS = 1000L;
	
	private Timer timer;
	
	private final Example2Task task;

	public Example2Task getTask() {
		return task;
	}

	public TimerTaskExample2(long seconds) {
		timer = new Timer();
		task = new Example2Task();
		timer.schedule(task, seconds * FACTOR_MILI_SECONDS, seconds * FACTOR_MILI_SECONDS);
	}
	
	public static void main(String[] args) throws InterruptedException {
		TimerTaskExample2 task = new TimerTaskExample2(5);
		System.out.println("Task scheduled.");
	}
}
