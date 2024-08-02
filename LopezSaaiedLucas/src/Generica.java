
import java.util.HashSet;
import java.util.Set;

public class Generica<T extends Producto>{
   Set<T> lista = new HashSet<>();

public void add(T t){
    lista.add(t);
}

public T get(String nombre){
    T comprobacion= null;
    T respuesta = null;
    int flag=0;
    try{
        for (T t : lista) {
            comprobacion = t;
            if (comprobacion.getNombre().equals(nombre)) {
                respuesta = comprobacion;
                flag = 1;
            }
        }
    if(flag == 0){
        throw new ProductNotFoundException();
    }
    }catch (Exception ProductNotFoundException) {
        System.out.println("Producto no encontrado");
        return respuesta;
    }finally {
        System.out.println("Producto Encontrado");
    }
    return respuesta;

}

public Set<T> getAll(){
   return lista;
}

public void Delete(T t){
    lista.remove(t);
}


}
