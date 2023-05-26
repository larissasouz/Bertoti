async function encontrarMedico() {
  try {
      const response = await axios.get('http://localhost:8080/medico');
      const medicos = response.data;
  
      const selectMedicos = document.getElementById('tabela').getElementsByTagName('tbody')[0];
  
      medicos.forEach(medico => {
          const linha = document.createElement('tr');
       
          const medicoNome = document.createElement('td');
          medicoNome.textContent = medico.nome;
          const medicoEspecializacao = document.createElement('td');
          medicoEspecializacao.textContent = medico.especializacao;
          const medicoTelefone = document.createElement('td');
          medicoTelefone.textContent = medico.telefone;
          const medicoSexo = document.createElement('td');
          medicoSexo.textContent = medico.sexo;
      
          linha.appendChild(medicoNome);
          linha.appendChild(medicoEspecializacao);
          linha.appendChild(medicoTelefone);
          linha.appendChild(medicoSexo);
          selectMedicos.appendChild(linha);
      });
  } catch (error) {
      console.error(error);
  }
}

async function cadastrar(){
  const nome = document.getElementById("txtnome");
  const especializacao = document.getElementById("txtespecializacao");
  const telefone = document.getElementById("txttelefone");
  const sexo = document.getElementById("txtsexo");

  await axios.post('http://localhost:8080/medico',{
      nome: nome.value,
      especializacao: especializacao.value,
      telefone: telefone.value,
      sexo: sexo.value
  });

  alert("Cadastro realizado com sucesso!");
  location.reload();
}

document.addEventListener('DOMContentLoaded', () => {
  encontrarMedico();
});
