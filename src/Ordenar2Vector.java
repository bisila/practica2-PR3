public class Ordenar2Vector {
    private int movimientos = 0;
    private int comparaciones = 0;
    
    public int[] shell(int[] vec, int n){
        int dist = n/2;
        int j, aux;
        while (dist > 0){
            for (int i = 0; i < n - dist; i++) {
                j = i + dist;
                while ((j >= dist) && (vec[j] < vec[j - dist])){
                    comparaciones++;
                    aux = vec[j];
                    vec[j] = vec[j-dist];
                    vec[j-dist] = aux;
                    movimientos++;
                    j = j - dist;
                }
                if (j>dist) comparaciones++;
            }
            dist = dist/2;
        }
        return vec;
    }
    
}