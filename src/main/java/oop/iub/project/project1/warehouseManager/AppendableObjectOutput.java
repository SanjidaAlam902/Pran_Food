package oop.iub.project.project1.warehouseManager;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutput extends ObjectOutputStream{
    public AppendableObjectOutput(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException{
        // do nothing
    }


}
