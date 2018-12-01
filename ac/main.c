#include <stdio.h>
#include <stdlib.h>
int main()
{FILE * fpointer;

 fpointer=fopen("Aniket.txt","w+");
 fputs("i ate 3 apples today",fpointer);


fseek(fpointer,7,SEEK_SET);
 fputs(" munchkins on sunday",fpointer);

      return 0;
    }
