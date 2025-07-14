class Animal
{
void eat()
{
System.out.println("");
System.out.println("it is Superclass");
System.out.println("eating..!");
}
}


class Dog extends Animal
{
void bark()
{
System.out.println("");
System.out.println("it is Subclass");
System.out.println("barking..!");
}
}

class Babydog extends Dog
{
void weep()
{
System.out.println("");
System.out.println("it is Derivedclass");
System.out.println("Weeping...!");
}
}

class Inheritence
{
public static void main(String args[])
{
Babydog obj = new Babydog();
obj.weep();
obj.bark();
obj.eat();
}
}


