# Unit Converter

Projeto feito seguindo o roadmap de projetos do [roadmap.sh](https://roadmap.sh/projects/unit-converter), com o objetivo de praticar Java.

## Descrição

O Unit Converter é uma aplicação de linha de comando (CLI) que permite converter unidades de medida como comprimento, peso e temperatura.  
O usuário escolhe a categoria, as unidade de origem e destino, o valor que deseja converter, e o programa retorna o resultado formatado diretamente no terminal.

## Tecnologias utilizadas

- **Java** – Linguagem principal
- **CLI (Command Line Interface)** – Interface baseada em terminal
- **Arquivo `.jar`** – Distribuição empacotada da aplicação

## Como rodar o projeto

### 1. Baixe ou clone o repositório

```bash
git clone https://github.com/JessicaLorenzon/unit-converter-java-cli.git
cd unit-converter-java-cli
```

### 2. Navegue até o diretório onde está o `.jar`:

```bash
cd out/artifacts/unit_converter_java_cli_jar
```

### 3. Execute o aplicativo:

```bash
java -jar unit-converter-java-cli.jar
```

## Exemplo de uso:

```bash
$ java -jar unit-converter-java-cli.jar
```
```text
Choose the magnitude you want to convert? [1.Length / 2.Weight / 3.Temperature] 1
Enter the length to convert: 20
Unit to convert from [1.Millimeter / 2.Centimeter / 3.Meter / 4.Kilometer] 2
Unit to convert to [1.Millimeter / 2.Centimeter / 3.Meter / 4.Kilometer] 1

Result of your calculation
20.0 cm = 200.0 mm
```