package br.com.houpper.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Esta aplicação atua como um gateway de entrada, responsável por rotear as requisições para os microsserviços
 * registrados no ambiente (Eureka).
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    /**
     * Inicializa a aplicação de gateway.
     *
     * @param args Os argumentos da linha de comando.
     */
    static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}