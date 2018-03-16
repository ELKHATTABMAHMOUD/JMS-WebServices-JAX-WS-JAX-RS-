using System;

namespace HelloWorld
{
    class OnlineService 
    {
        static void Main() 
        {
			TextCasing service = new TextCasing();
            Console.WriteLine(service.InvertStringCase("mahmoud"));
        }
    }
}
