class Person
{
int id=2;

Person()
{
System.out.println(id);
}
}
class Student extends Person
{
Student()
{
super();
}
}
class Emp extends Student
{
public static void main(String[] args)
{
Student s=new Student();
}
}
  