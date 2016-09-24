#include <stdio.h>
 
int main() {
	
	int a, b, c;
    
    while(scanf("%d %d %d", &a, &b, &c) != EOF){
	
		if(a == b && b == c) printf("*");
		else if(a == b ) printf("C");
		else if(a == c ) printf("B");
		else if(c == b ) printf("A");
		printf("\n");
		
	}
    
    return 0;
}
