package jaggl.jogl_wrapper;

import jaggl.context;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!jaggl/jogl_wrapper/GLContextImpl")
public final class GLContextImpl extends GLContext {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "context_valid", descriptor = "Z")
	private boolean context_valid;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "context", descriptor = "Lgl!jaggl/context;")
	public context context;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "drawable", descriptor = "Lgl!jaggl/jogl_wrapper/GLDrawableImpl;")
	private GLDrawableImpl drawable;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "<init>", descriptor = "(Lgl!jaggl/jogl_wrapper/GLDrawableImpl;)V")
	public GLContextImpl(@OriginalArg(0) GLDrawableImpl arg0) {
		this.drawable = arg0;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "create", descriptor = "()V")
	private void create() {
		this.context = new context();
		if (this.drawable.capabilities != null) {
			@Pc(20) int local20 = this.drawable.capabilities.getSampleBuffers() ? this.drawable.capabilities.getNumSamples() : 0;
			if (!this.context.choosePixelFormat(this.drawable.component, local20, this.drawable.capabilities.getAlphaBits())) {
				throw new GLException("Unable to create a usable pixel format ");
			}
		} else if (!this.context.choosePixelFormat(this.drawable.component, 0, 0)) {
			throw new GLException("Unable to create a usable pixel format ");
		}
		if (!this.context.createContext()) {
			throw new GLException("Unable to create OpenGL context for device context ");
		}
		this.drawable.chosenCapabilities = new GLCapabilities();
		this.drawable.chosenCapabilities.setAlphaBits(this.context.getAlphaBits());
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "makeCurrent", descriptor = "()I")
	@Override
	public int makeCurrent() throws GLException {
		@Pc(1) boolean local1 = false;
		if (!this.context_valid) {
			this.create();
			local1 = true;
		}
		if (!this.context.makeCurrent()) {
			throw new GLException("Error making context current: " + this.context.getLastError());
		}
		this.context_valid = true;
		setCurrent(this);
		return local1 ? 2 : 1;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "release", descriptor = "()V")
	@Override
	public void release() throws GLException {
		if (!this.context.releaseContext()) {
			throw new GLException("Error freeing OpenGL context: " + this.context.getLastError());
		}
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() throws GLException {
		if (!this.context.destroy()) {
			throw new GLException("Unable to delete OpenGL context");
		}
		this.context_valid = false;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "getGL", descriptor = "()Lgl!javax/media/opengl/GL;")
	@Override
	public GL getGL() {
		return this.context.getGL();
	}
}
