import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    class ListLiterature1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList comm = new ArrayList();
            defaultAdd(comm);
            int actionNum = 1;
            while (actionNum != 0) {
                System.out.println("\nAction:\n1. Show list of book\n2. Add book in list\n3. Sort by year\n4. Sort by name\n0. Exit\nEnter num of action: ");
                actionNum = scanner.nextInt();
                switch (actionNum) {
                    case 1:
                        show(comm);
                        break;
                    case 2:
                        add(comm);
                        break;
                    case 3:
                        System.out.println("Before sorting");
                        show(comm);
                        Collections.sort(comm, new Compare_By_Year());
                        System.out.println("After sorting");
                        show(comm);
                        break;
                    case 4:
                        System.out.println("Before sorting");
                        show(comm);
                        Collections.sort(comm, new Compare_By_Name());
                        System.out.println("After sorting");
                        show(comm);
                        break;
                    case 5:
                        Save(comm);
                    case 0: break;
                        default:
                        System.out.println("Choose correct num\n");
                        break;
                }
            }
        }

        static void show(List list) {
            int counter = 1;
            for (int i = 0; i < list.size(); i++) {
                System.out.print(counter + " book " + list.get(i) + "\n");
                counter++;
            }
            if (list.isEmpty()) {
                System.out.println("List is empty! ");
            }

        }

        static void defaultAdd(List list) {
            Literature item1 = new Literature("B", "Lev", "tor", 100,2000, 122, "Proza");
            list.add(item1);

            Literature item2 = new Literature("C", "Roma", "zob", 200,1000, 666, "Vobl");
            list.add(item2);

            Literature item3 = new Literature("A", "Qwerty", "poem", 40,322, 18, "Main");
            list.add(item3);
        }

        static void add(List list) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose type of commodity:\n1. Guide\n2. Period\n3. Scientific\nEnter num: ");
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
        public static void Save(List comm)
        {
            try {

                FileOutputStream fos = new FileOutputStream("file.txt");
                    try
                    {
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        for (int i =0; i<comm.size(); i++) {
                            oos.writeObject(comm.get(i));
                        }
                        oos.close();
                    }

                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }

        }
    }

