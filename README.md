# java_tutorial
1: Requirement
    Ubuntu 14.04
    jdk 1.8 or about
2: Install 
    1: install java
        http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    2: edit your ~/.bashrc.
        # add the function to file
        function wxj(){
            echo 'compiling file' $1;
            javac $1;
            echo '-----------compiling complete----------'
            name=$1
            left=0
            right=${#name}-5
            result=${name:0:right}
            java $result;
            echo '-------------running complete----------'
        # after editing your .bashrc file, run command
        $source ~/.bashrc
    3: write your own <filename>.java file or download the tutorial file
    4: wxj <filename>.java
3: Learn java in this order:
    # Basic tutorial
        01: HelloWorld.java         A basic Example, How to print result on your screen
        02: Comments.java           How to use comment
        03: Defination.java         How to definate a variant
        04: BasicOperation.java     Basic Operation
        05: IfElse.java             if else 
        06: SwitchCase.java         Switch case
        07: Iterate.java            How to iterate a loop (for, while, do)
        08: IterateControl.java     Special iterate loop control operation (continue and break)
        09: BasicArray.java              The array variable
        10: BasicClass.java         Basic class and function 
        11: Inheritance.java        inheritance other class, how to Override and Overload
        12: UserSuper.java          Hot to use super to use the function of father class or inherite the constructor of father class
        13: Package.java            The use of package
        14: PackageAccess.java      Control the access of properties and other decoration such as static, final, abstract
        15: Interface.java          The interface

    # tutorial grouped by type
        RegularMatch.java           User Regex match
