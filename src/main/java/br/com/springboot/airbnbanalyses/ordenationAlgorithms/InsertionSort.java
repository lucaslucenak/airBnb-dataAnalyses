package br.com.springboot.airbnbanalyses.ordenationAlgorithms;

public class InsertionSort {

    public static void insertionSortCrescent(Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365, String[] arrayName,
                                             String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude, Double[] arrayReviewsPerMonth) {
        int n = arrayPrice.length;
        for (int j = 1; j < n; j++) {
            Integer key = arrayPrice[j];
            Integer key2 = arrayId[j];
            Integer key3 = arrayHostId[j];
            Integer key4 = arrayMinimumNights[j];
            Integer key5 = arrayNumberOfReviews[j];
            Integer key6 = arrayCalculatedHostListingsCount[j];
            Integer key7 = arrayAvailability365[j];
            String key8 = arrayName[j];
            String key9 = arrayHostName[j];
            String key10 = arrayNeighbourhoodGroup[j];
            String key11 = arrayNeighbourhood[j];
            String key12 = arrayRoomType[j];
            String key13 = arrayLastReview[j];
            Double key14 = arrayLatitude[j];
            Double key15 = arrayLongitude[j];
            Double key16 = arrayReviewsPerMonth[j];
            int i = j-1;
            while ( (i > -1) && ( arrayPrice [i] > key ) ) {
                arrayPrice [i+1] = arrayPrice [i];
                arrayId[i + 1] = arrayId[i];
                arrayHostId[i + 1] = arrayHostId[i];
                arrayMinimumNights[i + 1] = arrayMinimumNights[i];
                arrayNumberOfReviews[i + 1] = arrayNumberOfReviews[i];
                arrayCalculatedHostListingsCount[i + 1] = arrayCalculatedHostListingsCount[i];
                arrayAvailability365[i + 1] = arrayAvailability365[i];
                arrayName[i + 1] = arrayName[i];
                arrayHostName[i + 1] = arrayHostName[i];
                arrayNeighbourhoodGroup[i + 1] = arrayNeighbourhoodGroup[i];
                arrayNeighbourhood[i + 1] = arrayNeighbourhood[i];
                arrayRoomType[i + 1] = arrayRoomType[i];
                arrayLastReview[i + 1] = arrayLastReview[i];
                arrayLatitude[i + 1] = arrayLatitude[i];
                arrayLongitude[i + 1] = arrayLongitude[i];
                arrayReviewsPerMonth[i + 1] = arrayReviewsPerMonth[i];
                i--;
            }
            arrayPrice[i+1] = key;
            arrayId[i+1] = key2;
            arrayHostId[i+1] = key3;
            arrayMinimumNights[i+1] = key4;
            arrayNumberOfReviews[i+1] = key5;
            arrayCalculatedHostListingsCount[i+1] = key6;
            arrayAvailability365[i+1] = key7;
            arrayName[i+1] = key8;
            arrayHostName[i+1] = key9;
            arrayNeighbourhoodGroup[i+1] = key10;
            arrayNeighbourhood[i+1] = key11;
            arrayRoomType[i+1] = key12;
            arrayLastReview[i+1] = key13;
            arrayLatitude[i+1] = key14;
            arrayLongitude[i+1] = key15;
            arrayReviewsPerMonth[i+1] = key16;
        }
    }

}