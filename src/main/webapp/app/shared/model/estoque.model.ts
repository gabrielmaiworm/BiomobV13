import { IItem } from 'app/shared/model/item.model';

export interface IEstoque {
  id?: number;
  quantidade?: number | null;
  item?: IItem | null;
}

export const defaultValue: Readonly<IEstoque> = {};
