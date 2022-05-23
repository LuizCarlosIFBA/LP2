
/**
 * Escreva uma descrição da classe Clinica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Clinica
{
   private Convenio[] convenios = new Convenio[5];
   private Medico[] medicos = new Medico[10];
   
   public void addConvenio(Convenio convenio) {
       for (int i = 0; i < 5; i++) {
           if (this.convenios[i] == null) {
               this.convenios[i] = convenio;
               return;
           }
       }
   }
   
   public void addMedico(Medico medico) {
       for (int i = 0; i < 10; i++) {
           if (this.medicos[i] == null) {
               this.medicos[i] = medico;
               return;
           }
       }
   }
}
