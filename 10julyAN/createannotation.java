


	import java.lang.annotation.*;

	@Retention(RetentionPolicy.RUNTIME)  
	@Target(ElementType.TYPE)
	public @interface createannotation {

	String servletName();
	String url();
	}


