package heapSort;

import java.awt.Frame;

public class HeapSort {

	int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	 public void swap(int i, int j){
		 int tmp = num[i];
		 num[i] = num[j];
		 num[j] = tmp;
	 }
	 public void bulidHeap(int end){
		 for(int i=end/2;i>=0;i--){
			 int k = i;
			 while(2*k+1<=end){
				 int big = 2*k+1;
				 if(2*k+2<=end){
					 if(num[big]< num[2*k+2] ){
						 big = 2*k+2;
					 }
				 }
				 if(num[k]<num[big]){
					 swap(k, big);
					 k = big;
				 }else break;
				 
			 }
		 }
	 }
	 public void heapSort(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 bulidHeap(length-1-i);
			 swap(0, length-1-i);
		 }
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort heapSort = new HeapSort();
		heapSort.heapSort();
		heapSort.print();
	}

}
