import dayjs from 'dayjs';
import { ICadastroDoacao } from 'app/shared/model/cadastro-doacao.model';
import { ICadastroUser } from 'app/shared/model/cadastro-user.model';
import { ISolicitacao } from 'app/shared/model/solicitacao.model';

export interface IAcao {
  id?: number;
  dataCriacao?: string | null;
  usuarioCriacaoAcao?: string | null;
  pendente?: boolean | null;
  dataExecucaoAcao?: string | null;
  ativa?: boolean | null;
  fotoContentType?: string | null;
  foto?: string | null;
  observacoes?: string | null;
  cadastroDoacao?: ICadastroDoacao | null;
  cadastroUser?: ICadastroUser | null;
  solicitante?: ISolicitacao | null;
}

export const defaultValue: Readonly<IAcao> = {
  pendente: false,
  ativa: false,
};
