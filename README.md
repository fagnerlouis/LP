# Projeto LP – Modelagem em Java

Projeto da disciplina de Linguagem de Programação: modelagem a partir de **Música**, **Duas obras de Vik Muniz**, **Imagem Doodle** e **Vídeo**.  

---

## 🧪 Teste de Mesa
O teste de mesa com 10 cenários (entradas e resultados da média) está disponível no arquivo:
[Atividade Linguagem de Programação.xlsx](Atividade%20Linguagem%20de%20Programação.xlsx)

---

## 🎵 Música - Faroeste Caboclo (Legião Urbana)

## 📐 UML

```mermaid
classDiagram
class Personagem{
  +nome: String
  +origem: String
  +estaVivo: boolean
  +viajar(destino: String): void
}
class Cidade{
  +nome: String
  +regiao: String
  +eViolenta: boolean
  +transformar(): void
}
class Arma{
  +modelo: String
  +qtdTiros: int
  +dono: String
  +atirar(tiros: int): void
}
```

---

## 🖼️ Obra Vik Muniz – *Lampedusa*

## 📐 UML 

```mermaid
classDiagram
class Barco{
  +material: String
  +tamanho: double
  +capacidade: int
  +navegar(): void
}
class Cidade{
  +nome: String
  +numeroDePredios: int
  +pais: String
  +descricao(): void
}
class Jornal{
  +titulo: String
  +idioma: String
  +numeroDePaginas: int
  +exibirNoticia(): void
}
```

---

## 🖼️ Obra Vik Muniz – *Track Brawl*

## 📐 UML

```mermaid
classDiagram
class Trilho{
  +material: String
  +comprimento: double
  +emUso: boolean
  +transportar(): void
}
class Lutador{
  +nome: String
  +forca: int
  +cansado: boolean
  +lutar(): void
}
class Mala{
  +cor: String
  +material: String
  +aberta: boolean
  +abrir(): void
}
```

---

## 🎨 Doodle

## 📐 UML

```mermaid
classDiagram
class Astronauta{
  +nome: String
  +missao: String
  +nivelOxigenio: int
  +explorar(): void
  +comunicar(): void
  +reabastecerOxigenio(): void
}
class Perifericos{
  +tipo: String
  +marca: String
  +conectado: boolean
  +conectar(): void
  +desconectar(): void
  +status(): void
}
class Robo{
  +modelo: String
  +nivelEnergia: int
  +temIA: boolean
  +executarTarefa(): void
  +recarregar(): void
  +apresentar(): void
}
```

---

## 🎬 Vídeo - Jackson Goldstone Cases Gap - ANDORRA 2025
https://www.youtube.com/shorts/MQbCJ1ldr9A


## 📐 UML

```mermaid
classDiagram
class Bicicleta{
  +quadro: String
  +marchas: int
  +aro: int
  +pedalar(): void
  +frear(): void
  +trocarMarcha(): void
}
class Capacete{
  +tamanho: String
  +material: String
  +preso: boolean
  +ajustar(): void
  +prender(): void
  +inspecionar(): void
}
class Camera{
  +resolucao: String
  +fps: int
  +gravando: boolean
  +gravar(): void
  +parar(): void
  +trocarBateria(): void
}
```

---
