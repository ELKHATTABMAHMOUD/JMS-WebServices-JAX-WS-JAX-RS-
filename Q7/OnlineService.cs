using System;
using System.Xml;
namespace HelloWorld
{
    class OnlineService 
    {
        static void Main() 
        {
			
			USZip service = new USZip();
			System.Xml.XmlNode node = service.GetInfoByZIP("99501")	;
            Console.WriteLine("city is : "+node.FirstChild.InnerText);
        }
    }
}
