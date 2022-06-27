mvn clean install compile

mvn exec:java -Dexec.mainClass="com.learning.challenge.TestOnePiece" -Dexec.classpathScope="test"

mvn exec:java -Dexec.mainClass="com.learning.challenge.Main"

mvn exec:java -Dexec.mainClass="com.learning.sax.Main"

mvn -X clean install exec:java -Dexec.mainClass="com.learning.challange.Main"

# XML Parsing (extensible markup language)
- membaca xml
- menyimpan dan mengantarkan data
- Teknik : SAX (simple api xml)
           DOM (document object model)
- StringBuilder : mutable string.membuat, modifikasi, replace string, dll
				  biasanya digunakan ketika perlu banyak modifikasi pada string

------------------------------------------------------------------

```
                  konfigurasi/membuat               wraps
SAXParserFactory --------------------> SAXParser  --------> interface for reading XML document
										   
```

SAXParserFactory
- digunakan untuk konfigurasi/obtain SAX based parser 
  to parse XML documents.
  
Logger
- Logging message
- Level -> standard logging level
- SEVERE -> message yg menandakan serious failure
- getMessage -> detail error message

------------------------------------------------------------------
```
<users>
	<user id="1">
		<id>26</id>
		<name>Bryant</name>
		<gender>Male</gender>
		<role>Java Developer</role>
	</user>
</users>
```
	
DefaultHandler
- import org.xml.sax.helpers.DefaultHandler;
- sax event handler
- startElement -> element pertama yang ditemukan <user>
- character -> character data dalam element <id> <name> <gender> <role>
- endElement -> element terakhir yang ditemukan </user>


# DOM (Document Object Model)
- xml processing
   
```               
document builder  ----> dom builder ---> dom tree ---> business logic
	factory         
```     
 
1. Get builder
2. Parse Document
3. Normalize XML Structure

--------------------------------------------------------------

```
<employees>
	<employee id="9">
		<firstname>Doctor</firstname>
		<lastname>Chopper</lastname>
		<location>Wanokuni</location>
	</employee>
</employees>
```

- NodeList -> collection of nodes
- getElementsByTagName -> return list of nodes (firstname, lastname, location)
- Node -> The Node interface is the primary datatype for the entire
        Document Object Model. It represents a single node in the document tree.
- Casting node to element -> (Element) node
- URLConnection -> read/write resource from url
- new URL -> buat url dari string
- openConnection -> instance yang merepresentasikan connection to remote object