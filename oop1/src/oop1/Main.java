package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Delonghi Kahve Makinsi");
		product.setDiscount(7);
		product.setImageUrl("image1.jpeg");
		product.setUnitPrice(7500);
		product.setUnitsInStock(3);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinsi");
		product2.setDiscount(7);
		product2.setImageUrl("image2.jpeg");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinsi");
		product3.setDiscount(7);
		product3.setImageUrl("image3.jpeg");
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		
		Product[] products = {product,product2,product3};
		
		System.out.println("<ul>");
		for (Product item : products) {
			System.out.println("<li>" + item.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
	}
}
