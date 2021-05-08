package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

import Trees.CreateHeap;

public class Graph {

	class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<String, Integer>();
		HashMap<String, Integer> nbrsDirected = new HashMap<String, Integer>();
		HashMap<String, Boolean> directed = new HashMap<String, Boolean>();

		@Override
		public String toString() {
			return "Vertex [nbrs=" + nbrs + ", nbrsDirected=" + nbrsDirected + ", directed=" + directed + "]";
		}

	}

	HashMap<String, Vertex> vtces = new HashMap<String, Graph.Vertex>();

	int numVertex() {

		return this.vtces.hashCode();

	}

	boolean containsVertex(String vName) {

		return this.vtces.containsValue(vName);

	}

	void addVertex(String vName) {

		Vertex nVertex = new Vertex();

		this.vtces.put(vName, nVertex);

	}

	int numEdges() {

		int count = 0;
		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());

		for (String key : keys) {
			Vertex vx = this.vtces.get(key);
			count += vx.nbrs.size();

		}

		return count / 2;

	}

	boolean containsEdges(String vName1, String vName2) {

		Vertex vx1 = this.vtces.get(vName1);
		Vertex vx2 = this.vtces.get(vName2);

		if (vx1 == null || vx2 == null || !vx1.nbrs.containsKey(vName2))
			return false;

		return true;

	}

	void addEdge(String vName1, String vName2, int cost, boolean direct) {

		Vertex vx1 = this.vtces.get(vName1); // 2k
		Vertex vx2 = this.vtces.get(vName2); // 4k

		if (vx1 == null || vx2 == null)
			return;

		vx1.nbrs.put(vName2, cost); // 2k nbrs put vName2
		vx2.nbrs.put(vName1, cost);

		vx1.directed.put(vName2, direct);

		if (direct)
			vx1.nbrsDirected.put(vName2, cost);

	}

	void removeEdge(String vName1, String vName2) {

		Vertex vx1 = this.vtces.get(vName1); // 2k
		Vertex vx2 = this.vtces.get(vName2); // 4k

		if (vx1 == null || vx2 == null || !vx1.nbrs.containsKey(vName2))
			return;

		vx1.nbrs.remove(vName2); // 2k nbrs remove vName2
		vx2.nbrs.remove(vName1);

	}

	void removeVertex(String vName) {

		Vertex vx = this.vtces.get(vName); // 2k
		if (vx == null)
			return;

		ArrayList<String> keys = new ArrayList<String>(vx.nbrs.keySet());

		for (String key : keys) {

			Vertex nbrVx = this.vtces.get(key);

			nbrVx.nbrs.remove(vName);

		}

		this.vtces.remove(vName);

	}

	void display() {

		System.out.println("===============");
		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());
		for (String key : keys) {
			Vertex vtx = this.vtces.get(key);
			System.out.println("key :" + key + "     =>" + vtx.nbrs);
		}
		System.out.println("===============");

	}

	boolean hasPath(String vName1, String vName2, HashMap<String, Boolean> processed) {

		processed.put(vName1, true);

		if (!this.vtces.containsKey(vName1) || !this.vtces.containsKey(vName2))
			return false;

		System.out.println("checking " + vName1 + "  &  " + vName2);

		if (containsEdges(vName1, vName2))
			return true;

		ArrayList<String> keys = new ArrayList<String>(this.vtces.get(vName1).nbrs.keySet());// 2k
		for (String key : keys) {
			Vertex vtx = this.vtces.get(key);
			if (!processed.containsKey(key) && hasPath(key, vName2, processed))
				return true;
		}

		return false;
	}

	private boolean hasDirection(String v1, String v2) {
		// TODO Auto-generated method stub
		if (!this.vtces.containsKey(v1) || !this.vtces.containsKey(v2))
			return false;

		System.out.println("checking " + v1 + "  &  " + v2);

		Vertex vx1 = this.vtces.get(v1);

		for (String key : vx1.nbrs.keySet()) {

			System.out.println("nbs====" + key);

			if (vx1.directed.containsKey(key)) {

				System.out.println("yes for above");
			}

		}

		return false;

	}

	class Pair {
		String vertex;
		String psf;
	}

	boolean bfs(String vName1, String vName2) {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Graph.Pair>();

		Pair pair = new Pair();

		pair.vertex = vName1;
		pair.psf = vName1;

		queue.addLast(pair);

		while (!queue.isEmpty()) {
			Pair rpair = queue.removeFirst();

			if (processed.containsKey(rpair.vertex))
				continue;

			processed.put(rpair.vertex, true);

			if (containsEdges(rpair.vertex, vName2)) {

				System.out.println("Path is " + rpair.psf + vName2);
				return true;
			}

			Vertex nbrVx = this.vtces.get(rpair.vertex);
			ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
			for (String nbr : nbrs) {

				if (!processed.containsKey(nbr)) {

					Pair npair = new Pair();
					npair.vertex = nbr;
					npair.psf = rpair.psf + nbr;

					queue.add(npair);
				}

			}

		}

		return false;

	}

	boolean dfs(String vName1, String vName2) {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> stack = new LinkedList<Graph.Pair>();

		Pair pair = new Pair();

		pair.vertex = vName1;
		pair.psf = vName1;

		stack.addFirst(pair);

		while (!stack.isEmpty()) {
			Pair rpair = stack.removeFirst();

			if (processed.containsKey(rpair.vertex))
				continue;

			processed.put(rpair.vertex, true);

			if (containsEdges(rpair.vertex, vName2)) {

				System.out.println("Path is " + rpair.psf + vName2);
				return true;
			}

			Vertex nbrVx = this.vtces.get(rpair.vertex);
			ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
			for (String nbr : nbrs) {

				if (!processed.containsKey(nbr)) {

					Pair npair = new Pair();
					npair.vertex = nbr;
					npair.psf = rpair.psf + nbr;

					stack.addFirst(npair);
				}

			}

		}

		return false;

	}

	void bft() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Graph.Pair>();

		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());// 2k
		for (String key : keys) {

			Pair pair = new Pair();

			pair.vertex = key;
			pair.psf = key;

			queue.addLast(pair);

			while (!queue.isEmpty()) {
				Pair rpair = queue.removeFirst();

				if (processed.containsKey(rpair.vertex))
					continue;

				processed.put(rpair.vertex, true);

				System.out.println(rpair.vertex + "   via   " + rpair.psf);

				Vertex nbrVx = this.vtces.get(rpair.vertex);
				ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
				for (String nbr : nbrs) {

					if (!processed.containsKey(nbr)) {

						Pair npair = new Pair();
						npair.vertex = nbr;
						npair.psf = rpair.psf + nbr;

						queue.add(npair);
					}

				}

			}
		}

	}

	void dft() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> stack = new LinkedList<Graph.Pair>();

		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());// 2k
		for (String key : keys) {

			Pair pair = new Pair();

			pair.vertex = key;
			pair.psf = key;

			stack.addFirst(pair);

			while (!stack.isEmpty()) {
				Pair rpair = stack.removeFirst();

				if (processed.containsKey(rpair.vertex))
					continue;

				processed.put(rpair.vertex, true);

				System.out.println(rpair.vertex + "   via   " + rpair.psf);

				Vertex nbrVx = this.vtces.get(rpair.vertex);
				ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
				for (String nbr : nbrs) {

					if (!processed.containsKey(nbr)) {

						Pair npair = new Pair();
						npair.vertex = nbr;
						npair.psf = rpair.psf + nbr;

						stack.addFirst(npair);
					}

				}

			}
		}

	}

	void topologicalSort() {

		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		LinkedList<String> stack = new LinkedList<String>();
		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());// 2k
		for (String key : keys) {
			if (visited.containsKey(key)) {
				continue;
			}
			topSortUtil(key, stack, visited);
		}

		
		System.out.println(stack);
		
	}

	private void topSortUtil(String vertex, LinkedList<String> stack,HashMap<String, Boolean> visited) {
		visited.put(vertex, true);
		ArrayList<String> nbrs = new ArrayList<String>(this.vtces.get(vertex).nbrsDirected.keySet());
		for (String nbr : nbrs) {
			if (visited.containsKey(nbr)) {
				continue;
			}
			topSortUtil(nbr, stack, visited);
		}
		stack.offerFirst(vertex);
	}

	boolean hasCycle() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Graph.Pair>();

		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());// 2k
		for (String key : keys) {

			Pair pair = new Pair();

			pair.vertex = key;
			pair.psf = key;

			queue.addLast(pair);

			while (!queue.isEmpty()) {
				Pair rpair = queue.removeFirst();

				if (processed.containsKey(rpair.vertex))
					return true;

				processed.put(rpair.vertex, true);

				System.out.println(rpair.vertex + "   via   " + rpair.psf);

				Vertex nbrVx = this.vtces.get(rpair.vertex);
				ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
				for (String nbr : nbrs) {

					if (!processed.containsKey(nbr)) {

						Pair npair = new Pair();
						npair.vertex = nbr;
						npair.psf = rpair.psf + nbr;

						queue.addLast(npair);
					}

				}

			}

			return false;
		}
		return false;

	}

	boolean isConnected() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Graph.Pair>();
		int count = 0;
		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());// 2k
		for (String key : keys) {

			if (processed.containsKey(key))
				continue;

			count++;
			Pair pair = new Pair();

			pair.vertex = key;
			pair.psf = key;

			queue.addLast(pair);

			while (!queue.isEmpty()) {
				Pair rpair = queue.removeFirst();

				processed.put(rpair.vertex, true);

				System.out.println(rpair.vertex + "   via   " + rpair.psf);

				Vertex nbrVx = this.vtces.get(rpair.vertex);
				ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
				for (String nbr : nbrs) {

					if (!processed.containsKey(nbr)) {

						Pair npair = new Pair();
						npair.vertex = nbr;
						npair.psf = rpair.psf + nbr;

						queue.addLast(npair);
					}

				}

			}

		}

		if (count > 1) {
			return false;
		}
		return true;
	}

	boolean isTree() {

		return !hasCycle() && isConnected();
	}

	ArrayList<ArrayList<String>> getCC() {

		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Graph.Pair>();
		ArrayList<String> keys = new ArrayList<String>(this.vtces.keySet());// 2k
		ArrayList<ArrayList<String>> finalListComponent = new ArrayList<ArrayList<String>>();
		for (String key : keys) {

			ArrayList<String> subComponent = new ArrayList<String>();

			Pair pair = new Pair();

			pair.vertex = key;
			pair.psf = key;

			queue.addLast(pair);

			while (!queue.isEmpty()) {
				Pair rpair = queue.removeFirst();

				if (processed.containsKey(rpair.vertex))
					continue;

				processed.put(rpair.vertex, true);

				// System.out.println(rpair.vertex + " via " + rpair.psf);
				subComponent.add(rpair.vertex);

				Vertex nbrVx = this.vtces.get(rpair.vertex);
				ArrayList<String> nbrs = new ArrayList<String>(nbrVx.nbrs.keySet());
				for (String nbr : nbrs) {

					if (!processed.containsKey(nbr)) {

						Pair npair = new Pair();
						npair.vertex = nbr;
						npair.psf = rpair.psf + nbr;

						queue.add(npair);
					}

				}

			}
			finalListComponent.add(subComponent);

		}

		finalListComponent.removeIf(x -> x.isEmpty());

		return finalListComponent;

	}

	class PrimsPair implements Comparable<PrimsPair> {
		String vName;
		String accName;
		int cost;

		@Override
		public int compareTo(PrimsPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

	}

	Graph prims() {

		Set<String> keys = this.vtces.keySet();

		Graph mst = new Graph();
		Trees.CreateHeap<PrimsPair> heap = new CreateHeap<>();
		HashMap<String, PrimsPair> map = new HashMap<String, Graph.PrimsPair>();

		// make a pair and put it in heap and map
		for (String key : keys) {

			PrimsPair pair = new PrimsPair();

			pair.vName = key;
			pair.accName = null;
			pair.cost = Integer.MAX_VALUE;

			heap.add(pair);
			map.put(key, pair);

		}

		// till the heap is not empty keep on removing pairs
		while (!heap.isEmpty()) {

			// remove the pair
			PrimsPair pair = heap.remove();
			map.remove(pair.vName);

			if (pair.accName == null) {

				mst.addVertex(pair.vName);
			} else {
				mst.addVertex(pair.vName);
				mst.addEdge(pair.vName, pair.accName, pair.cost, false);
			}

			for (String nbs : this.vtces.get(pair.vName).nbrs.keySet()) {

				// work on nbs which are in heap
				if (map.containsKey(nbs)) {

					// get old and new cost
					int oldCost = map.get(nbs).cost;
					int newCost = this.vtces.get(pair.vName).nbrs.get(nbs);

					// update cost
					if (oldCost > newCost) {
						PrimsPair p = map.get(nbs);
						p.cost = newCost;
						p.accName = pair.vName;

						heap.updatePriority(p);

					}

				}

			}

		}

		return mst;

	}

	class DijkstraPair implements Comparable<DijkstraPair> {
		String vName;
		String psf;
		int cost;

		@Override
		public int compareTo(DijkstraPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

		@Override
		public String toString() {
			return "DijkstraPair [vName=" + vName + ", psf=" + psf + ", cost=" + cost + "]";
		}

	}

	HashMap<String, Integer> Dijkstra(String src) {

		Set<String> keys = this.vtces.keySet();
		Trees.CreateHeap<DijkstraPair> heap = new CreateHeap<>();
		HashMap<String, DijkstraPair> map = new HashMap<String, DijkstraPair>();
		HashMap<String, Integer> ans = new HashMap<String, Integer>();

		// make a pair and put it in heap and map
		for (String key : keys) {

			DijkstraPair pair = new DijkstraPair();

			pair.vName = key;
			pair.psf = null;
			pair.cost = Integer.MAX_VALUE;

			if (key.contentEquals(src)) {

				pair.psf = key;
				pair.cost = 0;
			}

			heap.add(pair);
			map.put(key, pair);

		}

		// till the heap is not empty keep on removing pairs
		while (!heap.isEmpty()) {

			heap.display();
			// remove the pair
			DijkstraPair pair = heap.remove();
			map.remove(pair.vName);

			ans.put(pair.vName, pair.cost);
			for (String nbs : this.vtces.get(pair.vName).nbrs.keySet()) {

				// work on nbs which are in heap
				if (map.containsKey(nbs)) {

					// get old and new cost
					int oldCost = map.get(nbs).cost;
					int newCost = pair.cost + this.vtces.get(pair.vName).nbrs.get(nbs);

					// update cost
					if (oldCost > newCost) {
						DijkstraPair p = map.get(nbs);
						p.cost = newCost;
						p.psf = pair.psf + nbs;

						heap.updatePriority(p);

					}

				}

			}

		}

		return ans;

	}

	public class DisjointSet {

		HashMap<String, Node> map = new HashMap<String, Graph.DisjointSet.Node>();

		public class Node {
			String data;
			Node parent;
			int rank;

		}

		public void create(String value) {
			Node nn = new Node();
			nn.data = value;
			nn.parent = nn;
			nn.rank = 0;

			map.put(value, nn);

		}

		public void union(String value1, String value2) {

			Node re1 = find(value1);
			Node re2 = find(value2);

			if (re1.equals(re2))
				return;
			else {

				if (re1.rank == re2.rank) {
					re2.parent = re1;
					re1.rank = re1.rank + 1;

				} else if (re1.rank > re2.rank) {
					re2.parent = re1;
				} else {
					re1.parent = re2;

				}

			}

		}

		public Node find(String value) {

			Node node = map.get(value);

			if (node.data == node.parent.data) {
				return node;
			}

			Node rr = find(node.parent.data);
			node.parent = rr;
			return rr;

		}

	}

	class Edgepair implements Comparable<Edgepair> {

		String v1;
		String v2;
		int cost;

		@Override
		public int compareTo(Edgepair o) {
			return this.cost - o.cost;
		}

		@Override
		public String toString() {
			return "Edgepair [cost=" + cost + "]";
		}

	}

	public ArrayList<Edgepair> getAllEdges() {

		ArrayList<Edgepair> edge = new ArrayList<Graph.Edgepair>();

		for (String key : this.vtces.keySet()) {
			Vertex vx = this.vtces.get(key);

			for (String nbskey : vx.nbrs.keySet()) {

				Edgepair ep = new Edgepair();
				ep.v1 = key;
				ep.v2 = nbskey;
				ep.cost = vx.nbrs.get(nbskey);

				// System.out.println("ep=="+ep);
				if (!edge.contains(ep))
					edge.add(ep);

			}

		}
		return edge;
	}

	public void kruskal() {

		ArrayList<Edgepair> edges = getAllEdges();
		System.out.println("========all edges");
		System.out.println(edges);
		System.out.println("========all edges sorted");
		Collections.sort(edges);
		System.out.println(edges);

		DisjointSet set = new DisjointSet();

		for (String key : this.vtces.keySet()) {

			set.create(key);

		}

		for (Edgepair edgepair : edges) {

			String re1 = set.find(edgepair.v1).data;
			String re2 = set.find(edgepair.v2).data;

			if (re1 == re2)
				continue;
			else {
				System.out.println(edgepair);
				set.union(edgepair.v1, edgepair.v2);
			}

		}

	}

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

//		graph.addEdge("A", "B", 2, "AB");
//		graph.addEdge("A", "D", 6, "AD");
//		graph.addEdge("B", "C", 3, "BC");
//		graph.addEdge("C", "D", 1, "CD");
//		graph.addEdge("D", "E", 8, "DE");
//		graph.addEdge("E", "F", 5, "EF");
//		graph.addEdge("E", "G", 7, "EG");
//		graph.addEdge("F", "G", 9, "FG");

		graph.addEdge("A", "B", 2, true);
		graph.addEdge("B", "A", 2, false);

//		graph.addEdge("A", "D", 6, true);
//		graph.addEdge("D", "A", 6, false);

		graph.addEdge("B", "C", 3, true);
		graph.addEdge("C", "B", 3, false);

		graph.addEdge("C", "D", 1, true);
		graph.addEdge("D", "C", 1, false);

		graph.addEdge("D", "E", 8, true);
		graph.addEdge("E", "D", 8, false);

		graph.addEdge("E", "F", 5, true);
		graph.addEdge("F", "E", 5, false);

		graph.addEdge("E", "G", 7, true);
		graph.addEdge("G", "E", 7, false);

		graph.addEdge("F", "G", 9, true);
		graph.addEdge("G", "F", 9, false);

		graph.display();

		graph.hasDirection("D", "A");

		System.out.println("============topologicalSort============");

		graph.topologicalSort();

		boolean res = graph.hasPath("A", "G", new HashMap<String, Boolean>());
		// System.out.println(res);

		System.out.println(graph.bfs("A", "F"));
		System.out.println(graph.dfs("A", "F"));

		// graph.removeEdge("D", "E");
		System.out.println("===========bFT=============");

		graph.bft();
		System.out.println("=========DFT==============");
		graph.dft();
		System.out.println("========================");
		// graph.removeEdge("B", "C");
		// graph.removeEdge("E", "F");
		System.out.println("has cycle " + graph.hasCycle());
		// graph.removeEdge("D", "E");
		System.out.println("==============  is connected    " + graph.isConnected());
		System.out.println("==============  is tree    " + graph.isTree());
		System.out.println("==============  get components    " + graph.getCC());
		System.out.println("=============prims===========");

		graph.prims().display();

		System.out.println("==============  get components    " + graph.Dijkstra("A"));

		graph.kruskal();

	}

}
