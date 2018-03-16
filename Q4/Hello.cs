using System;

namespace HelloWorld
{
    class Hello 
    {
        static void Main() 
        {
			ServiceSOAPService myService = new ServiceSOAPService();
            Console.WriteLine(myService.sayHello("el khattab"));
        }
    }
}
