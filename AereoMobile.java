public class AereoMobile implements Confrontabile{
    protected String sigla;
    public AereoMobile(String s){
        sigla=s;
    }
    String getSigla(){return sigla;}
    public String toString(){
        String s=("la sigla è: " + sigla);
        return s;
    }
    
}