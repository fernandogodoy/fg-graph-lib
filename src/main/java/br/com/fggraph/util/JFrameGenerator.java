package br.com.fggraph.util;

import javax.swing.JFrame;

import org.jgrapht.Graph;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultListenableGraph;

import com.mxgraph.layout.mxCircleLayout;

import br.com.fggraph.model.Edge;
import br.com.fggraph.model.Tree;
import br.com.fggraph.model.Vertex;
import br.com.fggraph.response.View;

/**
 * Generate result in {@link JFrame} format
 * 
 * @author Fernando Godóy
 *
 */
public class JFrameGenerator implements ResultGenerator<View> {

	private Tree<Edge, Vertex> tree;
	private ListenableGraph<Vertex, DefaultEdge> graph = new DefaultListenableGraph<>(
			new DefaultDirectedGraph<>(DefaultEdge.class));

	public JFrameGenerator(Tree<Edge, Vertex> tree) {
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
	public View getResult() {
		JGraphXAdapter<Vertex, DefaultEdge> jgAdapter = new JGraphXAdapter<>(graph);
		mxCircleLayout layout = new mxCircleLayout(jgAdapter);
		layout.execute(jgAdapter.getDefaultParent());
		return new View(jgAdapter);
	}

}
