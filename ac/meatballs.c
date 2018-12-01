#include <stdio.h>
#include <stdlib.h>
#include<ctype.h>
#include<string.h>
int main()
{
  int i;
  int meatballs[5];
  int totalballs=0;

  for(i=0;i<5;i++){
    printf("how many meatball do you ate on day %d? \n",i+1);
    scanf("%d",&meatballs[i]);
  }
   for(i=0;i<5;i++){
    totalballs+=meatballs[i];
   }
   int avg=totalballs/5;
   printf("\nyou ate %d meatballs total,thats an avg of %d per day\n",totalballs,avg);
   return 0;
   }
