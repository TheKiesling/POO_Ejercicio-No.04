/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Combatiente {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vehiculo.java
    @version: 
        - Creación: 22/09/2021
        - Última modificación: 22/09/2021

    Clase que tiene las propiedades y métodos de los combatientes. Sirve como padre 
    */

    //---------------------------PROPIEDADES-------------------------
    protected String tipo;
    protected int vida;
    protected int ataque;
    protected String especial;

    //---------------------------MÉTODOS-----------------------------
    public Combatiente(String tipo){ 
        this.tipo = tipo;
        if (this.tipo.equals("guerrero")){
            this.vida = 40;
            this.ataque = 4;
            this.especial = "item"; 
        }

        if (this.tipo.equals("explorador")){
            this.vida = 20;
            this.ataque = 2;
            this.especial = "item"; 
        }

        if (this.tipo.equals("brujo")){
            this.vida = 20;
            this.ataque = 2;
            this.especial = "habilidad";
        }

        if (this.tipo.equals("valquiria")){
            this.vida = 40;
            this.ataque = 2;
            this.especial = "habilidad";
        }

        if (this.tipo.equals("dragon")){
            this.vida = 60;
            this.ataque = 4;
            this.especial = "habilidad";
        }
    }

    public String saludar(){
        return "Soy: " + this.tipo + " y he entrado a la batalla";
    }

    public String morir(){
        return this.tipo + " : Ha sido un honor estar en la batalla";
    }

    public String ganar(){
        return this.tipo + " : Muy bien combatiente, hemos vencido";
    }

    public void atacar(Combatiente objetivo){
        objetivo.dano(this.ataque);
    }

    public void atacar(Combatiente objetivo, int dano){
        objetivo.dano(dano);
    }

    public void dano(int dano){
        this.vida -= dano;
    }

    public void curar(Combatiente objetivo, int cantidad){
        objetivo.vida += cantidad;
    }

    public void incrementar(Combatiente objetivo, int cantidad){
        objetivo.ataque += cantidad;
    }

    public String pasar(){
        return this.tipo +  " : Me prepararé para el siguiente turno";
    }

    public String especial(String habilidad, Combatiente objetivo){
        return this.tipo + " : Ejecutando " + habilidad + " hacia " + objetivo;
    }

    public String toString(String s){
        return s;
    }

}
