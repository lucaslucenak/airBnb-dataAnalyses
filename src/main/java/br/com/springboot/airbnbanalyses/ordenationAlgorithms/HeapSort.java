package br.com.springboot.airbnbanalyses.ordenationAlgorithms;

public class HeapSort {

    public static void heapSortCrescent_Price(int[] array, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6,
                            int[] array7, int[] array8, String[] array9, String[] array10, String[] array11, String[] array12, String[] array13,
                            String[] array14, double[] array15, double[] array16) {

        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            applyHeapSortCrescent_Price(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, n, i);
        }

        for (int j = n - 1; j > 0; j--) {
            int aux = array[0];
            int aux2 = array2[0];
            int aux3 = array3[0];
            int aux4 = array4[0];
            int aux5 = array5[0];
            int aux6 = array6[0];
            int aux7 = array7[0];
            int aux8 = array8[0];
            String aux9 = array9[0];
            String aux10 = array10[0];
            String aux11 = array11[0];
            String aux12 = array12[0];
            String aux13 = array13[0];
            String aux14 = array14[0];
            double aux15 = array15[0];
            double aux16 = array16[0];

            array[0] = array[j];
            array2[0] = array2[j];
            array3[0] = array3[j];
            array4[0] = array4[j];
            array5[0] = array5[j];
            array6[0] = array6[j];
            array7[0] = array7[j];
            array8[0] = array8[j];
            array9[0] = array9[j];
            array10[0] = array10[j];
            array11[0] = array11[j];
            array12[0] = array12[j];
            array13[0] = array13[j];
            array14[0] = array14[j];
            array15[0] = array15[j];
            array16[0] = array16[j];

            array[j] = aux;
            array2[j] = aux2;
            array3[j] = aux3;
            array4[j] = aux4;
            array5[j] = aux5;
            array6[j] = aux6;
            array7[j] = aux7;
            array8[j] = aux8;
            array9[j] = aux9;
            array10[j] = aux10;
            array11[j] = aux11;
            array12[j] = aux12;
            array13[j] = aux13;
            array14[j] = aux14;
            array15[j] = aux15;
            array16[j] = aux16;
            applyHeapSortCrescent_Price(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, j, 0);
        }
    }

    private static void applyHeapSortCrescent_Price(int[] array, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6,
                                    int[] array7, int[] array8, String[] array9, String[] array10, String[] array11, String[] array12, String[] array13,
                                    String[] array14, double[] array15, double[] array16, int n, int i) {

        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && array[esquerda] > array[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && array[direita] > array[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int aux = array[i];
            int aux2 = array2[i];
            int aux3 = array3[i];
            int aux4 = array4[i];
            int aux5 = array5[i];
            int aux6 = array6[i];
            int aux7 = array7[i];
            int aux8 = array8[i];
            String aux9 = array9[i];
            String aux10 = array10[i];
            String aux11 = array11[i];
            String aux12 = array12[i];
            String aux13 = array13[i];
            String aux14 = array14[i];
            double aux15 = array15[i];
            double aux16 = array16[i];

            array[i] = array[raiz];
            array2[i] = array2[raiz];
            array3[i] = array3[raiz];
            array4[i] = array4[raiz];
            array5[i] = array5[raiz];
            array6[i] = array6[raiz];
            array7[i] = array7[raiz];
            array8[i] = array8[raiz];
            array9[i] = array9[raiz];
            array10[i] = array10[raiz];
            array11[i] = array11[raiz];
            array12[i] = array12[raiz];
            array13[i] = array13[raiz];
            array14[i] = array14[raiz];
            array15[i] = array15[raiz];
            array16[i] = array16[raiz];

            array[raiz] = aux;
            array2[raiz] = aux2;
            array3[raiz] = aux3;
            array4[raiz] = aux4;
            array5[raiz] = aux5;
            array6[raiz] = aux6;
            array7[raiz] = aux7;
            array8[raiz] = aux8;
            array9[raiz] = aux9;
            array10[raiz] = aux10;
            array11[raiz] = aux11;
            array12[raiz] = aux12;
            array13[raiz] = aux13;
            array14[raiz] = aux14;
            array15[raiz] = aux15;
            array16[raiz] = aux16;

            applyHeapSortCrescent_Price(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, n, raiz);
        }
    }
}