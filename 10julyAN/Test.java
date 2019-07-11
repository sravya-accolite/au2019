
	import java.io.FileNotFoundException;

	import java.io.FileOutputStream;

	 

	import javax.xml.parsers.DocumentBuilder;

	import javax.xml.parsers.DocumentBuilderFactory;

	import javax.xml.parsers.ParserConfigurationException;
	import javax.xml.transform.OutputKeys;
	import javax.xml.transform.Result;

	import javax.xml.transform.Source;

	import javax.xml.transform.Transformer;
	import javax.xml.transform.TransformerConfigurationException;

	import javax.xml.transform.TransformerException;

	import javax.xml.transform.TransformerFactory;

	import javax.xml.transform.dom.DOMSource;

	import javax.xml.transform.stream.StreamResult;

	import org.w3c.dom.Document;

	import org.w3c.dom.Element;

	public class Test {
		
		
		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Mainclass test = new Mainclass();
			
			createannotation s = test.getClass().getAnnotation(createannotation.class); ;  
			
			System.out.println(s.servletName()+" " +   s.url() +  "   " + test.getClass());
			
	        
			try {
				  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		            DocumentBuilder builder = factory.newDocumentBuilder();

		            Document doc = builder.newDocument();

		 
	      	        Element root = doc.createElement("Servlet");
	      	        doc.appendChild(root);
	      	        
	      	   
	                Element servletName = doc.createElement("ServletName");
	                servletName.appendChild(doc.createTextNode(s.servletName().toString()));
	                root.appendChild(servletName);
	      	   

	                Element url = doc.createElement("Url");
	                url.appendChild(doc.createTextNode(s.url().toString()));
	                root.appendChild(url);
	      	   
	                
	                Element cls = doc.createElement("Class");
	                cls.appendChild(doc.createTextNode(test.getClass().toString()));
	                root.appendChild(cls);
	               
	  
	      	   
	               
	                
	      	    
	      	      TransformerFactory tFactory = TransformerFactory.newInstance();

	              Transformer transformer = tFactory.newTransformer();
	              
	              transformer.setOutputProperty(OutputKeys.INDENT, "yes");

	              transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

	   

	              Source sou = new DOMSource(doc);

	              Result res = new StreamResult( new FileOutputStream("testFile.xml"));

	              transformer.transform(sou, res);

	              System.out.println("XML File Created Succesfully");

				
			}
			catch(ParserConfigurationException pce) {
	            pce.printStackTrace();
	        } 
			  catch(TransformerConfigurationException e)

	        {

	            e.printStackTrace();

	        } catch (FileNotFoundException e) {

	            e.printStackTrace();

	        } catch (TransformerException e) {

	            e.printStackTrace();

	        }
			
			
		       
		    }
		 
		

	}



