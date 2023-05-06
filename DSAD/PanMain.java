package finalfolder;

import java.lang.module.FindException;

public class PanMain {
    public static void main(String args[]){
        Account ac = new Account();
        ac.accounts = ac.initializeAccount("accountfile.txt");
        // ac.AccountDetailsprint(ac.accounts);

        Hash hash = new Hash();
        hash.initializeHash();
        hash.addEntry(ac.accounts);
        hash.hashtableprint();
        ac.find_accounts = ac.initializeAccount("findaccountfile.txt");
        hash.searchDetails(ac.find_accounts);
    }
}
