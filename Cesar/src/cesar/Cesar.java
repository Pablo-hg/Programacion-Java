
package cesar;


public class Cesar {

    public static void main(String[] args) {
      
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        String cadena = "ENUNLUGARDELAMANCHADECUYONOMBRENOQUIEROACORDARMENOHAMUCHOTIEMPOQUEVIVIAUNHIDALGO"
                + "DELOSDELANZAENASTILLEROADARGAANTIGUAROCINFLACOYGALGOCORREDORUNAOLLADEALGOMASVACAQUECARNEROS"
                + "ALPICONLASMASNOCHESDUELOSYQUEBRANTOSLOSSABADOSLANTEJASLOSVIERNESALGUNPALOMINODEAÑADIDURA"
                + "LOSDOMINGOSCONSUMIANLASTRESPARTESDESUHACIENDAELRESTODELLACONCLUIANSAYODEVELARTECALZASDE"
                + "VELLUDOPARALASFIESTASCONSUSPANTUFLOSDELOMESMOYLOSDIASDEENTRESEMANASEHONRABACONSUVELLORIDELOMAS"
                + "FINOTENIAENSUCASAUNAAMAQUEPASABADELOSCUARENTAYUNASOBRINAQUENOLLEGABAALOSVEINTEYUNMOZODECAMPO"
                + "YPLAZAQUEASIENSILLABAELROCINCOMOTOMABALAPODADERAFRISABALAEDADDENUESTROHIDALGOCONLOSCINCUENTA"
                + "AÑOSERADECOMPLEXIONRECIASECODECARNESENJUTODEROSTROGRANMADRUGADORYAMIGODELACAZAQUIERENDECIRQUETE"
                + "IAELSOBRENOMBREDEQUIJADAOQUESADAQUEENESTOHAYALGUNADIFERENCIAENLOSAUTORESQUEDESTECASOESCRIBENAUN"
                + "QUEPORCONJETURASVEROSIMILESSEDEJAENTENDERQUESELLAMABAQUIJANAPEROESTOIMPORTAPOCOANUESTROCUENTO"
                + "BASTAQUEENLANARRACIONDELNOSESALGAUNPUNTODELAVERDAD"; //sin espacio y en mayusculas
        String cadena_cifrada = "";// cadena cifrada = "OQPR"
        int desplazamiento = 3;
        //Bucle para recorrer la cadena
        int i = 0;
        int ascii = 0;
        char c = ' ';
        char d = ' ';
        int posicion = 0;
        
         while (i  < cadena.length()){
             c = cadena.charAt(i);
             if (c != 'Ñ')
                posicion = (int)(c - 'A');
             else
                 posicion = 14;
            
             if ((posicion < 14) || ( c == 'Ñ'))
                d = abecedario.charAt((posicion + desplazamiento)%27);
             //posicion + 3 > 14
             //else if (posicion)
             else // posicion >= 14
                d = abecedario.charAt((posicion + desplazamiento + 1)%27); 
             cadena_cifrada = cadena_cifrada + d;
             i++;
         }
        
        /////VERSION FINAL//////
       
////VERSION APROXIMADA////
        /*while(i < cadena.length()){
        //en cada iteracion accedo al valor quie contiene
        //esa posicion(i) con cadena.CharAt(i)
        //al carcater obetnido le sumamos el desplazamiento(ASCII)
            c = cadena.charAt(i);
            c = (char) (c + 3);
            cadena_cifrada = cadena_cifrada + c;
            ascii = (int)c;
        //solucionar cuando nos salimospor la derecha del abecedario
            i++;
        }*/
        System.out.println(cadena_cifrada);
       
    }
    
}
