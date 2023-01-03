package DemoMethodReference;

public class DemoMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Itest ob1 =  Display::new;
		 ob1.dis(5);//Con_Body_is_executed
		 Display d = new Display(123);//Con_call
		 Itest ob2 = d :: m1; //Reference to Instancemethod
		 ob2.dis(300);//Instance_method_body_is_executed
		 Itest ob3 = Display :: m2;//Reference to Staticmethod
		 ob3.dis(400);

	}

}
