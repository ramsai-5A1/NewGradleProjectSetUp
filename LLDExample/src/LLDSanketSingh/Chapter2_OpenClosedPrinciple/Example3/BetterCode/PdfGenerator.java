package LLDSanketSingh.Chapter2_OpenClosedPrinciple.Example3.BetterCode;

public class PdfGenerator implements Report {
    @Override
    public String generateReport() {
        return "PDF is getting generated";
    }
}
