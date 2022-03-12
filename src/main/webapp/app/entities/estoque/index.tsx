import React from 'react';
import { Switch } from 'react-router-dom';

import ErrorBoundaryRoute from 'app/shared/error/error-boundary-route';

import Estoque from './estoque';
import EstoqueDetail from './estoque-detail';
import EstoqueUpdate from './estoque-update';
import EstoqueDeleteDialog from './estoque-delete-dialog';

const Routes = ({ match }) => (
  <>
    <Switch>
      <ErrorBoundaryRoute exact path={`${match.url}/new`} component={EstoqueUpdate} />
      <ErrorBoundaryRoute exact path={`${match.url}/:id/edit`} component={EstoqueUpdate} />
      <ErrorBoundaryRoute exact path={`${match.url}/:id`} component={EstoqueDetail} />
      <ErrorBoundaryRoute path={match.url} component={Estoque} />
    </Switch>
    <ErrorBoundaryRoute exact path={`${match.url}/:id/delete`} component={EstoqueDeleteDialog} />
  </>
);

export default Routes;
