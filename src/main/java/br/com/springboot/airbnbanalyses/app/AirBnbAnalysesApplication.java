package br.com.springboot.airbnbanalyses.app;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import br.com.springboot.airbnbanalyses.ordenationAlgorithms.InsertionSort;
import br.com.springboot.airbnbanalyses.ordenationAlgorithms.MergeSort;
import br.com.springboot.airbnbanalyses.ordenationAlgorithms.QuickSort_MedianaDe3;
import br.com.springboot.airbnbanalyses.ordenationAlgorithms.SelectionSort;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static br.com.springboot.airbnbanalyses.app.CsvManipulation.*;


public class AirBnbAnalysesApplication {

    /*
    * Para que os arquivos sejam gerados corretamente é necessário que:
    * 1° - O clone do projeto seja realizado na área de trabalho (para evitar ter que trocar os parâmetros das constantes
    * 2° - O valor da constante "USER" seja alterado para o nome do usuário que está logado no Windows
    * 3° - Após ajustar os endereços de criação dos arquivos, basta executar esta classe (AirBnbAnalysesApplication.java)
    */

    private static final String USER = "lukki";

    private static final String CSV_LISTINGS = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\csvFiles\\listings.csv";
    private static final String CSV_LISTINGS_REVIEW_DATE = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\csvFiles\\listings_review_date.csv";
    private static final String CSV_LISTINGS_GT_AVG_PRICES = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\csvFiles\\listings_gt_avg_prices.csv";
    private static final String CSV_LISTINGS_LT_AVG_PRICES = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\csvFiles\\listings_lt_avg_prices.csv";

    private static final String CSV_LISTINGS_NAMES_INSERTIONSORT_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\insertionSort\\listings_names_insertionSort_medioCaso.csv";
    private static final String CSV_LISTINGS_NAMES_INSERTIONSORT_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\insertionSort\\listings_names_insertionSort_piorCaso.csv";
    private static final String CSV_LISTINGS_NAMES_INSERTIONSORT_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\insertionSort\\listings_names_insertionSort_melhorCaso.csv";

    private static final String CSV_LISTINGS_PRICE_INSERTIONSORT_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\insertionSort\\listings_price_insertionSort_medioCaso.csv";
    private static final String CSV_LISTINGS_PRICE_INSERTIONSORT_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\insertionSort\\listings_price_insertionSort_piorCaso.csv";
    private static final String CSV_LISTINGS_PRICE_INSERTIONSORT_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\insertionSort\\listings_price_insertionSort_melhorCaso.csv";

    private static final String CSV_LISTINGS_NUMBEROFREVIEWS_INSERTIONSORT_MEDIOCASO = "";
    private static final String CSV_LISTINGS_NUMBEROFREVIEWS_INSERTIONSORT_PIORCASO = "";
    private static final String CSV_LISTINGS_NUMBEROFREVIEWS_INSERTIONSORT_MELHORCASO = "";

    private static final String CSV_LISTINGS_LASTREVIEW_INSERTIONSORT_MEDIOCASO = "";
    private static final String CSV_LISTINGS_LASTREVIEW_INSERTIONSORT_PIORCASO = "";
    private static final String CSV_LISTINGS_LASTREVIEW_INSERTIONSORT_MELHORCASO = "";

    private static final String CSV_LISTINGS_NAMES_SELECTIONSORT_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\selectionSort\\listings_names_selectionSort_medioCaso.csv";
    private static final String CSV_LISTINGS_NAMES_SELECTIONSORT_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\selectionSort\\listings_names_selectionSort_piorCaso.csv";
    private static final String CSV_LISTINGS_NAMES_SELECTIONSORT_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\selectionSort\\listings_names_selectionSort_melhorCaso.csv";

    private static final String CSV_LISTINGS_PRICE_SELECTIONSORT_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\selectionSort\\listings_price_selectionSort_medioCaso.csv";
    private static final String CSV_LISTINGS_PRICE_SELECTIONSORT_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\selectionSort\\listings_price_selectionSort_piorCaso.csv";
    private static final String CSV_LISTINGS_PRICE_SELECTIONSORT_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\selectionSort\\listings_price_selectionSort_melhorCaso.csv";

    private static final String CSV_LISTINGS_NUMBEROFREVIEWS_SELECTIONSORT_MEDIOCASO = "";
    private static final String CSV_LISTINGS_NUMBEROFREVIEWS_SELECTIONSORT_PIORCASO = "";
    private static final String CSV_LISTINGS_NUMBEROFREVIEWS_SELECTIONSORT_MELHORCASO = "";

    private static final String CSV_LISTINGS_LASTREVIEW_SELECTIONSORT_MEDIOCASO = "";
    private static final String CSV_LISTINGS_LASTREVIEW_SELECTIONSORT_PIORCASO = "";
    private static final String CSV_LISTINGS_LASTREVIEW_SELECTIONSORT_MELHORCASO = "";

    private static final String CSV_LISTINGS_NAMES_MERGESORT_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\mergeSort\\listings_names_mergeSort_medioCaso.csv";
    private static final String CSV_LISTINGS_NAMES_MERGESORT_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\mergeSort\\listings_names_mergeSort_piorCaso.csv";
    private static final String CSV_LISTINGS_NAMES_MERGESORT_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\mergeSort\\listings_names_mergeSort_melhorCaso.csv";

    private static final String CSV_LISTINGS_PRICE_MERGESORT_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\mergeSort\\listings_price_mergeSort_medioCaso.csv";
    private static final String CSV_LISTINGS_PRICE_MERGESORT_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\mergeSort\\listings_price_mergeSort_piorCaso.csv";
    private static final String CSV_LISTINGS_PRICE_MERGESORT_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\mergeSort\\listings_price_mergeSort_melhorCaso.csv";

    private static final String CSV_LISTINGS_NAMES_QUICKSORT_MD3_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\quickSort_MedianaDe3\\listings_names_quickSort_md3_medioCaso.csv";
    private static final String CSV_LISTINGS_NAMES_QUICKSORT_MD3_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\quickSort_MedianaDe3\\listings_names_quickSort_md3_piorCaso.csv";
    private static final String CSV_LISTINGS_NAMES_QUICKSORT_MD3_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\quickSort_MedianaDe3\\listings_names_quickSort_md3_melhorCaso.csv";

    private static final String CSV_LISTINGS_PRICE_QUICKSORT_MD3_MEDIOCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\quickSort_MedianaDe3\\listings_price_mergeSort_medioCaso.csv";
    private static final String CSV_LISTINGS_PRICE_QUICKSORT_MD3_PIORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\quickSort_MedianaDe3\\listings_price_mergeSort_piorCaso.csv";
    private static final String CSV_LISTINGS_PRICE_QUICKSORT_MD3_MELHORCASO = "C:\\Users\\"+USER+"\\Desktop\\airBnb-dataAnalyses\\src\\main\\resources\\ordenatedCsvFiles\\quickSort_MedianaDe3\\listings_price_mergeSort_melhorCaso.csv";



    public static void main (String []args) {
        try {
            /*List<AirBnbListings> list = readCsv(CSV_LISTINGS).parse();

            convertDate(list);
            List<Integer> priceList = createPriceList(list);
            writeCsvFiles(CSV_LISTINGS_REVIEW_DATE, CSV_LISTINGS_GT_AVG_PRICES, CSV_LISTINGS_LT_AVG_PRICES, list, returnAvgPrice(priceList));
            System.out.println("Arquivos .csv criados com sucesso.");*/

            List<AirBnbListings> listings_review_date = readCsv(CSV_LISTINGS_REVIEW_DATE).parse();

            Integer[] arrayId = new Integer[listings_review_date.size()];
            String[] arrayName = new String[listings_review_date.size()];
            Integer[] arrayHostId = new Integer[listings_review_date.size()];
            String[] arrayHostName = new String[listings_review_date.size()];
            String[] arrayNeighbourhoodGroup = new String[listings_review_date.size()];
            String[] arrayNeighbourhood = new String[listings_review_date.size()];
            Double[] arrayLatitude = new Double[listings_review_date.size()];
            Double[] arrayLongitude = new Double[listings_review_date.size()];
            String[] arrayRoomType = new String[listings_review_date.size()];
            Integer[] arrayPrice = new Integer[listings_review_date.size()];
            Integer[] arrayMinimumNights = new Integer[listings_review_date.size()];
            Integer[] arrayNumberOfReviews = new Integer[listings_review_date.size()];
            String[] arrayLastReview= new String[listings_review_date.size()];
            Double[] arrayReviewsPerMonth = new Double[listings_review_date.size()];
            Integer[] arrayCalculatedHostListingsCount = new Integer[listings_review_date.size()];
            Integer[] arrayAvaiability365 = new Integer[listings_review_date.size()];

            String[] auxArrayName = new String[arrayName.length];
            Integer[] auxArrayPrice = new Integer[arrayPrice.length];
            Integer[] auxArrayId = new Integer[arrayId.length];
            Integer[] auxArrayHostId = new Integer[arrayHostId.length];
            Integer[] auxArrayMinimumNights = new Integer[arrayMinimumNights.length];
            Integer[] auxArrayNumberOfReviews = new Integer[arrayNumberOfReviews.length];
            Integer[] auxArrayCalculatedHostListingsCount = new Integer[arrayCalculatedHostListingsCount.length];
            Integer[] auxArrayAvailability365 = new Integer[arrayAvaiability365.length];
            String[] auxArrayHostName = new String[arrayHostName.length];
            String[] auxArrayNeighbourhoodGroup = new String[arrayNeighbourhoodGroup.length];
            String[] auxArrayNeighbourhood = new String[arrayNeighbourhood.length];
            String[] auxArrayRoomType = new String[arrayRoomType.length];
            String[] auxArrayLastReview = new String[arrayLastReview.length];
            Double[] auxArrayLatitude = new Double[arrayLatitude.length];
            Double[] auxArrayLongitude = new Double[arrayLongitude.length];
            Double[] auxArrayReviewsPerMonth = new Double[arrayReviewsPerMonth.length];

            resetArrays(listings_review_date, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //-----------------------------------------SELECTION SORT (PRICE)-----------------------------------------//
            SelectionSort.selectionSortCrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_SELECTIONSORT_MEDIOCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortCrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_SELECTIONSORT_MELHORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortDecrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_SELECTIONSORT_PIORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //-----------------------------------------SELECTION SORT (NAMES)-----------------------------------------//
            SelectionSort.selectionSortCrescent_Names(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            writeAlgorithmsFiles(CSV_LISTINGS_NAMES_SELECTIONSORT_MEDIOCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortCrescent_Names(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            writeAlgorithmsFiles(CSV_LISTINGS_NAMES_SELECTIONSORT_MELHORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortDecrescent_Names(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            writeAlgorithmsFiles(CSV_LISTINGS_NAMES_SELECTIONSORT_PIORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);


            //RESET DOS ARRAYS PARA A ORDEM ORIGINAL DOS DADOS
            resetArrays(listings_review_date, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //-----------------------------------------INSERTION SORT (PRICE)-----------------------------------------//
            InsertionSort.insertionSortCrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_INSERTIONSORT_MEDIOCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            InsertionSort.insertionSortCrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_INSERTIONSORT_MELHORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortDecrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            InsertionSort.insertionSortCrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_INSERTIONSORT_PIORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //RESET DOS ARRAYS PARA A ORDEM ORIGINAL DOS DADOS
            resetArrays(listings_review_date, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //-------------------------------------------MERGE SORT (PRICE)------------------------------------------//
            MergeSort.mergeSortCrescent_Price(arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
                    arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews,
                    arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, auxArrayAvailability365,
                    auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
                    arrayReviewsPerMonth, auxArrayReviewsPerMonth, 0, arrayPrice.length-1);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_MERGESORT_MEDIOCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            MergeSort.mergeSortCrescent_Price(arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
                    arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews,
                    arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, auxArrayAvailability365,
                    auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
                    arrayReviewsPerMonth, auxArrayReviewsPerMonth, 0, arrayPrice.length-1);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_MERGESORT_MELHORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortDecrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            MergeSort.mergeSortCrescent_Price(arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId,
                    arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews,
                    arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, auxArrayAvailability365,
                    auxArrayAvailability365, arrayName, auxArrayName, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,
                    arrayReviewsPerMonth, auxArrayReviewsPerMonth, 0, arrayPrice.length-1);
            writeAlgorithmsFiles(CSV_LISTINGS_PRICE_MERGESORT_PIORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);


            //RESET DOS ARRAYS PARA A ORDEM ORIGINAL DOS DADOS
            resetArrays(listings_review_date, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //-------------------------------------------MERGE SORT (NAMES)------------------------------------------//


            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvaiability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, 0, arrayName.length-1);
            writeAlgorithmsFiles(CSV_LISTINGS_NAMES_MERGESORT_MEDIOCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvaiability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, 0, arrayName.length-1);
            writeAlgorithmsFiles(CSV_LISTINGS_NAMES_MERGESORT_MELHORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            SelectionSort.selectionSortDecrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            MergeSort.mergeSortCrescent_Names(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
                    arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews,
                    auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
                    arrayAvaiability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
                    auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
                    arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, 0, arrayName.length-1);
            writeAlgorithmsFiles(CSV_LISTINGS_NAMES_MERGESORT_PIORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //RESET DOS ARRAYS PARA A ORDEM ORIGINAL DOS DADOS
            resetArrays(listings_review_date, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //-------------------------------------QUICK SORT MEDIANA DE 3 (NAMES)------------------------------------//
            // SÓ FUNCIONA O MEDIO CASO
            //QuickSort_MedianaDe3.quickSortMD3_Names(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);
            //writeAlgorithmsFiles(CSV_LISTINGS_NAMES_QUICKSORT_MD3_MEDIOCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            //QuickSort_MedianaDe3.quickSortMD3_Names(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);
            //writeAlgorithmsFiles(CSV_LISTINGS_NAMES_QUICKSORT_MD3_MELHORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);
            //SelectionSort.selectionSortDecrescent_Price(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, arrayReviewsPerMonth);
            //QuickSort_MedianaDe3.quickSortMD3_Names(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);
            //writeAlgorithmsFiles(CSV_LISTINGS_NAMES_QUICKSORT_MD3_PIORCASO, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);

            //RESET DOS ARRAYS PARA A ORDEM ORIGINAL DOS DADOS
            resetArrays(listings_review_date, arrayId, arrayName, arrayHostId, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayLatitude, arrayLongitude, arrayRoomType, arrayPrice, arrayMinimumNights, arrayNumberOfReviews, arrayLastReview, arrayReviewsPerMonth, arrayCalculatedHostListingsCount, arrayAvaiability365);


            //-------------------------------------QUICK SORT MEDIANA DE 3 (PRICE)------------------------------------//



        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //Reseta os arrays para o médio caso
    public static void resetArrays(List<AirBnbListings> listings_review_date, Integer[] arrayId, String[] arrayName, Integer[] arrayHostId,
                                   String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, Double[] arrayLatitude, Double[] arrayLongitude,
                                   String[] arrayRoomType, Integer[] arrayPrice, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews,
                                   String[] arrayLastReview, Double[] arrayReviewsPerMonth, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvaiability365) {

        //Movendo todos os arquivos do objeto para um array simples
        int j = 0;
        for (AirBnbListings i : listings_review_date) {
            arrayId[j] = i.getId();
            arrayName[j] = i.getName();
            arrayHostId[j] = i.getHost_id();
            arrayHostName[j] = i.getHost_name();
            arrayNeighbourhoodGroup[j] = i.getNeighbourhood_group();
            arrayNeighbourhood[j] = i.getNeighbourhood();
            arrayLatitude[j] = i.getLatitude();
            arrayLongitude[j] = i.getLongitude();
            arrayRoomType[j] = i.getRoom_type();
            arrayPrice[j] = i.getPrice();
            arrayMinimumNights[j] = i.getMinimum_nights();
            arrayNumberOfReviews[j] = i.getNumber_of_reviews();
            arrayLastReview[j] = i.getLast_review();
            arrayReviewsPerMonth[j] = i.getReviews_per_month();
            arrayCalculatedHostListingsCount[j] = i.getCalculated_host_listings_count();
            arrayAvaiability365[j] = i.getAvailability_365();
            j++;
        }
    }

    //Cria uma lista com os preços apenas
    public static List<Integer> createPriceList(List<AirBnbListings> list) {
        List<Integer> priceList = new ArrayList<>();

        for (AirBnbListings i : list) {
            Integer price = i.getPrice();
            //Integer price = Integer.parseInt(i.getPrice());
            priceList.add(price);
        }

        return priceList;
    }

    //Recebe uma lista de preços e retorna a média dela
    public static int returnAvgPrice(List<Integer> priceList) {
        int avgPrice;
        int priceCounter = 0, diviser = 0;

        for (Integer i : priceList) {
            priceCounter += i;
            diviser++;
        }

        avgPrice =(priceCounter / diviser);

        return  avgPrice;
    }

}