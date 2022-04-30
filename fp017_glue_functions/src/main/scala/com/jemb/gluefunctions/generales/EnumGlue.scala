package com.jemb.gluefunctions.generales

sealed trait EnumGlue

case object MANUAL_GLUE extends EnumGlue
case object BIND_GLUE extends EnumGlue
