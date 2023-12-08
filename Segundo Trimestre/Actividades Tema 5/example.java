public class example {
    public static void main(String[] args) {
        /*int edad2[];
        edad2 = new int[10];

        edad2[0] = 10;

        for(int i = 0; i<edad2.length; i++) {
            edad2[i] = 2*i;
        }

        for(int i = 0; i<edad2.length; i++) {
            System.out.println(edad2[i]);
        }*/

        /*int n1 = 5, n2;
        int a[], b[];

        a = new int[5];

        b = a;

        System.out.println("a: " + a + "b: " + b);*/

        //Definir arrays

        int a[];
        int []b;

        //Reservar memoria para el array 
        int c[] = {1,2,3}; //Asignoi memoria para tres elementos y doy valores.
        a = new int[5]; //Asigno memoria para 5 enteros.

        System.out.println("Primerm elemento de a: " + a[0]);
        //Para acceder a un elemento indico la posiciom
        // La primera posicion es la 0.
        System.out.println(a[0]);

        //Dar valores a todo el array
        //Calculo la longitud del array con length
        for(int i = 0; i<a.length; i++) {
            a[i] = i;
        }

        //Mostrar valores del array
        System.out.println("Muestro el array a");
        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("");
        //CUIDADO, cuando asigno una variable array a otra, no copio.
        // los contenidos, sino que le asigno la misma posicion de memoria.
        // Por lo tanto, todos los cambios que haga en un array se vam a 
        // reflejar en el otro array

        b = a;
        a[0] = 100;
        System.out.println(b[0]);
    }
}