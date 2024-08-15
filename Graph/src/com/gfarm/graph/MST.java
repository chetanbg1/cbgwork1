package com.gfarm.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
//Prim's Algorithm
public class MST {

	static class Edge {
		int src;
		int dist; //destination 
		int we; // weight

		public Edge(int src, int dist, int we) {
			super();
			this.src = src;
			this.dist = dist;
			this.we = we;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 10));
		graph[0].add(new Edge(0, 2, 15));
		graph[0].add(new Edge(0, 3, 30));

		graph[1].add(new Edge(1, 0, 10));
		graph[1].add(new Edge(1, 3, 40));

		graph[2].add(new Edge(2, 0, 15));
		graph[2].add(new Edge(2, 3, 50));

		graph[3].add(new Edge(3, 1, 40));
		graph[3].add(new Edge(3, 2, 50));
	}

	public static class Pair implements Comparable<Pair> {
		int node;
		int cost;

		public Pair(int node, int cost) {
			super();
			this.node = node;
			this.cost = cost;
		}

		@Override
		public int compareTo(Pair p2) {
			return this.cost - p2.cost;
		}
	}

	public static void primsAlgo(ArrayList<Edge> graph[]) {
		PriorityQueue<Pair> pq = new PriorityQueue<>(); // non-mst
		boolean visited[] = new boolean[graph.length]; // mst

		pq.add(new Pair(0, 0));
		
		int mstCost =0;
		
		while(!pq.isEmpty()) {
			Pair current = pq.remove();
			if(!visited[current.node]) {
				visited[current.node] = true;
				mstCost += current.cost;
				
				for(int i =0 ; i< graph[current.node].size();i++) {
					Edge e = graph[current.node].get(i);
					if(!visited[e.dist]) {
						pq.add(new Pair(e.dist, e.we));
					}
				}
			}
		}
		System.out.println("min cost of mst = " +mstCost);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];

		createGraph(graph);
		primsAlgo(graph);

	}

}
