To update to new version perform folowing steps:
 1. Download new version of opencv bundle from site vendor: http://opencv.org/
 2. Unpack zip and replace:
	2.1. dll and so native libraries in src/main/resources/META-INF/native corresponding to platform names and bits
	2.2. unpack contents of jar file to src/main/resources/
 3. Change version in pom to equal to version of opencv library
 4. Change version number in Loader.java  
 5. Build bundle by command:
	mvn clean install -DperformRelease=true deploy 