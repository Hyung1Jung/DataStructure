package hw11_1;

public class MyIntegerSort {

	public static void mergeSort(int[] a) {    
		mergeSort(a, 0, a.length - 1);
	}

	public static void mergeSort(int[] a, int lb, int ub) {
		int middle;
		if (lb < ub) {
			middle = (lb + ub) / 2;
			mergeSort(a, lb, middle);
			mergeSort(a, middle + 1, ub);
			merge(a, lb, middle, ub);
		}
	}

	public static void merge(int[] a, int lb, int middle, int ub) {

		int l = lb;
		int j = middle + 1;
		int k = lb;
		int[] t;

		t = new int[a.length];
		while (l <= middle || j <= ub) {

			if (l <= middle && j <= ub) {
				if (a[l] <= a[j]) {
					t[k] = a[l++];
				} else {
					t[k] = a[j++];
				}

			} else if (l <= middle && j > ub) {
				t[k] = a[l++];
			} else {
				t[k] = a[j++];
			}
			k++;
		}
		for (int i = lb; i < ub + 1; i++) {
			a[i] = t[i];
		}
	}
}
