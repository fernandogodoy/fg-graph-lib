package br.com.fggraph.util;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import br.com.fggraph.model.Edge;
import br.com.fggraph.model.Tree;
import br.com.fggraph.model.Vertex;

/**
 * 
 * @author Fernando Godóy
 *
 */
public interface ResultGenerator<T> {

	/**
	 * Return the Tree
	 * 
	 * @return
	 */
	Tree<Edge, Vertex> getTree();

	/**
	 * Return the {@link Graph}
	 * 
	 * @return
	 */
	Graph<Vertex, DefaultEdge> getGraph();

	/**
	 * Return the result in representation type implementation
	 * 
	 * @return
	 */
	T getResult();

	/**
	 * 
	 */
	default void createData() {
		getTree().getVertex().forEach(vertex -> getGraph().addVertex(vertex));
		getTree().getEdges().forEach(edge -> getGraph().addEdge(edge.getOrigin(), edge.getTarget()));
	}
}
