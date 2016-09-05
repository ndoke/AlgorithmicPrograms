import java.util.Arrays;
import java.util.Scanner;

public class RoundRobinTaskScheduling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter window size");
		int window = sc.nextInt();
		System.out.println("Enter the num of tasks");
		int n = sc.nextInt();
		System.out.println("Enter the task start times");
		int startTimes[] = new int[n];
		for (int i = 0; i < n; i++)
			startTimes[i] = sc.nextInt();
		System.out.println("Enter task durations");
		int taskDurations[] = new int[n];
		for (int i = 0; i < n; i++)
			taskDurations[i] = sc.nextInt();
		sc.close();
		scheduleTasks(startTimes, taskDurations, window);
	}

	public static void scheduleTasks(int[] startTimes, int[] taskDurations, int window) {
		// calculate work to be done
		int work = 0;
		for (int i = 0; i < taskDurations.length; i++)
			work += taskDurations[i];

		// initialize time
		int time = 0;

		// define and initialize waiting task
		int waitingTime[] = new int[startTimes.length];

		// iterate through the array till work becomes 0
		int i = 0;
		while (work > 0) {
			// if the task duration > window
			if (taskDurations[i] > window) {
				// reduce task duration
				taskDurations[i] -= window;
				// reduce the work
				work -= window;
				// add the waiting time
				waitingTime[i] = time;
				// increment time
				time += window;
			} else if (taskDurations[i] > 0) {
				// complete entire task
				int temp = taskDurations[i];
				taskDurations[i] = 0;
				// reduce work
				work -= temp;
				// add the waiting time
				waitingTime[i] = time;
				// increment time
				time += temp;
			}
			i++;
			if (i == taskDurations.length)
				i = 0;
		}
		System.out.println(Arrays.toString(waitingTime));
	}

}
/*
 * 3 5 0 3 4 7 9 5 2 3 4 1
 */