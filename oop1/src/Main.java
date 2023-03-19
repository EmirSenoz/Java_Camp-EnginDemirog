public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";
                    //set value
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makines");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("resim1.jpg");


        Product product2 = new Product();
        product2.setName("Beko Kahve Makines");
        product2.setDiscount(7);
        product2.setUnitPrice(6500);
        product2.setUnitInStock(3);
        product2.setImageUrl("resim2.jpg");

        Product product3 = new Product();
        product3.setName("Beko Kahve Makines");
        product3.setDiscount(7);
        product3.setUnitPrice(9500);
        product3.setUnitInStock(3);
        product3.setImageUrl("resim3.jpg");


        Product [] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>"+"Adı :" + product.getName() + "</li>");
             //System.out.println("Fiyatı :" + product.unitPrice);
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05264562545");
        individualCustomer.setCustomerNumber("1234");
        individualCustomer.setFirsName("Emir");
        individualCustomer.setLastName("ŞENÖZ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Senoz.io");
        corporateCustomer.setPhone("05265488456");
        corporateCustomer.setTaxnumber("646545");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};

}
}