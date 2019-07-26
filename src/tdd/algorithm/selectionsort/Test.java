package tdd.algorithm.selectionsort;
public class Test {

    App app = new App();

    @org.junit.Test
    public void testSort(){
        int arr[] = {40,20,50,100,40,80};
        app.arrSort(arr);
        app.printArr(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                System.out.println("unsorted");
                assert false;
        }
    }


}}
