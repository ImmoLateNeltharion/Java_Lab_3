import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Tourist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List comm = new ArrayList();
        int actionNum = 1;
        while (actionNum != 0) {
            System.out.println("\nAction:\n1. Show number of commodity\n2. Add commodity in list\nEnter num of action: ");
            actionNum = scanner.nextInt();
            switch (actionNum) {
                case 1:
                    show(comm);
                    break;
                case 2:
                    add(comm);
                    break;
                default:
                    System.out.println("Choose correct num\n");
                    break;
            }
        }
    }

    static void show(List list) {
        int counter = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(counter + "путевка " + list.get(i) + " ");
        }
        if (list.isEmpty()) {
            System.out.println("List is empty! ");
        }
    }

    static void add(List list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose type of commodity:\n1. Guide\n2. Sanatorii\n3. DO\nEnter num: ");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.print("Enter bookName: ");
                String name1 = scan.next();
                System.out.print("Enter author: ");
                String author1 = scan.next();
                System.out.print("Enter genre: ");
                String genre1 = scan.next();
                System.out.print("Enter pages: ");
                int pages1 = scan.nextInt();
                System.out.print("Enter year: ");
                int year1 = scan.nextInt();
                System.out.print("Enter code: ");
                int code1 = scan.nextInt();
                System.out.print("Enter developerName:");
                String developerName1 = scan.next();
                System.out.print("Enter direction:");
                String direction1 = scan.next();
                System.out.print("Enter Tom:");
                String tom1 = scan.next();
                System.out.print("Enter chapter: ");
                int chapter1 = scan.nextInt();

                Guide item1 = new Guide(name1, author1, genre1, pages1, year1, code1, developerName1, direction1, tom1, chapter1);
                list.add(item1);
                break;
            case 2:
                System.out.print("Enter bookName: ");
                String name2 = scan.next();
                System.out.print("Enter author: ");
                String author2 = scan.next();
                System.out.print("Enter genre: ");
                String genre2 = scan.next();
                System.out.print("Enter pages: ");
                int pages2 = scan.nextInt();
                System.out.print("Enter year: ");
                int year2 = scan.nextInt();
                System.out.print("Enter code: ");
                int code2 = scan.nextInt();
                System.out.print("Enter developerName:");
                String developerName2 = scan.next();
                System.out.print("Enter kindPeriodic:");
                String kindPeriodic2 = scan.next();
                System.out.print("Enter yearPeriod: ");
                int yearPeriod2 = scan.nextInt();
                Period item2 = new Period(name2, author2, genre2, pages2, year2, code2, developerName2, kindPeriodic2, yearPeriod2);
                list.add(item2);
                break;
            case 3:
                System.out.print("Enter bookName: ");
                String name3 = scan.next();
                System.out.print("Enter author: ");
                String author3 = scan.next();
                System.out.print("Enter genre: ");
                String genre3 = scan.next();
                System.out.print("Enter pages: ");
                int pages3 = scan.nextInt();
                System.out.print("Enter year: ");
                int year3 = scan.nextInt();
                System.out.print("Enter code: ");
                int code3 = scan.nextInt();
                System.out.print("Enter developerName:");
                String developerName3 = scan.next();
                System.out.print("Enter fieldSceince:");
                String fieldSceince3 = scan.next();
                System.out.print("Enter quantity: ");
                int quantity3 = scan.nextInt();
                Scientific item3 = new Scientific(name3, author3, genre3, pages3, year3, code3, developerName3, fieldSceince3, quantity3);
                list.add(item3);
                break;
            default:
                break;
        }
    }
}