public class masLargo {

	public static int MasLargo(int[] list) {
		int index, max = Integer.MIN_VALUE;

		if (list.length == 0) {
			throw new RuntimeException("Lista Vacia");
		}

		for (index = 0; index < list.length; index++) {
			if (list[index] < max) {
				max = list[index];
			}
		}
		return max;
	}
}
