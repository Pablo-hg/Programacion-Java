
package clinica;

public class DNI {
    
    int numero;
    
    char letra;

    public DNI(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }
    
    public boolean equals(DNI d){
        //Un dni es igual a otro cuando coinciden su núero y su letra
        if ((this.numero == d.numero) && (this.letra == d.letra))
            return true;
        else
            return false;
    }
    
    @Override
    public String toString(){
        //Resultado de concatenar el numero a la letra;
        String cadena = "" + this.numero + this.letra;
        return cadena;
    }
    
    public boolean comprobarDNI (DNI d){
        char[] aux = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 
        'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        //Comprobar que la letra se corresponde con el número
        int pos = (d.numero%23);
        
        char letraok = aux[pos];
        
        if (letraok == d.letra)
            return true;
        else
            return false;
    }
    
    
}
