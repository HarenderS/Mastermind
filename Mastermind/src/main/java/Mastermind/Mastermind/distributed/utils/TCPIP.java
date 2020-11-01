package Mastermind.Mastermind.distributed.utils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import Mastermind.Mastermind.models.Error;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;

public class TCPIP extends Mastermind.utils.TCPIP{

	public TCPIP(Socket socket) {
		super(socket);
	}
	
	public TCPIP(ServerSocket serverSocket, Socket socket) {
		super(serverSocket, socket);
	}
	
	public static TCPIP createClientSocket() {
		try {
			Socket socket = new Socket("localhost", 8044);
			System.out.println("Cliente> Establecida conexion");
			return new TCPIP(socket);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static TCPIP createServerSocket() {
		try {
			ServerSocket serverSocket = new ServerSocket(8044);
			System.out.println("Servidor> Esperando conexion...");
			Socket socket = serverSocket.accept();
			System.out.println("Servidor> Recibida conexion de " + socket.getInetAddress().getHostAddress() + ":"
					+ socket.getPort());
			return new TCPIP(serverSocket, socket);
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public void send(Error value) {
		if (value == null) {
			this.send("null");
		}else {
			this.send(value.name());
		}
	}
	
	public Error receiveError() {
		String error = this.receiveLine();
		if (error.equals("null")) {
			return null;
		}
		return Error.valueOf(error);
	}
	
//	public void send(ProposedCombination proposedCombination) {
//		if (proposedCombination == null) {
//			this.send("null");
//		}else {
//			this.send(proposedCombination);
//		}
//	}
//	
//	public ProposedCombination receiveProposel() {
//		ProposedCombination proposel = (ProposedCombination) this.receiveObject();
//		assert proposel != null;
//		return proposel;
//	}
	
//	public void send(SecretCombination secretCombination) {
//		if (secretCombination == null) {
//			this.send("null");
//		}else {
//			this.send(secretCombination);
//		}
//	}
//
//	public SecretCombination receiveSecret() {
//		SecretCombination secret = (SecretCombination) this.receiveObject();
//		assert secret != null;
//		return secret;
//	}	

//	public void send(Result result) {
//		if (result == null) {
//			this.send("null");
//		}else {
//			this.send(result);
//		}
//	}
	
//	public Result receiveResult() {
//		Result result = (Result) this.receiveObject();
//		assert result != null;
//		return result;
//	}

	public void close() {
		this.send(FrameType.CLOSE.name());
		super.close();
	}	
	
}
