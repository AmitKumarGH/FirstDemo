package signupform;

import java.util.Scanner;

public class StudentMain
{
 public static void main(String args[])
 {
  System.out.println(" 1. Add New Student \n 2. Print details of all students  \n 3. Search a student based on id \n 4. Search based on name \n 5. Modify name based on id \n 6. Sort based on id \n 7. Sort based on total \n 8. Exit");
  Scanner sc = new Scanner(System.in);
  int choice = sc.nextInt();
  Student st[] = new Student[100];
  int nos=0;
  while(true){
  switch(choice)
  {
   case 1:
    System.out.println("enter id, name");
    int tid=sc.nextInt();
    String tname=sc.next();
    int tmarks[]=new int[6];
    int ttotal=0;
    for(int i=0;i<tmarks.length;i++)
    {
     System.out.println("enter marks of  subject "+i);
     tmarks[i]=sc.nextInt();
     ttotal=ttotal+tmarks[i];
    }
    st[nos]  = new Student(tid,tname,tmarks,ttotal);
    nos++;
    break;
   case 2:
    for(int i=0;i<nos;i++)
     System.out.println(st[i]);
    break;
   case 3:     System.out.println("enter id to search");
                   int key=sc.nextInt();
                   int index = SearchSort.linearSearch(st,nos,key);
                   if(index == -1)
        System.out.println("search id not found");
                  else
        System.out.println("search element found at index " + index +" student details are " +st[index]);
                  break;
    
   case 4:
                  System.out.println("enter Student name to search");
                  String key1=sc.next();
                  index = SearchSort.linearSearch(st,nos,key1);
                   if(index == -1)
        System.out.println("search id not found");
                  else
        System.out.println("search element found at index " + index +" student details are " +st[index]);
                  break;
   case 5:  System.out.println("enter id whose name to be modified");
                    int key2=sc.nextInt();
                    index = SearchSort.linearSearch(st,nos,key2);
                    if(index == -1)
        System.out.println("search id not found");
                   else
    {
     System.out.println("enter Student name ");
     st[index].setName(sc.next());
     System.out.println(" student details after modifying name = " +st[index]);
    }
    break;
   case 6:
    SearchSort.sortById(st,nos);
    break;
   case 7:
    SearchSort.sortByTotal(st,nos);
    break;
   case 8: 
    System.exit(0);
  }
  System.out.println(" 1. Add New Student \n 2. Print details of all students  \n 3. Search a student based on id \n 4. Search based on name \n 5. Modify name based on id \n 6. Sort based on id \n 7. Sort based on total \n 8. Exit");
  choice = sc.nextInt();
  }
 }
}
 