package matrix;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

	@org.junit.jupiter.api.Test
	void transpuestaRectangular() {
		Matriz matrix = new Matriz(new int[][]{{1, 2}, {3, 4}, {5, 6}});
		Matriz target = new Matriz(new int[][]{{1, 3, 5}, {2, 4, 6}});
		assertEquals(matrix.transpuesta(), target);
	}

	@org.junit.jupiter.api.Test
	void transpuestaCuadrada() {
		Matriz matrix = new Matriz(new int[][]{{1, 2}, {3, 4}});
		Matriz target = new Matriz(new int[][]{{1, 3}, {2, 4}});
		assertEquals(matrix.transpuesta(), target);
	}

	@org.junit.jupiter.api.Test
	void getMaxValue() {
		Matriz matrix = new Matriz(new int[][]{{1, 2}, {3, 40}, {5, 6}});
		assertEquals(matrix.getMaxValue(), 40);
	}
}