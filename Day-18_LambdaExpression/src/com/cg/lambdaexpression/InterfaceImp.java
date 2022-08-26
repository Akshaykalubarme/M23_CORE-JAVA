package com.cg.lambdaexpression;

interface C
{
	//Lambda expression will works for functional impletational not for other implements
	void display();
	//void accept();
}
public class InterfaceImp {

	public static void main(String[] args) {
		// The target type of this expression must be a functional interface
		C obj=() ->
		{
			System.out.println("Funcational program on implements funcation interface using lambda");
		};
		obj.display();

	}

}
