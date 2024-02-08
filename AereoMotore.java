public class AereoMotore extends AereoMobile{
    protected double cava;
    public AereoMotore(String sigla,double ca){
        super(sigla);
        cava=ca;
    }
    double getPotenza(){return cava;}
    public String toString(){
        String s=("potenza espressa in cavalli del motopropulsore: " + cava);
        return s;
    }
    public boolean superiore(Confrontabile x){
        if (x == null || getClass() != x.getClass()) {
            return false;
        }
        if(this.getPotenza() < x.getPotenza()){
            return x;
        }
        return this.getPotenza();
        
    }
}