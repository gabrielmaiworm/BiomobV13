import dayjs from 'dayjs';
import { ICadastroUser } from 'app/shared/model/cadastro-user.model';
import { IEstoque } from 'app/shared/model/estoque.model';

export interface ISolicitacao {
  id?: number;
  solicitante?: string | null;
  anonima?: boolean | null;
  dataSolicitacao?: string | null;
  enderecoEntrega?: string | null;
  localDeEntrega?: string | null;
  dataAprovacao?: string | null;
  aprovado?: boolean | null;
  ativa?: boolean | null;
  nome?: ICadastroUser | null;
  descricao?: IEstoque | null;
}

export const defaultValue: Readonly<ISolicitacao> = {
  anonima: false,
  aprovado: false,
  ativa: false,
};
