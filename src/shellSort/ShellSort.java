package shellSort;

public class ShellSort {
	
	 int num[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	 public void print(){
		 int length = num.length;
		 for(int i=0;i<length;i++){
			 System.out.print(num[i]+" ");
		 }
	 }
	public void shellSort(){
		int length = num.length;
		for(int increment=length/2;increment>=1;increment/=2){
			for(int i=increment;i<length;i++){
				int tmp = num[i],j=0;
				for( j=i;j>=increment;j-=increment){
					if(num[j-increment]>tmp){
						num[j]= num[j-increment];
					}else break;
				}
				num[j] =tmp;
			}
		}
	}
	public static void main(String[] args) {
		ShellSort shellSort = new ShellSort();
		shellSort.shellSort();
		shellSort.print();
	}

}
