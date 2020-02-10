# libmapper_bitwig
A libmapper controller extension for Bitwig

## Compile and install
* Compile and install libmapper with Java bindings
  - For macOS mojave the .jni header has moved.
  - On my system it worked by running this before autogen.sh (I'm using fish) `set -x JAVA_HOME /usr/local/opt/openjdk/libexec/openjdk.jdk/Contents/Home`
* Install maven
```
brew install maven
```
* Compile
```
mvn install
```
* Move to libmapper.bwextension to Bitwig Extensions folder
