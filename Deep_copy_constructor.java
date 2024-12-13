public class Deep_copy_constructor{
      public static void main(String args[]){
        Student s1=new Student();
        s1.name="Sudhanshu";
        s1.roll=456;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s1.marks[1]=70;                             //here change will not reflect because we use deep coping
        for(int i=0;i<3;i++){ 
            System.out.println(s2.marks[i]);
        }

    }
}
class Student{
    String name;
    int roll;
    int marks[];

    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];                    //not copy reference make new one .so, change will not reflect
        }
    }
    Student(){
        marks=new int[3];
        System.out.println("called constuctor");
    }
}