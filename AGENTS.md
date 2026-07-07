# AGENTS.md - AI Agent Instructions for LegadoDeLosAntiguos

## Purpose
This repository is a small Java turn-based battle simulator with Spanish identifiers and a simple package structure. The file helps AI coding agents understand the project layout, avoid accidental renames, and stay aligned with the current implementation.

## Key project structure
- `Main.java` - application entrypoint. No package declaration.
- `partida/Partida.java` - game flow orchestration using battle and turn systems.
- `combate/` - battle system:
  - `SistemaCombate.java` handles attacks, life checks, and combat validation.
  - `SistemaTurnos.java` handles turn selection and user input via `Scanner`.
- `equipos/Equipo.java` - team container and alive-team checks.
- `personajes/` - entity model:
  - `Organico.java` base class for living entities.
  - `Combatiente.java` extends `Organico` and stores abilities.
  - `Campeon`, `Minion`, `MinionCannon`, `MinionCaster`, `MinionMelee`, `Monstruo`, `SuperMinion` represent game units.
- `habilidades/Habilidad.java` - skill definition data.
- `items/Item.java` - item attribute data.
- `tienda/Tienda.java` - shop model placeholder.

## Important conventions and notes
- Package names are mostly lowercase, except `IAs` which is deliberately uppercase in this codebase. Use exact existing package names.
- Identifiers are Spanish and often include accented or domain-specific names such as `getTamañoLista`, `agregarPersonaje`, and `subirNivel`.
- The code uses Java switch arrow syntax (`case 0 ->`), so target Java 14+ for compilation.
- There is no build tool or `pom.xml`/`build.gradle` found. Compile from the project root with `javac` and run with `java Main`.
- The project is partially implemented:
  - `Tienda.listaItemsVenta` is declared but not initialized.
  - Methods like `revivir()` and `subirNivel()` are placeholders.
  - `Main.java` contains temporary setup code and sample data.

## How to work with this repo
- Preserve the current architecture unless the user explicitly requests a refactor.
- Keep changes small and idiomatic; do not rename Spanish domain entities or package paths unless necessary.
- When adding functionality, follow the existing pattern of simple POJOs and explicit method names.
- Refer to `uml-diagram.md` for the current domain model and relationships.

## Notes for inline suggestions
- Suggest edits that match the project’s Spanish naming and package layout.
- Avoid proposing large restructures or new build tooling without user approval.
- Prioritize fixes that make the code compile and preserve the game flow.
