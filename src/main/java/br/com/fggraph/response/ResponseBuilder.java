package br.com.fggraph.response;

import br.com.fggraph.model.Edge;
import br.com.fggraph.model.Tree;
import br.com.fggraph.model.Vertex;
import br.com.fggraph.util.AbstractGeneratorResult;

/**
 * 
 * @author Fernando Godóy
 *
 * @param <T>
 */
public class ResponseBuilder<T> extends AbstractGeneratorResult<Tree<Edge, Vertex>> {

	private ResultDTO dto;

	@SuppressWarnings("unchecked")
	public ResponseBuilder(T arvore) {
		this.tree = (Tree<Edge, Vertex>) arvore;
		this.dto = new ResultDTO();
	}

	public ResponseBuilder<T> withCost() {
		this.dto.cost = super.costCalculator();
		return this;
	}

	public ResponseBuilder<T> withTextResult() {
		this.dto.result = super.textResult();
		return this;
	}

	public ResponseBuilder<T> withGraphicResult() {
		this.dto.view = super.viewResult();
		return this;
	}

	public ResultDTO build() {
		return dto;
	}

}
