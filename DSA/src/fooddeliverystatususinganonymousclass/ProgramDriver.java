package fooddeliverystatususinganonymousclass;

public class ProgramDriver {
//	USING ANONYMUS CLASSES
	public static void processOrder(OrderStatus orderStatus, String orderid) {
		orderStatus.updateStatus(orderid);
	}
	public static void main(String[] args) {
		
		String orderid = "ORD101";
		
//		OrderStatus ordPlaced = new OrderStatus() {
//			@Override
//			public void updateStatus(String orderid) {
//				System.out.println("Order id : "+orderid);
//				System.out.println("STATUS : ORDER PLACED ");
//			}			
//		};
//		OrderStatus ordPreparing = new OrderStatus() {
//			@Override
//			public void updateStatus(String orderid) {
//				System.out.println("Order id : "+orderid);
//				System.out.println("STATUS : FOOD PREPARING ");
//			}
//		};
//		OrderStatus ordontheway = new OrderStatus() {
//			@Override
//			public void updateStatus(String orderid) {
//				System.out.println("Order id : "+orderid);
//				System.out.println("STATUS : DELIVERY PARTNER IS ON THE WAY ");
//			}
//		};
		
//		USING LAMBDA EXPRESSION
		OrderStatus ordPlaced = (String orderId) -> {
				System.out.println("Order id : "+orderId);
				System.out.println("STATUS : ORDER PLACED ");		
		};
		OrderStatus ordPreparing = (String orderId) ->  {
				System.out.println("Order id : "+orderId);
				System.out.println("STATUS : FOOD PREPARING ");
		};
		OrderStatus ordontheway = (String orderId) ->{
				System.out.println("Order id : "+orderId);
				System.out.println("STATUS : DELIVERY PARTNER IS ON THE WAY ");
		};
		processOrder(ordPlaced,orderid);
		processOrder(ordPreparing,orderid);
		processOrder(ordontheway,orderid);
	}

	

	
	
}
