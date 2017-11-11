# PictureNaturalSorting

This little programming project came from a problem I encountered with the Costco photo printing website.
Our photographer who shot our wedding named the pictures in the following format.    
"John & Jane wedding photos 1"   
"John & Jane wedding photos 2"   
"John & Jane wedding photos 3...300"    
Picture 1 being the first picture he took and 300 being the last picture he took.

This looked fine in windows explorer but when uploaded to the Costco website I found picture it was ordered more like   
"John & Jane wedding photos 1"  
"John & Jane wedding photos 10"   
"John & Jane wedding photos 100"    
"John & Jane wedding photos 2"    

Like this blog post explains.
https://blog.codinghorror.com/sorting-for-humans-natural-sort-order/

We were trying to make a picture book and wanted all of the pictures in chronological order and this combined with 
poor design and the slow loading of the pictures and pages made have to scroll down many pages just to get pictures 7 
very time consuming.

To fix this I wanted to rename all of my pictures in the format AAA, AAB, ..., ABA, ABB   

First I had to write some code to generate the array for me that is the Java file.   

Then I had to rename the files. I was going to rename them in java but I already had some powershell code for   
renaming file that I could use. 

I ran into one more problem however, in powershell when I was getting a list of all files to rename it was ordering them 
in ASCII order..... 

I then had to modify the powershell code to sort all of the files naturally 
so Picture AAA would be the first and AAJ would be picture 10.

Reupload to the Costco website and finding the correct pictures was much easier.
