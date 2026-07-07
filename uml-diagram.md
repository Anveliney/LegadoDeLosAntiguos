Organico
  + vida: double
  + vidaMaxima: double
  + nombre: String
  + golpeBasico: double
  + armadura: double
  + resistenciaMagica: double
  + esquivar: double
  + oroOtorgado: double
  + experienciaOtorgada: double
  + nivel: double
  + vivo: boolean
  + subirNivel()
  + recibirGolpe()
  + morir()
  + revivir()
  ...

Combatiente extends Organico
  + listaHabilidades: ArrayList<Habilidad>
  + agregarHabilidad()
  + subirNivel()

Campeon extends Combatiente
  + mana: double
  + critico: double
  + experienciaRequerida: double
  + experienciaActual: double
  + listaItem: ArrayList<Item>
  + agregarItem()
  + curar()
  + adquirirExperiencia()

Monstruo extends Combatiente

Minion extends Organico

MinionCannon extends Minion
MinionCaster extends Minion
MinionMelee extends Minion
SuperMinion extends Minion

Equipo
  + equipoLista: ArrayList<Organico>
  + agregarPersonaje()
  + getEquipo()
  + getPersonaje()

Partida
  + combate: SistemaCombate
  + turno: SistemaTurnos
  + generarPartida()

SistemaCombate
  + imprimirVida()
  + verificarEquiposVivos()
  + revisarCombatiente()
  + atacar()
  + permisoAtacar()

SistemaTurnos
  + combate: SistemaCombate
  + scan: Scanner
  + turnoEquipo()
  + mostrarOpciones()
  + pasarTurno()
  + seleccionarObjetivo()
  + mostrarObjetivos()
  + indiceValido()

Item
  + nombreItem: String
  + danoItem: double
  + vidaItem: double
  + manaItem: double
  + criticoItem: double
  + armaduraItem: double
  + resistenciaMagicaItem: double

Habilidad
  + nombreHabilidad: String
  + costoHabilidad: double
  + tiempoEnfriamiento: double
  + danoHabilidad: double
  + curacion: double

Tienda
  + listaItemsVenta: ArrayList<Item>
  + agregarItemVenta()

IA
  + atacar()