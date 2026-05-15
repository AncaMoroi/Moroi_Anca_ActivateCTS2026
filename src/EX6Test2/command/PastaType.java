package EX6Test2.command;

import java.security.cert.CertPathBuilderResult;

public class PastaType implements OrdineComenzi {
    private Bucatar bucatar;

    public PastaType(Bucatar bucatar) {
        this.bucatar = bucatar;
    }

    @Override
    public void execute() {
        bucatar.createPasta();
    }
}
