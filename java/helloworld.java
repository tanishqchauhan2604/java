class helloworld
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int flag=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		flag++;
	     }
	  }
	  if (flag ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}