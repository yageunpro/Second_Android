package com.inner.second.core.navigation

import kotlinx.serialization.Serializable
import com.inner.second.core.model.ContractType
import java.io.Serial

sealed interface SecondScreen {
    @Serializable
    data object Home : SecondScreen

    @Serializable
    data object Contract : SecondScreen
    /**
     * Child of Contract
     **/
    @Serializable
    data object Main : SecondScreen
    @Serializable
    data class GetInfo(val contractType: ContractType) : SecondScreen
    @Serializable
    data object Signature : SecondScreen
    @Serializable
    data object Send : SecondScreen
    @Serializable
    data object Finish : SecondScreen

    @Serializable
    data object ContractReceiver : SecondScreen
    /**
     * Child of ContractReceiver
     **/
    @Serializable
    data object ReceiverSignature : SecondScreen
    @Serializable
    data object ReceiverFinish : SecondScreen

    @Serializable
    data class ContractDetail(val contractId: Int) : SecondScreen
}