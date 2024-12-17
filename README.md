# httpclient-proxy

Update /etc/environment
export JAVA_TOOL_OPTIONS="-Dhttp.proxyHost=<replace_here> -Dhttp.proxyPort=<replace_here> -Dhttps.proxyHost=<replace_here> -Dhttps.proxyPort=<replace_here>"

java -cp demo-1.0-SNAPSHOT.jar com.example.httpclient.Main OR
java -jar demo-1.0-SNAPSHOT.jar 

java -cp demo-1.0-SNAPSHOT.jar com.example.httpclient.MainOrig