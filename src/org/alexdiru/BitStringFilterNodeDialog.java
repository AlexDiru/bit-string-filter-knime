package org.alexdiru;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentString;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

/**
 * <code>NodeDialog</code> for the "BitStringFilter" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Alex Spedding
 */
public class BitStringFilterNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring BitStringFilter node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected BitStringFilterNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentString(
                new SettingsModelString(
                    BitStringFilterNodeModel.CFGKEY_BITSTRING,
                    BitStringFilterNodeModel.DEFAULT_BITSTRING), "Bit String"));
                    
    }
}

