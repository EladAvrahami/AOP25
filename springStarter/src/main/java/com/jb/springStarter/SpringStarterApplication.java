package com.jb.springStarter;

import com.jb.springStarter.beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@SpringBootApplication  //component scan , configuration scan
//@ComponentScan (basePackages = "com.jb.springStarter")
//@ConfigurationPropertiesScan (basePackages = "com.jb.springStarter")
@EnableAspectJAutoProxy
public class SpringStarterApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringStarterApplication.class, args);
		/*
		MySingleTon s1 = ctx.getBean(MySingleTon.class);
		MySingleTon s2 = ctx.getBean(MySingleTon.class);
		MyProtoType p1 = ctx.getBean(MyProtoType.class);
		MyProtoType p2 = ctx.getBean(MyProtoType.class);

		System.out.println(s1);
		System.out.println(s2);

		s1.setX(100);
		System.out.println("-----------------------SINGLETON--------------------------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("\n---------------------PROTOTYPE----------------------------------");
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("\n---------------------PROTOTYPE----------------------------------");
		Dikla dikla = ctx.getBean(Dikla.class);

		// DI - Dependency injection
		dikla.setGrade(100);
		dikla.setName("Diklush");
		dikla.setId(1);


		// CI - Constructor injection
		Dikla mazal = ctx.getBean(Dikla.class,5,"Mazal Dadon",95);
		System.out.println(dikla);
		System.out.println(mazal);

		//Builder
		Dikla victoriya = Dikla.builder()
				.name("Victoria")
				.grade(70)
				.id(10)
				.build();
		System.out.println(victoriya);

		 */

		//Student natan = ctx.getBean(Student.class);
		//System.out.println(natan);

		//Chip myChip = ctx.getBean(Chip.class);
		//System.out.println(myChip);

		//Cat chatchatul = ctx.getBean(Cat.class);
		//Cat tomCat = ctx.getBean(Cat.class);
		//System.out.println(chatchatul);
		//System.out.println(tomCat);


		/*
		Student natan = ctx.getBean(Student.class);
		System.out.println(natan);
		natan.getTeacher().info();
		*/

		/*
		Manager zeev = ctx.getBean(Manager.class);
		zeev.setSalary(45_000);
		zeev.setName("Zeev");
		zeev.setCellPhone("052-404-3142");
		*/

		/*
		Manager zeev = ctx.getBean("proto",Manager.class);
		Manager natan = ctx.getBean("proto2",Manager.class);
		natan.setName("Natan");
		System.out.println(zeev);
		System.out.println(natan);
		System.out.println("================================================================================================");
		Student dikla1 = ctx.getBean("dekel",Student.class);
		Student dikla2 = ctx.getBean("dekel",Student.class);
		System.out.println(dikla1);
		System.out.println(dikla2);
		System.out.println("================================================================================================");
		dikla1.setName("Ivgeny");
		dikla1.setGrade(100);
		dikla1.setId(10);
		System.out.println(dikla1);
		System.out.println(dikla2);

		 */

		/*
		MyCompsed compsed = ctx.getBean(MyCompsed.class);
		compsed.getDikla().setName("Ivgeny");
		System.out.println(compsed);
		*/
		//MyCompsed compsed1 = ctx.getBean(MyCompsed.class);
		//compsed1.getDikla().setName("Ivgeny");

		Dikla dekel= ctx.getBean(Dikla.class);
		dekel.setName("Ivgeny");
		dekel.setGrade(100);
		dekel.setName("Natan");/*הגדרת שם חדש לאובייקט ידפיס יבגני ראה מחלקת דיקלה*/
		dekel.setName("Dikla");/*הגדרת שם חדש לאובייקט ידפיס יבגני פעם נוספת בהתאם לאנוטציה שיצרנו ומתרחשת במחלקת דיקלה*/

		System.out.println(dekel);

	}


	/*
	//camera, traffic light, light pole, whether sensor, air sensor
	@Bean //instance
	@Scope("prototype")
	public Manager proto(){
		Manager myManager = new Manager();
		myManager.setName("zeevik");
		myManager.setSalary(55_000);
		myManager.setCellPhone("052-404-3142");
		return myManager;
	}
	*/
}
