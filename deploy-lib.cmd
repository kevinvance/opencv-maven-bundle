mvn deploy:deploy-file ^
  -DgroupId=org.opencv ^
  -DartifactId=opencv-java ^
  -Dversion=2.4.9 ^
  -Dpackaging=jar ^
  -Dfile=lib\opencv-249.jar ^
  -DrepositoryId=kamis-repo ^
  -Durl=ftp://spb.kamis.ru
