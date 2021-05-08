package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

class PrimsMinHeap {

	static ArrayList<SimpleEdge> resultedge = new ArrayList<SimpleEdge>();
	static Map<Integer, SimpleEdge> mapVertixEdge = new LinkedHashMap<Integer, SimpleEdge>();

	int arr[] = new int[5];

	int count = 0;

	void Min_heapfy(Map<Integer, Integer> heapmap, SimpleVertex simpleVertex) {
		// TODO Auto-generated method stub

		for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {
			SimpleEdge node = simpleVertex.neighborhood.get(i);
			heapmap.put(node.two.Vertexname, node.weight);
			mapVertixEdge.put(node.two.Vertexname, node);

		}
		heapmap.remove(simpleVertex.Vertexname);

		for (Integer v : heapmap.values()) {
			arr[count++] = v;
			System.out.println(v);
		}

		// arr = Arrays.copyOfRange(arr, 1, arr.length);
		int edgeWeight = new HeapForPrims().Max_heapfy(arr, 1);

		SimpleEdge removeedge = null;
		Iterator<Entry<Integer, SimpleEdge>> it = mapVertixEdge.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, SimpleEdge> pair = it.next();
			if (pair.getValue().weight == edgeWeight) {
				resultedge.add(pair.getValue());
				pair.getValue().EdgeVisited = true;
				removeedge = pair.getValue();

			}

		}
		while (mapVertixEdge.values().remove(removeedge))
			;

		Min_heapfy(heapmap, resultedge.get(resultedge.size() - 1).two);

	}

}

class SimpleVertex {
	int Vertexname;
	ArrayList<SimpleEdge> neighborhood;
	boolean isVisited = false;
	boolean isAdded = false;
	SimpleVertex parent;

	public SimpleVertex(int name) {
		// TODO Auto-generated constructor stub
		this.Vertexname = name;
		this.neighborhood = new ArrayList<SimpleEdge>();
	}

}

class SimpleEdge {
	SimpleVertex one, two;
	boolean EdgeVisited = false;
	int weight;

	public SimpleEdge(SimpleVertex vertexOne, SimpleVertex vertexTwo) {
		// TODO Auto-generated constructor stub
		one = vertexOne;
		two = vertexTwo;

	}

	public SimpleVertex getOne() {
		return one;
	}

	public void setOne(SimpleVertex one) {
		this.one = one;
	}

	public SimpleVertex getTwo() {
		return two;
	}

	public void setTwo(SimpleVertex two) {
		this.two = two;
	}

	@Override
	public String toString() {
		return "" + two;
	}

}

public class SimpleGraph {
	static LinkedList<SimpleVertex> allvertices;
	static LinkedList<SimpleEdge> edgeList = new LinkedList<SimpleEdge>();

	public SimpleGraph() {
		// TODO Auto-generated constructor stub
		allvertices = new LinkedList<SimpleVertex>();
	}

	public static LinkedList<SimpleVertex> getAllvertices() {
		return allvertices;
	}

	public static void setAllvertices(LinkedList<SimpleVertex> allvertices) {
		SimpleGraph.allvertices = allvertices;
	}

	void addVertex(SimpleVertex simpleVertex) {
		// TODO Auto-generated method stub
		allvertices.add(simpleVertex);
	}

	void addEdge(SimpleVertex vertexOne, SimpleVertex vertexTwo, int weight) {
		// TODO Auto-generated method stub

		SimpleEdge edge = new SimpleEdge(vertexOne, vertexTwo);
		edge.weight = weight;
		// edgeList.add(edge);
		// System.out.println(edge);
		vertexOne.neighborhood.add(edge);

	}

	static ArrayList<SimpleVertex> list = new ArrayList<SimpleVertex>();

	void dfs(SimpleVertex simpleVertex) {
		// TODO Auto-generated method stub

		while (true) {
			if (simpleVertex.isVisited == false) {
				simpleVertex.isVisited = true;
				System.out.print(simpleVertex.Vertexname + "   ");
				for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {
					SimpleEdge node = simpleVertex.neighborhood.get(i);

					dfs(node.two);
				}

			}
			break;
		}

	}

	Queue<SimpleVertex> queue = new LinkedList<SimpleVertex>();

	void bfs(SimpleVertex simpleVertex) {
		// TODO Auto-generated method stub
		while (true) {
			if (simpleVertex.isVisited == false) {

				if (simpleVertex.isAdded == false) {
					queue.add(simpleVertex);
					simpleVertex.isAdded = true;
				}
				simpleVertex.isVisited = true;
				System.out.print(simpleVertex.Vertexname + "   ");

				for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {
					SimpleEdge node = simpleVertex.neighborhood.get(i);

					if (node.two.isAdded == false)
						queue.add(node.two);
					node.two.isAdded = true;

				}
				queue.poll();
				if (!queue.isEmpty())
					bfs(queue.peek());
			}
			break;
		}

	}

	static boolean flag = false;
	static int count = 0;

	boolean isCycle(SimpleVertex simpleVertex, int length) {
		// TODO Auto-generated method stub

		while (count != length) {
			if (simpleVertex.isVisited == false) {
				simpleVertex.isVisited = true;
				count++;
				System.out.print(simpleVertex.Vertexname + "   ");
				for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {

					SimpleEdge node = simpleVertex.neighborhood.get(i);
					if (node.one.Vertexname == node.two.Vertexname) {

						System.out.println("here ---------------");
						flag = true;
						break;
					}

					isCycle(node.two, length);
				}

			} else {
				return true;

			}
		}
		return flag;

	}

	static boolean flagUndirected = false;

	boolean isCycleUndirected(SimpleVertex simpleVertex, SimpleVertex parent) {
		// TODO Auto-generated method stub\
		simpleVertex.parent = parent;

		while (true) {
			if (simpleVertex.isVisited == false) {
				simpleVertex.isVisited = true;
				System.out.print(simpleVertex.Vertexname + "   ");
				for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {

					SimpleEdge node = simpleVertex.neighborhood.get(i);
					node.EdgeVisited = true;
					/*
					 * if(simpleVertex.isVisited==node.two.isVisited){
					 * System.out.println("cycle present"); flagUndirected=true; return
					 * flagUndirected; }
					 */

					if (simpleVertex.parent != null && node.two.Vertexname == simpleVertex.parent.Vertexname)
						System.out.println("skip");
					else if (node.two.isVisited == true) {
						System.out.println("Graph contains a cycle");
						flagUndirected = true;
					} else {
						isCycleUndirected(node.two, simpleVertex);
					}

				}

			}

			break;
		}
		return flagUndirected;

	}

	static Stack<Integer> topostack = new Stack<Integer>();
	static LinkedList<Integer> listset = new LinkedList<Integer>();

	void topologicalSort() {
		// TODO Auto-generated method stub

		for (SimpleVertex vertice : allvertices) {

			if (vertice.isVisited == false) {
				listset.add(vertice.Vertexname);
				topologicalSortUtil(vertice);

			}
		}

	}

	void topologicalSortUtil(SimpleVertex simpleVertex) {
		for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {

			SimpleEdge node = simpleVertex.neighborhood.get(i);
			if (node.two.isVisited == false) {
				listset.add(node.two.Vertexname);
				topologicalSortUtil(node.two);
			}

		}
		if (!topostack.contains(listset.getLast())) {
			topostack.add(listset.getLast());
			allvertices.get(listset.getLast()).isVisited = true;
		} else if (!topostack.contains(simpleVertex.Vertexname)) {
			topostack.add(simpleVertex.Vertexname);
			allvertices.get(simpleVertex.Vertexname).isVisited = true;
		}

	}

	static Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

	static void primsMST(SimpleVertex simpleVertex, SimpleVertex parent, PrimsMinHeap heap) {
		// TODO Auto-generated method stub
		simpleVertex.parent = parent;

		for (SimpleVertex vertice : allvertices) {

			map.put(vertice.Vertexname, Integer.MAX_VALUE);

		}

		map.put(0, 0);
		heap.Min_heapfy(map, simpleVertex);

	}

	public static void main(String[] args) {
		SimpleGraph graph = new SimpleGraph();
		SimpleVertex[] vertex = new SimpleVertex[6];

		for (int i = 0; i < vertex.length; i++) {
			vertex[i] = new SimpleVertex(i);
			graph.addVertex(vertex[i]);
		}

		// directed
		/*
		 * graph.addEdge(vertex[0], vertex[1]); graph.addEdge(vertex[0], vertex[2]);
		 * graph.addEdge(vertex[1], vertex[2]); graph.addEdge(vertex[2], vertex[0]);
		 * graph.addEdge(vertex[2], vertex[3]); graph.addEdge(vertex[3], vertex[3]);
		 */

		// undirected
		/*
		 * graph.addEdge(vertex[0], vertex[1]); graph.addEdge(vertex[1], vertex[0]);
		 * graph.addEdge(vertex[0], vertex[5]); graph.addEdge(vertex[5], vertex[0]);
		 * 
		 * graph.addEdge(vertex[1], vertex[2]); graph.addEdge(vertex[2], vertex[1]);
		 * graph.addEdge(vertex[2], vertex[3]); graph.addEdge(vertex[3], vertex[2]);
		 * graph.addEdge(vertex[3], vertex[4]); graph.addEdge(vertex[4], vertex[3]);
		 */
		// condition
		// graph.addEdge(vertex[4], vertex[1]);
		// graph.addEdge(vertex[4], vertex[4]);

		// Topological sort
		/*
		 * graph.addEdge(vertex[5], vertex[2]); graph.addEdge(vertex[5], vertex[0]);
		 * graph.addEdge(vertex[4], vertex[0]); graph.addEdge(vertex[4], vertex[1]);
		 * graph.addEdge(vertex[1], vertex[3]); graph.addEdge(vertex[2], vertex[3]);
		 */

		// prim MST
		graph.addEdge(vertex[0], vertex[1], 10);
		graph.addEdge(vertex[1], vertex[0], 10);
		graph.addEdge(vertex[1], vertex[2], 40);
		graph.addEdge(vertex[2], vertex[1], 40);
		graph.addEdge(vertex[0], vertex[2], 30);
		graph.addEdge(vertex[2], vertex[0], 30);
		graph.addEdge(vertex[0], vertex[3], 15);
		graph.addEdge(vertex[3], vertex[0], 15);
		graph.addEdge(vertex[3], vertex[2], 50);
		graph.addEdge(vertex[2], vertex[3], 50);

		for (int i = 0; i < vertex.length; i++) {
			SimpleVertex vertexName = allvertices.get(i);
			System.out.print("vertex  " + vertexName.Vertexname + "   has edges    ");

			int len = vertexName.neighborhood.size();

			for (int k = 0; k < vertexName.neighborhood.size(); k++) {
				SimpleEdge node = vertexName.neighborhood.get(k);

				System.out.print(node.two.Vertexname + "  ");
			}
			System.out.println();
		}

		System.out.print("BFS  -----------");
		// graph.dfs(vertex[3]);

		// graph.bfs(vertex[2]);

		// directed cycle
//	boolean cycle=	graph.isCycle(vertex[0],vertex.length);

		// undirected cycle
		// graph.isCycleUndirected(vertex[0],null);

		// directed cycle print
//System.out.println("cycle  "+cycle);

		// undirected cycle print
		// System.out.println("cycle "+flagUndirected);
		System.out.println();

		// topological sort code
		// System.out.println("topological sort");

		/*
		 * graph.topologicalSort();
		 * 
		 * while (!topostack.isEmpty()) {
		 * 
		 * System.out.print("  "+topostack.pop()); }
		 */

		PrimsMinHeap heap = new PrimsMinHeap();
		primsMST(vertex[0], null, heap);

	}

}
