To run this project, you need to follow these steps in order:
- Set up the environment:
  +Note: Ensure you have installed SQL Server Management Studio (SSMS) and have an "sa" account with the password "sapassword".
  +First, after downloading the project from Git, open it using an IDE to open. 
  *IntelliJ is recommended (download link: https://www.jetbrains.com/idea/download/?section=windows; note that the Community version is free).
  +Next, open IntelliJ and simultaneously open the two folders within the project, mavenprojectClient and mavenprojectServer, in two separate windows.
  
- Modify the configuration:
  +In the IntelliJ window with the mavenprojectServer folder open, locate the RmiConfig file by navigating to: mavenprojectServer -> src -> main -> java -> url -> RmiConfig.
  +Edit the value of the RMI_URL variable to your device IP address.
   For example, if your device IP address is 192.168.8.36, update the RMI_URL value to "rmi://192.168.8.36:7878/" (public static final String RMI_URL = "rmi://192.168.8.36:7878/";).
  *To find your IP address: Open the terminal, type ipconfig, and the value of the IPv4 Address line is your IP address.
  +Similarly, edit the RmiConfig file in the mavenprojectClient folder.
  
- Run the project:
  +In the IntelliJ window with the mavenprojectServer folder open,
   locate the Server file by navigating to: mavenprojectServer -> src -> main -> java -> server -> Server. Press (Shift + F10) or the Run button to start the project.
   Wait about 5 seconds; if the "Run" dialog shows the message "Server is running...", the server has been successfully started.
  +In the IntelliJ window with the mavenprojectClient folder open,
   locate the Client file by navigating to: mavenprojectClient -> src -> main -> java -> Client. Press (Shift + F10) or the Run button to start the project.
   Wait about 5 seconds; if the application interface appears, the application has been successfully launched.
