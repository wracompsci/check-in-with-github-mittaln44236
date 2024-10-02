class DoubleDataType {
   public static void main(String[] args) {
      /* There are issues with declaring and assigning the double data type, and int type.
       * A double is a larger data type than an int which means it holds more values. 
       * When you operate on a double and an int, the result will always be set as a double.
       */
     double archimedesPi = 22.0/7;
     System.out.println(archimedesPi);

     double chinesePi = 355/113.0;
     System.out.println(chinesePi);

     System.out.println("Stored pi: " + Math.PI());

     /* If we operate on two int values then the result will be an int.
      * In Python, we had the / for floating point results and the // for int results.
      * There is not a direct way to do this in Java.
      */
     double badPi = 22/7;
     System.out.println(badPi);

     /* If we try to declare an int and operate on at least one double,
      * we will get a loss of precision error.
      */
     int noWay = 22.0 / 7;
     System.out.println(noWay);
   }
}
