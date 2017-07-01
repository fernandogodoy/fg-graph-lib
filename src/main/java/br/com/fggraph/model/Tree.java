package br.com.fggraph.model;

import java.io.Serializable;
import java.util.List;

/**
 * This is a representation for Tree
 * 
 * @author Fernando Godóy
 *
 * @param <T>
 * @param <S>
 */
public interface Tree<T extends Edge, S extends Vertex> extends Serializable {

	/**
	 * @return
	 */
	List<T> getEdges();

	/**
	 * @return
	 */
	List<S> getVertex();

	/**
	 * @param edge
	 */
	void add(T edge);
}
