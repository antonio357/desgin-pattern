#!/bin/bash

rm $(find -name "*.java")
echo "removed all .java"
cp $(find ../ -name "*.java") .
echo "copied all .java files"

for file in *.java; do 
    line=`grep -n "package" $file | cut -d: -f1` 
    sed -i $line'd' ./$file
done
echo "removed the package statement from all .java files"
rm $(find -name "*.jar")
echo "removed all .jar files"
rm $(find -name "*.class")
echo "removed all .class files"
javac *.java
echo "compiled all .java files"
jar -cfvm SistemaPostagemObserver.jar manifest.MF $(find -name "*.class" | cut -c 3-)
echo "created SistemaPostagemObserver.jar"
cat testsIn.txt | java -jar SistemaPostagemObserver.jar > testsOut.txt
