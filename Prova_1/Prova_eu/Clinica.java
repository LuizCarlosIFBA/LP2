import java.util.ArrayList; // import the ArrayList class

/**
 * Escreva uma descrição da classe Clinica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Clinica
{
   private ArrayList<Convenio> convenio = new ArrayList<Convenio>();
   private ArrayList<Medico> medico = new ArrayList<Medico>();
   
   public void addConvenio(Convenio convenios) {
       convenio.add(convenios);
   }
   
   public void addMedico(Medico medicos) {
       medico.add(medicos);
   }
   
}
