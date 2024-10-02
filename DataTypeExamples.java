class DataTypeExamples {
  public static void main(String[] args) {
    // Declare the variable with the fundamental data type.
    int zipCode;
    // Initialize the variable with the assignment statement. Assignment goes from right to left,
    // i.e. <variable> = <value>
    zipCode = 44236;
    System.out.println(zipCode);
    // You can condense the declaration - intialization into one line
    int enrollment = 440;
    System.out.println(enrollment);
    // The most fundamental data type is the boolean, which holds either a true or false value.
    boolean isMath = true;
    // note that the syntax of true and false is different in Java than in Python.
    System.out.println(isMath);
    boolean isHistory = false;
    System.out.println(isHistory);
    // Boolean variables, by convention, start with is or has before the next descriptor.

    // Floating point numbers can be of type float, but as a convention we use the double data type. 
    double phi = 1.61803399;
    System.out.println(phi);

    // A character is a primitive data type in Java and uses the single quote lines rather than the double.
    char alpha = 'a';

    /* Operations on the numeric data types are the standard +, -, *, and /. There is no built in
     * exponent operator as there is in Python. To get a power expression you need to use the Math.pow(<base>, <exponent>)
     * command and that returns a double.
     * The operators for boolean data types are not (syntax is ! before the variable or expression), and (syntax is &&
     * between the two expressions or variables), and or (syntax is || between the two expressions).
     */
    int product = 3 * 217;
    int factorial = 1*2*3*4*5*6*7; // note that operations can be performed before the assignment will occur. 

    boolean andResults1 = true && true;
    boolean andResults2 = true && false;
    boolean andResults3 = false && true;
    boolean andResults4 = false && false;

    System.out.println(andResults1 + "\n" + andResults2 + "\n" + andResults3 + "\n" + andResults4);

    boolean orResults1 = true || true;
    boolean orResults2 = true || false;
    boolean orResults3 = false || true;
    boolean orResults4 = false || false;

    System.out.println(orResults1 + "\n" + orResults2 + "\n" + orResults3 + "\n" + orResults4);

    // The not operator negates the current value of a boolean. 
    andResults1 = !andResults1;

    System.out.println(andResults1);
    
  }
}
