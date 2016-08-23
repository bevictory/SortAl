package insertSort;

public class InserSort {
	 int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 
	 public void sort(int num[]){
		int length = num.length;
		for(int i=1;i<length;i++){
			int tmp = num[i],j=0;
			for( j=i-1;j>=0&&num[j]>tmp;j--){
				num[j+1]= num[j];
			}
			num[j+1] = tmp;
		
		}
	}
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	 public static void main(String args[]){
		 InserSort insertSort = new InserSort();
		 insertSort.sort(insertSort.num);
		 insertSort.print();
	 }
	
}
