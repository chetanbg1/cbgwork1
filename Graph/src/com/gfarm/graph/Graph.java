package com.gfarm.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Graph {
	static class Edge {
		int src;
		int dest;

		public Edge(int src, int dest) {
			super();
			this.src = src;
			this.dest = dest;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
//		graph[0].add(new Edge(0, 2));
//		graph[1].add(new Edge(1, 2));
//		graph[1].add(new Edge(1, 3));
//		graph[2].add(new Edge(2, 0));
//		graph[2].add(new Edge(2, 1));
//		graph[2].add(new Edge(2, 3));
//		graph[3].add(new Edge(3, 1));
//		graph[3].add(new Edge(3, 2));
		
		//cycle exit 
		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 0));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 0));
	}

	// BFS
	public static void bfs(ArrayList<Edge> graph[], int V) {
		Queue<Integer> que = new LinkedList<>();
		boolean visted[] = new boolean[V];
		que.add(0);
		while (!que.isEmpty()) {
			int curr = que.remove();
			if (visted[curr] == false) {
				System.out.print(curr + " ");
				visted[curr] = true;
				for (int i = 0; i < graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					que.add(e.dest);
				}
			}
		}
	}

	// un connected graph
	private static void bfs(ArrayList<Edge>[] graph, int v, boolean[] visited, int start) {
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		while (!que.isEmpty()) {
			int curr = que.remove();
			if (visited[curr] == false) {
				System.out.print(curr + " ");
				visited[curr] = true;
				for (int i = 0; i < graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					que.add(e.dest);
				}
			}
		}
	}

	// DFS
	public static void dfs(ArrayList<Edge> graph[], int current, boolean visited[]) {
		System.out.print(current + " ");
		visited[current] = true;
		for (int i = 0; i < graph[current].size(); i++) {
			Edge e = graph[current].get(i);
			if (visited[e.dest] == false) {
				dfs(graph, e.dest, visited);
			}
		}
	}
	// All path from source to target
	public static void printAllPath(ArrayList<Edge> graph[], boolean visited[], int current, String path,int target) {
		if(current == target) {
			System.out.println(path);
			return;
		}
		for(int i=0; i< graph[current].size();i++) {
			Edge e = graph[current].get(i);
			if(visited[e.dest] ==false) {
				visited[current] = true;
				printAllPath(graph, visited, e.dest, path+e.dest, target);
				visited[current] =false;
			}
		}
	}
	
	//cycle detection
	public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visited[], int current,boolean recursion []) {
		visited[current] =true;
		recursion[current] = true;
		for(int i=0; i< graph[current].size();i++) {
			Edge e = graph[current].get(i);
			if(recursion[e.dest]) {
				return true;
			}else if(!visited[e.dest]) {
				if(isCycleDirected(graph, visited, e.dest, recursion)) {
					return true;
				}
			}
		}
		recursion[current] =false;
		return false;
	}
	
	//cycle detection
	public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean visited[],int current, int parent) {
		visited[current] = true;
		for(int i= 0;i< graph[current].size();i++) {
			Edge e = graph[current].get(i);
			if(visited[e.dest] && e.dest != parent) {
				return true;
			}else if(!visited[e.dest]) {
				if(isCycleUndirected(graph, visited, e.dest, current)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void printGraph(ArrayList<Edge> graph[]) {
		for (int j = 0; j < graph.length; j++) {
			for (int i = 0; i < graph[j].size(); i++) {
				Edge e = graph[j].get(i);
				System.out.print(e.src + " " + e.dest);
				System.out.println();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		// printGraph(graph);
		// bfs(graph, V);

		// graph that is not connected BFS
//		boolean visited [] = new boolean[V];
//		for(int i=0; i<V; i++){
//			if(visited[i] ==false) {
//				bfs(graph, V , visited , i);
//			}
//			
//		}

		// graph that is not connected DFS
//		boolean visited[] = new boolean[V];
//		for (int i = 0; i < V; i++) {
//			if (visited[i] == false) {
//				dfs(graph, i, visited);
//			}
//
//		}
		// dfs(graph, 0, visited);
		
		//printAllPath(graph, new boolean[V], 0, "0", 3);		//O(V^V)
		
		//System.out.println(isCycleDirected(graph, new boolean[V], 0, new boolean[V]));
		System.out.println(isCycleUndirected(graph, new boolean[V], 0, 0));
	}
}
