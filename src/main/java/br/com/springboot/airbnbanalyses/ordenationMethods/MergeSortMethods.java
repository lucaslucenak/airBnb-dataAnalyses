package br.com.springboot.airbnbanalyses.ordenationMethods;

import br.com.springboot.airbnbanalyses.ordenationAlgorithms.MergeSort;
import br.com.springboot.airbnbanalyses.ordenationAlgorithms.SelectionSort;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.text.ParseException;

import static br.com.springboot.airbnbanalyses.app.CsvManipulation.writeAlgorithmsFiles;

public class MergeSortMethods {
    public static void mergeSort_Prices(String pathMedioCaso, String pathMelhorCaso, String pathPiorCaso, Integer[] arrayPrice, Integer[] auxArrayPrice, Integer[] arrayId, Integer[] auxArrayId, Integer[] arrayHostId, Integer[] auxArrayHostId, Integer[] arrayMinimumNights, Integer[] auxArrayMinimumNights,
                                        Integer[] arrayNumberOfReviews, Integer[] auxArrayNumberOfReviews,Integer[] arrayCalculatedHostListingsCount, Integer[] auxArrayCalculatedHostListingsCount,Integer[] arrayAvailability365, Integer[] auxArrayAvailability365,String[] arrayName, String[] auxArrayName, String[] arrayHostName, String[] auxArrayHostName,
                                        String[] arrayNeighbourhoodGroup, String[] auxArrayNeighbourhoodGroup,String[] arrayNeighbourhood, String[] auxArrayNeighbourhood,String[] arrayRoomType, String[] auxArrayRoomType,String[] arrayLastReview, String[] auxArrayLastReview,
                                        Double[] arrayLatitude, Double[] auxArrayLatitude,Double[] arrayLongitude, Double[] auxArrayLongitude, Double[] arrayReviewsPerMonth, Double[] auxArrayReviewsPerMonth, Integer ini, Integer fim) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException, ParseException {
        MergeSort.mergeSortCrescent_Price(arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
            arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews,
            arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365,
            auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
            auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
            arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
            arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
        writeAlgorithmsFiles(pathMedioCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
        MergeSort.mergeSortCrescent_Price(arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
            arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews,
            arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365,
            auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
            auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
            arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
            arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
        writeAlgorithmsFiles(pathMelhorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
        SelectionSort.selectionSortDecrescent(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
        MergeSort.mergeSortCrescent_Price(arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
            arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews,
            arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365,
            auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
            auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
            arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
            arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
            writeAlgorithmsFiles(pathPiorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
    }

    public static void mergeSort_NumberOfReviews(String pathMedioCaso, String pathMelhorCaso, String pathPiorCaso, Integer[] arrayPrice, Integer[] auxArrayPrice, Integer[] arrayId, Integer[] auxArrayId, Integer[] arrayHostId, Integer[] auxArrayHostId, Integer[] arrayMinimumNights, Integer[] auxArrayMinimumNights,
                                        Integer[] arrayNumberOfReviews, Integer[] auxArrayNumberOfReviews,Integer[] arrayCalculatedHostListingsCount, Integer[] auxArrayCalculatedHostListingsCount,Integer[] arrayAvailability365, Integer[] auxArrayAvailability365,String[] arrayName, String[] auxArrayName, String[] arrayHostName, String[] auxArrayHostName,
                                        String[] arrayNeighbourhoodGroup, String[] auxArrayNeighbourhoodGroup,String[] arrayNeighbourhood, String[] auxArrayNeighbourhood,String[] arrayRoomType, String[] auxArrayRoomType,String[] arrayLastReview, String[] auxArrayLastReview,
                                        Double[] arrayLatitude, Double[] auxArrayLatitude,Double[] arrayLongitude, Double[] auxArrayLongitude, Double[] arrayReviewsPerMonth, Double[] auxArrayReviewsPerMonth, Integer ini, Integer fim) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException, ParseException {
        MergeSort.mergeSortCrescent_Price(arrayNumberOfReviews, auxArrayNumberOfReviews, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
                arrayMinimumNights, auxArrayMinimumNights, arrayPrice, auxArrayPrice,
                arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365,
                auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
                arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
                arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
        writeAlgorithmsFiles(pathMedioCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
        MergeSort.mergeSortCrescent_Price(arrayNumberOfReviews, auxArrayNumberOfReviews, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
                arrayMinimumNights, auxArrayMinimumNights, arrayPrice, auxArrayPrice,
                arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365,
                auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
                arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
                arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
        writeAlgorithmsFiles(pathMelhorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
        SelectionSort.selectionSortDecrescent(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
        MergeSort.mergeSortCrescent_Price(arrayNumberOfReviews, auxArrayNumberOfReviews, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
                arrayMinimumNights, auxArrayMinimumNights, arrayPrice, auxArrayPrice,
                arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365,
                auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
                arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
                arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
        writeAlgorithmsFiles(pathPiorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
    }

    public static void mergeSort_Names(String pathMedioCaso, String pathMelhorCaso, String pathPiorCaso, String[] arrayName, String[] auxArrayName, Integer[] arrayPrice, Integer[] auxArrayPrice, Integer[] arrayId, Integer[] auxArrayId, Integer[] arrayHostId, Integer[] auxArrayHostId, Integer[] arrayMinimumNights, Integer[] auxArrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] auxArrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] auxArrayCalculatedHostListingsCount, Integer[] arrayAvailability365 , Integer[] auxArrayAvailability365 ,
                                       String[] arrayHostName, String[] auxArrayHostName, String[] arrayNeighbourhoodGroup, String[] auxArrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] auxArrayNeighbourhood, String[] arrayRoomType, String[] auxArrayRoomType, String[] arrayLastReview, String[] auxArrayLastReview, Double[] arrayLatitude, Double[] auxArrayLatitude, Double[] arrayLongitude, Double[] auxArrayLongitude, Double[] arrayReviewsPerMonth, Double[] auxArrayReviewsPerMonth, Integer ini, Integer fim) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException, ParseException {

                    MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                            arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
            writeAlgorithmsFiles(pathMedioCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
            //zerarAux(auxArrayName,auxArrayPrice,auxArrayId,auxArrayHostId,auxArrayMinimumNights,auxArrayNumberOfReviews,auxArrayCalculatedHostListingsCount,auxArrayAvailability365,auxArrayHostName,auxArrayNeighbourhoodGroup,auxArrayNeighbourhood
            //,auxArrayRoomType,auxArrayLastReview,auxArrayLatitude,auxArrayLongitude, arrayReviewsPerMonth);
            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, arrayReviewsPerMonth, auxArrayReviewsPerMonth,ini, fim);
            writeAlgorithmsFiles(pathMelhorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
            //zerarAux(auxArrayName,auxArrayPrice,auxArrayId,auxArrayHostId,auxArrayMinimumNights,auxArrayNumberOfReviews,auxArrayCalculatedHostListingsCount,auxArrayAvailability365,auxArrayHostName,auxArrayNeighbourhoodGroup,auxArrayNeighbourhood
            //    ,auxArrayRoomType,auxArrayLastReview,auxArrayLatitude,auxArrayLongitude, arrayReviewsPerMonth);
            SelectionSort.selectionSortDecrescent(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, arrayReviewsPerMonth, auxArrayReviewsPerMonth,ini, fim);
        writeAlgorithmsFiles(pathPiorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
    }


    /*
    * String auxArrayName[] = new String[arrayName.length];
            Integer auxArrayPrice[] = new Integer[arrayPrice.length];
            Integer auxArrayId[] = new Integer[arrayId.length];
            Integer auxArrayHostId[] = new Integer[arrayHostId.length];
            Integer auxArrayMinimumNights[] = new Integer[arrayMinimumNights.length];
            Integer auxArrayNumberOfReviews[] = new Integer[arrayNumberOfReviews.length];
            Integer auxArrayCalculatedHostListingsCount[] = new Integer[arrayCalculatedHostListingsCount.length];
            Integer auxArrayAvailability365[] = new Integer[arrayAvaiability365.length];
            String auxArrayHostName[] = new String[arrayHostName.length];
            String auxArrayNeighbourhoodGroup[] = new String[arrayNeighbourhoodGroup.length];
            String auxArrayNeighbourhood[] = new String[arrayNeighbourhood.length];
            String auxArrayRoomType[] = new String[arrayRoomType.length];
            String auxArrayLastReview[] = new String[arrayLastReview.length];
            Double auxArrayLatitude[] = new Double[arrayLatitude.length];
            Double auxArrayLongitude[] = new Double[arrayLongitude.length];
            *
            *
            * String auxArrayName2[] = new String[arrayName.length];
            Integer auxArrayPrice2[] = new Integer[arrayPrice.length];
            Integer auxArrayId2[] = new Integer[arrayId.length];
            Integer auxArrayHostId2[] = new Integer[arrayHostId.length];
            Integer auxArrayMinimumNights2[] = new Integer[arrayMinimumNights.length];
            Integer auxArrayNumberOfReviews2[] = new Integer[arrayNumberOfReviews.length];
            Integer auxArrayCalculatedHostListingsCount2[] = new Integer[arrayCalculatedHostListingsCount.length];
            Integer auxArrayAvailability3652[] = new Integer[arrayAvaiability365.length];
            String auxArrayHostName2[] = new String[arrayHostName.length];
            String auxArrayNeighbourhoodGroup2[] = new String[arrayNeighbourhoodGroup.length];
            String auxArrayNeighbourhood2[] = new String[arrayNeighbourhood.length];
            String auxArrayRoomType2[] = new String[arrayRoomType.length];
            String auxArrayLastReview2[] = new String[arrayLastReview.length];
            Double auxArrayLatitude2[] = new Double[arrayLatitude.length];
            Double auxArrayLongitude2[] = new Double[arrayLongitude.length];
            * */
    public static void zerarAux(String[] auxArrayName,Integer[] auxArrayPrice, Integer[] auxArrayId, Integer[] auxArrayHostId, Integer[] auxArrayMinimumNights, Integer[] auxArrayNumberOfReviews, Integer[] auxArrayCalculatedHostListingsCount, Integer[] auxArrayAvailability365 ,
                               String[] auxArrayHostName, String[] auxArrayNeighbourhoodGroup, String[] auxArrayNeighbourhood, String[] auxArrayRoomType, String[] auxArrayLastReview, Double[] auxArrayLatitude, Double[] auxArrayLongitude, Double[] auxArrayReviewsPerMonth) {

        for (int i = 0; i < auxArrayName.length-1; i++) {
            auxArrayName[i] = null;
            auxArrayPrice[i] = null;
           auxArrayId[i] = null;
             auxArrayHostId[i] = null;
             auxArrayMinimumNights[i] = null;
             auxArrayNumberOfReviews[i] = null;
             auxArrayCalculatedHostListingsCount[i] = null;
             auxArrayAvailability365[i] = null;
             auxArrayHostName[i] = null;
             auxArrayNeighbourhoodGroup[i] = null;
             auxArrayNeighbourhood[i] = null;
             auxArrayRoomType[i] = null;
             auxArrayLastReview[i] = null;
             auxArrayLatitude[i] = null;
             auxArrayLongitude[i] = null;
             auxArrayReviewsPerMonth[i] = null;
        }

    }


}
