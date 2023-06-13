package bank;

public class Program {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(443333, 300.26);
        System.out.println(simpleAccount);

        UniversalAccount universalAccount1 = new UniversalAccount("FFFYYY456", 126378.90);
        System.out.println(universalAccount1);
        UniversalAccount universalAccount2 = new UniversalAccount(new AccountIdetifier(123, "asdasd"), 126378.90);
        System.out.println(universalAccount2);


//        System.out.println(((AccountIdetifier)universalAccount2.getId()).getPrefix());
        Account<AccountIdetifier> account1 = new Account(new AccountIdetifier(780, "ASDASD"), 234234.34);
        System.out.println(account1);
        AccountIdetifier accountIdetifier = account1.getId();
        System.out.println(accountIdetifier.getPrefix());

        Integer[] numbers = {2, 3, 4, 5, 1345, -78, 45};
        String[] names = {"Ann", "Ted", "Alex", "Bob", "Jann"};

        Object[] newNames = ArrayUtils.replaseTwoElemetsVO(names, 1, 3);
        for (Object newName: newNames ) {
            System.out.println(newName);
        }

        Integer[] newNumbers = ArrayUtils.replaseTwoElemets(numbers, 0, 3);

        for (Integer newNumber: newNumbers ) {
            System.out.print(newNumber+ " / ");
        }



        //        gh

    }
}
