/**
 * Configuración personalizada de CORS (Cross-Origin Resource Sharing) para la aplicación Spring Boot.
 *
 * Esta configuración permite el acceso a recursos desde orígenes cruzados (dominios diferentes) en la aplicación.
 *
 * Configuración:
 * - Permite solicitudes CORS para la ruta "/birthday".
 * - Origen permitido: "http://localhost:4200".
 * - Métodos permitidos: GET, POST, PUT y DELETE.
 * - Se permiten credenciales (cookies y autenticación) en las solicitudes CORS.
 *
 * Uso:
 * Esta configuración se utiliza para permitir que una aplicación web en "http://localhost:4200" se comunique con
 * tu aplicación Spring Boot, especialmente en las solicitudes a la ruta "/birthday".
 *
 * Autor: Javiera Gandarillas
 * Fecha: 22-10-2023
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/birthday")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowCredentials(true);
            }
        };
    }
}
