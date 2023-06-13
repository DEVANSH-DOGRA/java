// base class
class Parent{
    //data members
   public String name;
    public int age;
    public int salary;
    public int numchild;
    //constructor
    Parent(String n,int a,int s){
        this.name=n;
        this.age=a;
        this.salary=s;
    }
    //methods
   public  void printinfo(){
    System.out.print("name: "+this.name+"\n"+"age: "+this.age+"\n"+"salary: "+this.salary);
    }
}

//Derived class of Parent class
class Child extends Parent{
    int roll;
    String college;
    //Constructor
    Child(int roll,String c){
        this.roll=roll;
        this.college=c;
    }
    public void printChildInfo(){
         System.out.print("name: "+super.name+"\n"+"age: "+super.age+"\n"+"Roll: "+this.roll+"College: "+this.college);

    }
}



class oops{
    public static void main(String [] str){
        //inheritance
        Parent p=new Parent("Bob",35,45000);//object of Parent class
        p.printinfo();
        Child ch=new Child();
        

    }
}