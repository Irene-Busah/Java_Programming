# Java File Handling

In Java programming, file handling is an important part of any application.
The programming language provides several methods for creating, reading, writing and 
deleting a file.

The File class from java.io package allows us to work with files. Therefore, to use this class,
we need to create an object of the class and specify the file name or directory.
The createNewFile() method of the File class is used to create the new file. The method returns
a boolean: true, if the file is created successfully and false, if the file already exist.

To write data into a file, we use the FileWriter class and write() method to achieve that. It is 
advisable close the file after writing the data to the file using close() method.
