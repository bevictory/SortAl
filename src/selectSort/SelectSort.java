package selectSort;

public class SelectSort {
	
	int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	 public void selectSort(){
		 int length = num.length;
		 int pos =0;
		 for(int i=0;i< length;i++){
			 int tmp = num[i],j=i+1;
			 for(;j<length;j++){
				 if(num[j]<tmp){
					 tmp = num[j];
					 pos = j;
				 }
			 }
			 num[pos] =num[i];
			 num[i] = tmp;
			 
		 }
	 }
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectSort selectSort = new SelectSort();
		selectSort.selectSort();
		selectSort.print();
	}

}
