package org.orbisgis.orbisprocess.geoclimate

import org.orbisgis.orbisprocess.geoclimate.geoindicators.Geoindicators as GI
import org.orbisgis.orbisprocess.geoclimate.preparedata.PrepareData as PD
import org.orbisgis.orbisprocess.geoclimate.processingchain.ProcessingChain as PC

import static org.orbisgis.orbisdata.processmanager.process.GroovyProcessManager.load

/**
 * Root access point to the Geoindicators processes.
 */
class Geoclimate {

    public static def Geoindicators = load(GI)
    public static def PrepareData = load(PD)
    public static def ProcessingChain = load(PC)

    /**
     * Set the logger for all the processes.
     *
     * @param logger Logger to use in the processes.
     */
    static void setLogger(def logger){
        PrepareData.logger = logger
        ProcessingChain.logger = logger
        Geoindicators.logger = logger
    }
}
