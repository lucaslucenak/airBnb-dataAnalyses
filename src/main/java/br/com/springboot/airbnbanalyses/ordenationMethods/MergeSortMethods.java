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

    public static void mergeSort_Names(String pathMedioCaso, String pathMelhorCaso, String pathPiorCaso, String[] arrayName, String[] auxArrayName, Integer[] arrayPrice, Integer[] auxArrayPrice, Integer[] arrayId, Integer[] auxArrayId, Integer[] arrayHostId, Integer[] auxArrayHostId, Integer[] arrayMinimumNights, Integer[] auxArrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] auxArrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] auxArrayCalculatedHostListingsCount, Integer[] arrayAvailability365 , Integer[] auxArrayAvailability365 ,
                                       String[] arrayHostName, String[] auxArrayHostName, String[] arrayNeighbourhoodGroup, String[] auxArrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] auxArrayNeighbourhood, String[] arrayRoomType, String[] auxArrayRoomType, String[] arrayLastReview, String[] auxArrayLastReview, Double[] arrayLatitude, Double[] auxArrayLatitude, Double[] arrayLongitude, Double[] auxArrayLongitude, Double[] arrayReviewsPerMonth, Double[] auxArrayReviewsPerMonth, Integer ini, Integer fim) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException, ParseException {

                    MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                            arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, arrayReviewsPerMonth, auxArrayReviewsPerMonth, ini, fim);
            writeAlgorithmsFiles(pathMedioCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, arrayReviewsPerMonth, auxArrayReviewsPerMonth,ini, fim);
            writeAlgorithmsFiles(pathMelhorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
            SelectionSort.selectionSortDecrescent(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvailability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, arrayReviewsPerMonth, auxArrayReviewsPerMonth,ini, fim);
        writeAlgorithmsFiles(pathPiorCaso, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvailability365);
    }
}
