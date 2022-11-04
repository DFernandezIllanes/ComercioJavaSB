----------------------------------------------------------------
Commit Title: "Agregado relación entre Gestor y ProductoBase"

Descripción: Establecida relación 1:M entre Gestor y ProductoBase. Uso de anotaciones @JsonManagedReference(en atributo productosBase de Gestor) y @JsonBackReference(en atributo gestor de ProductoBase) para evitar la recursividad. De esta forma, al usar GET en Gestor, se tendrá una lista de los productos base que tiene, mientras que al usar GET en ProductosBase no se obtendrá información de su respectivo gestor

Nota: Releer esta página para cambiar la forma de resolver la recursividad https://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion
----------------------------------------------------------------