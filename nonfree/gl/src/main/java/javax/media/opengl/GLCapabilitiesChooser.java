package javax.media.opengl;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GLCapabilitiesChooser")
public interface GLCapabilitiesChooser {

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilitiesChooser", name = "chooseCapabilities", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;[Lgl!javax/media/opengl/GLCapabilities;I)I")
	int chooseCapabilities(@OriginalArg(0) GLCapabilities arg0, @OriginalArg(1) GLCapabilities[] arg1, @OriginalArg(2) int arg2);
}
