
package freecars;


public class FreeCars {

    
    public static void main(String[] args) {
        
        String Quijote = "HPXPÑXJDUGHÑDODPFKDGHFXBRPROEUHPRTXLRWLHOSRTXHYLYLDXPKLGDÑJRGHÑRVGHÑDPCDHPDVWLÑÑHURDGDUJDDPWLJXDURFLPIÑDFRBJDÑJRFRUUHGRUXPDRÑÑDGHDÑJRODVYDFDTXHFDUPHURVDÑSLFRPÑDVODVPRFKHVGXHÑRVBTXHEUDPWRVÑRVVDEDGRVÑDPWHMDVÑRVYLHUPHVDÑJXPSDÑROLPRGHDQDGLGXUDÑRVGROLPJRVFRPVXOLDPÑDVWUHVSDUWHVGHVXKDFLHPGDHÑUHVWRGHÑÑDFRPFÑXLDPVDBRGHYHÑDUWHFDÑCDVGHYHÑÑXGRSDUDÑDVILHVWDVFRPVXVSDPWXIÑRVGHÑROHVORBÑRVGLDVGHHPWUHVHODPDVHKRPUDEDFRPVXYHÑÑRULGHÑRODVILPRWHPLDHPVXFDVDXPDDODTXHSDVDEDGHÑRVFXDUHPWDBXPDVREULPDTXHPRÑÑHJDEDDÑRVYHLPWHBXPORCRGHFDOSRBSÑDCDTXHDVLHPVLÑÑDEDHÑURFLPFRORWRODEDÑDSRGDGHUDIULVDEDÑDHGDGGHPXHVWURKLGDÑJRFRPÑRVFLPFXHPWDDQRVHUDGHFROSÑHALRPUHFLDVHFRGHFDUPHVHPMXWRGHURVWURJUDPODGUXJDGRUBDOLJRGHÑDFDCDTXLHUHPGHFLUTXHWHLDHÑVREUHPROEUHGHTXLMDGDRTXHVDGDTXHHPHVWRKDBDÑJXPDGLIHUHPFLDHPÑRVDXWRUHVTXHGHVWHFDVRHVFULEHPDXPTXHSRUFRPMHWXUDVYHURVLOLÑHVVHGHMDHPWHPGHUTXHVHÑÑDODEDTXLMDPDSHURHVWRLOSRUWDSRFRDPXHVWURFXHPWREDVWDTXHHPÑDPDUUDFLRPGHÑPRVHVDÑJDXPSXPWRGHÑDYHUGDG";
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int [] frecs = new int[27];
        int i = 0;
        char c = ' ';
        int ascii = 0;
        int posicion = 0;
        while (i < Quijote.length()){
            c = Quijote.charAt(i);
            ascii = (int)c;
            if (c != 'Ñ')
                posicion = ascii - 65;
            else//c == 'Ñ'
                posicion = 26;
            frecs[posicion]++;            
            i++;
            /*switch(Quijote.charAt(i)){
                case: 'A'
                  frecs[0]++;
            
            }*/
        //resolver mediante la tabla ASCII         
        //restando 65 para obtener la posición correspondiente
        }
        
        int maximo1 = 0;
        int pos_maximo1 = 0;
        int maximo2 = 0;
        int pos_maximo2 = 0;
        int j = 0;
        for (j = 0; j < frecs.length; j++){
            //System.out.print(frecs[j] + ", ");
            if (maximo1 < frecs[j]){
                maximo1 = frecs[j];
                pos_maximo1 = j;
            }
        }
        
        for (j = 0; j < frecs.length; j++){
            if ((j != pos_maximo1)&&(maximo2 < frecs[j])){
                maximo2 = frecs[j];
                pos_maximo2 = j;
            }
        }
        
        
        char c1 = (char)(pos_maximo1 + 65);
        
        char c2 = (char)(pos_maximo2 + 65);
        
        System.out.println(c1);
        
        System.out.println(c2);
        
        int desplazamiento = 0;
        //D->A resta = 3
        //H->E resta = 3
        if ((int)(c1 - 'A')==(int)(c2 - 'E'))       
            desplazamiento = (int)(c1 - 'A');
        //D->E resta = -1
        //H->A rest = 7
        else //(int)(c1 - 'E') == (c2 - 'A')
            desplazamiento = (int)(c1 - 'E');
        
        
        c = ' ';
        char d = ' ';
        
        i = 0;
        
        posicion = 0;
        String cadena = "";
        while (i  < Quijote.length()){
            c = Quijote.charAt(i);
            //distincion de caso para la Ñ
            if (c != 'Ñ')
                posicion = (int)(c - 'A');
            else
                posicion = 14;              
            //distinciones de casos 
            //izquierda y derecha de la Ñ
            if ((posicion < 14)|| (c == 'Ñ'))
                if ((posicion - desplazamiento) < 0)
                    d = abecedario.charAt((posicion - desplazamiento) + abecedario.length());
                else//(posicion -3) >= 0
                    d = abecedario.charAt(posicion - desplazamiento);
            else//posicion > 14 y O
                if ((posicion - desplazamiento + 1) < 0)
                    d = abecedario.charAt(posicion - desplazamiento + 1 + abecedario.length());
                else//(posicion - 2) >= 0
                    d = abecedario.charAt(posicion - desplazamiento + 1);
            //hacer cambio si posicion - desplazamiento
            //es negativo
            //d = abecedario.charAt(posicion - 3);
            cadena = cadena + d;
            i++;
        }
        
        System.out.println(cadena);
        
    }
    
}