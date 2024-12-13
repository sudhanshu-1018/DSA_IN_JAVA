public class copy_constructor{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Sudhanshu";
        s1.roll=456;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);       //already s2 copyied to s2 then also if we change the value of s1 later the value of s2 is also change;
        s1.marks[1]=70;                   //change the value of s1;
        for(int i=0;i<3;i++){                   //change also reflect in s2;
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
        this.marks=s1.marks;                  //only copy reference(or pointing) ,so changes will reflect
    }
    Student(){
        marks=new int[3];
        System.out.println("called constuctor");
    }
    // Student(String name){
    //     marks=new int[3];
    //     this.name=name;
    // }
    // Student(int roll){
    //     marks=new int[3];
    //     this.roll=roll;
    // }
}