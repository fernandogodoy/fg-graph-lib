package br.com.fggraph.response;

import java.math.BigDecimal;

/**
 * 
 * @author Fernando Godóy
 *
 */
public class ResultDTO {

	BigDecimal cost;

	String result;

	View view;

	public BigDecimal getCost() {
		return cost;
	}

	public String getResult() {
		return result;
	}

	public View getView() {
		return view;
	}
}
