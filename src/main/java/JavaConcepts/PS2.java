package JavaConcepts;

public class PS2 extends PS3 {


    int a;
    public PS2(int a) { //Instance variable
        super(a);    //Used to invoke the parent class constructor (It always first line of the child constructor to invoke the parent class constructor)
        this.a=a;   //Assigning instance variable to current class variable
    }

    public int increment()
    {
        a=a+1;
        return a;
    }
    public int decrement()
    {
        a=a-1;
        return a;
    }
}
