package JavaConcepts;

public class PS3 {

    int a;
    public PS3(int a) { //Instance variable
        this.a=a;   //Assigning instance variable to current class variable
    }

    public int multiplyTwo()
    {
        a=a*2;
        return a;
    }
    public int multiplyThree()
    {
        a=a*3;
        return a;
    }
}
