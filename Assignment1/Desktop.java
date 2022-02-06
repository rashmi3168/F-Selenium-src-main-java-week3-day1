package org.system;

public class Desktop {
	public void desktopSize() {
		System.out.println("Desktop Size:-19.5 inches");
	}
	public static void main(String[] args) {
		Computer comp=new Computer();
		Desktop desk=new Desktop();
		comp.computerModel();
		desk.desktopSize();

	}

}
