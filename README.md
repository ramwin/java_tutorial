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
