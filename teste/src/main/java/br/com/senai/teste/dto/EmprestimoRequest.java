package br.com.senai.teste.dto;

import java.time.LocalDate;

public class EmprestimoRequest {

    private Integer alunoId;
    private Integer livroId;
    private LocalDate dataPrevistaDevolucao;

   public EmprestimoRequest(){

   }

   public Integer getAlunoId() {
    return alunoId;
   }

   public void setAlunoId(Integer alunoId) {
    this.alunoId = alunoId;
   }

   public Integer getLivroId() {
    return livroId;
   }

   public void setLivroId(Integer livroId) {
    this.livroId = livroId;
   }

   public LocalDate getDataPrevistaDevolucao() {
    return dataPrevistaDevolucao;
   }

   public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
    this.dataPrevistaDevolucao = dataPrevistaDevolucao;
   }

   
    
}
