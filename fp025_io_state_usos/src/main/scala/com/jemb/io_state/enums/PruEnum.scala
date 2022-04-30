package com.jemb.io_state.enums

sealed trait PruEnum

case object PRU_PUSH extends PruEnum
case object PRU_GET_PUT extends PruEnum
case object PRU_IO_FOR extends PruEnum
case object PRU_ST_FOR extends PruEnum
case object PRU_IO_FOR_SIMPLE extends PruEnum