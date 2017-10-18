package util;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

 

/**
5
 *
6
 * @author Herman Alonso Barrates V�quez
7
 */

public class StringMD {

 

    //algoritmos

    public static String MD2 = "MD2";
    public static String MD5 = "MD5";
    public static String SHA1 = "SHA-1";
    public static String SHA256 = "SHA-256";
    public static String SHA384 = "SHA-384";
    public static String SHA512 = "SHA-512";


    /***
19
     * Convierte un arreglo de bytes a String usando valores hexadecimales
20
     * @param digest arreglo de bytes a convertir
21
     * @return String creado a partir de <code>digest</code>
22
     */

    private static String toHexadecimal(byte[] digest){

        String hash = "";

        for(byte aux : digest) {

            int b = aux & 0xff;

            if (Integer.toHexString(b).length() == 1) hash += "0";

            hash += Integer.toHexString(b);

        }

        return hash;

    }

 

    /***
34
     * Encripta un mensaje de texto mediante algoritmo de resumen de mensaje.
35
     * @param message texto a encriptar
36
     * @param algorithm algoritmo de encriptacion, puede ser: MD2, MD5, SHA-1, SHA-256, SHA-384, SHA-512
37
     * @return mensaje encriptado
38
     */
    public static String getStringMessageDigest(String message, String algorithm){

        byte[] digest = null;

        byte[] buffer = message.getBytes();

        try {

            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error creando Digest");

        }
        return toHexadecimal(digest);

    }
    
    public static String Encriptar(String cadena) {
    	String Combina="-t@u*pass_con";
    	cadena=Combina+cadena;
    	return getStringMessageDigest(cadena, StringMD.MD5);
    }

    public static void main(String[] args) {
    	
    	
    	        String cadena = "Mensaje secreto";
    	
    	        System.out.println("Mensaje = " + cadena);
    	
    	        System.out.println("MD2 = " + StringMD.getStringMessageDigest(cadena, StringMD.MD2));
    	
    	        System.out.println("MD5 = " + StringMD.getStringMessageDigest(MD2, StringMD.MD5));
    	
    	        System.out.println("SHA-1 = " + StringMD.getStringMessageDigest(MD2, StringMD.SHA1));
    	
    	        System.out.println("SHA-256 = " + StringMD.getStringMessageDigest(MD2, StringMD.SHA256));
    	
    	        System.out.println("SHA-384 = " + StringMD.getStringMessageDigest(MD2, StringMD.SHA384));
    	
    	        System.out.println("SHA-512 = " + StringMD.getStringMessageDigest(MD2, StringMD.SHA512));
    	       
    	        System.out.println(Encriptar("root"));
    	        
    	    }

}
