
package cesar2;

public class Cesar2 {

    public static void main(String[] args) {
        
       String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
       String cadena_cifrada = "HPXPÑXJDUGHÑDODPFKDGHFXBRPROEUHPRTXLHURDFRUGDUOHPRKDOXFKRWLHOSRTXHYLYLDXPKLGDÑJRGHÑRVGHÑDPCDHPDVWLÑÑHURDGDUJDDPWLJXDURFLPIÑDFRBJDÑJRFRUUHGRUXPDRÑÑDGHDÑJRODVYDFDTXHFDUPHURVDÑSLFRPÑDVODVPRFKHVGXHÑRVBTXHEUDPWRVÑRVVDEDGRVÑDPWHMDVÑRVYLHUPHVDÑJXPSDÑROLPRGHDQDGLGXUDÑRVGROLPJRVFRPVXOLDPÑDVWUHVSDUWHVGHVXKDFLHPGDHÑUHVWRGHÑÑDFRPFÑXLDPVDBRGHYHÑDUWHFDÑCDVGHYHÑÑXGRSDUDÑDVILHVWDVFRPVXVSDPWXIÑRVGHÑROHVORBÑRVGLDVGHHPWUHVHODPDVHKRPUDEDFRPVXYHÑÑRULGHÑRODVILPRWHPLDHPVXFDVDXPDDODTXHSDVDEDGHÑRVFXDUHPWDBXPDVREULPDTXHPRÑÑHJDEDDÑRVYHLPWHBXPORCRGHFDOSRBSÑDCDTXHDVLHPVLÑÑDEDHÑURFLPFRORWRODEDÑDSRGDGHUDIULVDEDÑDHGDGGHPXHVWURKLGDÑJRFRPÑRVFLPFXHPWDDQRVHUDGHFROSÑHALRPUHFLDVHFRGHFDUPHVHPMXWRGHURVWURJUDPODGUXJDGRUBDOLJRGHÑDFDCDTXLHUHPGHFLUTXHWHLDHÑVREUHPROEUHGHTXLMDGDRTXHVDGDTXHHPHVWRKDBDÑJXPDGLIHUHPFLDHPÑRVDXWRUHVTXHGHVWHFDVRHVFULEHPDXPTXHSRUFRPMHWXUDVYHURVLOLÑHVVHGHMDHPWHPGHUTXHVHÑÑDODEDTXLMDPDSHURHVWRLOSRUWDSRFRDPXHVWURFXHPWREDVWDTXHHPÑDPDUUDFLRPGHÑPRVHVDÑJDXPSXPWRGHÑDYHUGDG";
       String cadena_descifrada = "";
       //String cadena_cifrada = "ÑO";
       
       int desplazamiento = 3;
       
       char c = ' ';
       char d = ' ';
       
       int i = 0;
       int posicion = 0;
       
       while(i < cadena_cifrada.length()){
           c = cadena_cifrada.charAt(i);
           //distincion de caso para la Ñ
           if ( c != 'Ñ')
             posicion = (int)(c - 'A');
           else
               posicion = 14;
           //distinciones de casos
           //izquierda y derecha de la Ñ
           if ((posicion <14) || ( c == 'Ñ'))
                if ((posicion -3) < 0 )
                    d = abecedario.charAt((posicion - desplazamiento) + abecedario.length());
                else//(posicion -3) >= 0
                   d = abecedario.charAt(posicion - desplazamiento);
           else //posicion >14 y O
                if ((posicion - desplazamiento +1) < 0)
                    d = abecedario.charAt(posicion - desplazamiento + 1 + abecedario.length());
                else//(posicion -2) >= 0
                    d = abecedario.charAt(posicion - desplazamiento + 1);
           //HACER CAMBIO SI POSICION - DESPLAZAMIENTO ES NEGATIVO
           //d = abecedario.charAt(posicion -3);
           cadena_descifrada = cadena_descifrada + d;
           i++;
       }
        System.out.println(cadena_descifrada);
        
    }
    
}
