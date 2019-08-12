REM /*----------------------------------------------------------------------------------
REM Filename			: compile.bat
REM Programer			: Reinaldy Rahmadian
REM Date    			: 2016/04/29
REM Email				: Reinaldy.Rahmadian@gmail.com
REM Deskripsi			: mencompile program
REM ----------------------------------------------------------------------------------*/


cls
javac model\*.java
javac controller\*.java
javac view\*.java
javac Main.java
java Main