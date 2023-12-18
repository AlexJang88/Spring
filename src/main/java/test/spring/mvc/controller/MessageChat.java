package test.spring.mvc.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.json.JsonObject;

import com.nhncorp.mods.socket.io.SocketIOServer;
import com.nhncorp.mods.socket.io.SocketIOSocket;
import com.nhncorp.mods.socket.io.impl.DefaultSocketIOServer;
import com.nhncorp.mods.socket.io.spring.DefaultEmbeddableVerticle;

public class MessageChat extends DefaultEmbeddableVerticle{

	private SocketIOServer io = null;
	
	@Override
	public void start(Vertx arg0) {
			
			HttpServer server = arg0.createHttpServer(); //서버 생성
			io = new DefaultSocketIOServer(arg0, server);
			io.sockets().onConnection(new Handler<SocketIOSocket>() {
				
				@Override
				public void handle(SocketIOSocket socket) {
					socket.on("chatMsg",new Handler<JsonObject>() {
						public void handle(JsonObject event) {
						//  대화 내용 처리
							System.out.println(event.getString("msg"));
							String msg = event.getString("msg");
							System.out.println(event.getString("id"));
							System.out.println();
							String path = "D:\\springdev\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\spring\\resources\\file\\chat\\";
							String id = event.getString("id");
							String fullname = path+id+".txt";
							if(!id.equals("") && id.length()>0) {
							File file = new File(path+id+".txt");
							try {
							if(!file.exists()) {
									file.createNewFile();
								}	
								FileWriter fw=new FileWriter(file,true);
								BufferedWriter writer = new BufferedWriter(fw);
								writer.write(msg+"\r\n");
								writer.close();
								}catch (IOException e) {
								e.printStackTrace();
							}
							}
							
							
						//	event.getString("msg");    //받은 대화 내용
						//  연결된 모든 사용자에게 대화 보내기
							io.sockets().emit("response",event);
						}
					});
				};
			});
			server.listen(9999);//서버스타트
	}
	
}
