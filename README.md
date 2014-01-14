unix-tools
==========

This is Repo for different unix-tools.

##WC
    This is Word Count unix tool,which counts number of words,characters and lines.

WC filename

This will give number of lines,words,characters

For Example :- `WC names.txt` will give `14 49 278 names.txt` as an output.

##Head
    This is head tool,which by default displays top 10 lines of file.

1. head filename

    This will give top 10 lines from the file given

    For Example :- `head names.txt` will display 10 lines from `names.txt` file.
    
2. head [no. of lines] filename 
    
    This will give the no. of lines specified in options

    For Example :- `head -5 names.txt` will  display top 5 lines from `names.txt` file.
    

##Tail
    This is tail tool,which by default displays bottom 10 lines of file.

1. tail filename

    This will give bottom 10 lines from the file given

    For Example :- `tail names.txt` will display 10 lines from `names.txt` file.
    
2. tail [no. of lines] filename 
    
    This will give the no. of lines specified in options

    For Example :- `tail -5 names.txt` will  display bottom 5 lines from `names.txt` file.
    
##Uniq
    This is uniq tool,which discards all but one of successive identical lines from input
    
uniq filename

This will display all lines in file and discards duplicate lines in it if present.

For Example :- `uniq names.txt` will give all unique lines in `names.txt` file.
    
##Cut
    This is cut tool,which cuts and gives the output according to given option
    
1. cut -f[fieldno.] filename
    
    This will display the contents of specified field

    For Example :- `cut -f1 names.txt` will display the content in 1st field of `names.txt` file.
    
2. cut -d[delimiter] filename
    
    This will display contents cut by given delimeter

    For Example :- `cut -d" " names.txt` will display contents with single space from `names.txt`
    
3. cut -f[fieldno.] -d[delimeter] filename
    
    This will display specified field contents with given delimeter

    For Example :- `cut -f2 -d" " names.txt` will display contents of 2nd field with single space.
    
##Sort
    This is sort tool, which sorts the given content with given option.
    
1. sort filename
    
    This will give all content in the file in sorted order.

    For Example :- `sort names.txt` will display all contents from `names.txt` file in sorted order.
    
2. sort [option] filename
    
    This will sort and display contents by given option

    For Example :- `sort -r names.txt` will display all contents from `names.txt` file in reverse order.


##ReduceSpace
    This reduces multiple spaces from file and replaces it with single space and writes back to different file.
    
reducespace filename

This will reduce multiple spaces in given file if present and writes it back to different file with single space

For Example :- `reducespace names.txt` will reduce all multiple spaces from file `names.txt` and writes it back to different file 
