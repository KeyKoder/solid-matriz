package matrix;

public class Main {
	public static void main(String[] args) {
		Matriz m = new Matriz(new int[][]{{10, 200}, {30, 4}});
		m.imprimir();
		// Debería imprimir:
		// 1 2
		// 3 4

		Matriz mTranspuesta = m.transpuesta();
		mTranspuesta.imprimir();
		// Debería imprimir:
		// 1 3
		// 2 4
	}
}