/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Jugador extends Combatiente{
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vehiculo.java
    @version: 
        - Creación: 22/09/2021
        - Última modificación: 22/09/2021

    Clase que tiene las propiedades y métodos específicos de los jugadores. Sirve como hijo 
    */

    //---------------------------PROPIEDADES-------------------------
    protected int cantidadItems;
    protected String[] items;

    //---------------------------MÉTODOS-----------------------------
    public Jugador(String tipo){
        super(tipo);

        if (this.tipo.equals("guerrero")){
            cantidadItems = 10;
            items = new String[2];
            items[0] = "Espada ignea";
            items[1] = "Lanza voladora";
        }
        if (this.tipo.equals("explorador")){
            cantidadItems = 20;
            items = new String[4];
            items[0] = "Curar";
            items[1] = "Pico de acero";
            items[2] = "Flecha venenosa";
            items[3] = "Incrementar ataque";
        }
    }

    public String especial(String habilidad, Combatiente objetivo){
        if(cantidadItems > 0 && habilidad.equals("Espada ignea")){
            cantidadItems -= 2;
            atacar(objetivo, 6);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if (cantidadItems > 0 && habilidad.equals("Lanza voladora")){
            cantidadItems--;
            atacar(objetivo, 5);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if (cantidadItems > 0 && habilidad.equals("Curar")){
            cantidadItems -=4;
            curar(objetivo, 5);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if(cantidadItems > 0 && habilidad.equals("Pico de acero")){
            cantidadItems -= 2;
            atacar(objetivo, 4);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if(cantidadItems > 0 && habilidad.equals("Flecha Venenosa")){
            cantidadItems--;
            atacar(objetivo, 3);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if(cantidadItems > 0 && habilidad.equals("Incrementar ataque")){
            cantidadItems -=5;
            incrementar(objetivo, 2);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else 
            return this.tipo + " : quizo ejecutar " + habilidad + " hacia " + objetivo + " pero no pudo";
        
    }

}
