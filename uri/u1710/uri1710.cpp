#include <stdio.h>

using namespace std;

struct Plano {
    int a=0, b=0, c=0, d=0;
    int mundos = 0;
};

int isInPlano(Plano p, int x, int y, int z) {
    int pos = ((x * p.a) + (y * p.b) + (z * p.c));
    if (pos == p.d) {
        p.mundos++;
        return 1;
    }
    return 0;
}

int main() {
    int m, n;
    scanf("%d %d", &m, &n);
    Plano planos[m];

    int i;
    for (i = 0; i < m; i++) {
        int a, b, c, d;
        scanf("%d %d %d %d", &a, &b, &c, &d);
        planos[i].a = a;
        planos[i].b = b;
        planos[i].c = c;
        planos[i].d = d;
    }

    Plano maiorPlano;
    for (i = 0; i < n; i++) {
        if (i == 0) maiorPlano = planos[0];
        int j, x, y, z;
        scanf("%d %d %d", &x, &y, &z);

        for (j = 0; j < m; j++) {
            if (isInPlano(planos[j], x, y, z)) {
                if (maiorPlano.mundos < planos[j].mundos) {
                    maiorPlano = planos[j];
                }
                break;
            }
        }
    }

    printf("%d\n", maiorPlano.mundos);
}


