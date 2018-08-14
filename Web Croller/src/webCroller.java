import java.io.BufferedReader;    
 import java.io.IOException;    
 import java.io.InputStreamReader;    
 import java.io.FileWriter;    
 import java.io.BufferedWriter;    
 import java.net.HttpURLConnection;    
 import java.net.URL;    
 import java.net.SocketTimeoutException;    
 import java.net.UnknownHostException;    
 import java.util.ArrayList;    
 import java.util.regex.Matcher;    
 import java.util.regex.Pattern;    
 public class webCroller {    
     public static void main(String args[]) throws Exception    
     {    
         String url = null;    
         if (args.length > 0) {    
             url = args[0];    
             System.out.println(url);    
         }    
         else {    
             System.out.println("Please enter the URL as a command line parameter.");    
             return;    
         }    
         String content = getUrlContent(url);    
         ArrayList<String> links = getHyperlinks(content);    
         FileWriter fstream = new FileWriter("out.txt");    
         BufferedWriter out = new BufferedWriter(fstream);    
         int status;    
         for (int i = 0; i < links.size(); i++) {    
             url = (String) links.get(i);    
             System.out.println(url);    
             status = getHTTPResponseCode(url);    
             if (status != 200) {    
                 if (status > 0) {    
                     out.write(url + ", HTTP Response Code: " + status + "n");    
                 }    
                 else {    
                     out.write(url + ", Unknown Errorn");    
                 }    
             }                
         }    
         out.close();    
     }    
     private static ArrayList<String> getHyperlinks(String html)    
     {    
         ArrayList<String> links = new ArrayList<String>();    
         Pattern p = Pattern.compile("<a [^<>]*?href="(http.*?)"");    
         Matcher m = p.matcher(html);    
         while(m.find()) {    
             links.add(m.group(1));    
         }    
         p = Pattern.compile("<a [^<>]*?href='(http.*?)'");    
         m = p.matcher(html);    
         while(m.find()) {    
             links.add(m.group(1));    
         }    
         return links;    
     }    
     private static String getUrlContent(String targetUrl) throws Exception    
     {    
         HttpURLConnection connection = null;    
         BufferedReader br = null;    
         StringBuilder sb = null;    
         String line = null;    
         String content = null;    
         URL target = null;    
         try {    
             target = new URL(targetUrl);    
             connection = (HttpURLConnection)target.openConnection();    
             connection.setRequestMethod("GET");    
             connection.setReadTimeout(30 * 1000); // timeout 30 seconds    
             connection.connect();    
             br = new BufferedReader(new InputStreamReader(connection.getInputStream()));    
             sb = new StringBuilder();    
             while ((line = br.readLine()) != null) {    
                 sb.append(line);    
             }    
             content = sb.toString();    
         } catch (SocketTimeoutException e) {    
             System.out.println("Timed Out!");                
         } catch (UnknownHostException e) {    
             System.out.println("Unknown Host");    
         } catch (Exception e) {    
             System.out.println("Unknown Error");    
         }    
         finally {    
             connection.disconnect();    
             br = null;    
             sb = null;    
             connection = null;    
         }    
         return content;    
     }    
     private static int getHTTPResponseCode(String targetUrl) throws Exception    
     {    
         HttpURLConnection connection = null;    
         int response;    
         URL target = null;    
         try {    
             target = new URL(targetUrl);    
             connection = (HttpURLConnection)target.openConnection();    
             connection.setRequestMethod("GET");    
             connection.setReadTimeout(10 * 1000); // timeout 10 seconds    
             connection.connect();    
             response = ((HttpURLConnection) connection).getResponseCode();    
         } catch (SocketTimeoutException e) {    
             response = -100;    
         } catch (UnknownHostException e) {    
             response = -101;    
         }catch (Exception e) {    
             response = -102;    
         }    
         finally {    
             connection.disconnect();    
             connection = null;    
         }    
         return response;    
     }    
 } 