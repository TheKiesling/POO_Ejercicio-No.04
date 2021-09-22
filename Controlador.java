/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Controlador {
   /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controlador.java
    @version: 
        - Creación: 21/09/2021
        - Última modificación: 21/09/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */ 

    //---------------------------MÉTODOS-----------------------------
    public static void main(String[] args){
        //Instancia de objetos
        Mundo mundo = new Mundo();
        Combatiente combatiente = null;
        Vista vista = new Vista();


        try{
            //Saludar al usuario
            vista.bienvenida();

            //Creación de combatientes en el mundo
            int jugadores = vista.pedirJugadores();
            for (int i = 0; i < jugadores; i++){
                String tipo = vista.pedirTipo();
                combatiente = new Combatiente(tipo);
                mundo.crearCombatiente(combatiente); //Jugadores
                combatiente.saludar();
            }
            mundo.crearCombatiente();//Enemigos

            int opcion = -1;
            while (opcion != 4){
                //Despliegue de las opciones del menú y su previa lectura de dicha opción
                opcion = vista.menuOpciones();
                mundo.acciones(); //Desplegar las 3 últimas acciones

                //Pasar turno
                if (opcion == 1){
                    combatiente.pasar();
                }

                //Atacar
                if (opcion == 2){
                    String enemigo = vista.pedirEnemigo();
                    combatiente.atacar(enemigo);
                }

                //Habilidad especial
                if (opcion == 3){
                    int especial = vista.pedirEspecial();
                    combatiente.especial(especial);
                }

                //Salir
                if (opcion == 4){
                    vista.despedida();
                }
            }
        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }
    }
}
