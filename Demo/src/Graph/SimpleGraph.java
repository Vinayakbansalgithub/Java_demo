package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class SimpleVertex {
	int Vertexname;
	ArrayList<SimpleEdge> neighborhood;
	boolean isVisited = false;
	boolean isAdded=false;
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
	static LinkedList<SimpleVertex> adj = new LinkedList<SimpleVertex>();
	static LinkedList<SimpleEdge> edgeList = new LinkedList<SimpleEdge>();

	public SimpleGraph() {
		// TODO Auto-generated constructor stub
		adj = new LinkedList<SimpleVertex>();
	}

	void addVertex(SimpleVertex simpleVertex) {
		// TODO Auto-generated method stub
		adj.add(simpleVertex);
	}

	void addEdge(SimpleVertex vertexOne, SimpleVertex vertexTwo) {
		// TODO Auto-generated method stub

		SimpleEdge edge = new SimpleEdge(vertexOne, vertexTwo);
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
	
	
	
	
	
	Queue<SimpleVertex> queue= new LinkedList<SimpleVertex>();
	
	
	 void bfs(SimpleVertex simpleVertex) {
		// TODO Auto-generated method stub
		 while (true) {
				if (simpleVertex.isVisited == false) {
					
					if (simpleVertex.isAdded == false){ 
						queue.add(simpleVertex);
						simpleVertex.isAdded=true;
					}
					simpleVertex.isVisited = true;
					System.out.print(simpleVertex.Vertexname + "   ");
				
					
					 for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {
						 SimpleEdge node = simpleVertex.neighborhood.get(i);
						 
						 if(node.two.isAdded==false)
						 queue.add(node.two);
						 node.two.isAdded=true;

					}						
					 queue.poll();
					if(!queue.isEmpty())
					bfs(queue.peek());
				}
				break;
			}
		 
		 
		 
		 
		
	}
	 
	 
	 
	 static boolean flag=false;
	 static int count=0;
	 boolean isCycle(SimpleVertex simpleVertex,int length) {
			// TODO Auto-generated method stub
		 
		 
		 
		 while (count!=length) {
				if (simpleVertex.isVisited == false) {
					simpleVertex.isVisited = true;
					count++;
					System.out.print(simpleVertex.Vertexname + "   ");
					for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {
						
						
						SimpleEdge node = simpleVertex.neighborhood.get(i);
						if(node.one.Vertexname==node.two.Vertexname){
							
							System.out.println("here ---------------");
							flag=true;
							break;
						}
						
						


						isCycle(node.two,length);
					}

				}else{
					return true;
			
				
				}}
		return flag;
		 
		 
			
		}
	 
	 
	 
	 
	 static boolean flagUndirected=false;

		 boolean isCycleUndirected(SimpleVertex simpleVertex, SimpleVertex parent) {
			// TODO Auto-generated method stub\
			 simpleVertex.parent=parent;
			 
			 while (true){
					if (simpleVertex.isVisited == false) {
						simpleVertex.isVisited = true;
						System.out.print(simpleVertex.Vertexname + "   ");
						for (int i = 0; i < simpleVertex.neighborhood.size(); i++) {
							
							
							SimpleEdge node = simpleVertex.neighborhood.get(i);
							node.EdgeVisited=true;
							/*if(simpleVertex.isVisited==node.two.isVisited){
								System.out.println("cycle present");
								flagUndirected=true;
								return flagUndirected;
							}*/
							
							if(simpleVertex.parent != null && node.two.Vertexname == simpleVertex.parent.Vertexname)
								System.out.println("skip");							
							else if(node.two.isVisited==true){
								System.out.println("Graph contains a cycle");
								flagUndirected=true;
							}
							else{
								isCycleUndirected(node.two,simpleVertex);
							}
							
							
							
							
							
						}

					}
					
			 break;
			 }
			return flagUndirected;
			
		 }
			 
			 
			 

		


	public static void main(String[] args) {
		SimpleGraph graph = new SimpleGraph();
		SimpleVertex[] vertex = new SimpleVertex[6];

		for (int i = 0; i < vertex.length; i++) {
			vertex[i] = new SimpleVertex(i);
			graph.addVertex(vertex[i]);
		}

		
	//directed
	/*graph.addEdge(vertex[0], vertex[1]);
	graph.addEdge(vertex[0], vertex[2]);
	graph.addEdge(vertex[1], vertex[2]);
	graph.addEdge(vertex[2], vertex[0]);
	graph.addEdge(vertex[2], vertex[3]);
	graph.addEdge(vertex[3], vertex[3]);*/
		
		
		//undirected
		graph.addEdge(vertex[0], vertex[1]);
		graph.addEdge(vertex[1], vertex[0]);
		graph.addEdge(vertex[0], vertex[5]);
		graph.addEdge(vertex[5], vertex[0]);
		
		graph.addEdge(vertex[1], vertex[2]);
		graph.addEdge(vertex[2], vertex[1]);
		graph.addEdge(vertex[2], vertex[3]);
		graph.addEdge(vertex[3], vertex[2]);
		graph.addEdge(vertex[3], vertex[4]);
		graph.addEdge(vertex[4], vertex[3]);
		//graph.addEdge(vertex[4], vertex[1]);
		//graph.addEdge(vertex[4], vertex[4]);
		
		
		
				
		
		
		
		

		for (int i = 0; i < vertex.length; i++) {
			SimpleVertex vertexName = adj.get(i);
			System.out.print("vertex  " + vertexName.Vertexname
					+ "   has edges    ");

			int len = vertexName.neighborhood.size();

			for (int k = 0; k < vertexName.neighborhood.size(); k++) {
				SimpleEdge node = vertexName.neighborhood.get(k);

				System.out.print(node.two.Vertexname + "  ");
			}
			System.out.println();
		}

		System.out.print("BFS   ");
		//graph.dfs(vertex[3]);
		
	//	graph.bfs(vertex[2]);
		
//	boolean cycle=	graph.isCycle(vertex[0],vertex.length);
		
		
		//for (int i = 0; i < vertex.length; i++) {
			graph.isCycleUndirected(vertex[0],null);
		//}
	
	
//System.out.println("cycle  "+cycle);
	System.out.println("cycle  "+flagUndirected);

	}

	

	

}
