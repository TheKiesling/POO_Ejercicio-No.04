/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    /**
     @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 21/09/2021
        - Última modificación: 21/09/2021

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
     */ 

    //---------------------------PROPIEDADES--------------------------
    private Scanner scan;

    //---------------------------MÉTODOS------------------------------

    /*****************************************************************
     * constructor: instancia el scanner
     */
    public Vista(){
        scan = new Scanner(System.in);
    }
    //****************************************************************

    /*****************************************************************
     * error: captura errores y muestra el mensaje que se obtuvo
     * @param e
     */
    public void error(String s){
        System.out.println("Ha ocurrido un error : -- " + s); 
    }
    //****************************************************************

    //---------------------------MENÚ---------------------------------
    /*****************************************************************
     * bienvenida: imprime un mensaje de bienvenida
     */
    public void bienvenida(){
        System.out.println("\n Bienvenido a The Ducky Thief 2.0. Un RPG donde te enfrentarás a enemigos");
    }
    //****************************************************************

    /*****************************************************************
     * menuOpciones: despliega el menú y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpciones() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nHa llegado tu turno combatiente, ¿qué harás?");
            System.out.println("\n\n1. Pasar Turno");
            System.out.println("2. Atacar");
            System.out.println("3. Usar Habilidad Especial/Ítem");
            System.out.println("4. Salir\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 4) //Opciones válidas
                    bandera = true;
                else{ 
                    System.out.println("ERROR: Ingrese una de las opciones indicadas anteriormente"); 
                }
            }
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + opcion + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  opcion + ": " + e.toString();
            throw new Exception(s);
        }
        return opcion;
    }
    //****************************************************************

    /*****************************************************************
     * despedida: Imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\nGG. Descansa combatiente");
        scan.close();
    }
    //****************************************************************

    /*****************************************************************
     * pedirJugadores: pide el número de jugadores en la partida
     * @return jugadores
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirJugadores() throws Exception, InputMismatchException{
        int jugadores = 0;
        boolean bandera = false;

        try{
            System.out.println("Ingrese el número de jugadores que tendrá en esta partida");
        
            while (!bandera){ //Ciclo para evaluar si se ingresó un tamano de memoria correcto
                jugadores = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (jugadores > 0) //Verificar si el espacio de memoria es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de memoria valida"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + jugadores + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  jugadores + ": " + e.toString();
            throw new Exception(s);
        }
        return jugadores;
    }
    //****************************************************************

    /*****************************************************************
     * pedirTipo: pide la el tipo de jugador que será
     * @return tipo
     * @throws Exception
     */
    public String pedirTipo() throws Exception{
        String tipo = "";
        boolean bandera = false;
        
        try{
            System.out.println("Qué rol será combatiente? (Guerrero/Explorador)");

            while (!bandera){ //Ciclo para evaluar si se ingresó un tipo de jugador correcto
                tipo = scan.nextLine().toLowerCase();
                System.out.println();
                if (tipo.equals("guerrero") || tipo.equals("explorador")) //Tipos admitidos
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un rol válido"); 
            }
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  tipo + ": " + e.toString();
            throw new Exception(s);
        }
        return tipo;
    }
    //****************************************************************

    /*****************************************************************
     * pedirEnemigo: pide el enemigo (o jugador) al que se le quiere destinar el ataque
     * @return enemigo
     * @throws Exception
     */
    public String pedirEnemigo() throws Exception{
        String enemigo = "";
        boolean bandera = false;
        
        try{
            System.out.println("A que combatiente desea atacar");

            while (!bandera){ //Ciclo para evaluar si se ingresó un tipo de jugador correcto
                enemigo = scan.nextLine().toLowerCase();
                System.out.println();
                if (enemigo.equals("guerrero") || enemigo.equals("explorador")) //Tipos admitidos
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un rol válido"); 
            }
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  enemigo + ": " + e.toString();
            throw new Exception(s);
        }
        return enemigo;
    }
    //****************************************************************

    /*****************************************************************
     * pedirJugadores: pide el especial que usará el jugador
     * @return jugadores
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirEspecial() throws Exception, InputMismatchException{
        int especial = 0;
        boolean bandera = false;

        try{
            System.out.println("Ingrese la opción que desea ejecutar");
        
            while (!bandera){ //Ciclo para evaluar si se ingresó un tamano de memoria correcto
                especial = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (especial > 0) //Verificar si el espacio de memoria es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de memoria valida"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + especial + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  especial + ": " + e.toString();
            throw new Exception(s);
        }
        return especial;
    }
    //****************************************************************

}