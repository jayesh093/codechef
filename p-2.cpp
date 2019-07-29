    #include <stdio.h>
    #include <iostream>

    inline int input()
    {
    	char c=0;
    	int input=0;
    	while(c<33)
    	{
    		c = getchar_unlocked();
    	}
    	while(c>33)
    	{
    		input = input*10+c-'0';
    		c = getchar_unlocked();
    	}
    	return input;
    }

    int main()
    {
    	int t,
    		elephants,
    		candies;

    	scanf("%u", &t);

    	while(t--)
    	{
    		scanf("%u %u", &elephants, &candies);
    		for(int i = 0; i < elephants; i++)
    		{
    			candies -= input();
    		}
    		if(candies < 0)
    			printf("No\n");
    		else
    			printf("Yes\n");
    	}
    	//system("Pause");
    	return  0;
    }

