#include <stdio.h>
#include <stdlib.h>
#include<ctype.h>

int main()
{
    int a;
    printf("enter your password(must contain $,num,uppercase):\n");
    scanf(" %c",&a);

    if (isalpha(a)){
        if(isupper(a)){
            printf(" %c is an upper case letter",a);
        }else{
        printf("%c is an lower case letter");
        }
    }else{
     if(isdigit(a)){
       printf("%c is a number\n",a);
     }else{
      printf("%c omg idk!\n",a);
     }
    }


   return 0;
   }
