import { IEstoque } from 'app/shared/model/estoque.model';
import { CategoriaItem } from 'app/shared/model/enumerations/categoria-item.model';
import { UnidadeMedida } from 'app/shared/model/enumerations/unidade-medida.model';

export interface IItem {
  id?: number;
  nome?: string | null;
  descricao?: string | null;
  imagemContentType?: string | null;
  imagem?: string | null;
  categoriaItem?: CategoriaItem | null;
  unidadeMedida?: UnidadeMedida | null;
  estoque?: IEstoque | null;
}

export const defaultValue: Readonly<IItem> = {};
