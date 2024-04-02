## For the command `cd`:

**1. With no arguments:**
   
![Image](cd-none.png)

Absolute path: ~/ (home directory)

This command with no outputs returns the working directory to the home directory. Since I was already in the home directory, it stays in the same place. This is not an error because it is an intended behavior.

**2. With directory argument:**

![Image](cd-dir.png)

Absolute path: ~/ (home directory)

This command moves the working directory to the specified directory in the argument as shown in the screenshot. This is NOT an error.

**3. With file argument:**

![Image](cd-file.png)

Absolute path: ~/lecture1

This command moves the working directory to the specified argument. However this is an ERROR because the argument points to a file and not a directory, which is why an error is shown in red.
  
