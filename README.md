# spring-wildfly
Simples Projeto Spring com configuracoes para utilizar   com Servidor Wildfly  


		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<!-- excluir tomcat para garantir que não será usado -->
			<exclusions>
				<exclusion>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-tomcat</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<!-- dependencia necessária para wildfly -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-undertow</artifactId>
		</dependency>
    
    * Estender o Arquivo Principal do projeto 

@SpringBootApplication
public class SpringWildflyApplication  extends SpringBootServletInitializer  {//extender para usar wildfly

	private static ApplicationContext APPLICATION_CONTEXT;
	
	public static void main(String[] args) {
		APPLICATION_CONTEXT = SpringApplication.run(SpringWildflyApplication.class, args);
	}
	
	@Override // sobreescrever para usar wildfly
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
	
	public static <T> T getBean(Class<T> requiredType) {
		return APPLICATION_CONTEXT.getBean(requiredType);
	}
}

* Definindo o ContextPath
# Server
server.servletPath=/spring-wildfly
