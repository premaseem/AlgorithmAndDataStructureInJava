package tdd.datastructure.hashtable;

public class Test {

    HashTable ht = new HashTable(13);
    @org.junit.Test
    public void test(){
        ht.insert("srisri");
        ht.insert("srisri2");
        ht.insert("SriSri");
        ht.insert("srisrI");
        ht.insert("srisri");
        ht.insert("srisri1");
        ht.insert("srisri3");
        ht.insert("srisri4");

        assert -1 == ht.find("aseem");
        assert  0 == ht.find("srisri");
    }
}
