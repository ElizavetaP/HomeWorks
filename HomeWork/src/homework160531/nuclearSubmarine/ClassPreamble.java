package homework160531.nuclearSubmarine;

import java.lang.annotation.Inherited;

/**
 * Annotation.
 */
@Inherited
public @interface ClassPreamble {
    String author();
    String date();
    String lastModified();
    String lastModifiedBy();
}
