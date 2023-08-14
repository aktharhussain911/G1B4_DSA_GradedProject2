package skyscraperConstruction;

import java.util.Collections;
import java.util.PriorityQueue;

public class FloorConstruction {
	public void skyscraperConstruction(int[] floor) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>(Collections.reverseOrder());

		// Add all elements of input array to queue
		for (int i = 0; i < floor.length; i++) {
			queue.add(floor[i]);
		}

		System.out.println("The order of construction is as follows : \n");

		// Check if each element is equal to the maximum element of queue
		for (int i = 0; i < floor.length; i++) {

			if (floor[i] == queue.peek()) {

				// Print day number and current element
				System.out.println("Day: " + (i + 1));

				System.out.print(queue.remove() + " ");

				// Print elements in queue1 that are equal to the maximum element of queue
				while (!queue1.isEmpty()) {

					int x = queue.peek();

					if (x == queue1.peek()) {

						System.out.print(queue1.remove() + " ");
						queue.remove();
					} else {
						break;
					}
				}
				System.out.println();
			} else {
				// If NO, Add element to queue1 and print day number with an empty line
				System.out.println("Day: " + (i + 1));
				System.out.println(" ");
				queue1.add(floor[i]);
				System.out.println();

			}
		}
	}
}
