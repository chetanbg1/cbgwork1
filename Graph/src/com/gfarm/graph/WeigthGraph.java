package com.gfarm.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeigthGraph {
	static class Edge {
		int src;
		int dest;
		int weight;

		public Edge(int src, int dest, int weight) {
			super();
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}

	}

	private static void createGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 2, 2));
		
		
		graph[1].add(new Edge(1, 2, 10));
		graph[1].add(new Edge(1, 3, 0));
		graph[2].add(new Edge(2, 0, 2));
		graph[2].add(new Edge(2, 1, 10));
		graph[2].add(new Edge(2, 3, -1));
		graph[3].add(new Edge(3, 1, 0));
		graph[3].add(new Edge(3, 2, -1));

		// -ve weight // Bellman Ford algorithm
//		graph[0].add(new Edge(0, 1, 2));
//		graph[0].add(new Edge(0, 2, 4));
//		graph[1].add(new Edge(1, 2, -4));
//		graph[2].add(new Edge(2, 3, 2));
//		graph[3].add(new Edge(3, 4, 4));
//		graph[4].add(new Edge(4, 1, -10));

	}

	// Dijkstras algorithm O(E + ElogV) //all positive values
	public static class Pair implements Comparable<Pair> {
		// we will pass pair as return type to priority Queue
		int node;
		int dist;

		public Pair(int node, int dist) {
			super();
			this.node = node;
			this.dist = dist;
		}

		@Override
		public int compareTo(Pair p2) { // compare on the basis of distance
			return this.dist - p2.dist; // ascending order
			// return p2.dist - this.dist; //descending order
		}

	}

	public static int[] dijkstras(ArrayList<Edge>[] graph, int source) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		int distance[] = new int[graph.length];
		boolean visited[] = new boolean[graph.length];
		for (int i = 0; i < distance.length; i++) { // initialize the array with infinity value
			if (i != source) {
				distance[i] = Integer.MAX_VALUE;
			}
		}

		pq.add(new Pair(source, 0));

		while (!pq.isEmpty()) {
			Pair current = pq.remove(); // shortest
			if (!visited[current.node]) {
				visited[current.node] = true;

				for (int i = 0; i < graph[current.node].size(); i++) {
					Edge e = graph[current.node].get(i);
					int u = e.src;
					int v = e.dest;
					if (distance[u] + e.weight < distance[v]) {
						distance[v] = distance[u] + e.weight;
						pq.add(new Pair(v, distance[v]));
					}
				}
			}
		}
		return distance;
	}

	// Bellman ford //weight having -ve values
	public static int[] bellmanFord(ArrayList<Edge> graph[], int source) {
		int distance[] = new int[graph.length];
		for (int i = 0; i < distance.length; i++) {
			if (i != source) {
				distance[i] = Integer.MAX_VALUE;
			}
		}
		// iterate v-1 times //O(V) 
		//as from each source we have V-1 nodes/vertices
		//we all possible shortest paths
		for (int k = 0; k < graph.length - 1; k++) { 
			// O(E)
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].size(); j++) {
					Edge e = graph[i].get(j);
					int u = e.src;
					int v = e.dest;
					int w = e.weight;
					if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
						distance[v] = distance[u] + w;
					}
				}

			}
		}
		//detect -ve weight cycle
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge e = graph[i].get(j);
				int u = e.src;
				int v = e.dest;
				int w = e.weight;
				if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
					System.out.println("negative weight cycle");
				}
			}

		}
		return distance;
	}

	public static void printGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge e = graph[i].get(j);
				System.out.print(e.dest + " " + e.src + " " + e.weight);
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int V = 5;

		ArrayList<Edge> graph[] = new ArrayList[V];

		createGraph(graph);
		
		for(int i=0;i<graph[2].size();i++) {
			Edge e = graph[2].get(i);
			System.out.println(e.weight);
		}
		
		// printGraph(graph);
		// int []dist = dijkstras(graph, 0);
		int[] dist = bellmanFord(graph, 0);
		for (int i : dist) {
			System.out.println(i + " ");
		}
	}

}
