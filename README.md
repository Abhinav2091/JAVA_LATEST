# JAVA_LATEST

# JAVA-8

. introduction to lambda
. introduction to functional interface
. practice using lambda and java 8

# Parallel Stream

parallel stream is not always a good approach
it is build on Fork-Join Framework introduced in java 7
which is build upon ExecutorService framework

Parallel processing may be beneficial to fully utilize multiple cores.
But we also need to consider the overhead of managing multiple threads,
memory locality, splitting the source and merging the results.

# MultipleInhertance in default methods and problems

it will call the implement class method first
then the sub interface if any that extends the interface
and so on

# NOTE:

if we implement two Interface both have same method,
so it will give us compilation error.
the only way to resolve it is to override it in the class that
implements both interface.

# JAVA 9

# jshell

it is a REPL(Read Evaluate print loop)

# few basic jshell command

# to enter jshell

install java 9 atleast then open cmd
jshell -v --> to enter
/exit --> to exit
CTRL+L --> to clear screen
/import --> to check by default imported pacakage
/list --> to check list we just created or initiated
/list -all --> to check list we just created or initiated including errors and imports as well
/list {lineno/varaible name} --> to get specific value
eg: to get x and y we created above
/list x y
//run particular line snippet againg
/{snippet no}
/drop{line no/variable name} --> drop variable

# jsell shortcuts

CTRL+A --> begning of line
CTRL+E --> end of the line
ALT+B --> move left to one word
ALT+F --> move right to one word
CTRL+K --> delete next of cursor
ALT+D --> delete to next of the word
CTRL+W --> delete to the text from the cursor to previous white space
CTRL+y --> paste the most recentely deleted text in line
ALT+Y --> cycle previous deleted text

/edit className --> open jshell text editor for ease
/help set --> for help to set editior(customized editor)

# JAVA 9 modules

java --list-modules -->ti get list of modules

# will create three modules inside this project to utalized Modules functionality in java 9

producer
consumer
client

# NOTE:

although it seems like they are in same project different packages
but it is not instead these are modules created by me inside that package
to store it in a single repo

and we also need to creat module-info.java class in each module to consume it

we can also add dependency using pom file we have to clean,package and install using mvm
producer and consumer module
and add those dependency in client

# JAVA 10

Type Inference
where compiler infers the value at run time
can add final too
cannot assign null
var is not a key word
best practice: variable name is good

# JAVA 11

Epsilon GC -->only allocate memory, doesn't clear the heap memory
usefull for extremely short application where gc wil take time to run

enable Epsilon GC use below steps
edit run configuration
add this value in VM Option tab:-XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -verbose:gc
NOTE:if VM option is not available click modify option and add VM Option

# JAVA 12

although Switch expression is introduced in java 12 for some reason it was throwing
compile time error in intellij.
so have to download java 17 here.
reason:coz it was preview in java 12 but released in java 14

# JAVA 13

yield method in Switch expression is introduced

# JAVA 14

null pointer exception is more readable with specific position where we have null pointer exception.

Record somewhere similar to lombook with extra feature like
compact constructor
will override equals and hascode method for us

NOTE: it oppose data hiding