import java.util.*;

public class ArrayTasks {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13};
        int [] arr2 = {2, 4, 6, 8, 10};
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println(sum);

        printArray(arr);
        printArray(arr2);
//        findMaxValue(arr);
//        findMinValueAndIndex(arr);
//        findAvarageFromArray(arr);
//        countElementsEqualsTo(arr,8);
//        countElementsGreaterThenZero(arr);
//        countElementsEqualsToZero(arr);
//        printArray(multiplyArraysElementsOnTheNumber(arr,5));
//        printArray(addIndexToElementsValues(arr));
//        printArray(resetEvenElements(arr));
//        printArray(resetElementsWithOddIndex(arr));
//        findFirstPositiveElement(arr);
//        findLastNegativeElement(arr);
//        printList(findIndexesOfElement(arr, 6));
//        System.out.println(isArraySortedAscending(arr));
//        System.out.println(isArraySortedDescending(arr));

//        printArray(shiftArraysElements(arr,2));

//        countElementsGreaterThanAverage(arr);

//        showRepeatedElements(arr);

//        showUniqueElements(arr);

//        countRepeatedElementsFromArrays(arr,arr2);

//        showUniqueElementsFromArrays(arr, arr2);

//        changePosiveElementPositions(arr);

        printArray(mergeSortedArrays(arr,arr2));
    }

    static void findMaxValue(int[] arr) {
        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("maxValue = " + maxValue + ", index of the greatest element is " + maxIndex);
    }

    static void findMinValueAndIndex(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        System.out.println("minValue = " + minValue + " minIndex = " + minIndex);
    }

    static void findAvarageFromArray(int[] arr) {

        int sum = 0;
        int avarage = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Average value from array = " + sum / arr.length);
    }

    static void countElementsEqualsTo(int[] arr, int n) {
        int count = 0;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }
        System.out.println("Amount of elements equals to " + n + " = " + count);
    }

    static void countElementsGreaterThenZero(int arr[]) {
        int count = 0;
        for (int n : arr) {
            if (n > 0) {
                count++;
            }
        }
        System.out.println("Number of arrays elements greater than zero is" + count);
    }

    static void countElementsEqualsToZero(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n == 0) {
                count++;
            }
        }
        System.out.println("Number of arrays elements equals to zero is " + count);
    }

    static int[] multiplyArraysElementsOnTheNumber(int[] arr, int multiplier) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= multiplier;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static int[] addIndexToElementsValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
        return arr;
    }

    static int[] resetEvenElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    static int[] resetElementsWithOddIndex(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if ((i & 1) != 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    static void findFirstPositiveElement(int[] arr) {
        for (int n : arr) {
            if (n > 0) {
                System.out.println("First positive element is " + n);
                break;
            }
        }
    }

    static void findLastNegativeElement(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                System.out.println("Last negative element of array = " + arr[i]);
                break;
            }
        }
    }

    static List findIndexesOfElement(int[] arr, int value) {
        List<Integer> indexes = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    static void printList(List list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }


    static boolean isArraySortedAscending(int [] arr) {
   	    for (int i = 0; i <= arr.length - 2; i++) {
   		if (arr[i]>arr[i+1]) {return false;}
   	    }
   	    return true;
   	}

    static boolean isArraySortedDescending (int [] arr) {
    	    for (int i = 0; i<=arr.length - 2; i ++) {
    		if (arr[i]<arr[i+1]) {return false;}
    	    }
    	    return true;
    	}

    static int [] shiftArraysElements(int [] arr, int shift) {
    	    int [] result = new int [arr.length + shift];
    	    System.arraycopy(arr,0,result,shift,arr.length);
    	    return result;
    	}

    static void countElementsGreaterThanAverage(int[] arr) {
        int sum = 0;
        int counter = 0;
        for (int i : arr) {
            sum += i;
        }

        int average = sum / arr.length;

        for (int i : arr) {
            if (i > average) {
                counter++;
            }
        }

        System.out.println("Number of arrays elements greater then average is " + counter);
    }

    static void showRepeatedElements(int [] arr) {
    	    Set<Integer> all = new HashSet<>();
    	    Set <Integer> repeated = new HashSet<> ();
    	    for (int i : arr) {
    	    if (!all.contains (i)) {
    		all.add(i);
    	    }
    	    else {repeated.add(i);}
    	}

    	for (Integer element : repeated) {
    	System.out.print(element.intValue() + " ");
    	}
    	System.out.println();
    	}

    static void showUniqueElements(int[] arr) {
        Set<Integer> all = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        for (int i : arr) {
            if (!all.contains(i)) {
                all.add(i);
            } else {
                repeated.add(i);
            }
        }

        all.removeAll(repeated);
        for (Integer element : all) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void countRepeatedElementsFromArrays(int[] arr1, int[] arr2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (int i : arr1) {
            firstSet.add(i);
        }
        for (int n : arr2) {
            secondSet.add(n);
        }
        firstSet.retainAll(secondSet);
        System.out.println("Number of the elements that equals in both arrays is " + firstSet.size());
    }

    static void showUniqueElementsFromArrays(int [] arr1, int [] arr2) {
    		Set <Integer> set1 = new HashSet<> ();
    		Set <Integer> set2 = new HashSet<> ();
    			for(int i : arr1) {set1.add(i);}
    			for (int n : arr2) {set2.add(n);}
    			set1.removeAll(set2);
    		System.out.print ("Unique elements from first array are ");
    		for (Integer element : set1) {
    		System.out.print(element + " ");
    		}
    	}

    static void changePosiveElementPositions(int arr []) {
        		List<Integer> indexes = new ArrayList<>();
        		List<Integer> values =  new ArrayList<>();
        			for (int i = 0; i < arr.length; i++) {
        			if (arr[i]>0) {
        			indexes.add(i);
        			values.add(arr[i]);
        			}
        			}
        			Collections.reverse(indexes);
        			for (int i = 0; i<indexes.size();i++) {
        			arr[indexes.get(i)] = values.get(i);}
        			}

    static int [] mergeSortedArrays(int arr1 [] , int arr2 []) {

    		int [] result = new int [arr1.length + arr2.length];
    		int j, k;
    		j = 0;
    		k = 0;
    			for (int i = 0; i < result.length; i++) {
    			if (j>arr1.length-1) {result[i] = arr2[k++];}
    			else if (k>arr2.length-1) {result[i] = arr1[j++];}
    			else if (arr1[j]>arr2[k]) {result[i] = arr2[k++];}
    			else result[i] = arr1[j++];
    			}
    		return result;
    	}
}



