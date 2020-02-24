package solid;

public class TestPen {
    public static void main(String[] args) {
        PenPurpose penPurpose = new PenPurpose();
        ClickPen clickPen = new ClickPen("black","plastic");
        //clickPen.addSpring();
        penPurpose.printPurpose(clickPen);


        System.out.println("ink colour:     "+clickPen.getInkColour());
        System.out.println(clickPen .clickMechanism());
        System.out.println(clickPen .springInformation());

System.out.println("Child class object is substituted as Parent class object");
        ClickPen celloClickPen=new  CelloClickPen("red","plastic");
        System.out.println("ink colour:     "+celloClickPen.getInkColour());
        System.out.println(celloClickPen.clickMechanism());
        System.out.println(celloClickPen.springInformation());

        
    }

}
