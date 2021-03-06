/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/
package org.eclipse.persistence.testing.models.jpa.advanced;

import java.io.Serializable;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

@Entity
@Table(name = "MW")
@IdClass(org.eclipse.persistence.testing.models.jpa.advanced.PartnerLinkPK.class)
public class PartnerLink implements Serializable {
    private Man man;
    private Woman woman;

    public PartnerLink() {
    }

    @Id
    @OneToOne(cascade = PERSIST, fetch = LAZY)
    @JoinColumn(name = "M")
    public Man getMan() {
        return man;
    }

    @Transient
    public Integer getManId() {
        return (getMan() == null) ? null : getMan().getId();
    }

    @Id
    @OneToOne(cascade = PERSIST, fetch = LAZY)
    @JoinColumn(name = "W")
    public Woman getWoman() {
        return woman;
    }

    @Transient
    public Integer getWomanId() {
        return (getWoman() == null) ? null : getWoman().getId();
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public void setManId(Integer manId) {
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public void setWomanId(Integer womanId) {
    }
}
