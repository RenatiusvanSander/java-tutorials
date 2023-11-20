package timertasks.example1;

import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class Example1Task extends TimerTask {

	private Timer tasksTimer;
	private Instant startExecutionTime;
	private Instant executionEndTime;

	public Example1Task() {
		tasksTimer = new Timer();
	}
	
	public Example1Task(Timer paraentsTimer) {
		tasksTimer = paraentsTimer;
	}

	@Override
	public void run() {
		startExecutionTime = Instant.now();
		
		System.out.println("Time is up!!!");
		tasksTimer.cancel();
		
		executionEndTime = Instant.now();
		System.exit(0);
	}
	
	public long getExecutionTime() {
		Duration excutionTime = Duration.between(startExecutionTime, executionEndTime);
		long time = excutionTime.toNanos();
		
		return time;
	}
}
