package com.masai.Usecase;

import com.masai.Entities.Address;
import com.masai.Entities.Customer;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class GetallAddressesOfCustomerBycid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID");
        int custid = sc.nextInt();

        EntityManager em = EMUtil.provideConnection();

        Customer cus=em.find(Customer.class, custid);

        List<Address> addressList=cus.getAddresses();

        System.out.println("===================All addresses are=======================");
        for ( Address c: addressList) {
                System.out.println("Customer State Name is:- "+c.getState());
                System.out.println("Customer city Name is:- "+c.getCity());
                System.out.println("Customer Pin Code is:- "+c.getPincode());
                System.out.println("Customer Address Type is:- "+c.getType());
                System.out.println("===================================================");
            }

        System.out.println("done...");

    }
}
