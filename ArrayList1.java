import java.util.ArrayList;
import java.util.Scanner;

class ArrayList1 {
    int id = 0;
    ArrayList<Integer> idArray = new ArrayList<Integer>();
    ArrayList<String> namesArray = new ArrayList<String>();
    ArrayList<Integer> ageArray = new ArrayList<Integer>();

    void addData(String name, int age) {
        this.id = this.id + 1;
        this.idArray.add(this.id);
        this.namesArray.add(name);
        this.ageArray.add(age);
    }

    void displayData() {
        System.out.println("id.\tName\tAge");
        for (int i = 0; i < this.namesArray.size(); i++) {
            System.out.println(this.idArray.get(i) + "\t" + this.namesArray.get(i) + "\t" + this.ageArray.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, age;
        String name;
        ArrayList1 ar1 = new ArrayList1();
        do {
            System.out.println("\n---- Menu ----");
            System.out.println("\n1.Add new Data \n2.Remove Data \n3.Display Data \n4.Update Data \n-1 to Exit");
            option = sc.nextInt();
            switch (option) {
            case 1:
                System.out.println("\n Enter name :  ");
                name = sc.next();
                System.out.println("\n Enter age : ");
                age = sc.nextInt();
                ar1.addData(name, age);
                break;
            case 2:
                System.out.println("Remove Data : ");
                break;
            case 3:
                ar1.displayData();
                break;
            case 4:
                System.out.println("\n Update Data ");
                break;
            default:
                System.out.println("\nInvalid Choice");
            }
        } while (option != -1);
    }
}
