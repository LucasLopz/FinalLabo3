import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Accesorios acc= new Accesorios("Auriculares","nokia",100f,5,"Si","No");
        Computadora computadora= new Computadora("PC gamer","Samsung",150f,0,"Inteli3",30,520);
        Telefono tel = new Telefono("Samsung A13","Samsung",300f,3,"iOS",500,50);

        sistema.getListaTel().add(tel);
        sistema.getListaComp().add(computadora);
        sistema.getListaAcc().add(acc);

        ArrayList<String> compra= new ArrayList<>();
        compra.add("Samsung A13");
        compra.add("PC gamer");
        compra.add("Auriculares");
        sistema.buy(compra);


    }
}