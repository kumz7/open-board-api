package com.open.board.log;

public class Logger {
	public static <L>void Log(L log) {
		System.out.print("\n\n\n**************");
		if(log instanceof Exception)
			System.err.println(((Exception)log).getMessage()); 
		else
			System.err.println(log);
		System.out.print("**************\n\n\n"); 
	}
}
