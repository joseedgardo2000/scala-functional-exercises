package com.jemb.option_for.general

sealed trait UsoEnum

case object OPTION extends UsoEnum
case object TRY extends UsoEnum
case object EITHER extends UsoEnum
