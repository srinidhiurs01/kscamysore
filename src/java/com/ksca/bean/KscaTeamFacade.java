/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ksca.bean;

import com.ksca.KscaTeam;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Urs
 */
@Stateless
public class KscaTeamFacade extends AbstractFacade<KscaTeam> {
    @PersistenceContext(unitName = "WebApplication15PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KscaTeamFacade() {
        super(KscaTeam.class);
    }
    
}
