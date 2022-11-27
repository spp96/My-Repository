package com.masai.Usecase;

import com.masai.Entities.Address;
import com.masai.Entities.Customer;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID");
        int cid = sc.nextInt();
        System.out.println("Enter Customer Name");
        String cname = sc.next();
        System.out.println("Enter Customer Mobile Number");
        String cmble = sc.next();
        System.out.println("Enter Customer Email");
        String cemail = sc.next();

        System.out.println("Enter Customer Home State");
        String cstate = sc.next();
        System.out.println("Enter Customer Home City");
        String ccity = sc.next();
        System.out.println("Enter Customer Home Pin code");
        String cpin = sc.next();

        System.out.println("Enter Customer Office State");
        String cstate_1 = sc.next();
        System.out.println("Enter Customer Office City");
        String ccity_1 = sc.next();
        System.out.println("Enter Customer Office Pin code");
        String cpin_1 = sc.next();

        EntityManager em = EMUtil.provideConnection();

        Customer customer = new Customer();

        customer.setCid(cid);
        customer.setName(cname);
        customer.setMobileNumber(cmble);
        customer.setEmail(cemail);

        List<Address> list = customer.getAddresses();

        list.add(new Address(cstate,ccity,cpin,"homeAdderss"));

        list.add(new Address(cstate_1,ccity_1,cpin_1,"officeAddress"));

        customer.setAddresses(list);

        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();

        em.close();

        System.out.println("Done...........");


    }
}
