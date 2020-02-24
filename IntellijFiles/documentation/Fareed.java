package documentation;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A
{   int  a,b;
    A()
    {
        this.a=10;
        this.b=20;
    }
}
public class Fareed{
    public static void main(String[] args) throws Exception {


        A a = new A();
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    ("LunchBox.java");
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(a);

            out.close();
            file.close();

        } catch (
                IOException ex) {
            System.out.println("IOException is caught");
        }


    }
}
