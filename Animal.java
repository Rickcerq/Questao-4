public class Animal {
    protected String Especíe, Locomoção;
    
    public Animal(String Especíe, String Locomoção) {
        super();
        this.Especíe = Especíe;
        this.Locomoção = Locomoção;
    }

    public String getEspecíe() {
        return Especíe;
    }

    public String getLocomoção() {
        return Locomoção;
    }

    public void exibirInformações() {
        System.out.println("Especíe: " + getEspecíe());
        System.out.println("Locomoção: " + getLocomoção()); 
    }
}