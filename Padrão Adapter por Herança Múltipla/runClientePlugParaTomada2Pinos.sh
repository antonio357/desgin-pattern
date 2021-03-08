#!/bin/bash

# find com grep é pra acahr os diretorios dos .class e .java dentro de com/

rm $(find com/ -name "*.class" | grep "Int");
javac $(find com/ -name "*.java" | grep "Int");

rm $(find com/ -name "*.class" | grep "Ada");
javac $(find com/ -name "*.java" | grep "Ada");

rm $(find com/ -name "*.class" | grep "ClientePlugParaTomada2Pinos");
javac $(find com/ -name "*.java" | grep "ClientePlugParaTomada2Pinos");

echo "classes compiladas"
find com/ -name "*.class" | grep "ClientePlugParaTomada2Pinos";
find com/ -name "*.class" | grep "Int";
find com/ -name "*.class" | grep "Ada";

echo "rodando ClientePlugParaTomada2Pinos"
java $(find com/ -name "*.class" | grep "ClientePlugParaTomada2Pinos" | sed -e s/.class//)
