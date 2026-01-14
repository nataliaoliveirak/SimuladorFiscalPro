Simulador Fiscal Pro - MVA Ajustado e DIFAL

Este projeto é um Simulador Fiscal Inteligente desenvolvido em Java, focado na automação de cálculos tributários complexos como a Substituição Tributária (ST) com MVA Ajustado e o Diferencial de Alíquota (DIFAL).

O sistema foi construído para validar regras de negócio reais do setor contábil, garantindo precisão matemática idêntica a planilhas de auditoria fiscal.

Funcionalidades
Cálculo de MVA Ajustado: Implementação da fórmula matemática oficial para ajuste de índice em operações interestaduais.
Simulador de ST: Cálculo completo considerando Base de Cálculo, Débito Bruto e abatimento de Crédito de Entrada.
Cálculo de DIFAL: Simulação rápida de diferencial de alíquota entre estados.
Interface Interativa: Entrada de dados via console com suporte ao padrão monetário brasileiro (Locale PT-BR).
Persistência de Dados: Integração com banco de dados SQL (H2) para registro do histórico de simulações.

 A Lógica Matemática
O grande diferencial deste projeto é a precisão no cálculo do MVA Ajustado, utilizando a fórmula: [(1 + MVA_Original) * (1 - Aliq_Inter) / (1 - Aliq_Int) - 1]

Tecnologias Utilizadas
Java 21: Linguagem principal utilizando Programação Orientada a Objetos (POO).
Maven: Gerenciamento de dependências.
H2 Database: Banco de dados relacional para persistência local.
IntelliJ IDEA: Ambiente de desenvolvimento (IDE).

Final: Simulador Fiscal com MVA Ajustado Validado
