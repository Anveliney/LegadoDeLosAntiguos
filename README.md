# RPG LoL ⚔️

Un videojuego RPG por turnos inspirado en League of Legends, desarrollado en Java como proyecto personal para practicar Programación Orientada a Objetos, diseño de software y arquitectura de aplicaciones.

## Características

- ⚔️ Sistema de combate por turnos.
- 🤖 Equipos controlados por jugador o por IA.
- 🧙 Campeones con habilidades.
- 👾 Minions y monstruos de la jungla.
- ❤️ Sistema de vida y daño.
- 🎯 Selección de objetivos.
- 📈 Sistema de niveles (en desarrollo).
- 💰 Sistema de oro y experiencia (en desarrollo).

## Tecnologías

- Java
- Programación Orientada a Objetos (POO)

## Diseño del proyecto

El proyecto busca aplicar distintos conceptos de POO como:

- Herencia
- Polimorfismo
- Encapsulamiento
- Composición
- Reutilización de código
- Separación de responsabilidades

Actualmente la jerarquía principal es:

```
Organico
├── Minion
└── Combatiente
    ├── Campeon
    └── MonstruoJG
```

Cada equipo puede estar controlado por un jugador o por una IA.

```
Equipo
│
├── Jugador
└── ControladorIA
```

El sistema de turnos es independiente del sistema de combate, permitiendo reutilizar la lógica de ataque y facilitando la incorporación de nuevas mecánicas.

## Estado actual

Actualmente el proyecto incluye:

- ✔ Sistema de equipos
- ✔ Sistema de combate
- ✔ Sistema de turnos
- ✔ IA básica
- ✔ Ataques básicos
- ✔ Sistema de habilidades
- ✔ Selección de objetivos

## Próximas características

- Sistema de maná
- Enfriamientos de habilidades
- Efectos de estado (congelar, veneno, etc.)
- Objetivos múltiples
- Sistema de rondas
- Objetos
- Inventario
- Mejor IA
- Interfaz gráfica
- Guardado de partidas

## Objetivo

Este proyecto tiene como finalidad aprender desarrollo de software mediante la construcción de un videojuego, aplicando buenas prácticas de programación y mejorando continuamente su arquitectura conforme el proyecto crece.

## Autor

Desarrollado por Pablo.
