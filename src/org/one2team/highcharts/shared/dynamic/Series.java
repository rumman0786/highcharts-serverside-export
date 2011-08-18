//File              $Source: /var/lib/cvs2/highcharts-server/src/org/one2team/highcharts/shared/dynamic/Series.java,v $
//Last modified by  $Author: obt $
//Revision Date     $Revision: 1.1 $
//Tag Name          $Name:  $
//
//Copyright (c) 2000-2011 One2team All Rights Reserved.

package org.one2team.highcharts.shared.dynamic;

import com.google.gwt.shared.Array;

public interface Series {
  
  Array<Point> getData ();
  
  Element getGraph ();
  
  Element getArea ();
  
  String getName ();

}
