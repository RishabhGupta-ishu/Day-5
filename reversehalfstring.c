#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char str[]="ABCDEFGH" , str1[10] , *str2;
int i=0;
clrscr();
strcpy(str1,str);
str1[strlen(str1)/2]=NULL ;
printf("first half->%s\n",str1);
str2=str;
for(i=0;i<strlen(str)/2;i++)
{
str2++;
}
printf("secondhalf->%s\n",strrev(str2));
printf("string->%s",strcpy(str,strcat(str1,str2)));
getch();
}
