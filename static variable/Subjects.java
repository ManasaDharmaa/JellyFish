class Subjects{
	
static int cPrograming = 95;
static int java = 80;
static int DBMS = 90;
static int web = 88;
static int DS = 78;

static char outstanding = 'S';
static char excellent = 'A';
static char Good = 'B';
static char average= 'C';
static char fail = 'F';

public static void main(String [] args){
	
   System.out.println("marks of the c : " + cPrograming);
   System.out.println("marks of the java : " + java);
   System.out.println("marks of the DBMS : " + DBMS);
   System.out.println("marks of the web : " + web);
   System.out.println("marks of the DS : " + DS);
   
   System.out.println("Gread of the 90-100 marks : " + outstanding);
   System.out.println("Gread of the 70-89 marks : " + excellent);
   System.out.println("Gread of the 50-69 marks : " + Good);
   System.out.println("Gread of the 30-49 marks : " + average);
   System.out.println("Gread of the 0-29 marks : " + fail);
}
}