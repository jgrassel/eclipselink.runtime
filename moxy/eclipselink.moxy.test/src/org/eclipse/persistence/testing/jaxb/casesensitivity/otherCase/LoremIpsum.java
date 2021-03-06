/*******************************************************************************
 * Copyright (c) 2014, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Marcel Valovy - 2.6.0 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.casesensitivity.otherCase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Dummy class for performance testing with case differing from the xml resource.
 *
 * @author Marcel Valovy - marcel.valovy@oracle.com
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LoremIpsum {

    // different cases than the xml - use with Insensitive
    @XmlAttribute
    private int LorEm, ipsUm, DoLor, sIT, AMet;
    @XmlElement
    private int conSectetuR, aDiPiscinG, eLIt, PhasEllus,
                conDimentuM, tElLus, tINciDUnt, magNa, Fusce, cursus;

    @XmlElement
    private String Diam, iD, pUlVinar, mauRIs, iacuLis;

}
