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

