#include <bits/stdc++.h>
using namespace std;

stack<int> pilha1, pilha2, pilha3;

bool resolver() {
    if (pilha1.empty() && pilha2.empty() && pilha3.empty()) return true;
    if ((pilha1.empty() && pilha2.empty()) || (pilha2.empty() && pilha3.empty()) || (pilha1.empty() && pilha3.empty())) return false;

    if (pilha1.empty()) {
        if ((pilha2.top() + pilha3.top()) % 3) return false;
        else pilha2.pop(), pilha3.pop();
        return resolver();

    } else if (pilha2.empty()) {
        if ((pilha3.top() + pilha1.top()) % 3) return false;
        else pilha1.pop(), pilha3.pop();
        return resolver();

    } else if (pilha3.empty()) {
        if ((pilha2.top() + pilha1.top()) % 3) return false;
        else pilha2.pop(), pilha1.pop();
        return resolver();

    } else {
        if (!((pilha1.top() + pilha2.top() + pilha3.top()) % 3)) {
            pilha1.pop();
            pilha2.pop();
            pilha3.pop();
            return resolver();
        }
        bool parab, parbc, parac;
        int num1 = pilha1.top(), num2 = pilha2.top(), num3 = pilha3.top();

        if ((num1 + num2) % 3 == 0) {
            pilha1.pop();
            pilha2.pop();
            parab = resolver();
            pilha1.push(num1);
            pilha2.push(num2);
        } else if ((num2 + num3) % 3 == 0) {
            pilha2.pop();
            pilha3.pop();
            parbc = resolver();
            pilha2.push(num2);
            pilha3.push(num3);
        } else if ((num1 + num3) % 3 == 0) {
            pilha1.pop();
            pilha3.pop();
            parac = resolver();
            pilha1.push(num1);
            pilha3.push(num3);
        }
        return parab || parbc || parac;
    }
}

int main() {
    int n;

    while (scanf("%d", &n) && n) {
        int cont = 0;
        while (!pilha1.empty()) pilha1.pop();
        while (!pilha2.empty()) pilha2.pop();
        while (!pilha3.empty()) pilha3.pop();

        for (int i = 0, a, b, c; i < n; i++) {
            scanf("%d%d%d", &a, &b, &c);
            cont += a % 3 + b % 3 + c % 3;
            if (a % 3) pilha1.push(a);
            if (b % 3) pilha2.push(b);
            if (c % 3) pilha3.push(c);
        }
        printf("%d\n", cont % 3 ? 0 : resolver());
    }

    return 0;
}