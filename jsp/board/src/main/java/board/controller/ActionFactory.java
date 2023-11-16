package board.controller;

import board.action.Action;
import board.action.BoardDeleteAction;
import board.action.BoardDetailAction;
import board.action.BoardListAction;
import board.action.BoardUpdateAction;
import board.action.BoardWriteAction;

public class ActionFactory {
	private ActionFactory() {
		
	}
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		// command로 받은(서블릿에서 받음)가지고 해당 명령처리하는 클래스를 찾음
		// 찾은 클래스를 객체 생성한 수 action에 담아서 리턴
		if(command.equals("listAll")) {
			action = new BoardListAction();
		} else if(command.equals("boardWrite")) {
			action = new BoardWriteAction();
		} else if(command.equals("boardDetail")) {
			action = new BoardDetailAction();
		} else if(command.equals("boardUpdate")) {
			action = new BoardUpdateAction();
		} else if(command.equals("boardDelete")) {
			action = new BoardDeleteAction();
		}
		
		return action;
	}
	
}
