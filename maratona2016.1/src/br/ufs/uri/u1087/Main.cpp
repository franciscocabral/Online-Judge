#include <iostream>

using namespace std;

int main(){
    int x0, x1, y0, y1;
    
    while(scanf("%d %d %d %d", &x0, &y0, &x1, &y1)){
        if(x0 == 0) break;
        else if(x0 == x1 && y0 == y1) printf("0\n");
        else if(x0 == x1 
            ||  y0 == y1
            ||  (x1-x0) ==  (y1-y0)
            || -(x1-x0) ==  (y1-y0)
            ||  (x1-x0) == -(y1-y0)
            || -(x1-x0) == -(y1-y0)) printf("1\n");
        else printf("2\n");
    }
    
}

