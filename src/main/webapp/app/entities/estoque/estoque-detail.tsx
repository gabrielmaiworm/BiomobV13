import React, { useEffect } from 'react';
import { Link, RouteComponentProps } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import {} from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { getEntity } from './estoque.reducer';
import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';
import { useAppDispatch, useAppSelector } from 'app/config/store';

export const EstoqueDetail = (props: RouteComponentProps<{ id: string }>) => {
  const dispatch = useAppDispatch();

  useEffect(() => {
    dispatch(getEntity(props.match.params.id));
  }, []);

  const estoqueEntity = useAppSelector(state => state.estoque.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="estoqueDetailsHeading">Estoque</h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">ID</span>
          </dt>
          <dd>{estoqueEntity.id}</dd>
          <dt>
            <span id="quantidade">Quantidade</span>
          </dt>
          <dd>{estoqueEntity.quantidade}</dd>
          <dt>Item</dt>
          <dd>{estoqueEntity.item ? estoqueEntity.item.id : ''}</dd>
        </dl>
        <Button tag={Link} to="/estoque" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/estoque/${estoqueEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
        </Button>
      </Col>
    </Row>
  );
};

export default EstoqueDetail;
