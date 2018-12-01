#include <stdio.h>
#include <stdlib.h>


int main()
{
 float grade1;
 float grade2;
 float grade3;

  printf("enter your grade:\n");
  scanf(" %f",&grade1);
  scanf(" %f",&grade2);
  scanf(" %f",&grade3);
 float average=(grade1+grade2+grade3)/3;
 printf("average is %.2f:\n",average);

 if(average>=90){
    printf("grade:A\n");
 }else if(average>=80){
     printf("grade:B\n");
     }else if(average>=70){
     printf("grade:C\n");
     }else if(average>=60){
     printf("grade:D\n");
 }else {
     printf("you need to study well");
 }
 return 0;

}
