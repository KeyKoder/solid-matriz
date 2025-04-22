package matrix;

import java.util.Arrays;
import java.util.Objects;

public class Matriz {
	private int[][] matriz;

	public Matriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public void imprimir() {
		System.out.println(this.toString());
	}

	public Matriz transpuesta() {
		int[][] newMatrix = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < newMatrix.length; i++) {
			for (int j = 0; j < newMatrix[i].length; j++) {
				newMatrix[i][j] = matriz[j][i];
			}
		}
		return new Matriz(newMatrix);
	}

	public int getMaxValue() {
		int max = Integer.MIN_VALUE;
		for (int[] row : matriz) {
			for (int num : row) {
				if (num > max) max = num;
			}
		}
		return max;
	}

	@Override
	public String toString() {
		String out = "";
		int maxLen = Integer.toString(this.getMaxValue()).length();
		for (int[] row : matriz) {
			for (int j = 0; j < row.length; j++) {
				out += row[j] + " ".repeat(maxLen);
			}
			out += "\n";
		}
		return out;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Matriz matriz1)) return false;
		return Objects.deepEquals(matriz, matriz1.matriz);
	}

	@Override
	public int hashCode() {
		return Arrays.deepHashCode(matriz);
	}
}
