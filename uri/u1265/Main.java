/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1265;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        int q = s.nextInt();
        while (n != 0) {
            String[] musicas = new String[n];

            for (int i = 0; i < n; i++) {
                musicas[i] = s.next();
            }

            for (int i = 0; i < q; i++) {
                int consulta = s.nextInt();

                String resposta;

                consulta--;
                if (consulta < n) {
                    resposta = musicas[consulta];
                } else {
                    int tamanhoDoTermo = 1;
                    int tamanhoDoGrupo = n;
                    while (consulta >= tamanhoDoGrupo * tamanhoDoTermo) {
                        consulta -= tamanhoDoGrupo * tamanhoDoTermo;
                        tamanhoDoGrupo *= n;
                        tamanhoDoTermo++;
                    }

                    tamanhoDoGrupo *= tamanhoDoTermo;
                    int fim = consulta;
                    int grupo = 0;
                    int j = 0;
                    while (fim != 0) {
                        tamanhoDoGrupo = tamanhoDoGrupo / n;
                        grupo = fim / tamanhoDoGrupo;
                        fim = fim % tamanhoDoGrupo;
                        if (fim % tamanhoDoTermo == i) {
                            break;
                        }

                        i++;
                    }
                    resposta = musicas[grupo];
                }
                sb.append(resposta).append("\n");
            }
            n = s.nextInt();
            q = s.nextInt();
            if (n != 0) {
                sb.append("\n");
            }
        }
        System.out.print(sb);

    }
}
