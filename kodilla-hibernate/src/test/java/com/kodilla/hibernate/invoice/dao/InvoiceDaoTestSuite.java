package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product pasta = new Product("Pasta");
        Product milk = new Product("Milk 3%");
        Product rice = new Product("White rice");

        Item itemPasta = new Item(pasta, new BigDecimal(2), 1);
        Item itemMilk = new Item(milk, new BigDecimal(2.80), 4);
        Item itemRice = new Item(rice, new BigDecimal(4.20), 3);

        Invoice invoice = new Invoice("0245/03/2020");

        itemPasta.setInvoice(invoice);
        itemMilk.setInvoice(invoice);
        itemRice.setInvoice(invoice);

        invoice.getItems().add(itemPasta);
        invoice.getItems().add(itemMilk);
        invoice.getItems().add(itemRice);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Assert.assertNotEquals(3, id);

        //CleanUp
       invoiceDao.deleteById(id);

    }
}
