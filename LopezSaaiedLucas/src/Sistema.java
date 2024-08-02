import java.lang.reflect.Array;
import java.util.ArrayList;
public class Sistema {
    Generica<Telefono> listaTel;
    Generica<Computadora> listaComp;
    Generica<Accesorios> listaAcc;

    ///Buy. Realizar una compra de uno o varios Productos, reduciendo el Stock
    ///correspondiente. Si se intenta comprar un Producto que no tiene Stock, se debe
    ///lanzar una excepción personalizada llamada ProductNotAvailableException.

    public void buy(ArrayList<String> listaCompra){
        int i;
        Producto productAux= null;
        try{
            for(i=0;i<listaCompra.size();i++) {
                productAux = listaTel.get(listaCompra.get(i));
                if (productAux != null) {

                    if (productAux.getStock() >= 1) {
                        productAux.setStock(productAux.getStock() - 1);
                    } else throw new ProductNotAvailableException();

                } else {
                    productAux = listaComp.get(listaCompra.get(i));
                    if (productAux != null) {
                        if (productAux.getStock() >= 1)
                            productAux.setStock(productAux.getStock() - 1);
                        else throw new ProductNotAvailableException();
                    } else {
                        productAux = listaAcc.get(listaCompra.get(i));
                        if (productAux != null) {
                            if (productAux.getStock() >= 1)
                                productAux.setStock(productAux.getStock() - 1);
                            else throw new ProductNotAvailableException();
                        }
                    }


                }

            }

        }catch(Exception ProductNotAvailableException){
            System.out.println("No se encuentra disponible un producto de la lista");
        }
        finally {
            System.out.println("Compra Exitosa");
        }
    }

    public Generica<Telefono> getListaTel() {
        return listaTel;
    }

    public void setListaTel(Generica<Telefono> listaTel) {
        this.listaTel = listaTel;
    }

    public Generica<Computadora> getListaComp() {
        return listaComp;
    }

    public void setListaComp(Generica<Computadora> listaComp) {
        this.listaComp = listaComp;
    }

    public Generica<Accesorios> getListaAcc() {
        return listaAcc;
    }

    public void setListaAcc(Generica<Accesorios> listaAcc) {
        this.listaAcc = listaAcc;
    }
}
