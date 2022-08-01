public class Main {

    public static void main(String[] args){
        int a = 5;
        int b = 12;
        int c = 7;

        int resultado = suma(a,b,c);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.println(miCoche.nroPuertas);
    }

    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    int nroPuertas = 0;

    public void incrementarPuertas(){
        nroPuertas++;
    }
}
