package br.com.fggraph.model;

import java.io.Serializable;

/**
 * Representação do comportamento esperador para um vertice
 * 
 * @author Fernando
 *
 */
public interface Vertex extends Serializable {

	/**
	 * Recupera o nome atribuido ao vertice
	 * 
	 * @return
	 */
	String getName();
}
