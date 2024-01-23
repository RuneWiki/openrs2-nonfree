package javax.media.opengl;

import com.sun.opengl.impl.macosx.GLDrawableFactory_Sub1_Sub1;
import com.sun.opengl.impl.windows.GLDrawableFactory_Sub1_Sub2;
import com.sun.opengl.impl.x11.X11GLDrawableFactory;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!javax/media/opengl/GLDrawableFactory")
public abstract class GLDrawableFactory {

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "factory", descriptor = "Lgl!javax/media/opengl/GLDrawableFactory;")
	private static GLDrawableFactory factory;

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "getFactory", descriptor = "()Lgl!javax/media/opengl/GLDrawableFactory;")
	public static GLDrawableFactory getFactory() {
		if (factory == null) {
			@Pc(5) String local5 = System.getProperty("os.name").toLowerCase();
			if (local5.startsWith("win")) {
				factory = new GLDrawableFactory_Sub1_Sub2();
			}
			if (local5.startsWith("mac")) {
				factory = new GLDrawableFactory_Sub1_Sub1();
			}
			if (local5.startsWith("linux") || local5.startsWith("sunos")) {
				factory = new X11GLDrawableFactory();
			}
		}
		return factory;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	public abstract GLDrawable getGLDrawable(@OriginalArg(0) Object arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) throws IllegalArgumentException, GLException;
}
