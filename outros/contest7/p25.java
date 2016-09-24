package contest7;



import java.util.Scanner;

class Main {

    public static double buscaBinaria(int[] papeis, double primeiro, double ultimo, double desejado, double ultimoMeio) {
        double meio, soma = 0;

        meio = (ultimo + primeiro) / 2;
        for (int i = 0; i < papeis.length; i++) {
            if (meio < papeis[i]) {
                soma += papeis[i] - meio;
            }
        }
        if (Math.abs(meio - ultimoMeio) < 0.000001 ) return meio;
        if (soma > desejado) return buscaBinaria(papeis, meio, ultimo, desejado, meio);
        if (soma < desejado) return buscaBinaria(papeis, primeiro, meio, desejado, meio);
        return meio;
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = s.nextInt();
        int a = s.nextInt();
        
        while (n != 0) {
            double soma = 0;
            double maior = 0;
            
            int[] papeis = new int[n];
            for (int i = 0; i < n; i++) {
                papeis[i] = s.nextInt();
                if (i == 0 || maior < papeis[i]) {
                    maior = papeis[i];
                }
                soma += papeis[i];
            }

            if (soma == a) sb.append(":D\n");
            if (soma < a) sb.append("-.-\n");
            if (soma > a) {
                sb.append(String.format("%.4f\n", buscaBinaria(papeis, 0, maior, a, 0)));
            }

            n = s.nextInt();
            a = s.nextInt();
        }
        System.out.print(sb);

    }
}
