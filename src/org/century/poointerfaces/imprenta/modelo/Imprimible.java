package org.century.poointerfaces.imprenta.modelo;

public interface Imprimible {

    //Tambien puede tener atributos constantes
    //Se puede quitar el static final, ya que es rebundante, ya que por defecto es static finañ
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    //Puede ser Default o Public, nunca private porque no tendria sentido
    //Ya que siempre deberia ser public y por defecto lo es, entonces usar
    //public queda rebundante y el IDE no los menciona

    /* Si queremos tener un metodo por defecto, ya que hay ocaciones que no
       queremos que implemente todos los metodos por obligacion si no
       que algunos ya vengan con una implementacion por defecto,
       aunque la regla dice que no implementaciones en una interfaz
       se puede crear una por defecto, ademas tiene modificador de acceso public,
       esta desde Java 8
     */
     default String imprimir(){
         return TEXTO_DEFECTO;
     }

     //Tambien podemos tener metodos estaticos, sin el public ya que no es obligatorio
    //y viene por defecto
      static void imprimir(Imprimible imprimible){
         System.out.println(imprimible.imprimir());
         System.out.println();
     }

}
