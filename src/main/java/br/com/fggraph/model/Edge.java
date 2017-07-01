package br.com.fggraph.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Representation of the desired behaviors for Edges
 * 
 * @author Fernando Godóy
 *
 * @param <T>
 */
public interface Edge extends Comparable<Edge>, Serializable {

	/**
	 * Return a origin vertex
	 * 
	 * @return
	 */
	Vertex getOrigin();

	/**
	 * Return a destination vertex
	 * 
	 * @return
	 */
	Vertex getTarget();

	/**
	 * Sum the cost for tree
	 * 
	 * @return
	 */
	BigDecimal getCost();

	/**
	 * Default comparable for Edges
	 */
	@Override
	default int compareTo(Edge o) {
		return this.getCost().compareTo(o.getCost());
	}

}
