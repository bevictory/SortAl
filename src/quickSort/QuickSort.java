package quickSort;

public class QuickSort {

	int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	 public int partion(int begin ,int end){
		 int tmp = num[end];
		 while(begin<end){
			 while(begin<end&&num[begin]<tmp){
				 begin++;
			 }
			 num[end] = num[begin];
			 while(begin<end&&num[end]>=tmp){
				 end--;
			 }
			 num[begin]=num[end];
			 
		 }
		 num[end] =tmp;
		 return end;
	 }
	 public void quickSort(int begin, int end){
		 if(begin>=end) return;
		 int mid = partion(begin , end);
		 quickSort(begin, mid-1);
		 quickSort(mid+1, end);
	 }
	 public void sort(){
		 quickSort(0, num.length-1);
		 print();
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort quickSort = new QuickSort();
		quickSort.sort();
	}

}
