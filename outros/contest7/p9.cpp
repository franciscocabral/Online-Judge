#include <cstdio>
#include <algorithm>
using namespace std;

int find(int p, int lugares[]) {
    int i;
    for (i = 0; i < 8; i++) {
        if (lugares[i] == p)
            break;
    }
    return i;
}

int main() {
    int n, m;
    int regras[20][3];

    while (scanf("%d %d", &n, &m), n || m) {
        for (int i = 0; i < m; i++) {
            scanf("%d %d %d", &regras[i][0], &regras[i][1],&regras[i][2]);
        }

        int lugares[8] = { 0, 1, 2, 3, 4, 5, 6, 7 };

        int respostas = 0;
        do {
            bool taValendo = true;
            for (int i = 0; i < m; i++) {
                int pos1 = find(regras[i][0], lugares);
                int pos2 = find(regras[i][1], lugares);
                if (regras[i][2] > 0) {
                    if (abs(pos1 - pos2) > regras[i][2]) {
                        taValendo = false;
                        break;
                    }
                }
                if (regras[i][2] < 0) {
                    if (abs(pos1 - pos2) < (-regras[i][2])) {
                        taValendo = false;
                        break;
                    }
                }
            }

            if (taValendo)
                respostas++;
        } while (next_permutation(lugares, lugares + n));

        printf("%d\n", respostas);
    }

    return 0;
}