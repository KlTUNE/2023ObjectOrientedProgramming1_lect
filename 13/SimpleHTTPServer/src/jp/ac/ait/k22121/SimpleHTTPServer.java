package jp.ac.ait.k22121;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleHTTPServer extends Thread{
    java.net.Socket socket;
    public SimpleHTTPServer(Socket s) {
        socket = s;
    }

    @Override
    public void run() {
        String html;

        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)){
            String requests = in.readLine();
            String[] request = requests.split(" ", -1);

            if (request[0].equals("GET")) {
                System.out.println(request[1]);
                String[] path = null;

                try {
                    path = request[1].split("\\.", -1);

                    if (path[1].equals("css")) {
                        html = "www" + request[1];
                        try (BufferedReader br = Files.newBufferedReader(Paths.get(html))) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                out.println(line);
                            }
                        } catch (IOException ee) {
                            throw new UncheckedIOException(ee);
                        }
                    }
                    else if (path[1].equals("js")) {
                        html = "www" + request[1];
                        try (BufferedReader br = Files.newBufferedReader(Paths.get(html))) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                out.println(line);
                            }
                        } catch (IOException ee) {
                            throw new UncheckedIOException(ee);
                        }
                    }
                    else if (path[1].equals("html")) {
                        html = "www" + request[1];
                        try (BufferedReader br = Files.newBufferedReader(Paths.get(html))) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                out.println(line);
                            }
                        } catch (IOException ee) {
                            throw new UncheckedIOException(ee);
                        }
                    }
                } catch (Exception e){
                    html = "www/index.html";
                    try (BufferedReader br = Files.newBufferedReader(Paths.get(html))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            out.println(line);
                        }
                    } catch (IOException ee) {
                        throw new UncheckedIOException(ee);
                    }
                }
            }
            socket.close();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {

        try (ServerSocket ss = new ServerSocket(8088)) {
            while (true) {
                Socket s = ss.accept();
                System.out.printf("クライアントからの接続: %s:%d\n", s.getInetAddress(), s.getPort());
                SimpleHTTPServer app = new SimpleHTTPServer(s);
                app.start();
            }
        }
    }
}
