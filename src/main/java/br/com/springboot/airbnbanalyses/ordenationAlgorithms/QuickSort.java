package br.com.springboot.airbnbanalyses.ordenationAlgorithms;

public class QuickSort {

    public static void quickSort_Prices(Integer[] array, Integer[] array2, Integer[] array3, Integer[] array4, Integer[] array5, Integer[] array6, Integer[] array7, String[] array8,
                                 String[] array9, String[] array10, String[] array11, String[] array12, String[] array13, Double[] array14, Double[] array15, Double[] array16, int a, int b) {

        if (a < b) {
            int q = particiona(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, a, b);
            quickSort_Prices(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, a, q - 1);
            quickSort_Prices(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, q + 1, b);
        }
    }

    public static int particiona(Integer[] array, Integer[] array2, Integer[] array3, Integer[] array4, Integer[] array5, Integer[] array6, Integer[] array7, String[] array8,
                                 String[] array9, String[] array10, String[] array11, String[] array12, String[] array13, Double[] array14, Double[] array15, Double[] array16, int p, int r) {
        int i = p - 1;
        Integer x = array[r];
        Integer aux;
        String auxStr;
        Double auxDouble;

        for (int j = p; j < r; j++) {
            if (array[j] <= x) {
                i++;

                aux = array[i];
                array[i] = array[j];
                array[j] = aux;

                aux = array2[i];
                array2[i] = array2[j];
                array2[j] = aux;

                aux = array3[i];
                array3[i] = array3[j];
                array3[j] = aux;

                aux = array4[i];
                array4[i] = array4[j];
                array4[j] = aux;

                aux = array5[i];
                array5[i] = array5[j];
                array5[j] = aux;

                aux = array6[i];
                array6[i] = array6[j];
                array6[j] = aux;

                aux = array7[i];
                array7[i] = array7[j];
                array7[j] = aux;

                auxStr = array8[i];
                array8[i] = array8[j];
                array8[j] = auxStr;

                auxStr = array9[i];
                array9[i] = array9[j];
                array9[j] = auxStr;

                auxStr = array10[i];
                array10[i] = array10[j];
                array10[j] = auxStr;

                auxStr = array11[i];
                array11[i] = array11[j];
                array11[j] = auxStr;

                auxStr = array12[i];
                array12[i] = array12[j];
                array12[j] = auxStr;

                auxStr = array13[i];
                array13[i] = array13[j];
                array13[j] = auxStr;

                auxDouble = array14[i];
                array14[i] = array14[j];
                array14[j] = auxDouble;

                auxDouble = array15[i];
                array15[i] = array15[j];
                array15[j] = auxDouble;

                auxDouble = array16[i];
                array16[i] = array16[j];
                array16[j] = auxDouble;

            }

        }

        aux = array[i + 1];
        array[i + 1] = array[r];
        array[r] = aux;

        aux = array2[i + 1];
        array2[i + 1] = array2[r];
        array2[r] = aux;

        aux = array3[i + 1];
        array3[i + 1] = array3[r];
        array3[r] = aux;

        aux = array4[i + 1];
        array4[i + 1] = array4[r];
        array4[r] = aux;

        aux = array5[i + 1];
        array5[i + 1] = array5[r];
        array5[r] = aux;

        aux = array6[i + 1];
        array6[i + 1] = array6[r];
        array6[r] = aux;

        aux = array7[i + 1];
        array7[i + 1] = array7[r];
        array7[r] = aux;

        auxStr = array8[i + 1];
        array8[i + 1] = array8[r];
        array8[r] = auxStr;

        auxStr = array9[i + 1];
        array9[i + 1] = array9[r];
        array9[r] = auxStr;

        auxStr = array10[i + 1];
        array10[i + 1] = array10[r];
        array10[r] = auxStr;

        auxStr = array11[i + 1];
        array11[i + 1] = array11[r];
        array11[r] = auxStr;

        auxStr = array12[i + 1];
        array12[i + 1] = array12[r];
        array12[r] = auxStr;

        auxStr = array13[i + 1];
        array13[i + 1] = array13[r];
        array13[r] = auxStr;

        auxDouble = array14[i + 1];
        array14[i + 1] = array14[r];
        array14[r] = auxDouble;

        auxDouble = array15[i + 1];
        array15[i + 1] = array15[r];
        array15[r] = auxDouble;

        auxDouble = array16[i + 1];
        array16[i + 1] = array16[r];
        array16[r] = auxDouble;

        return i + 1;

    }

    public static void quickSortStr(String[] arrayName, Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365 ,
                                    String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude, int a, int b) {

        if (a < b) {
            int q = particionaStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, a, b);
            quickSortStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, a, q - 1);
            quickSortStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, q + 1, b);
        }
    }

    public static int particionaStr(String[] arrayName, Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365 ,
                                    String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude, int p, int r) {
        int i = p - 1;
        String x = arrayName[r];

        int aux;
        String auxStr;
        double auxDouble;

        for (int j = p; j < r; j++) {

            if (arrayName[j].compareToIgnoreCase(x) < 0) {
                i++;

                auxStr = arrayName[i];
                arrayName[i] = arrayName[j];
                arrayName[j] = auxStr;

                aux = arrayPrice[i];
                arrayPrice[i] = arrayPrice[j];
                arrayPrice[j] = aux;

                aux = arrayId[i];
                arrayId[i] = arrayId[j];
                arrayId[j] = aux;

                aux = arrayHostId[i];
                arrayHostId[i] = arrayHostId[j];
                arrayHostId[j] = aux;

                aux = arrayMinimumNights[i];
                arrayMinimumNights[i] = arrayMinimumNights[j];
                arrayMinimumNights[j] = aux;

                aux = arrayNumberOfReviews[i];
                arrayNumberOfReviews[i] = arrayNumberOfReviews[j];
                arrayNumberOfReviews[j] = aux;

                aux = arrayCalculatedHostListingsCount[i];
                arrayCalculatedHostListingsCount[i] = arrayCalculatedHostListingsCount[j];
                arrayCalculatedHostListingsCount[j] = aux;

                aux = arrayAvailability365[i];
                arrayAvailability365[i] = arrayAvailability365[j];
                arrayAvailability365[j] = aux;

                auxStr = arrayHostName[i];
                arrayHostName[i] = arrayHostName[j];
                arrayHostName[j] = auxStr;

                auxStr = arrayNeighbourhoodGroup[i];
                arrayNeighbourhoodGroup[i] = arrayNeighbourhoodGroup[j];
                arrayNeighbourhoodGroup[j] = auxStr;

                auxStr = arrayNeighbourhood[i];
                arrayNeighbourhood[i] = arrayNeighbourhood[j];
                arrayNeighbourhood[j] = auxStr;

                auxStr = arrayRoomType[i];
                arrayRoomType[i] = arrayRoomType[j];
                arrayRoomType[j] = auxStr;

                auxStr = arrayLastReview[i];
                arrayLastReview[i] = arrayLastReview[j];
                arrayLastReview[j] = auxStr;

                auxDouble = arrayLatitude[i];
                arrayLatitude[i] = arrayLatitude[j];
                arrayLatitude[j] = auxDouble;

                auxDouble = arrayLongitude[i];
                arrayLongitude[i] = arrayLongitude[j];
                arrayLongitude[j] = auxDouble;

            }

        }

        auxStr = arrayName[i + 1];
        arrayName[i + 1] = arrayName[r];
        arrayName[r] = auxStr;

        aux = arrayPrice[i + 1];
        arrayPrice[i + 1] = arrayPrice[r];
        arrayPrice[r] = aux;

        aux = arrayId[i + 1];
        arrayId[i + 1] = arrayId[r];
        arrayId[r] = aux;

        aux = arrayHostId[i + 1];
        arrayHostId[i + 1] = arrayHostId[r];
        arrayHostId[r] = aux;

        aux = arrayMinimumNights[i + 1];
        arrayMinimumNights[i + 1] = arrayMinimumNights[r];
        arrayMinimumNights[r] = aux;

        aux = arrayNumberOfReviews[i + 1];
        arrayNumberOfReviews[i + 1] = arrayNumberOfReviews[r];
        arrayNumberOfReviews[r] = aux;

        aux = arrayCalculatedHostListingsCount[i + 1];
        arrayCalculatedHostListingsCount[i + 1] = arrayCalculatedHostListingsCount[r];
        arrayCalculatedHostListingsCount[r] = aux;

        aux = arrayAvailability365[i + 1];
        arrayAvailability365[i + 1] = arrayAvailability365[r];
        arrayAvailability365[r] = aux;

        auxStr = arrayHostName[i + 1];
        arrayHostName[i + 1] = arrayHostName[r];
        arrayHostName[r] = auxStr;

        auxStr = arrayNeighbourhoodGroup[i + 1];
        arrayNeighbourhoodGroup[i + 1] = arrayNeighbourhoodGroup[r];
        arrayNeighbourhoodGroup[r] = auxStr;

        auxStr = arrayNeighbourhood[i + 1];
        arrayNeighbourhood[i + 1] = arrayName[r];
        arrayNeighbourhood[r] = auxStr;

        auxStr = arrayRoomType[i + 1];
        arrayRoomType[i + 1] = arrayRoomType[r];
        arrayRoomType[r] = auxStr;

        auxStr = arrayLastReview[i + 1];
        arrayLastReview[i + 1] = arrayLastReview[r];
        arrayLastReview[r] = auxStr;

        auxDouble = arrayLatitude[i + 1];
        arrayLatitude[i + 1] = arrayLatitude[r];
        arrayLatitude[r] = auxDouble;

        auxDouble = arrayLongitude[i + 1];
        arrayLongitude[i + 1] = arrayLongitude[r];
        arrayLongitude[r] = auxDouble;

        return i + 1;
    }
}