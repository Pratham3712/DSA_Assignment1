package stackDS;

import java.util.Scanner;

public class Stackmain {
		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
	        stack1 obj=new stack1();//object created
	        System.out.println("Enter size of stack:");
	        int size=in.nextInt();
	        obj.createStack(size, size);
	        int ch,e;
	        do
	        {
	            System.out.println("Stack Menu");
	            System.out.println("-----------");
	            System.out.println("1.Push");
	            System.out.println("2.Pop");
	            System.out.println("3.Peek");
	            System.out.println("4.Print all elements");
	            System.out.println("0.Exit");
	            System.out.println("-----------");
	            System.out.println("Choice:");
	            ch=in.nextInt();
	            switch (ch) {
                case 1:
                    System.out.print("Enter element to push onto Stack 1: ");
                    int element1 = in.nextInt();
                    obj.push(element1);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    System.out.println("Top element of Stack 1: " + obj.peek());
                    break;
                case 4:
                    System.out.println("Is Stack 1 empty? " + obj.isEmpty1());
                    break;
                case 5:
                    System.out.print("Enter element to push onto Stack 2: ");
                    int element2 = in.nextInt();
                    obj.push1(element2);
                    break;
                case 6:
                    obj.pop1();
                    break;
                case 7:
                    System.out.println("Top element of Stack 2: " + obj.peek1());
                    break;
                case 8:
                    System.out.println("Is Stack 2 empty? " + obj.isEmpty1());
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

	        }while(ch!=0);
		}
}
