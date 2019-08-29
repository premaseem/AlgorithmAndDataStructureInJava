## What is the best way to tell if a character is a letter or number in Java without using regexes?

Out of the box:

    Character.isAlphabetic('a')
    Character.isDigit('a')
    Character.isLetter('a')

Custom code:

    char c = ''
    if  (c>='a'&& c<='z') || (c>='A' && c<'Z') || c>='0' && c<='9'){
    return true;
    }

============================================

## Printing string from char array 

Out of the box:

    new String(strChars);

Custom code:

    String fa="";
    for(int i;i<ca.length;i++){
       fa+=ca[i];
    }

============================================

## Sort and array 

Out of the box:

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

============================================

## Convert array int[] to Array List 

Out of the box: (in datatype is Integer and not int)

    Integer[] arr = new Integer[] {2,3,4,5,3,3}
    List<Integer> int = Arrays.asList(arr);

Custom Code:

        char[] ca = s.toCharArray();
        List<Character> lst = new ArrayList<>();
        for(char c: ca){
            lst.add(c);
        }  

============================================

## Find second occurance of char in string

        for (Character c: s.toCharArray()){
            int first = s.indexOf(c);
            int second = s.indexOf(c, first + 1);
            if(second == -1){
                System.out.println(c);
                return c;
            }
        }
        
============================================
## Count number of occurance of char in string

Custom Code:

     String line = "a.b.c.d";
     int count = line.length() - line.replace(".", "").length();

============================================
## Recursion 
Custom Code:
  
    static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n-1);
    }


============================================
## Initializing 2 D array 
Out of the box:

    int[][] TwoDarray  =  {  
            {  1,  0, 12, -1 },
            {  7, -3,  2,  5 },
            { -5, -2,  2, -9 }
    };
    
Custom Code:

     for (int i = 0; i < row.length; i++) {
         for (int i = 0; i < col.length; i++) {
             arr[row][col] = data;
         }
     }

============================================
## Find Tail or last element in linked list 
Out of the box:
    
    LinkedList.getLast();        
        
Custom Code:

    // Iterate through list until last node's current is null
    while (current.next != null) {
        current = current.next;
    }


Custom Code:
============================================
Out of the box:

Custom Code:
============================================