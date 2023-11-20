package timertasks.exampl2;

import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class Example2Task extends TimerTask{
	private Timer tasksTimer;
	private Instant startExecutionTime;
	private Instant executionEndTime;

	public Example2Task() {
		tasksTimer = new Timer();
	}
	
	public Example2Task(Timer paraentsTimer) {
		tasksTimer = paraentsTimer;
	}

	@Override
	public void run() {
		startExecutionTime = Instant.now();
		
		System.out.println("Time is up!!!");
		
		executionEndTime = Instant.now();
	}
	
	public long getExecutionTime() {
		Duration excutionTime = Duration.between(startExecutionTime, executionEndTime);
		long time = excutionTime.toNanos();
		
		return time;
	}
}
