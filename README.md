# Padrão_Template
Projeto desenvolvido para E1 de Projeto e Arquitetura de Software usando o Template Method.

O Padrão Template Method tem como propósito principal promover o reuso de código, permitindo que subclasses alterem ou complementem partes de um processo sem mudar sua estrutura geral.

Diagrama

        +---------------------+
        |  ReportGenerator     |  (abstract)
        +---------------------+
        | + generateReport()   |  <Template Method>
        | - fetchData()        |  (abstract)
        | - processData()      |  (abstract)
        | - exportReport()     |  (abstract)
        +---------------------+
                   ^
                   |
   +----------------------------+
   |                            |
+------------+            +------------+
| PDFReport  |            | ExcelReport|
+------------+            +------------+
| - fetchData()           | - fetchData() 
| - processData()         | - processData()
| - exportReport()        | - exportReport()
+------------+            +------------+

(Estou fazendo tudo pelo Visual Studio Code, por isso o diagrama não é uma imagem em si)


Este exemplo simula que tem dois tipos de relatórios: um relatório PDF e um relatório Excel. Ambos seguem o mesmo processo para gerar o relatório, mas a forma de gerar o conteúdo e o formato do relatório são diferentes.

O método generateReport() na classe ReportGenerator define a sequência de operações para gerar um relatório.
As subclasses PDFReport e ExcelReport implementam os métodos abstratos (fetchData(), processData(), exportReport()) de maneiras diferentes, permitindo a customização de partes específicas do algoritmo.
Com o padrão Template Method, a estrutura do processo está fixa, mas o comportamento em pontos específicos pode variar conforme a necessidade da aplicação.