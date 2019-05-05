# ContractLast JAXWS Example Using ApacheCXF
Command to generate java server class using ApacheCXF
> wsdl2java -verbose -d src/main/java -impl -server .\src\main\webapp\WEB-INF\wsdl\product.wsdl

Command to generate wsdl from java classes
> java2ws -databinding jaxb -frontend jaxws -wsdl -server -o product.wsdl -d src/main/webapp/WEB-INF/wsdl -s src -verbose -cp .\target\classes\ -q com.radiantsage.service.ProductService