package day13_string;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "loop";
        System.out.println(str1);

        str1 = str1.toUpperCase(); // -> at this line -> it makes copy of "loop" in pool with value - "LOOP" and other value - "loop" will be lost in memory(it goes to garbage collection(method .finalize in Java 9(before Java 9 you was needed to call the method manually after 9 -> automatically), in java 18 was completely removed) -> 2 reasons of deletion of previous values: if your computer memory is full, or this value doesn't have any reference) --> string is immutable - you are not changing original value, you are actually making a new one
        System.out.println(str1);

        str1 = str1 + "camp";// I did a copy "LOOPcamp" and now im referencing to this new value in string pool, the previous value getting lost (deprecated -> garbage collection automatically removes the values from java)

        str1 = str1.toUpperCase(); // -> Here, `str1` is reassigned to a new value, "LOOP", in the string pool. The original value, "loop", is no longer referenced by `str1` and becomes eligible for garbage collection.
// Strings in Java are immutable, meaning the original value is not changed; instead, a new string object is created for "LOOP".
// In Java versions prior to Java 9, the `finalize()` method could be overridden to manage garbage collection, but from Java 9 onward, garbage collection is automatic. The `finalize()` method was removed entirely in Java 18 due to its inefficiencies.
        System.out.println(str1);

        str1 = str1 + "camp"; // Here, we create another new string, "LOOPcamp", and `str1` now references this value. The previous value, "LOOP", is unreferenced and becomes eligible for garbage collection.
// Java’s garbage collector will automatically remove unreferenced string objects when memory is needed, and strings in the pool without references may be cleaned up as well.
        System.out.println(str1);


        //Strings are immutable in Java; methods that seem to modify a string return a new string instance instead.
//Garbage collection: Objects with no references are eligible for garbage collection, freeing memory. This process is automatic and doesn't require manual intervention in modern Java versions.
//String pool: When you modify a string, Java often creates a new instance in the pool, and unreferenced values may eventually be cleaned up.
        }
}
