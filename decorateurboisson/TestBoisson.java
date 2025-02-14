package decorateurboisson;

public class TestBoisson {
    public static void main(String[] args) {
        Boisson cafeNoir = new CafeNoir();
        BoissonDecoratrice cafeNoirAuLait = new BoissonAuLait(cafeNoir);
        BoissonDecoratrice cafeNoirAuLaitSoya = new BoissonAuSoya(cafeNoirAuLait);
        BoissonDecoratrice cafeNoirAuSoya = new BoissonAuSoya(cafeNoir-);


        System.out.println(cafeNoir.calculerPrix());
        System.out.println(cafeNoirAuLait.calculerPrix());
        System.out.println(cafeNoirAuLaitSoya.calculerPrix());


    }
}
