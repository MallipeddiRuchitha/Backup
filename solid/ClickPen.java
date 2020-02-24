package solid;

public class ClickPen extends Pen implements InterfaceClickPen{
    public ClickPen(String inkColour,String  material){
        super(inkColour,material);

    }

    public String clickMechanism(){

        return("mechanism...");
    }
    public String barrelInformation(){
        return("Information of barrel");
    }

    public String springInformation(){
        return("Information of spring");
    }
    public String  refillInformation(){
        return("Information of refill");
    }
    public String  purpose(){
        return("To write");
    }


}

