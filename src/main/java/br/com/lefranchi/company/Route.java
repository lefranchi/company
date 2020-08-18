package br.com.lefranchi.company;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;

public class Route extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        BindyFixedLengthDataFormat company = new BindyFixedLengthDataFormat(Company.class);
        
        from("file:///Users/lflfx/Downloads/file?delete=false")
            .split(body().tokenize("\n")).streaming()
                .choice()
                    .when(simple("${body.startsWith('1')}"))
                        .unmarshal(company)
                        .log("${body}")
                .to("jpa://br.com.lefranchi.company.Company")
                .end()
            .end()
        .log("FIM");

    }
    
}