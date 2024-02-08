public class TestAereoMobile {
    public static void main(String[] args){
    AereoMobile a = new Aliante ("I-IVVL",40);
    AereoMobile b = new Aliante ("I-QCNK", 39);
    AereoMobile c = new AereoMotore("I-EAAD", 66.2);
    AereoMobile d = new AereoMotore("I-CYKF", 66.1);

    System.out.println("-- Test get:");
    System.out.println("\" "+a.getSigla()+"\"[\"I-IVVL\"]");
    System.out.println(((Aliante)a).getEfficienza() + "[40]");
    System.out.println(((AereoMotore)c).getPotenza()+ "[66.2]");
    System.out.println("-- Test equals:");
    System.out.println(a.equals(a)+" [true]");
    System.out.println(a.equals(b)+" [false]");
    System.out.println(a.equals(c)+" [false]");
    
    System.out.println(c.equals(d)+" [false]");
    System.out.println(d.equals(d)+"[true]");
    System.out.println("-- Test toString:");
    System.out.println(a.toString().equals("I-IVVL 40") +" [true]");
    System.out.println(c.toString().equals("I-EAAD 66.2")+" [true]");
    System.out.println("-- Test superiore:");
    Confrontabile e = a;
    Confrontabile f = b;
    boolean q = e.superiore(f);
    System.out.println(q+" [true]");
    System.out.println(a.superiore(a)+" [false]");
    System.out.println(b.superiore(a)+" [false]");
    System.out.println(c.superiore(d)+" [true]");
    System.out.println(d.superiore(d)+" [false]");
    System.out.println(d.superiore(c)+" [false]");
    }
    }