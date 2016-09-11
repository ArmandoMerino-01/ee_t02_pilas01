package unidadiii;

/**
 *
 * @author Armando1
 */
public class Pila{

    class Nodo {
        char simbolo;
        Nodo sig;
    }
    private Nodo raiz;

    Pila (){
        raiz=null;
    }

    public void Push(char x) {
        Nodo nuevo = new Nodo();
        nuevo.simbolo = x;
        if (raiz==null) {
            nuevo.sig = null;
            raiz = nuevo;
        }else{
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public char Pop(){
        if (raiz!=null){
            char informacion = raiz.simbolo;
            raiz = raiz.sig;
            return informacion;
        }else {
            return Character.MAX_VALUE;
        }
    }  

    public boolean vacia(){
        return raiz==null;

    }
}


