package Day10_IfElse_ElseIf;

public class CommonErrors {
    public static void main(String[] args) {
        int radius = 5;
        float area = 0.0f;
        final float  PI = 3.14f;

        if (radius >= 10)
        {
            area = radius * radius * PI;
            System.out.println("Hesaplanan dairenin alanı = " + area);
        }
    }
}
