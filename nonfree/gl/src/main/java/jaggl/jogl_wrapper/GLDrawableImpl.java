package jaggl.jogl_wrapper;

import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jogl_wrapper/GLDrawableImpl")
public final class GLDrawableImpl implements GLDrawable {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "chosenCapabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	public GLCapabilities chosenCapabilities;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "context", descriptor = "Lgl!jaggl/jogl_wrapper/GLContextImpl;")
	private GLContextImpl context;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "component", descriptor = "Ljava/awt/Component;")
	public Component component;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "capabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	public GLCapabilities capabilities;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "<init>", descriptor = "(Ljava/awt/Component;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	public GLDrawableImpl(@OriginalArg(0) Component arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) {
		this.component = arg0;
		this.capabilities = arg1;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public GLContext createContext(@OriginalArg(0) GLContext arg0) {
		this.context = new GLContextImpl(this);
		return this.context;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
		this.context.context.swapBuffers();
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "setRealized", descriptor = "(Z)V")
	@Override
	public void setRealized(@OriginalArg(0) boolean arg0) {
	}
}
