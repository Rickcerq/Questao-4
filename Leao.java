public class Leao extends Animal {
    private String Pelo;

    public Leao(String Especíe, String Locomoção, String Pelo) {
        super(Especíe, Locomoção);
        this.Pelo = Pelo;
    }

    public String getPelo() {
        return Pelo;
    }

    public void exibirInformações_Leão() {
        System.out.println("Informações do Leão:");
        super.exibirInformações();
        System.out.println("Pelo: " + getPelo());
    }
}
