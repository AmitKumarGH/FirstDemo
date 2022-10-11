package signupform;

//import java.util.Scanner;
import java.util.Arrays;

class Student
{
 private long id;
 private String name;
 private int marks[],total;
 Student(long tid, String tname,int tmarks[],int ttotal )
 {
  id=tid;name=tname; marks=tmarks;total=ttotal;
 }
 public void setName(String tname)
 {
  name=tname;
 }
 public String toString()
 {
  return "regd id = "+ id+" name = "+name + "\n marks in 6 subjects = "+Arrays.toString(marks) +" Total ="+total;
 }
 public long getId()
 {
  return id;
 }
 public String getName()
 {
  return name;
 }
 public int[] getMarks()
 {
  return marks;
 }
 public int getTotal()
 {
  return total;
 } 
}
class SearchSort
{
 public static void sortById(Student st[], int n)
 {
      
  for(int i=0;i<n-1;i++)
       {
   for(int j=0;j<n-i-1;j++)
   {
    if(st[j].getId() > st[j+1].getId())
    {
     Student temp = st[j];
     st[j]=st[j+1];
     st[j+1]=temp; 
    }
   }
        }
  System.out.println("After sorting based on id, Student details are");
  for(int i=0;i<n;i++)
   System.out.println(st[i]);
 }
 public static void sortByTotal(Student st[],int n)
 {
  for(int i=0;i<n-1;i++)
       {
   for(int j=0;j<n-i-1;j++)
   {
    if(st[j].getTotal() > st[j+1].getTotal())
    {
     Student temp = st[j];
     st[j]=st[j+1];
     st[j+1]=temp; 
    }
   }
        }
  System.out.println("After sorting based on total, Student details are");
  for(int i=0;i<n;i++)
   System.out.println(st[i]);
 }
 public static int linearSearch(Student st[], int n, int key)
 {
  int flag=0;
  for(int i=0;i<n;i++)
  {
   if(st[i].getId() == key)    
    return i;
                                    }
  return -1;
 }
 public static int linearSearch(Student st[], int n, String key)
 {
  int flag=0;
  for(int i=0;i<n;i++)
  {
   if(st[i].getName().equalsIgnoreCase(key))   
    return i;
                                    }
  return -1;
 }    
}
 