public class RecursiveSearchBinary {
    int recursiveSearchBinary(int[] list, int x,int l, int r) {
        if (l<=r) {
            int mid=l+(r-l)/2;
            if (list[mid]>x) {
                return recursiveSearchBinary(list, x,l,mid-1);
            } else if (list[mid]<x) {
                return recursiveSearchBinary(list,x,mid+1,r);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RecursiveSearchBinary search=new RecursiveSearchBinary();
        int[] numbers={2,4,6,8,9,10};
        int x=10;
        int l=0;
        int r=numbers.length-1;
        int result=search.recursiveSearchBinary(numbers,x,l,r);
        if (result==-1) {
            System.out.println("Not found.");
        } else {
            System.out.println("Is found at "+result);
        }

    }
}
