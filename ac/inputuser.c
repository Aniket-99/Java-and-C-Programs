#include <stdio.h>
#include <stdlib.h>


int main()
{
 char firstname[20];
 char lastname[30];
 int age;

 printf("what is your name?\n");
 scanf("%s",firstname);

 printf("what is your lastname?\n" );
 scanf("%s",lastname);

 printf("what is your age?\n" );
 scanf("%d",&age);

 printf("%s %s is %d years old",firstname,lastname,age );

 return 0;

}
