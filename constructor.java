public class constructor{
    public static void main(String args[]){
        Student s=new Student("Sudhanshu");
        System.out.println(s.name);
        Student k=new Student();
        

    }
}
class Student{
    String name;
    int roll;

    Student(String name){           //parameterised
        this.name=name;
    }
    Student(){                      //non-parameterised
        System.out.println("kumar singh");
    }
}