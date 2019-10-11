package dependencias;

import org.springframework.context.annotation.Bean;

public class AppConfig {

   @Bean
    public DirectorEmpleados getDirectorEmpleados(){
        return new DirectorEmpleados();
    }
    @Bean
    public JefeEmpleados getJefeEmpleados(){
        return new JefeEmpleados();
    }
    @Bean
    public SecretariaEmpleados getSecretariaEmpleados(){
        return new SecretariaEmpleados();
    }
    @Bean
    public IntendenteEmpleados getIntendenteEmpleados(){
        return new IntendenteEmpleados();
    }
    @Bean
    public ProfesorEmpleados getProfesorEmpleado(){
        return new ProfesorEmpleados();
    }
}
