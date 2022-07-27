package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id =1;
		product1.name="lenovo v14";
		product1.unitPrice=15000;
		product1.detail="16Gb ram";
		
		Product product2 = new Product();
		product2.id =2;
		product2.name="lenovo v16";
		product2.unitPrice=25000;
		product2.detail="32Gb ram";
		
		
		Product product3 = new Product();
		product3.id =3;
		product3.name="hp v14";
		product3.unitPrice=10000;
		product3.detail="8Gb ram";
		
		
		
		Product[] products= {product1,product2,product3};
		
		for(Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		
		Category category1= new Category();
		category1.id=1;
		category1.name="bilgisayar";
		
		Category category2= new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		
	}

}
