package com.gfarm.graph;

import java.util.ArrayList;
import java.util.Stack;

import com.gfarm.graph.Graph.Edge;

public class KosaRajuAlgorithm {
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
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));
		graph[1].add(new Edge(1, 0));
		graph[2].add(new Edge(2, 1));
		graph[3].add(new Edge(3, 4));

	}

	// dfs
	public static void dfs(ArrayList<Edge> graph[], int current, boolean visited[]) {
		visited[current] = true;
		System.err.print(current + " ");
		for (int i = 0; i < graph[current].size(); i++) {
			Edge e = graph[current].get(i);
			if (!visited[e.dest]) {
				dfs(graph, e.dest, visited);
			}
		}
	}

	// topological sorting
	private static void topSort(ArrayList<Edge>[] graph, int current, boolean[] visited, Stack<Integer> s) {
		visited[current] = true;
		for (int i = 0; i < graph[current].size(); i++) {
			Edge e = graph[current].get(i);
			if (!visited[e.dest]) {
				topSort(graph, e.dest, visited, s);
			}
		}
		s.push(current);
	}

	@SuppressWarnings("unchecked")
	public static void kosarajuAlgo(ArrayList<Edge> graph[], int V) {
		// step 1 add in stack in topological order //O(V+E)
		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[V];

		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				topSort(graph, i, visited, s);
			}
		}
		// step 2 - clone graph to store transpose //reverse graph //O(V+N)
		ArrayList<Edge> transapose[] = new ArrayList[V];
		for (int i = 0; i < graph.length; i++) {
			visited[i] = false;
			transapose[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < V; i++) {
			visited[i] = false;
			for (int j = 0; j < graph[i].size(); i++) {
				Edge e = graph[i].get(j);
				// add dest in place of src in transpose graph
				transapose[e.dest].add(new Edge(e.dest, e.src));
			}
		}
		// step 3 //O(V+N)
		while (!s.isEmpty()) {
			int current = s.pop();
			if (!visited[current]) {
				dfs(graph, current, visited);
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		kosarajuAlgo(graph, V);

	}

}
