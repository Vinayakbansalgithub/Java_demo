package StackandQueue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Pair {
	public Pair(int value, int index) {
		// TODO Auto-generated constructor stub

		this.value = value;
		this.index = index;
	}

	int value;
	int index;

	@Override
	public String toString() {
		return "Pair [value=" + value + ", index=" + index + "]";
	}

}

public class NextLargestElement {

	static Stack<Integer> stack = new Stack<Integer>();
	static List<Integer> list = new LinkedList<>();

	static Stack<Pair> stackPair = new Stack<Pair>();

	static List<Integer> listLeft = new LinkedList<>();

	static List<Integer> listRight = new LinkedList<>();

	private static void NGR(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = arr.length - 1; i >= 0; i--) {

			if (stack.isEmpty()) {
				list.add(-1);
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() > arr[i]) {
				list.add(stack.peek());
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() <= arr[i]) {
				while (!stack.isEmpty()) {
					stack.pop();

					if (stack.isEmpty()) {
						list.add(-1);

					} else if (stack.peek() > arr[i]) {
						list.add(stack.peek());
						break;
					}

				}
				stack.push(arr[i]);

			}

		}

	}

	private static void NGL(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= arr.length - 1; i++) {

			if (stack.isEmpty()) {
				list.add(-1);
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() > arr[i]) {
				list.add(stack.peek());
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() <= arr[i]) {
				while (!stack.isEmpty()) {
					stack.pop();

					if (stack.isEmpty()) {
						list.add(-1);

					} else if (stack.peek() > arr[i]) {
						list.add(stack.peek());
						break;
					}

				}
				stack.push(arr[i]);

			}

		}

	}

	private static void NSL(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= arr.length - 1; i++) {

			if (stack.isEmpty()) {
				list.add(-1);
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() < arr[i]) {
				list.add(stack.peek());
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() >= arr[i]) {
				while (!stack.isEmpty()) {
					stack.pop();
					if (stack.isEmpty()) {
						list.add(-1);

					} else if (stack.peek() < arr[i]) {
						list.add(stack.peek());
						break;
					}

				}
				stack.push(arr[i]);

			}

		}

	}

	private static void NSR(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = arr.length - 1; i >= 0; i--) {

			if (stack.isEmpty()) {
				list.add(-1);
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() < arr[i]) {
				list.add(stack.peek());
				stack.push(arr[i]);
			} else if (!stack.isEmpty() && stack.peek() >= arr[i]) {
				while (!stack.isEmpty()) {
					stack.pop();

					if (stack.isEmpty()) {
						list.add(-1);

					} else if (stack.peek() < arr[i]) {
						list.add(stack.peek());
						break;
					}

				}
				stack.push(arr[i]);

			}

		}

	}

	
	// NGLI
	private static void StockSpanProblem(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= arr.length - 1; i++) {

			if (stackPair.isEmpty()) {
				list.add(-1);
				stackPair.push(new Pair(arr[i], i));
			} else if (!stackPair.isEmpty() && stackPair.peek().value > arr[i]) {
				list.add(stackPair.peek().index);
				stackPair.push(new Pair(arr[i], i));
			} else if (!stackPair.isEmpty() && stackPair.peek().value <= arr[i]) {
				while (!stackPair.isEmpty()) {
					stackPair.pop();

					if (stackPair.isEmpty()) {
						list.add(-1);

					} else if (stackPair.peek().value > arr[i]) {
						list.add(stackPair.peek().index);
						break;
					}

				}
				stackPair.push(new Pair(arr[i], i));

			}

		}

	}

	private static void NSLI(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= arr.length - 1; i++) {

			if (stackPair.isEmpty()) {
				listLeft.add(-1);
				stackPair.push(new Pair(arr[i], i));
			} else if (!stackPair.isEmpty() && stackPair.peek().value < arr[i]) {
				listLeft.add(stackPair.peek().index);
				stackPair.push(new Pair(arr[i], i));
			} else if (!stackPair.isEmpty() && stackPair.peek().value >= arr[i]) {
				while (!stackPair.isEmpty()) {
					stackPair.pop();

					if (stackPair.isEmpty()) {
						listLeft.add(-1);

					} else if (stackPair.peek().value < arr[i]) {
						listLeft.add(stackPair.peek().index);
						break;
					}

				}
				stackPair.push(new Pair(arr[i], i));

			}

		}

	}

	// check in NGRI if value not found add length+1 not -1
	private static void NSRI(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = arr.length - 1; i >= 0; i--) {

			if (stackPair.isEmpty()) {
				listRight.add(arr.length);
				stackPair.push(new Pair(arr[i], i));
			} else if (!stackPair.isEmpty() && stackPair.peek().value < arr[i]) {
				listRight.add(stackPair.peek().index);
				stackPair.push(new Pair(arr[i], i));
			} else if (!stackPair.isEmpty() && stackPair.peek().value >= arr[i]) {
				while (!stackPair.isEmpty()) {
					stackPair.pop();

					if (stackPair.isEmpty()) {
						listRight.add(-1);

					} else if (stackPair.peek().value < arr[i]) {
						listRight.add(stackPair.peek().index);
						break;
					}

				}
				stackPair.push(new Pair(arr[i], i));

			}

		}

	}

	public static void main(String[] args) {

		// int arr[] = { 1, 3, 0, 0, 1, 2, 4 };

		int arr[] = { 6, 2, 5, 4, 5, 1, 9 };

		NGR(arr);
		Collections.reverse(list);
		list.stream().forEach(s -> System.out.print(s + " "));
		stack.clear();
		list.clear();
		NGL(arr);
		System.out.println();
		list.stream().forEach(s -> System.out.print(s + " "));
		stack.clear();
		list.clear();
		NSL(arr);
		System.out.println();
		list.stream().forEach(s -> System.out.print(s + " "));
		stack.clear();
		list.clear();
		NSR(arr);
		System.out.println();
		Collections.reverse(list);
		list.stream().forEach(s -> System.out.print(s + " "));
		stack.clear();
		list.clear();

		System.out.println();
		System.out.println("stock span problem");

		StockSpanProblem(arr);
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.print(i - list.get(i) + " ");
		}

		System.out.println("========");
		stackPair.clear();
		System.out.println();
		System.out.println("======   histogram");
		NSLI(arr);
		System.out.println();
		listLeft.stream().forEach(s -> System.out.print(s + " "));
		stackPair.clear();
		NSRI(arr);
		System.out.println();
		Collections.reverse(listRight);
		listRight.stream().forEach(s -> System.out.print(s + " "));
		int area = 0;

		for (int j = 0; j <= arr.length - 1; j++) {

			
			// -1 is to get hight if left is 1 and right is 5 the 5-1 -1 =3 (inbetween)
			if ((listRight.get(j) - listLeft.get(j) - 1) * arr[j] > area)
				area = (listRight.get(j) - listLeft.get(j) - 1) * arr[j];

		}
		System.out.println();

		System.out.println("area is " + area);
		System.out.println("=======");

		int arr2D[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };

		int h[] = arr2D[0];

		stackPair.clear();
		listLeft.clear();
		listRight.clear();
		NSLI(h);
		stackPair.clear();
		NSRI(h);
		Collections.reverse(listRight);
		area = 0;
		for (int j = 0; j <= h.length - 1; j++) {
			if ((listRight.get(j) - listLeft.get(j) - 1) * h[j] > area)
				area = (listRight.get(j) - listLeft.get(j) - 1) * h[j];

		}
		System.out.println("area h1 is " + area);

		stackPair.clear();
		listLeft.clear();
		listRight.clear();

		for (int j = 0; j < h.length; j++) {
			h[j] += arr2D[1][j];
		}
		NSLI(h);
		stackPair.clear();
		NSRI(h);
		Collections.reverse(listRight);
		area = 0;
		for (int j = 0; j <= h.length - 1; j++) {
			if ((listRight.get(j) - listLeft.get(j) - 1) * h[j] > area)
				area = (listRight.get(j) - listLeft.get(j) - 1) * h[j];

		}
		System.out.println("area h2 is " + area);

		stackPair.clear();
		listLeft.clear();
		listRight.clear();

		for (int j = 0; j < h.length; j++) {
			h[j] += arr2D[2][j];
		}

		NSLI(h);
		stackPair.clear();
		NSRI(h);
		Collections.reverse(listRight);
		area = 0;
		for (int j = 0; j <= h.length - 1; j++) {
			if ((listRight.get(j) - listLeft.get(j) - 1) * h[j] > area)
				area = (listRight.get(j) - listLeft.get(j) - 1) * h[j];

		}
		System.out.println("area h3 is " + area);

		stackPair.clear();
		listLeft.clear();
		listRight.clear();

		for (int j = 0; j < h.length; j++) {
			if (arr2D[3][j] > 0) {
				h[j] = 0;
			} else
				h[j] += arr2D[3][j];
		}

		NSLI(h);
		stackPair.clear();
		NSRI(h);
		Collections.reverse(listRight);
		area = 0;
		for (int j = 0; j <= h.length - 1; j++) {
			if ((listRight.get(j) - listLeft.get(j) - 1) * h[j] > area)
				area = (listRight.get(j) - listLeft.get(j) - 1) * h[j];

		}
		System.out.println("area h4 is " + area);

	}

}
