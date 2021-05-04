public class App 
{
    public static void main(String[] args) throws Exception 
    {
        String inputMock = "1+2*4-((11-6)+7)*9";
        var calculator = new CalculatorController();
        calculator.calculateInput(inputMock);
    }
}
