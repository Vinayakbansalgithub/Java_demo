package SelFrDemo;
enum StateDFS {

    Unvisited,Visiting,Visited;

}

class NodeDFS{
	
	 public NodeDFS[] child;
	    public int childCount=0;
	    private String vertex;
	    public StateDFS state;

	    public NodeDFS(String vertex) {
			// TODO Auto-generated constructor stub
	    	this.vertex=vertex;
		}

		public void addEdge(NodeDFS nodeDFS) {
			child = new NodeDFS[childCount];
			nodeDFS.state = StateDFS.Unvisited;
	      
	       
	            this.child[childCount] = nodeDFS;
	            childCount++;
	        
			
		}

	
		

}
public class DFS {
	

	

	

	public static void main(String[] args) {
		System.out.println("start");

		NodeDFS[] temp = new NodeDFS[4];
		   temp[0] = new NodeDFS("A");
	        temp[1] = new NodeDFS("B");
	        temp[2] = new NodeDFS("C");
	        temp[3] = new NodeDFS("D");
	        
	        temp[0].addEdge(temp[1] );
	        temp[0].addEdge(temp[2]) ;
	        temp[1].addEdge(temp[3] );
	        temp[2].addEdge(temp[1] );
	        temp[3].addEdge(temp[1] );

	}

}

