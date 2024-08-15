package com.gfarm.graph;

import java.util.ArrayList;

import com.gfarm.graph.Graph.Edge;

public class Bridge {
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

		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 2));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));

		graph[3].add(new Edge(3, 0));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
	}

	public static void dfs(ArrayList<Edge> graph[], int current,
			boolean visited[], int dt[], int low[],int time, int parent) {
		visited[current] = true;
		dt[current] = low[current] = ++time;
		for(int i =0;i<graph[current].size();i++) {
			Edge e = graph[current].get(i);
			if(e.dest ==parent) {
				continue;
			}else if(!visited[e.dest]) {
				dfs(graph, e.dest, visited, dt, low, time, current);
				low[current] = Math.min(low[current], low[e.dest]);
				if(dt[current] < low[e.dest]) {
					System.out.println("bridge is : "+ current+ "----"+ e.dest);
				}
			}else {
				low[current] = Math.min(low[current], dt[e.dest]);
			}
		}
	}

	public static void getBridge(ArrayList<Edge> graph[], int V) {
		int dt[] = new int[V];
		int low[] = new int[V];
		int time = 0;
		boolean visited[] = new boolean[V];

		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				dfs(graph, i, visited, dt, low, time, -1);
			}
		}
	}

	public static void main(String[] args) {
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		
		getBridge(graph, V);

	}

}
