#!/bin/bash

# find com grep é pra acahr os diretorios dos .class e .java dentro de com/

rm $(find com/ -name "*.class" | grep "ClientePlugParaTomada3Pinos");
javac $(find com/ -name "*.java" | grep "ClientePlugParaTomada3Pinos");

echo "classes compiladas"
find com/ -name "*.class" | grep "ClientePlugParaTomada3Pinos";

echo "rodando ClientePlugParaTomada3Pinos"
java $(find com/ -name "*.class" | grep "ClientePlugParaTomada3Pinos" | sed -e s/.class//)
