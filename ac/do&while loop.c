#include <stdio.h>
#include <stdlib.h>
#include<ctype.h>

int main()
{
    int tuna='a';
if(isalpha(tuna)){
    if(isupper(tuna)){
        printf("%c is an upper case letter",tuna);
    }else{
    printf("%c is an lower case letter",tuna};
}


return 0;
}
