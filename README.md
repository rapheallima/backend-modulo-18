## Módulo 18: AnnotationProcessor

A classe `AnnotationProcessor` é responsável por processar a annotation personalizada `@Tabela` em tempo de execução.

### O que ela faz:
- Verifica se uma classe possui a annotation `@Tabela`.
- Se presente, exibe o nome da tabela definido na annotation.
- Caso contrário, informa que a annotation não foi encontrada.

### Como funciona:
1. Recebe uma classe como parâmetro.
2. Usa Reflection para verificar e acessar a annotation.
3. Exibe o valor atribuído à annotation no console.

### Exemplo de uso:
```java
@Tabela("usuarios")
public class Usuario {
    // Código da classe
}

AnnotationProcessor.processarTabela(Usuario.class);
// Saída: Nome da tabela: usuarios
