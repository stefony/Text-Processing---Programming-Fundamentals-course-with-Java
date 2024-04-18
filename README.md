# Text-Processing---Programming-Fundamentals-course-with-Java
Courses from my education Java fundamental  in @SoftUni


Problems for exercises Text Processing

1.	Reverse Strings
You will be given a series of strings until you receive an "end" command. Write a program that reverses strings and prints each pair on a separate line in the format "{word} = {reversed word}".
2.	Repeat Strings
Write a Program That Reads an Array of Strings. Each String is Repeated N Times, Where N is the length of the String. Print the Concatenated String.

3.	Substring
On the first line, you will receive a string. On the second line, you will receive a second string. Write a program that removes all of the occurrences of the first String in the second until there is no match. At the end, print the remaining String.
4.	Text Filter
Write a program that takes a text and a string of banned words. All words included in the ban list should be replaced with asterisks "*", equal to the word's length. The entries in the ban list will be separated by a comma and space ", ".
The ban list should be entered on the first input line and the text on the second input line. 
5.	Digits, Letters and Other
Write a program that receives a single string and on the first line prints all the digits, on the second – all the letters, and on the third – all the other characters. There will always be at least one digit, one letter, and another character.
6.	Valid Usernames
Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames. 
A valid username is:
•	Has a length of between 3 and 16 characters.
•	It contains only letters, numbers, hyphens, and underscores.
7.	Character Multiplier
Create a method that takes two strings as arguments and returns the sum of their character codes multiplied (multiply str1[0] with str2[0] and add to the total sum). Then continue with the next two characters. If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
8.	Extract File
Write a program that reads the path to a file and subtracts the file name and its extension.
9.	Caesar Cipher
Write a program that returns an encrypted version of the same text. Encrypt the text by shifting each character with three positions forward. For example, A would be replaced by D, B would become E, and so on. Print the encrypted text.
10.	Multiply Big Number
You are given two lines – the first one can be a really big number (0 to 1050). The second one will be a single-digit number (0 to 9). You must display the product of these numbers.
Note: do not use the BigInteger class.
11.	Replace Repeating Chars
Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.
12.	String Explosion
Explosions are marked with ">". Immediately after the mark, there will be an integer, which signifies the strength of the explosion.
You should remove x characters (where x is the strength of the explosion), starting after the punched character (">").
If you find another explosion mark (">") while you're deleting characters, you should add the strength to your previous explosion.
When all characters are processed, print the string without the deleted characters. 
You should not delete the explosion character – ">", but you should delete the integers, which represent the strength.
13.	Letters Change Numbers
Nakov likes Math. But he also likes the English alphabet a lot. He invented a game with numbers and letters from the English alphabet. The game was simple. You get a string consisting of a number between two letters. Whether the letter was in front of the number or after it, you would perform different mathematical operations on the number to achieve the result.
First, you start with the letter before the number. 
•	If it's uppercase, you divide the number by the letter's position in the alphabet. 
•	If it's lowercase, you multiply the number with the letter's position in the alphabet. 
Then you move to the letter after the number. 
•	If it's uppercase, you subtract its position from the resulted number.
•	If it's lowercase, you add its position to the resulted number.
But the game became too easy for Nakov was really quick. He complicated it a bit by doing the same but with multiple strings keeping track of only the total sum of all results. Once he started to solve this with more strings and bigger numbers, it became quite hard to do it only in his mind. So he kindly asks you to write a program that calculates the sum of all numbers after the operations on each number have been done.



