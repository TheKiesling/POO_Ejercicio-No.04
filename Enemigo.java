/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Enemigo extends Combatiente {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vehiculo.java
    @version: 
        - Creación: 23/09/2021
        - Última modificación: 23/09/2021

    Clase que tiene las propiedades y métodos específicos de los enemigos. Sirve como hijo 
    */

    //---------------------------PROPIEDADES-------------------------
    protected String habilidad;
    protected int experiencia;

    //---------------------------MÉTODOS-----------------------------
    public Enemigo(String tipo){
        super(tipo);

        if(this.tipo.equals("brujo"))
            this.habilidad = "Curar";
        if(this.tipo.equals("valquiria"))
            this.habilidad = "Pico de acero";
        if(this.tipo.equals("dragon"))
            this.habilidad = "Flecha Venenosa";
    }

    public String especial(String habilidad, Combatiente objetivo){

        if (habilidad.equals("Curar")){
            curar(objetivo, 5);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if(habilidad.equals("Pico de acero")){
            atacar(objetivo, 4);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else if(habilidad.equals("Flecha Venenosa")){
            atacar(objetivo, 3);
            return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
        }
        else 
            return this.tipo + " : quizo ejecutar " + habilidad + " hacia " + objetivo + " pero no pudo";
    }
}
