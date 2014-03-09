package main.scala.removeCharactersFromString

//TODO: use hash table for chars to remove -> no need to use contains - which cycles through remove -> reduces from O(mn) to O(n)
class RemoveCharactersFromString {
   def removeChars (str : String, remove : String) = {
     var strChar = str.toCharArray;
     var write = 0;

     for (read <- 0.to(str.length - 1)) {
       if(!remove.contains(str.charAt(read))) {
         strChar(write) = strChar(read);
         write += 1;
       }
     }

     new String(strChar).substring(0, write);
   }
}
