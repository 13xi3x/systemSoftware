import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class commandExe {
    private String[] cmdTokens= new String[10];
    private String UserCommand;
    private String cmdHistory;

    public void verifyCommand( String cmdTokens){};

     public String exeCommand(String cmdTokens){
         String s="ok";
         var processBuilder = new ProcessBuilder();

         processBuilder.command(UserCommand, "2021", "-m 10");

         //var process = processBuilder.start();

//          try (var reader = new BufferedReader(
//                  new InputStreamReader(process.getInputStream()))) {
//
//              String line;
//
//              while ((line = reader.readLine()) != null) {
//                  System.out.println(line);
//             }






         return s;
     };
    public void userHistory(){};
    public void getUserCommad(){};

}
