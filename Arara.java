public class Arara extends Animal {
    private int QtdeOvos;

    public Arara(String Especíe, String Locomoção, int QtdeOvos) {
        super(Especíe, Locomoção);
        this.QtdeOvos = QtdeOvos;
    }

    public void exibirInformações_Arara() {
        System.out.println("Informações da Arara");
        super.exibirInformações();
        System.out.println("Quantidade de ovos: " + QtdeOvos);
    }
}
