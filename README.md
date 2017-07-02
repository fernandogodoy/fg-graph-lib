# Fg-Graph-Lib

### Objetivo
Este projeto tem por objetivo ser um facilitador para geração de representações visuais de árvores.

Fazendo uso da biblioteca JGraph(http://jgrapht.org/) este projeto provê dois geradores para representar árvores.

> StringGenerator - Representação no formato texto.

> JFrame Generator - Representação no formato JFrame

### Como usar

#### Configuração Repositório

```xml
	<repositories>
		<repository>
			<id>graph</id>
			<url>https://dl.bintray.com/godoy/graph</url>
		</repository>
	</repositories>
```
#### Inclusão da dependência

```xml
	<dependency>
		<groupId>br.com.fggraph</groupId>
		<artifactId>fg-graph-lib</artifactId>
		<version>1.0</version>
	</dependency>

```

É necessário implementação de 3 interfaces

> Tree - Árvore do qual se deseja obter a representação

> Edge - Arestas 

> Vertex - Vertices

Por meio da classe ResponseBuilder é possivel optar qual formato deseja obter, bem como efetuar o cálculo de custo da árvore.
```java

	ResponseBuilder<Tree> builder = new ResponseBuilder<>(tree);
	ResultDTO dto = builder.withCost()
				.withTextResult()
				.withGraphicResult()
				.build();
						
```
Como visto, o retorno é um ResultDTO onde os resultados da execução estão encapsulados e podem ser obtidos por meio dos métodos acessores.
No caso de visualização em tela, será retornado uma Jframe pré-configurado.
```java

	private View defaultConfig() {
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setLocationRelativeTo(null);
		return this;
	}

```

Fica sob responsabilidade do utilizador setar o nome da janela, caso queira e acionar o método que open para exibição do JFrame.
```java

	public View name(String name) {
		frame.setName(name);
		return this;
	}
	
	public void open() {
		frame.setVisible(true);
	}
	
```

### Limitações
A representação visual no momento se da por meio de um grafo direcionado não sendo possível outras configurações até o momento.

