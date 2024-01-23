package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.GLContext_Sub1;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/macosx/MacOSXGLContext")
public abstract class GLContext_Sub1_Sub1 extends GLContext_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "nsContext", descriptor = "J")
	protected long aLong1265;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "drawable", descriptor = "Lgl!com/sun/opengl/impl/macosx/MacOSXGLDrawable;")
	private Class195_Sub1 aClass195_Sub1_2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/macosx/MacOSXGLDrawable;)V")
	protected GLContext_Sub1_Sub1(@OriginalArg(0) Class195_Sub1 arg0) {
		this.aClass195_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "mapToRealGLExtensionName", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	protected final String mapToRealGLExtensionName(@OriginalArg(0) String arg0) {
		return arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "create", descriptor = "()Z")
	protected abstract boolean method4612();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "create", descriptor = "(ZZ)Z")
	protected final boolean method4613() {
		@Pc(1) long local1 = 0L;
		@Pc(4) int[] local4 = new int[1];
		@Pc(8) GLCapabilities local8 = this.aClass195_Sub1_2.method4616();
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[128];
		@Pc(16) byte local16 = 0;
		local11[0] = 5;
		local14[0] = local8.getDoubleBuffered() ? 1 : 0;
		@Pc(52) int local52 = local16 + 1;
		local11[1] = 6;
		local14[1] = local8.getStereo() ? 1 : 0;
		@Pc(66) int local66 = local52 + 1;
		local11[2] = 8;
		local14[2] = local8.getRedBits() + local8.getGreenBits() + local8.getBlueBits();
		@Pc(82) int local82 = local66 + 1;
		local11[3] = 11;
		local14[3] = local8.getAlphaBits();
		@Pc(92) int local92 = local82 + 1;
		local11[4] = 12;
		local14[4] = local8.getDepthBits();
		@Pc(102) int local102 = local92 + 1;
		local11[5] = 14;
		local14[5] = local8.getAccumRedBits() + local8.getAccumGreenBits() + local8.getAccumBlueBits() + local8.getAccumAlphaBits();
		@Pc(121) int local121 = local102 + 1;
		local11[6] = 13;
		local14[6] = local8.getStencilBits();
		@Pc(131) int local131 = local121 + 1;
		if (local8.getSampleBuffers()) {
			local11[7] = 55;
			local14[7] = 1;
			local131++;
			local11[8] = 56;
			local14[8] = local8.getNumSamples();
			local131++;
		}
		@Pc(160) long local160 = CGL.method4594(local11, local131, local14);
		if (local160 == 0L) {
			throw new GLException("Unable to allocate pixel format with requested GLCapabilities");
		}
		try {
			this.aLong1265 = CGL.method4593(local1, this.aClass195_Sub1_2.method4615(), local160, local4);
			if (this.aLong1265 == 0L) {
				if (local4[0] == 1) {
					return false;
				}
				throw new GLException("Error creating NSOpenGLContext with requested pixel format");
			}
			if (this.aClass195_Sub1_2.getChosenGLCapabilities() == null) {
				@Pc(208) GLCapabilities local208 = new GLCapabilities();
				CGL.method4595(local160, local11, local131, local14);
				for (@Pc(217) int local217 = 0; local217 < local131; local217++) {
					@Pc(224) int local224 = local11[local217];
					@Pc(260) int local260;
					switch(local224) {
						case 5:
							local208.setDoubleBuffered(local14[local217] != 0);
							break;
						case 6:
							local208.setStereo(local14[local217] != 0);
							break;
						case 8:
							local260 = local14[local217];
							if (local260 == 32) {
								local260 = 24;
							}
							local260 /= 3;
							local208.setRedBits(local260);
							local208.setGreenBits(local260);
							local208.setBlueBits(local260);
							break;
						case 11:
							local208.setAlphaBits(local14[local217]);
							break;
						case 12:
							local208.setDepthBits(local14[local217]);
							break;
						case 13:
							local208.setStencilBits(local14[local217]);
							break;
						case 14:
							local260 = local14[local217] / 4;
							local208.setAccumRedBits(local260);
							local208.setAccumGreenBits(local260);
							local208.setAccumBlueBits(local260);
							local208.setAccumAlphaBits(local260);
							break;
						case 55:
							local208.setSampleBuffers(local14[local217] != 0);
							break;
						case 56:
							local208.setNumSamples(local14[local217]);
							break;
						case 58:
							local208.setPbufferFloatingPointBuffers(local14[local217] != 0);
					}
				}
				this.aClass195_Sub1_2.setChosenGLCapabilities(local208);
			}
		} finally {
			CGL.deletePixelFormat(local160);
		}
		return true;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "makeCurrentImpl", descriptor = "()I")
	@Override
	protected int makeCurrentImpl() throws GLException {
		@Pc(1) boolean local1 = false;
		if (this.aLong1265 == 0L) {
			if (!this.method4612()) {
				return 0;
			}
			local1 = true;
		}
		if (!CGL.makeCurrentContext(this.aLong1265)) {
			throw new GLException("Error making nsContext current");
		} else if (local1) {
			this.resetGLFunctionAvailability();
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "releaseImpl", descriptor = "()V")
	@Override
	protected final void releaseImpl() throws GLException {
		if (!CGL.clearCurrentContext(this.aLong1265)) {
			throw new GLException("Error freeing OpenGL nsContext");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "destroyImpl", descriptor = "()V")
	@Override
	protected final void destroyImpl() throws GLException {
		if (this.aLong1265 != 0L) {
			if (!CGL.deleteContext(this.aLong1265)) {
				throw new GLException("Unable to delete OpenGL context");
			}
			this.aLong1265 = 0L;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "getPlatformExtensionsString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String getPlatformExtensionsString() {
		return "";
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "setSwapInterval", descriptor = "(I)V")
	@Override
	public final void setSwapInterval(@OriginalArg(0) int arg0) {
		if (this.aLong1265 == 0L) {
			throw new GLException("OpenGL context not current");
		}
		CGL.setSwapInterval(this.aLong1265, arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLContext", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public final boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		return arg0.equals("GL_ARB_pbuffer") || arg0.equals("GL_ARB_pixel_format") ? true : super.isExtensionAvailable(arg0);
	}
}
