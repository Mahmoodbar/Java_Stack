import java.io.*;

// public class StringManipulator {
//     public static String trimAndConcat(String str1, String str2){
//     return str1.trim() + str2.trim();
//     }


//     public static void main(String[] args) {
// StringManipulator manipulator = new StringManipulator();
// String str = manipulator.trimAndConcat("    Hello     ","     World    ");
// System.out.println(str); 
//     }
// }

//     public class StringManipulator {
//         public static Integer getIndexOrNull( String str , char x){
//             return (str.indexOf(x));
//         }

    

//     public static void main ( String[] args) {
// StringManipulator manipulator = new StringManipulator();
// char letter = 'o';
// Integer a = manipulator.getIndexOrNull("Coding", letter);
// Integer b = manipulator.getIndexOrNull("Hello World", letter);
// Integer c = manipulator.getIndexOrNull("Hi", letter);
// System.out.println(a); // 1
// System.out.println(b); // 4
// System.out.println(c); // null
//     }
//     }

//     public class StringManipulator {
//         public static Integer getIndexOrNull (String str1 , String str2){

        
//         return (str1.indexOf(str2));
//         }
    

//     public static void main ( String[] args) {

// StringManipulator manipulator = new StringManipulator();
// String word = "Hello";
// String subString = "llo";
// String notSubString = "world";
// Integer a = manipulator.getIndexOrNull(word, subString);
// Integer b = manipulator.getIndexOrNull(word, notSubString);
// System.out.println(a); // 2
// System.out.println(b); // null
//     }
//     }



  public class StringManipulator {

 public static String concatSubstring (String str1 , int in1, int in2 , String str2){
     return str1.charAt(in1)+str2;
 }
 public static void main ( String[] args){ 

 
StringManipulator manipulator = new StringManipulator();
String word = manipulator.concatSubstring("Hello", 1, 2, "world");
System.out.println(word); // eworld
}
}
  