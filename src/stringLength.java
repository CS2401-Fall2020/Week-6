class stringLength{
  public static void main(String[] args){
    // note to use Java assertions, the `-ea`flag must be on in the JRE
    //   this can be done in your IDE's settings
    // These examples, from the assignment do not count towards your 10. 
    
    // Testing a mix of length and alpha sorting
    String[] test1 = {"DeBlasio","Gastelum","Flores","Alvorado","Berkowitz"};
    String[] test1correct = {"Flores","Alvorado","DeBlasio","Gastelum","Berkowitz"};
    mergeSortLengths(test1);
    for(int i=0; i<test1.length; i++) assert(test1[i].equals(test1correct[i]));
    
    // Testing only alpha sorting
    String[] test2 = {"AAAAA","BBBB","CCC","DD","E"};
    String[] test2correct = {"E", "DD", "CCC","BBBB","AAAAA"};
    mergeSortLengths(test2);
    for(int i=0; i<test2.length; i++) assert(test2[i].equals(test2correct[i]));

    // testing not there 
    String[] test3 = {"a","aaa","aaaaa"};
    String test3out = binarySearchLengths(test3,"bb",0,2);
    String test3correct = "(0,2) (0,0) False";
    assert(test3out.equals(test3correct));
    
    // testing alpha search
    String[] test4 = {"a","b","c","d","e","f","g"};
    String test4out = binarySearchLengths(test4,"e",0,6);
    String test4correct = "(0,6) (4,6) (4,4) True";
    assert(test4out.equals(test4correct));
  }
  
  public static void mergeSortLengths(String[] stringArray){
  
  }
  
  public static String binarySearchLengths(String[] inArray, String search, int start, int end){
    return null; // this should be deleted, it is here so the initial submission will compile. 
  }
}
