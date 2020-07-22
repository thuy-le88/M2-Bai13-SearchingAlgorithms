package tim.kiem.nhi.phan.ko.de.quy;

public class SearchBinary {
    int searchBinary(int[] list, int x) {
        int l=0;
        int r=list.length-1;

        while (l<=r) {
            int mid=(l+r)/2;
            if (list[mid]<x) {
                l=mid+1;
            } else if (list[mid]>x) {
                r=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchBinary search=new SearchBinary();
        int[] numbers={2,5,7,11,12,18,50};
        int searchNumber=12;
        int result=search.searchBinary(numbers,searchNumber);
        if (result==-1) {
            System.out.println("Number "+searchNumber+" is not found in array.");
        } else {
            System.out.println("Number "+searchNumber+" is found in array at index "+result);
        }
    }
}
