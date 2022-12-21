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



