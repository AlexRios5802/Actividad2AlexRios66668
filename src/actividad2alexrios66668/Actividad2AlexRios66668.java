
package actividad2alexrios66668;

import java.util.Scanner;

public class Actividad2AlexRios66668 {
    
    public static void datos( ) {
        
        System.out.println("Alex Omar Ríos Pérez");
        System.out.println("Ingeniería en Sistemas Computacionales");
        System.out.println("Facultad de Ingeniería");
        
    }
    public static void space( ) {
        System.out.println(" ");
    }
        
     public static void separador( ) {
         System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    public static void main(String[] args) {
        
        datos ( );
        space( );
        separador( );

        System.out.println("Actividad 2.1 // Crear un menú del 1 al 5, con opciones de acciones se lea un valor de ");
        System.out.println("tipo int y se proceso algún mensaje");
        
        //Entrando en la situacion de una reservacion de mesas en un restautrant
        
        System.out.println("Menú de reservación");
        space ( );
        System.out.println("Cant -  Costo");
        System.out.println("1 - $150.00");
        System.out.println("2 - $275.00");
        System.out.println("3 - $400.00");
        System.out.println("4 - $525.00");
        System.out.println("5 - $650.00");

        space ( );

        int mesas = 0; 
        System.out.println("Ingrese el numero de mesas que desea reservar");
        Scanner numero = new Scanner(System.in);
        mesas = numero.nextInt();
        
        switch (mesas) {
            case 1:
                System.out.println("Haz reservado una mesa, con capcacidad para cuatro personas // Costo $150.00");
                break;
            case 2:
                System.out.println("Haz reservado dos mesas, con capcidad para ocho personas // Costo $275.00");
                break;
            case 3:
                System.out.println("Haz reservado tres mesas, con capacidad para doce personas // Costo $400.00");
                break;
            case 4:
                System.out.println("Haz reservado cuatro mesas, con capacidad para catorce personas // Costo $525.00");
                break;
            case 5:
                System.out.println("Haz reservado cinco mesas, con capacidad para dieciseis personas // Costo $650.00");
                break;
                
            default:
                System.out.println("Este numero, sobre pasa nuestra cantidad de reservas");
        }
        
        space ( );
        separador ( );
        
        System.out.println("Actividad 2.2 // Crear un menú del 1 al 5 con opciones de acciones  se lea un valor de tipo");
        System.out.println("string (correr, saltar, dormir, comer, estudiar) y se proceso algún mensaje");
        
        // Entrando a una actividad que queremos hacer
        System.out.println("¿Cual de estas opciones te guntan hacer en tus ratos libres?");
        
        System.out.println("Ten en cuenta estas opciones: Correr, Saltar, Dormir, Comer, Estudiar, Otros...");
        Scanner teclado = new Scanner (System.in);
        String accion = teclado.next( );
        
        switch (accion) {
            case "Correr":
            case "correr":
                System.out.println("Te gusa " + accion);
                break;
                
            case "Saltar":
            case "saltar":
                System.out.println("Te gusa " + accion);
                break;
                
            case "Dormir":
            case "dormir":
                System.out.println("Te gusta " + accion);
                break;
                
            case "Comer":
            case "comer":
                System.out.println("Te gusta " + accion);
                break;
                
            case "Estudiar":
            case "estudiar":
                System.out.println("Te gusta " + accion);
                break;
                
            case "Otros":
            case "otros":
                
                System.out.println("¿Cual?");
                Scanner teclado2 = new Scanner (System.in);
                String accion2 = teclado2.next( );
                System.out.println("Te gusta " + accion2);
                break;
                
            default:
                System.out.println("No aplica");
        }
        
        space ( );
        separador ( );
        
        System.out.println("Actividad 2.3 // Crear un horario de usted de cualquier día de la semana, ej: 6 Despertar,");
        System.out.println(" 7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras, 10 …, 21 Dormir, leer un valor de 1  al 24");
        System.out.println(" validar e imprimir la acción que realiza en su horario.");
        
        //Entrando en una vida de estudiante
        space ( );
        System.out.println("Introduce una hora, en un lapso de 24 hora,  para ver que actividad tienes en esa hora");
        
        int hora = 0;
                
        Scanner rios = new Scanner(System.in);
        hora = rios.nextInt();
        
        switch (hora) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hora: " + hora + " a.m.; estarás hora estas durmiendo, lo recomenble sería no modificar");
                System.out.println("su hora establecida, debido a que lo usa de descanzo de todos los días.");
                break;
                
            case 6:
                System.out.println("Hora: " + hora + " a.m; Te levantas para alistarte, para tu primera clase de las 7 a.m.");
                break;
                
            case 7:
            case 8:
                System.out.println("Hora: " + hora + "  a.m; Estas en clase de Administracion General");
                
            case 9:
                System.out.println("Hora: " + hora + " a.m; Hora libre hasta las 10");
                break;
                
            case 10:
            case 11:
                System.out.println("Hora: " + hora + " a.m; Estas en clase de ingles hasta las 12");
                break;
                
            case 12:
                System.out.println("Hora: " + hora + " p.m; Ultima clase del día, cálculo integral hasta la 1");
                break;
                
            case 13:
                System.out.println("Hora: " + hora + " p.m; Hora de limpiar el patio");
                break;
                
            case 14:
                System.out.println("Hora: " + hora + " p.m; Descanso, puedes agregar una actividad en esta hora");
                break;
                
            case 15:
                System.out.println("Hora: " + hora + " p.m; Hora del almuerzo");
                break;
                
            case 16:
                System.out.println("Hora: " + hora + " p.m; Hora de descanso");
                break;
                
            case 17:
                System.out.println("Hora: " + hora + " p.m; Hora de ensayar con el instrumento");
                break;
                
            case 18:
                System.out.println("Hora: " + hora + " p.m; Hora de hacer la tarea");
                break;
                
            case 19:
            case 20:
                System.out.println("Hora: " + hora + " p.m; Entrar a la clase de Lenguaje de programación hasta las 9");
                break;
                
            case 21:
                System.out.println("Hora: " + hora + " p.m;  Hacer tarea hasta las 11");
                break;
                
            case 22:
                System.out.println("Hora: " + hora + " p.m; Hora de tarea");
                break;
                
            case 23:
                System.out.println("Hora: " + hora + " p.m; Hora de dormir, o puedes aprovechar para teminar la tarea");
                
            default:
                System.out.println("No aplica");
        }
        
        
        System.out.println("Actividad 2.4 // ");
    }
    
}
