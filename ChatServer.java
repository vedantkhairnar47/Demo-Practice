import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String Arg[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Marvellous server is waiting at port number 5100");
        
        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server suucesfully connected with the client");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        pobj.println("Hello from server");


        String str = bobj1.readLine();
        System.out.println("Message from client : "+str);
    }
}