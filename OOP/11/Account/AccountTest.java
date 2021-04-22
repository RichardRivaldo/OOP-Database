public class AccountTest {
    public AccountTest() {
      // Tidak melakukan apa-apa
    }
  
    public void test() {
      // Melakukan tes terhadap method transfer.
      // Asumsikan method lainnya benar.
      Account a = AccountFactory.withBalance(20);
      Account a2 = AccountFactory.withBalance(30);

      assert(a.getBalance() == 20);
      assert(a2.getBalance() == 30);
      assert(a.getNumOfTransaction() == 0);
      assert(a2.getNumOfTransaction() == 0);

      try{
          a.transfer(a2, 20);
          assert(a.getBalance() == 0);
          assert(a2.getBalance() == 50);
          assert(a.getNumOfTransaction() == 1);
          assert(a2.getNumOfTransaction() == 1);
      }
      catch(InvalidAmountException e){
          assert false;
      }

      try{
          a.transfer(a2, 1000);
          assert(false);
      }
      catch(InvalidAmountException e){
          assert(a.getBalance() == 0);
          assert(a2.getBalance() == 50);
          assert(a.getNumOfTransaction() == 1);
          assert(a.getNumOfTransaction() == 1);
      }
    }
  }