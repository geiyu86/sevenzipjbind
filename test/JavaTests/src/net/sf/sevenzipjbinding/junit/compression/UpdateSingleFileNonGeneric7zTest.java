package net.sf.sevenzipjbinding.junit.compression;

import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IOutItemAllFormats;

/**
 * Tests compression, update and extraction of a single file using non-generic callback with 7z.
 *
 * @author Boris Brodski
 * @version 9.20-2.00
 */
public class UpdateSingleFileNonGeneric7zTest extends UpdateSingleFileNonGenericAbstractTest {

    @Override
    protected ArchiveFormat getArchiveFormat() {
        return ArchiveFormat.SEVEN_ZIP;
    }

    @Override
    protected void copyFromDelegate(IOutItemAllFormats outItem, IOutItemAllFormats delegateOutItem) {
        copyFromDelegate7z(outItem, delegateOutItem);
    }

}
