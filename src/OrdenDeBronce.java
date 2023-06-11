import Caballeros.Caballero;
import Exceptions.ErrorAlAgregarException;
import Exceptions.ErrorAlEliminarException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

public class OrdenDeBronce {
    private LinkedHashSet<Caballero>caballeros=new LinkedHashSet<>();

    public OrdenDeBronce() {
    }

    public void  agregarCaballero(Caballero aux)throws ErrorAlAgregarException {
        if (aux.getVida() != 0 && aux.getPuntosAtaque() >0){
            caballeros.add(aux);
        }
        else {
            throw new ErrorAlAgregarException("La vida o los puntos de ataque son incompatibles");
        }
    }
    public void mostrarCaballeros(){
        for (Caballero aux:caballeros){
            System.out.println(aux);
        }
    }
    public void eliminarDeLaOrden(String nombre)throws ErrorAlEliminarException {
        for (Caballero aux:caballeros){
            if (aux.getNombre().equalsIgnoreCase(nombre)){
                caballeros.remove(aux);
                return;
            }
        }
        throw new ErrorAlEliminarException();

    }

    public void exportarOrdenJackson(String path){

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(path),caballeros);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
