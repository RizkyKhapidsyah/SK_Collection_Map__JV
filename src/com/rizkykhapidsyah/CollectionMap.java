package com.rizkykhapidsyah;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Created by Rizky Khapidsyah */

public class CollectionMap {
    public static void main(String[] args) {
        Map M = new HashMap();

        M.put("Kunci 1", "Elemen 1");
        M.put("Kunci 2", "Elemen 2");
        M.put("Kunci 3", "Elemen 3");

        System.out.println("======\nCARA 1\n======");
        String Elemen1 = (String) M.get("Kunci 1");
        System.out.println("Elemen 1  = " + Elemen1 + "\n\n");

        System.out.println("======\nCARA 2\n======\n");
        Iterator i = M.keySet().iterator();

        while (i.hasNext()) {
            Object kunci = i.next();
            Object value = M.get(kunci);

            System.out.println("Kunci   : " + kunci);
            System.out.println("Value   : " + value);

            continue;
        }

        Object hapus = M.remove("Kunci 1");
        System.out.println("Hapus data pada kunci 1, data = " + hapus);
    }

}
