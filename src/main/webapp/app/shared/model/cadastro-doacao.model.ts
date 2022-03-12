import dayjs from 'dayjs';
import { ICadastroUser } from 'app/shared/model/cadastro-user.model';
import { IEstoque } from 'app/shared/model/estoque.model';
import { IAcao } from 'app/shared/model/acao.model';

export interface ICadastroDoacao {
  id?: number;
  doacaoAnonima?: boolean | null;
  realizaEntrega?: boolean | null;
  dataDoacao?: string | null;
  logradouro?: string | null;
  numero?: number | null;
  bairro?: string | null;
  cidade?: string | null;
  cep?: string | null;
  estado?: string | null;
  pais?: string | null;
  complemento?: string | null;
  nome?: ICadastroUser | null;
  descricao?: IEstoque | null;
  acao?: IAcao | null;
}

export const defaultValue: Readonly<ICadastroDoacao> = {
  doacaoAnonima: false,
  realizaEntrega: false,
};
