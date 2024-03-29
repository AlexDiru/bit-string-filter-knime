package org.alexdiru.bitstringfilter;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "BitStringFilter" Node.
 * 
 *
 * @author Alex Spedding
 */
public class BitStringFilterNodeFactory 
        extends NodeFactory<BitStringFilterNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public BitStringFilterNodeModel createNodeModel() {
        return new BitStringFilterNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<BitStringFilterNodeModel> createNodeView(final int viewIndex,
            final BitStringFilterNodeModel nodeModel) {
        return new BitStringFilterNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new BitStringFilterNodeDialog();
    }

}

