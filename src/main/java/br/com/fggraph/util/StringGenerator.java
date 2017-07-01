package br.com.fggraph.util;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import br.com.fggraph.model.Edge;
import br.com.fggraph.model.Tree;
import br.com.fggraph.model.Vertex;

/**
 * Representation for result graph in String value
 * 
 * @author Fernando Godóy
 *
 */
public class StringGenerator implements ResultGenerator<String> {

	private Graph<Vertex, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
	private Tree<Edge, Vertex> tree;

	public StringGenerator(Tree<Edge, Vertex> tree) {
		this.tree = tree;
		createData();
	}

	@Override
	public Tree<Edge, Vertex> getTree() {
		return tree;
	}

	@Override
	public Graph<Vertex, DefaultEdge> getGraph() {
		return graph;
	}

	@Override
	public String getResult() {
		return graph.toString();
	}

}
