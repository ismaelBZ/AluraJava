## Configure the environment

    - To run the JDK, first needs to configure the machine environment to run jkd's commands, to do that follow the steps above:
        - Copy the bin jdk path, common is c://arquivos de programas/java/jdk_v/bin/
        - Add the path to system variables in, windows - control pannel - system - advanced system settings - environment variables - system variables - path (c://oracle/java/...) - edit - new - paste path

## First knowledges

    - Java is c derivated language, so it need a complex structure
    - All statements in Java needs semicolon
    - All Java program need the same name as the class inside
    - All classes need to start with uppercase letter
    - All code in java need's to be inside a class
    - Main method is required in every code and any method inside it will be executed
    - In cmd-prompt javac filename.java -> compile file -> filename.class
    - In cmd-prompt java filename -> run filename.class (bytecode)

## Bits anda Bytes                                             Primitives Data Types

    1 bit   = 0 ou 1    =   2^1     -> 2 opções possíveis           (boolean)
    1 byte  = 8 bits    =   2^8     -> 256 combinações              (byte)
    2 bytes = 16 bits   =   2^16    -> 65536 combinações            (short)(char)
    4 bytes = 32bits    =   2^32    -> +2Bilhões combinações        (int)(float)
    8 bytes = 64bits    =   2^64    -> +1Quintilhão Combinações     (long)(double)


    1KB =   2^10    = 1.024 bytes
    1MB =   2^20    = 1.048.576 bytes
    1GB =   2^30    = 1.073.741.824 bytes

## VsCode configs

    - Instal Extension Pack for Java
    - On extensions tab look for Debugger for Java Extension, acess extension settings and change de debugger console to internal console
