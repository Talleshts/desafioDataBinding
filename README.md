# Módulo de Data Binding

## Visão Geral

Este projeto fornece um módulo de data binding que permite a sincronização entre um modelo e uma visão em uma aplicação Java. O módulo é projetado para ser flexível e extensível, permitindo que seja integrado em várias partes de uma aplicação sem acoplamento forte a um contexto específico.

## Recursos

- Implementa o padrão Observer para notificar a visão de alterações no modelo e vice-versa
- Suporta configurações de data binding one-way e two-way
- Integra-se com o padrão Model-View-Presenter (MVP) em uma abordagem de Visão Passiva
- Permite extensão e customização fáceis para atender aos requisitos específicos de uma aplicação

## Componentes

- `DataBinding`: A classe principal que gerencia o data binding entre o modelo e a visão
- `Observavel`: Uma implementação do padrão Observer que notifica observadores de alterações no modelo ou visão
- `Model`: Uma classe de modelo de exemplo que demonstra como usar o módulo de data binding
- `View`: Uma classe de visão de exemplo que demonstra como usar o módulo de data binding
- `Presenter`: Uma classe de apresentador de exemplo que demonstra como usar o módulo de data binding em uma arquitetura MVP

## Uso

Crie uma classe de model que estenda a classe Model
Crie uma classe de view que estenda a classe View
Crie uma classe de presenter para alinhar a view com a model e que estenda a classe Presenter
Configure o data binding chamando o método `configureOneWayBinding` ou `configureTwoWayBinding` na instância DataBinding
Use o método `updateModel` ou `updateView` na instância Presenter para atualizar o modelo ou visão

## Exemplo

Esse repositório abaixo tem um exemplo de como usar o módulo de data binding em uma arquitetura MVP.
https://github.com/Talleshts/exemploParaDesafio

## Configuração

O módulo de data binding pode ser configurado para suportar data binding one-way ou two-way. O data binding one-way atualiza a view quando a model muda, enquanto o data binding two-way atualiza ambos a model e a view quando qualquer um deles muda.

## Extensibilidade

O módulo de data binding é projetado para ser extensível e personalizável. Você pode estender a classe DataBinding para adicionar funcionalidades personalizadas ou modificar a implementação existente para atender aos requisitos específicos de uma aplicação.

[![](https://jitpack.io/v/Talleshts/desafioDataBinding.svg)](https://jitpack.io/#Talleshts/desafioDataBinding)
