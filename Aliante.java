public class Aliante extends AereoMobile{
    protected int efficenza;
    public Aliante(String sigla,int efa){
        super(sigla);
        efficenza=efa;
    }
    int getEfficienza(){return efficenza;}

    public boolean superiore(Confrontabile x){
        if (x == null || getClass() != x.getClass()) {
            return false;
        }
        Aliante altroAliante = (Aliante) x;
        return this.getEfficienza() > altroAliante.getEfficienza();
        
    }

    public String toString() {
        return getSigla() + " " + getEfficienza();
    }

    
}