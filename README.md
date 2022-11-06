# 151Lab3

In this project,
You will ask the user to type in their full name (i.e, their first, middle and last name) and convert it to a
String consisting of their last name followed by the initials of their first and middle names (we’ll
call this the standard format). 

So for example if the user types in Patrick Jayson Ekeu
you will create and output a String with the value "Ekeu, P.J.". 

To make things a little trickier, you will also handle the case when someone has more than one middle name. 
So for example if the user types in
John Ronald Reuel Tolkien
or
Kiefer William Frederick Dempsey George Rufus Sutherland,
you will create and output the strings "Tolkien, J.R." and "Sutherland, K.W.". 

Notice in both cases you ignore all but the first, second and last names when converting the string to the standard
format (and yes, that is actor Kiefer Sutherland’s real full name).
You should use the nextLine() method to read in the input and then use the indexOf(),
lastIndexOf() and substring() methods in the String class to create the standard format
string. You may assume that the user always types in at least three names. Note: even if you know
how to use if statements you should NOT use them for this lab.
