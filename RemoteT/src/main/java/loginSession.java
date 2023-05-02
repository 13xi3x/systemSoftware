import java.util.Scanner;
public class loginSession {
  public User currentUser=new User();
  public static void main(String[] args) {
        System.out.println("hey");

        loginSession remoteShell= new loginSession();
        Scanner userInput= new Scanner(System.in);
        System.out.print("Login$ ");
        String uName=userInput.nextLine();









        remoteShell.displayPrompt();


    }





   public void login(){};
   private boolean isUser(){
     //verify user account
     //return true if valid
   return true;   };
   public void decryptFolder(){};
   public void logOut(){};
   public void updateUserRecords(){};

   //move to the command class
   public void displayPrompt(){
      //System.out.print("home/<user>/$ ");
      var homeDir = System.getProperty("user.home");
      System.out.print(homeDir+"/$ ");

   };
}
