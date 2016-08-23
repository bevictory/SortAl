package bubbleSort;

public class BubbleSort {

	int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	 public void bubbleSort(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 for(int j=0;j<length-1-i;j++){
				 if(num[j+1]<num[j]){
					 int tmp = num[j];
					 num[j] = num[j+1];
					 num[j+1] = tmp;
				 }
			 }
		 }
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort();
		bubbleSort.print();
	}

}
