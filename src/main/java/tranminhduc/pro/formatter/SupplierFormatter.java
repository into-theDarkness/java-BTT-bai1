package tranminhduc.pro.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import tranminhduc.pro.model.Supplier;
import tranminhduc.pro.service.SupplierService;

import java.text.ParseException;
import java.util.Locale;

public class SupplierFormatter implements Formatter<Supplier> {
    private SupplierService supplierService;
    @Autowired
    public SupplierFormatter(SupplierService supplierService){
        this.supplierService =supplierService;
    }
    @Override
    public Supplier parse(String text, Locale locale) throws ParseException{
        return supplierService.findById(Long.parseLong(text));
    }
    @Override
    public String print(Supplier object, Locale locale) {
        return "[" + object.getSup_id() + ", " + object.getName() + "]";
    }
}
