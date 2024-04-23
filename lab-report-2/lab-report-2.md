# CSE 15L Lab Report #2 - Cory Chung

## Part 1:

**ChatServer.java**

![Image](code.png)

**Screenshot 1**

![Image](ss1.png)

*Which methods in your code are called? What are the relevant arguments to those methods, and the values of any relevant fields of the class? How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.*

The method that is immediately called in the code is `handleRequest`. This runs the if statement which checks for `/add-message` which, if true, triggers the splitting process. First the `url.getQuery` is split into two separate parameters separated by `&`, which would put the `splitUserAndMessage` String array into two items, with the first item in the Array being `s=This is a test!` and `user=Cory`. Then these two items are further split into `msgString` and `userString` by removing everything before the `=` symbol. Thus `msgString` becomes `This is a test!` and `userString` becomes `Cory`.

Finally, these two strings are added to a previously declared array list called `chatHistory` which logs every past and current chat message. the `toPrint` string converts `chatHistory` into a legible preview and then returns it for the webpage to print out. So here, `chatHistory` and `toPrint` would show the same message, `Cory: This is a test!`, since there is only one message in the "history".

**Screenshot 2**

![Image](ss2.png)

*Which methods in your code are called? What are the relevant arguments to those methods, and the values of any relevant fields of the class? How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.*

Going off of the previous message, the code would trigger `handleRequest` and then create `splitUserAndMessage` which splits the `getQuery()` method into two items, `s=I am a fish` and `user=Dory`. Then `msgString` and `userString` contain `"I am a fish"` and `"Dory"` respectively after splitting once again. Then this message would be added to `chatHistory`, which now contains two items, this one and the previous message from Screenshot 1.

Finally, these message are added to `toPrint` by iterating over `chatHistory` and then returned. The contents of `toPrint` match what is shown in Screenshot 2 above.
