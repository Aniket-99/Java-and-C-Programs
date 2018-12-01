#include <stdio.h>
#include <stdlib.h>
int main()
{
  float percentage;
  printf("enter your percentage");
  scanf(" %f",&percentage);

  if(percentage>=75){
    printf("grade is o");
  }else if(percentage>=65){
    printf("grade is a");
}else if(percentage>=55){
    printf("grade is b");
}else if(percentage>=45){
    printf("grade is c");
}else{
    printf("you are fail");
}
   return 0;
   }
