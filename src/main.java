public class main {

    public static void main(String[] args) {
        int[] vec = {5, 6, 9, 1, 23, 4, 56, 78, 12, 0,18,5,6,48,6,95,62,32,45,23,29,28,27,15,16,18,19,17,13,16,25,456,7};
       // int[] ordena1 = new Ordenar1Vector().ordena(vec, new DatosEstadisticos());
        int[] ordena2 = new Ordenar2Vector().shell(vec, vec.length);
        for (int i = 0; i < ordena2.length; i++) {
            System.out.println(ordena2[i]+", ");
        }
        
 
    }
}