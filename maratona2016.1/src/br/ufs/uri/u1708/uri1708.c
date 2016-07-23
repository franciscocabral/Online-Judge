#include <stdio.h>
int main(){
	int x,y;
	scanf("%d %d", &x, &y);
	
    int vx = 0;
    int vy = 0;
    int tx = 0;
    int ty = 0;
        
    while(vx >= vy){
        tx = x*vx;
        ty = y*vy;
        vx++;
        
        if(tx+x > ty){
            vy++;
        }else{
            break;
        }
    }
    
    printf("%d\n",vx);
}
