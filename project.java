import java.util.Scanner;

public class project{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st character: ");
		char char1=scan.next().charAt(0);
        System.out.println();
		System.out.print("Enter 2nd character: ");
		char char2=scan.next().charAt(0);
        System.out.println();
		System.out.print("Enter the number of the lines: ");
		int lineNo=scan.nextInt();
        System.out.println();
		
		for(int i=1;i<=lineNo;++i){
			for(int j=1;j<(i+1);j++){
				if(j%2!=0){
					System.out.print(char1);
				}else{
					System.out.print(char2);
				}
			}
			System.out.println();
		}
        System.out.println("end.");
	}
}