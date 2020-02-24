package solid;

public  abstract class Pen {
   private String inkColour;
    private String  material;
    public Pen(String inkColour,String  material){
        this.material=material;
        this.inkColour=inkColour;
    }

    public void setInkColour(String inkColour) {
        this.inkColour = inkColour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getInkColour() {
        return inkColour;
    }

    public String getMaterial() {
        return material;
    }
    //few pens can be used to highlight the  text
    public abstract String  purpose();

}
