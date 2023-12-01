package com.company.heranca;

public class Sistema {

    private String[] valores = new String[50];

    public String getValorByIndice(int indice) throws com.company.heranca.ValorIncorretoException {

        if (indice >= 0 && indice < valores.length) {
            return valores[indice];
        }

        throw new com.company.heranca.ValorIncorretoException("Valor incorreto para o indice");
    }

    public static void main(String[] args) throws com.company.heranca.ValorIncorretoException {

        Sistema sistema = new Sistema();

        try {

            String valorByIndice = sistema.getValorByIndice(50);
            System.out.println(valorByIndice);

        } finally {

        }

    }

}
