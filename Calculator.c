#include <stdio.h>
#include <inttypes.h>
#include <stdint.h>
int main()
{
    int T,t;
    uint64_t N,B,a,c1,c2;
    scanf("%d",&T);
    for(t=0;t<T;++t)
    {
        scanf("%"SCNu64" %"SCNu64"",&N,&B);
        if(B>=N)
        {
            printf("0\n");
        }
        else
        {
            a=(N/2)-((N/2)%B);
            c1=(N-a)*(a/B);
            a+=B;
            c2=(N-a)*(a/B);
            if(c1>c2)
            printf("%"PRIu64"\n",c1);
            else
            printf("%"PRIu64"\n",c2);
        }
    }
}

