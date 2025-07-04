# Componente Pokemon

Este projeto contém **abstrações base do PIC (Processo de Integração de Componentes)** para Java. Ele foi desenvolvido como parte da disciplina de **Desenvolvimento de Componentes (BRADECO)** do curso de Tecnologia em Análise e Desenvolvimento de Sistemas - Campus Bragança Paulista. O objetivo é fornecer um conjunto de interfaces e classes abstratas que representam os principais elementos arquiteturais de um sistema baseado em componentes reutilizáveis. Como tema foi utilizado a pokerest, se baseando em entidades do universo pokemon.

>  Foi utilizado as dependencias provenientes do github: https://github.com/lifveras/bradeco_pic_abstract/tree/master, do professor.

---

## Estrutura do Projeto
Particularmente, a implementação **sem a dependência** permite explorar melhor os princípios SOLID, especialmente no que diz respeito à separação de interfaces, além de tornar o código mais fácil de ler e compreender para mim. Por isso, esta versão está localizada como branch principal (`main`). Mas como fiquei em dúvida de sua correta implementação, fiz outra utilizando a dependência do professor, o que acaba não mudando muito o código.
Para fins de estudo e comparação, este repositório possui as **duas branches distintas**:

- **Branch com PIC como dependência(Pic):**  
  Nesta branch, o projeto utiliza a dependência `bredeco_pic_abstract` no `pom.xml`, implementando as classes concretas a partir das abstrações fornecidas pelo PIC, conforme o padrão ensinado pelo professor. Isso garante total aderência ao modelo acadêmico de componentes reutilizáveis.

- **Branch sem PIC(Main):**  
  Nesta branch, o componente foi desenvolvido sem depender da biblioteca do professor. As interfaces e classes seguem o padrão de interface de componente de forma manual, mantendo a separação de responsabilidades e a arquitetura modular, mas sem vínculo com o artefato externo.

Dessa forma, é possível visualizar e comparar as duas abordagens: uma fiel ao padrão acadêmico com dependência explícita, e outra mais flexível e independente, mas ainda alinhada aos princípios de componentes.

### Pacote `provided`
Contém abstrações que representam **interfaces fornecidas** por componentes.

### Pacote `required`
Contém abstrações relacionadas às **interfaces requeridas**, simulando caixas de saída (outboxes) de comunicação entre componentes.

---

## Como Usar

Este projeto está disponível no [Maven Central]([https://central.sonatype.com/artifact/io.github.lifveras/bredeco_pic_abstract](https://central.sonatype.com/artifact/io.github.tduarte29/pokement)).

Adicione a dependência no seu `pom.xml`:

```xml
<dependency>
    <groupId>io.github.tduarte29</groupId>
    <artifactId>pokement</artifactId>
    <version>1.0.2</version>
</dependency>
