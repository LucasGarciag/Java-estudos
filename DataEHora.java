import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {
    public static void main(String[] arg){

       //Data e hora. Local, global, duração.
       //local: armazenada sem fuso horario. Usar quando pessoas de outros paises(com fusos horarios diferentes) não visualizarão
       //Global: com fuso horario. Usar quando usuarios de outros paises(outros fusohorarios) acessam.
       //duração: Tempo decorrido entre duas horas.

        // Timezone
       //GMT: horario de londres, marco zero.
       //EX: SP GMT-3, Manaus GMT-4, Portugal GMT+1

        //Padrão ISO 8601
        //Como representar data e hora como texto.

        ////Local: O T é de tempo, time. Representa a hora
        //Data: 2022-08-13
        //Data e hora: 2022-08-13T07:43
        //Data e hora com segundos: 2022-08-13T07:43:09
        //Data e hora com segundos e milésimos: 2022-08-13T07:43:09.4073

        ////Global: O Z no final representa londres por exemplo:
        //Data e hora: 2022-08-13T07:43Z
        //Data e hora com segundos e milésimos: 2022-08-13T07:43:09.4073Z
        //Data e hora: 2022-08-13T07:43:09-03:00
        //(Acima o padrão que é -3, indicando um fuso horario diferente, como o de SP por exemplo)

        //// Operações importantes com data e hora:
        //Agora: Instancia data e hora no momento atual
        //Texto iso 8601: converter texto em objeto data hora
        //Texto em outro formato: converter tmb
        //Dia, mes, ano: Instanciar dat hora local

        //Formatação:
        //Formatar

        //Obter dados de uma data hora local. Se for data global converter para local e dps obter um dado.
        //Converter local para global, informando o timezone
        //Calculo com data hora: Colocar dias ou anos em mais ou menos.
        //Duração entre duas datas horas

        ////Instanciando data e hora:

        //Data:
        LocalDate hora01 = LocalDate.now();
        System.out.println(hora01);

        //Data e hora:
        LocalDateTime hora02 = LocalDateTime.now();
        System.out.println(hora02);

        //Com instant: Horario GMT, de londres. Marco zero. Global
        Instant hora03 = Instant.now();
        System.out.println(hora03);

        //Pegar texto iso e transformar em data:
        //Posso escrever no padrão ISO usando parse que ele tranforma em data:
        LocalDate hora04 = LocalDate.parse("2022-05-22");
        System.out.println(hora04);

        //Pegar texto iso e transformar em data e hora:
        //Posso escrever no padrão ISO usando parse que ele tranforma em data:
        LocalDateTime hora05 = LocalDateTime.parse("2022-05-22T12:00:00");
        System.out.println(hora05);

        //Com instant: Horario GMT, de londres. Marco zero. Global com parse:
        Instant hora06 = Instant.parse("2022-08-13T12:00:00Z");
        System.out.println(hora06);

        //Com instant: Horario GMT, de São Paulo global com parse:
        //Instant hora07 = Instant.parse("2022-08-13T12:00:00-03:00");
        //System.out.println(hora07);
        //ACIMA COMENTADO PQ ESTÁ GERANDO UMA EXCEÇÃO

        //Gerando data customizada:
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        //Pattern diz que estou estabelecendo um padrão
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Agora instancio minha hora de acordo com o formato acima:
        LocalDate hora08 = LocalDate.parse("20/07/2022", fmt1);
        System.out.println("Data formatada: " + hora08);

        //Gerando data e hora customizada:
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime hora09 = LocalDateTime.parse("20/07/2022 22:30", fmt2);
        System.out.println("Data e hora formatada: " + hora09);

        //OBS: POSSO COLOCAR O METODO DIRETAMENTE NA LINHA DE CODIGO:
        LocalDateTime hora10 = LocalDateTime.parse("22/07/2022 00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Direto na linha de comando: " + hora10);

        //Colocando ano, mes e dia separadamente:
        LocalDate hora11 = LocalDate.of(2022, 8, 13);
        System.out.println("Data separada: " + hora11);

        //Colocando ano, mes e dia e hora separadamente:
        LocalDateTime hora12 = LocalDateTime.of(2022, 8, 13, 0, 0);
        System.out.println("Data separada: " + hora12);

    }
}
