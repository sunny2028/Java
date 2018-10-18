#include<stdio.h>
#include<math.h>
int main()
{
  int n ,i,t,s=0,z;
  scanf("%d",&t);
  z=t;
  for(i=0;i<t;i++)
  {z--;
    scanf("%d",&n);
    s=n*pow(10,z)+s;
  }
  printf("%d",s);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
}
