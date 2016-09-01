import java.util.Scanner;
public class test{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		sausage sausage = new sausage();
		System.out.printf("Name: %s \nLength: %02dcm\nColor: %s \n\n",sausage.getName(),sausage.getLength(),sausage.getColor());
		System.out.printf("Enter new name: ");
		sausage.setName(input.nextLine());
		System.out.printf("Enter new length: ");
		sausage.setLength(input.nextInt());
		sausage.setColor(input.nextLine()); //to remove enter line
		System.out.printf("Enter new Color: ");
		sausage.setColor(input.nextLine());
		System.out.printf("\n \nName: %s \nLength: %02dcm\nColor: %s \n\n",sausage.getName(),sausage.getLength(),sausage.getColor());
	}
}
