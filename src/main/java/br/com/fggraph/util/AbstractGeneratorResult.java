package br.com.fggraph.util;

import java.math.BigDecimal;

import br.com.fggraph.model.Edge;
import br.com.fggraph.model.Tree;
import br.com.fggraph.model.Vertex;
import br.com.fggraph.response.View;

/**
 * @author Fernando Godóy
 *
 * @param <T>
 */
public abstract class AbstractGeneratorResult<T extends Tree<Edge, Vertex>> {

	protected T tree;

	/**
	 * Return graph in text format
	 * 
	 * @return
	 */
	public String textResult() {
		ResultGenerator<String> generator = new StringGenerator(tree);
		return generator.getResult();
	}

	/**
	 * Return one view for exibition the Graph
	 * 
	 * @return
	 */
	public View viewResult() {
		ResultGenerator<View> generator = new JFrameGenerator(tree);
		return generator.getResult();
	}

	/**
	 * Return the cost for Graph
	 * 
	 * @return
	 */
	public BigDecimal costCalculator() {
		return tree.getEdges().parallelStream().map(edge -> edge.getCost()).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
