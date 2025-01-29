/**************************************************************************************************
    
    QUESTIONS ON hello World Progarm

----------------------------------------------------------------------------------------------------

1.Describe what happens if, in HelloWorld.java, you omit

    a.main - The program will compile successfully, but when you try to run it, the JVM throws an error:
            Error: Main method not found in class HelloWorld, please define the main method as:
            public static void main(String[] args)

            Reason : The JVM requires a method named main with the exact signature public static void main(String[] args) to start execution.
                      Without main, the JVM doesn’t know where to begin.
    
    b.String - We can compile the code with different name , but when execute it , throws an error:
                Error: Main method not found in class Practical_questions, please define the main method as:
                public static void main(String[] args)
                or a JavaFX application class must extend javafx.application.Application

    c. HelloWorld - Empty line prints
    d. System.out - error: cannot find symbol
                            println("");
                            symbol:   method println(String)
                            location: class Practical_questions
    e. println - error: <identifier> expected
                        System.out.("");

    Omission	Effect
        main	    -> Runtime error: JVM cannot find the starting point of the program.
        String	    -> Compilation error: args type is undefined, as String specifies the data type for command-line arguments.
        HelloWorld	-> Compilation error: Missing class name makes the file invalid.
        System.out	-> Compilation error: println cannot be found because it belongs to System.out.
        println	    -> Compilation error: System.out must call a valid method like println or print. 


---------------------------------------------------------------------------------------------------------------------------------

2. Describe what happens if, in HelloWorld.java, you omit

    a. the ;
    b. the first "
    c. the second "
    d. the first {
    e. the second {
    f. the first }
    g. the second } 

Omission	Effect
Semicolon (;)	-> Compilation error: ';' expected.
First "	        -> Compilation error: unclosed string literal.
Second "	    -> Compilation error: unclosed string literal.
First {	        -> Compilation error: '{ expected'.
Second {	    -> Compilation error: '{ expected'.
First }	        -> Compilation error: reached end of file while parsing.
Second }	    -> Compilation error: reached end of file while parsing.

---------------------------------------------------------------------------------------------------------


 ********************************************************************************************************/

public class Practical_questions{
    public static void main(String[] args){
        System.out.("");
    }
}