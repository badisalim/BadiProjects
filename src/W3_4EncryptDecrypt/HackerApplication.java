package W3_4EncryptDecrypt;

class HackerApplication {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        String ciphertext = messenger.send("Adib");
        System.out.println(ciphertext);
        String plaintext = messenger.receive(ciphertext);
        System.out.println(plaintext);
    }
}