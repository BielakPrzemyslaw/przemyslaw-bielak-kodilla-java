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
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("0245/03/2020");

        Product pasta = new Product("Pasta");
        Product milk = new Product("Milk 3%");
        Product rice = new Product("White rice");

        Item itemPasta = new Item(pasta, new BigDecimal(2), 1);
        Item itemMilk = new Item(milk, new BigDecimal(2.80), 4);
        Item itemRice = new Item(rice, new BigDecimal(4.20), 3);

        itemPasta.setInvoice(invoice);
        itemMilk.setInvoice(invoice);
        itemRice.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemPasta);
        items.add(itemMilk);
        items.add(itemRice);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFrom = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceReadFrom.getId());
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, invoiceReadFrom.getItems().size());

        //CleanUp
        //invoiceDao.deleteById(invoiceId);
        //invoiceDao.deleteById(itemSize);

    }
}
