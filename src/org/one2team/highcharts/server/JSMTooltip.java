//File              $Source: /var/lib/cvs2/highcharts-server/src/org/one2team/highcharts/server/JSMTooltip.java,v $
//Last modified by  $Author: obt $
//Revision Date     $Revision: 1.4 $
//Tag Name          $Name:  $
//
//Copyright (c) 2000-2010 One2team All Rights Reserved.

package org.one2team.highcharts.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.one2team.highcharts.shared.Tooltip;


@XmlAccessorType(XmlAccessType.NONE)
public class JSMTooltip extends JSMBaseObject implements Tooltip {

  @Override
  public Tooltip setFormatter (Object formatter) {
    this.formatter = formatter;
    return this;
  }
  
  @Override
  public Object getFormatter () {
    return formatter;
  }

  @Override
  public Tooltip setShared (boolean shared) {
    this.shared = shared;
    return this;
  }

  @Override
  public Tooltip setCrosshairs (boolean b) {
    this.crosshairs = b;
    return this;
  }
  
  @Override
  public boolean isCrosshairs () {
    return crosshairs;
  }
  
  @Override
  public boolean isShared () {
    return shared;
  }

  @XmlElement
  private Boolean crosshairs;

  @XmlElement
  private Boolean shared;
  
  private Object formatter;

}
