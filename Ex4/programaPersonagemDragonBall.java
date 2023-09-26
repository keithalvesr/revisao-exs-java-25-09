public class programaPersonagemDragonBall {
    public static void main(String[] args) {
        Terraqueo kuririn = new Terraqueo("Kuririn", 34, "Masculino", 8000, "Kienzan", "Ilha do mestre Kame");
        Saiyajin goku = new Saiyajin("Goku", 38, "Masculino", 35000, "Kamehameha", true);
        Saiyajin gohan = new Saiyajin("Gohan", 17, "Masculino", 20000, "Kamehameha", false);
        Namekian dende = new Namekian("Dende", 12, "Masculino", 15000, "Curar", 7, true);

        System.out.println(goku.transformar(5));
        System.out.println(gohan.transformar(5));

        String desejo = "Trazer o Kuririn de volta a vida";
        String desejoEmNamekusei = dende.transformarPedido(desejo);
        System.out.println(desejoEmNamekusei);
    }
}
