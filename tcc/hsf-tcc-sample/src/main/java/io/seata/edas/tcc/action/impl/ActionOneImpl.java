package io.seata.edas.tcc.action.impl;

import io.seata.edas.tcc.action.ActionOne;
import io.seata.rm.tcc.api.BusinessActionContext;

/**
 * The type Tcc action one.
 *
 * @author zhangsen
 */
public class ActionOneImpl implements ActionOne {

    @Override
    public boolean prepare(BusinessActionContext actionContext, int a) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne prepare, xid:" + xid + ", a:" + a);
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne commit, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne rollback, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
        return true;
    }
}
