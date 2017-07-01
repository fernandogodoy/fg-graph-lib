package br.com.fggraph.response;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JApplet;
import javax.swing.JFrame;

import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;

import com.mxgraph.swing.mxGraphComponent;

import br.com.fggraph.model.Vertex;

/**
 * 
 * @author Fernando Godóy
 *
 */
public class View extends JApplet {

	private static final long serialVersionUID = 1L;

	private JFrame frame = new JFrame();
	private JGraphXAdapter<Vertex, DefaultEdge> jgAdapter;
	private static final Dimension DEFAULT_SIZE = new Dimension(500, 400);

	@Override
	public void init() {
		getContentPane().add(new mxGraphComponent(jgAdapter));
		resize(DEFAULT_SIZE);
	}

	public View(JGraphXAdapter<Vertex, DefaultEdge> jgAdapter) {
		this.jgAdapter = jgAdapter;
		init();
		defaultConfig();
	}

	public View name(String name) {
		frame.setName(name);
		return this;
	}

	private View defaultConfig() {
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setLocationRelativeTo(null);
		return this;
	}

	public void open() {
		frame.setVisible(true);
	}
}
