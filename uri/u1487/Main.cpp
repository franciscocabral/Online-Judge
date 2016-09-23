#include <cstdio>
#include <algorithm>
using namespace std;

int main() {
    int brinquedos[101][601];
    int n;
    int tempo;
    int tempos[101];
    int pontos[101];
    scanf("%d %d", &n, &tempo);
    int zzz = 0;
    while (n != 0) {
        for (int i = 1; i <= n; i++){
            scanf("%d %d", &tempos[i], &pontos[i]);
        }
        for (int i = 1; i <= tempo; i++) {
            brinquedos[0][i] = 0;
            for (int j = 1; j <= n; j++)
                if (i - tempos[j] < 0) {
                    brinquedos[j][i] = brinquedos[j - 1][i];
                } else {
                    brinquedos[j][i] = max(max(brinquedos[j - 1][i], brinquedos[j - 1][ i - tempos[j] ] + pontos[j]), brinquedos[j][ i - tempos[j] ] + pontos[j]);
                }
        }
        zzz++;
        printf("Instancia %d\n", zzz);
        printf("%d\n\n", brinquedos[n][tempo]);
        scanf("%d %d", &n, &tempo);
    }

    return 0;
}