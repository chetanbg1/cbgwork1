package com.gfarm.graph;

import java.util.ArrayList;

import com.gfarm.graph.Graph.Edge;

public class WeigthGraph {
	static class Edge{
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
		for(int i=0;i< graph.length;i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 2 ,2));
		graph[1].add(new Edge(1, 2,10 ));
		graph[1].add(new Edge(1, 3,0));

		graph[2].add(new Edge(2, 0,2));
		graph[2].add(new Edge(2, 1,10));
		graph[2].add(new Edge(2, 3,-1));
		graph[3].add(new Edge(3, 1,0));
		graph[3].add(new Edge(3, 2,-1));
		
	}
	public static void printGraph(ArrayList<Edge>[] graph) {
		for(int i=0;i< graph.length;i++) {
			for(int j=0; j<graph[i].size();j++) {
				Edge e = graph[i].get(j);
				System.out.print(e.dest+" "+e.src+" "+e.weight);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int V =4;
		
		ArrayList<Edge> graph[] = new ArrayList[4];
		
		createGraph(graph);
		printGraph(graph);
	}
	

}
