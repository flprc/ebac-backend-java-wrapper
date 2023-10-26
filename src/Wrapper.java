public class Wrapper {
    public static void main(String[] args) {
        // Valor inteiro primitivo
        int numeroInteiroPrimitivo = 26;

        // Convertendo para um tipo wrapper (Integer)
        Integer numeroWrapper = Integer.valueOf(numeroInteiroPrimitivo);

        System.out.println("Valor inteiro primitivo: " + numeroInteiroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);
    }
}
