package mergeSort;

public class MergeSort {
	
	int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	 
	 public void merge(int begin1,int end1, int begin2,int end2){
		 int []tmp= new int[end2-begin1+1];
		 int start =begin1,i=0;
		 while(begin1<=end1&&begin2<=end2){
			 if(num[begin1]>num[begin2]){
				 tmp[i++]=num[begin2++];
			 }else tmp[i++]=num[begin1++];
		 }
		 while(begin1<=end1){
			 tmp[i++] = num[begin1++];
		 }
		 while(begin2<=end2){
			 tmp[i++] = num[begin2++];
		 }
		 System.arraycopy(tmp, 0, num, start	, end2-start+1);
	 }
	 public void sort(int begin ,int end){
		 if(begin < end){
			 
			 int mid = (begin+end)/2;
			 sort(begin,mid );
			 sort(mid+1, end);
			 merge(begin, mid, mid+1, end);
		 }
		 
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(0, mergeSort.num.length-1);
		mergeSort.print();
	}

}
