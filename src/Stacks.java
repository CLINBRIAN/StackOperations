import java.util.Scanner;

public class Stacks {
    //it uses array
    final int MAX = 100;
    int[] array = new int[MAX];
    int top =-1;

    public void push(int data){
        if (top >= MAX-1){
            System.out.println("Stack Overflow");
        }
        else {
            array[++top] = data;
        }
    }
    public int pop(){
        int data = 0;
        if (top == -1){
            System.out.println("stack underflow");
        }
        else {
            data = array[top--];
        }
        return data;
    }
    public void display(){
        if (top == -1)
        {
            System.out.println("the stack is empty");
        }
        else {
            for (int i = top; i > -1; i--)
                System.out.println(array[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks stack = new Stacks();
        int q = 1;
        while(q !=0 ) {
            System.out.println("Enter 1.to push \t "+"2.to pop\t"+"3.to display\t "+"4. to quit");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    int element ;
                    System.out.println("enter the number to push");
                    element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int removed =stack.pop();
                    System.out.println("the poped number is "+removed);
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    q=0;
                    break;

            }
        }

    }
}