## What is the best way to tell if a character is a letter or number in Java without using regexes?

Out of box
Character.isAlphabetic('a')
Character.isDigit('a')
Character.isLetter('a')

Custom code:
char c = ''
if  (c>='a'&& c<='z') || (c>='A' && c<'Z') || c>='0' && c<='9'){
return true;
}

============================================

## Printing string back from char array 

Out of box:
new String(strChars);

Custom code:
String fa="";
for(int i;i<ca.length;i++){
   fa+=ca[i];
}

============================================

## Sort and array 

out of box:
Arrays.sort(arr);

Custom code: Bubble sort On2 
for(int j=0;j<a.length;j++){
   for(int i;i<a.length-j-1;i++){
      if(a[i]>a[i+1]){
        int swap = a[i];
        a[i] = a[i+1];
        a[i+1] = swap;
      }
   }
}