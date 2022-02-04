package br.com.springboot.airbnbanalyses.ordenationAlgorithms;

public class CountingSort {
    public static void countSortCrescent_Price(int[] array, int[] array2, int[] array3, int[] array4, int[] array5,
                                 int[] array6, int[] array7, int[] array8, String[] array9, String[] array10, String[] array11,
                                 String[] array12, String[] array13, String[] array14, double[] array15, double[] array16, int size) {

        int[] arrayOutput = new int[size + 1];
        int[] array2Output = new int[size + 1];
        int[] array3Output = new int[size + 1];
        int[] array4Output = new int[size + 1];
        int[] array5Output = new int[size + 1];
        int[] array6Output = new int[size + 1];
        int[] array7Output = new int[size + 1];
        int[] array8Output = new int[size + 1];
        String[] array9Output = new String[size + 1];
        String[] array10Output = new String[size + 1];
        String[] array11Output = new String[size + 1];
        String[] array12Output = new String[size + 1];
        String[] array13Output = new String[size + 1];
        String[] array14Output = new String[size + 1];
        double[] array15Output = new double[size + 1];
        double[] array16Output = new double[size + 1];


        // Encontrando o maior elemento do vetor
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Inicializa a contagem com zero dos vetores
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Armazena a contagem de cada elemento
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Armazena a contagem acumulativa de cada vetor
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        //Encontra o indice de cada elemento do vetor original no vetor count
        // Coloca os elementos na saída do vetor
        for (int i = size - 1; i >= 0; i--) {

            arrayOutput[count[array[i]] - 1] = array[i];
            array2Output[count[array[i]] - 1] = array2[i];
            array3Output[count[array[i]] - 1] = array3[i];
            array4Output[count[array[i]] - 1] = array4[i];
            array5Output[count[array[i]] - 1] = array5[i];
            array6Output[count[array[i]] - 1] = array6[i];
            array7Output[count[array[i]] - 1] = array7[i];
            array8Output[count[array[i]] - 1] = array8[i];
            array9Output[count[array[i]] - 1] = array9[i];
            array10Output[count[array[i]] - 1] = array10[i];
            array11Output[count[array[i]] - 1] = array11[i];
            array12Output[count[array[i]] - 1] = array12[i];
            array13Output[count[array[i]] - 1] = array13[i];
            array14Output[count[array[i]] - 1] = array14[i];
            array15Output[count[array[i]] - 1] = array15[i];
            array16Output[count[array[i]] - 1] = array16[i];

            count[array[i]]--;
        }

        // Copia os elementos organizado no vetor original
        for (int i = 0; i < size; i++) {
            array[i] = arrayOutput[i];
            array2[i] = array2Output[i];
            array3[i] = array3Output[i];
            array4[i] = array4Output[i];
            array5[i] = array5Output[i];
            array6[i] = array6Output[i];
            array7[i] = array7Output[i];
            array8[i] = array8Output[i];
            array9[i] = array9Output[i];
            array10[i] = array10Output[i];
            array11[i] = array11Output[i];
            array12[i] = array12Output[i];
            array13[i] = array13Output[i];
            array14[i] = array14Output[i];
            array15[i] = array15Output[i];
            array16[i] = array16Output[i];
        }
    }
}