package com.sun.opengl.impl;

import com.sun.gluegen.runtime.Class183;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GL;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/GLImpl")
public final class GLImpl implements GL {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "inBeginEndPair", descriptor = "Z")
	private boolean aBoolean458;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "haveARBPixelBufferObject", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "haveEXTPixelBufferObject", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "haveGL15", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "haveGL21", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "haveARBVertexBufferObject", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "bufferObjectExtensionsInitialized", descriptor = "Z")
	private boolean aBoolean459 = false;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "arbVBOCache", descriptor = "Ljava/util/Map;")
	private Map aMap1 = new HashMap();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "_context", descriptor = "Lgl!com/sun/opengl/impl/GLContextImpl;")
	private GLContext_Sub1 aGLContext_Sub1_2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/GLContextImpl;)V")
	public GLImpl(@OriginalArg(0) GLContext_Sub1 arg0) {
		this.aGLContext_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glActiveTexture", descriptor = "(I)V")
	@Override
	public void glActiveTexture(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong208;
		if (local4 == 0L) {
			local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong209;
			if (local4 == 0L) {
				throw new GLException("Method \"glActiveTexture\" not available");
			}
		}
		this.dispatch_glActiveTexture0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glActiveTexture0", descriptor = "(IJ)V")
	private native void dispatch_glActiveTexture0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glAlphaFunc", descriptor = "(IF)V")
	public native void glAlphaFunc(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glAttachObjectARB", descriptor = "(II)V")
	@Override
	public void glAttachObjectARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong218;
		if (local4 == 0L) {
			throw new GLException("Method \"glAttachObjectARB\" not available");
		}
		this.dispatch_glAttachObjectARB0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glAttachObjectARB0", descriptor = "(IIJ)V")
	private native void dispatch_glAttachObjectARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBegin", descriptor = "(I)V")
	@Override
	public void glBegin(@OriginalArg(0) int arg0) {
		this.aBoolean458 = true;
		this.glBegin0(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBegin0", descriptor = "(I)V")
	private native void glBegin0(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBindBufferARB", descriptor = "(II)V")
	@Override
	public void glBindBufferARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong229;
		if (local4 == 0L) {
			throw new GLException("Method \"glBindBufferARB\" not available");
		}
		this.dispatch_glBindBufferARB0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBindBufferARB0", descriptor = "(IIJ)V")
	private native void dispatch_glBindBufferARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBindFramebufferEXT", descriptor = "(II)V")
	@Override
	public void glBindFramebufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong235;
		if (local4 == 0L) {
			throw new GLException("Method \"glBindFramebufferEXT\" not available");
		}
		this.dispatch_glBindFramebufferEXT0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBindFramebufferEXT0", descriptor = "(IIJ)V")
	private native void dispatch_glBindFramebufferEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBindProgramARB", descriptor = "(II)V")
	@Override
	public void glBindProgramARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong239;
		if (local4 == 0L) {
			throw new GLException("Method \"glBindProgramARB\" not available");
		}
		this.dispatch_glBindProgramARB0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBindProgramARB0", descriptor = "(IIJ)V")
	private native void dispatch_glBindProgramARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBindRenderbufferEXT", descriptor = "(II)V")
	@Override
	public void glBindRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong241;
		if (local4 == 0L) {
			throw new GLException("Method \"glBindRenderbufferEXT\" not available");
		}
		this.dispatch_glBindRenderbufferEXT0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBindRenderbufferEXT0", descriptor = "(IIJ)V")
	private native void dispatch_glBindRenderbufferEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBindTexture", descriptor = "(II)V")
	public native void glBindTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBlendFunc", descriptor = "(II)V")
	public native void glBlendFunc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBufferDataARB", descriptor = "(IILjava/nio/Buffer;I)V")
	@Override
	public void glBufferDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3) {
		@Pc(2) boolean local2 = Class183.method4474(arg2);
		@Pc(7) long local7 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong255;
		if (local7 == 0L) {
			throw new GLException("Method \"glBufferDataARB\" not available");
		} else if (local2) {
			this.dispatch_glBufferDataARB0(arg0, arg1, arg2, Class183.method4475(arg2), arg3, local7);
		} else {
			this.dispatch_glBufferDataARB1(arg0, arg1, Class183.method4476(arg2), Class183.method4477(arg2), arg3, local7);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBufferDataARB0", descriptor = "(IILjava/lang/Object;IIJ)V")
	private native void dispatch_glBufferDataARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBufferDataARB1", descriptor = "(IILjava/lang/Object;IIJ)V")
	private native void dispatch_glBufferDataARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glBufferSubDataARB", descriptor = "(IIILjava/nio/Buffer;)V")
	@Override
	public void glBufferSubDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		@Pc(2) boolean local2 = Class183.method4474(arg3);
		@Pc(7) long local7 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong259;
		if (local7 == 0L) {
			throw new GLException("Method \"glBufferSubDataARB\" not available");
		} else if (local2) {
			this.dispatch_glBufferSubDataARB0(arg0, arg1, arg2, arg3, Class183.method4475(arg3), local7);
		} else {
			this.dispatch_glBufferSubDataARB1(arg0, arg1, arg2, Class183.method4476(arg3), Class183.method4477(arg3), local7);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBufferSubDataARB0", descriptor = "(IIILjava/lang/Object;IJ)V")
	private native void dispatch_glBufferSubDataARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glBufferSubDataARB1", descriptor = "(IIILjava/lang/Object;IJ)V")
	private native void dispatch_glBufferSubDataARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCallList", descriptor = "(I)V")
	public native void glCallList(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
	@Override
	public int glCheckFramebufferStatusEXT(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong260;
		if (local4 == 0L) {
			throw new GLException("Method \"glCheckFramebufferStatusEXT\" not available");
		}
		return this.dispatch_glCheckFramebufferStatusEXT0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glCheckFramebufferStatusEXT0", descriptor = "(IJ)I")
	private native int dispatch_glCheckFramebufferStatusEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glClear", descriptor = "(I)V")
	public native void glClear(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glClearColor", descriptor = "(FFFF)V")
	public native void glClearColor(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glClearDepth", descriptor = "(D)V")
	public native void glClearDepth(@OriginalArg(0) double arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glClientActiveTexture", descriptor = "(I)V")
	@Override
	public void glClientActiveTexture(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong265;
		if (local4 == 0L) {
			local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong266;
			if (local4 == 0L) {
				throw new GLException("Method \"glClientActiveTexture\" not available");
			}
		}
		this.dispatch_glClientActiveTexture0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glClientActiveTexture0", descriptor = "(IJ)V")
	private native void dispatch_glClientActiveTexture0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColor3ub", descriptor = "(BBB)V")
	public native void glColor3ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColor4f", descriptor = "(FFFF)V")
	public native void glColor4f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColor4fv1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glColor4fv1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColor4fv", descriptor = "([FI)V")
	@Override
	public void glColor4fv(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null && arg0.length <= arg1) {
			throw new GLException("array offset argument \"v_offset\" (" + arg1 + ") equals or exceeds array length (" + arg0.length + ")");
		}
		this.glColor4fv1(arg0, arg1 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColor4ub", descriptor = "(BBBB)V")
	public native void glColor4ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColorMask", descriptor = "(ZZZZ)V")
	public native void glColorMask(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColorMaterial", descriptor = "(II)V")
	public native void glColorMaterial(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColorPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	@Override
	public void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		this.method4525();
		Class183.method4479(arg3, 1);
		if (!Class183.method4474(arg3)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glColorPointer0(arg0, arg1, arg2, arg3, Class183.method4475(arg3));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColorPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glColorPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColorPointer", descriptor = "(IIIJ)V")
	@Override
	public void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		this.method4526();
		this.glColorPointer0(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glColorPointer0", descriptor = "(IIIJ)V")
	private native void glColorPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCompileShaderARB", descriptor = "(I)V")
	@Override
	public void glCompileShaderARB(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong297;
		if (local4 == 0L) {
			throw new GLException("Method \"glCompileShaderARB\" not available");
		}
		this.dispatch_glCompileShaderARB0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glCompileShaderARB0", descriptor = "(IJ)V")
	private native void dispatch_glCompileShaderARB0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCopyPixels", descriptor = "(IIIII)V")
	public native void glCopyPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
	public native void glCopyTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCreateProgramObjectARB", descriptor = "()I")
	@Override
	public int glCreateProgramObjectARB() {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong316;
		if (local4 == 0L) {
			throw new GLException("Method \"glCreateProgramObjectARB\" not available");
		}
		return this.dispatch_glCreateProgramObjectARB0(local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glCreateProgramObjectARB0", descriptor = "(J)I")
	private native int dispatch_glCreateProgramObjectARB0(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCreateShaderObjectARB", descriptor = "(I)I")
	@Override
	public int glCreateShaderObjectARB(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong318;
		if (local4 == 0L) {
			throw new GLException("Method \"glCreateShaderObjectARB\" not available");
		}
		return this.dispatch_glCreateShaderObjectARB0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glCreateShaderObjectARB0", descriptor = "(IJ)I")
	private native int dispatch_glCreateShaderObjectARB0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glCullFace", descriptor = "(I)V")
	public native void glCullFace(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glDeleteBuffersARB1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glDeleteBuffersARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
	@Override
	public void glDeleteBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong328;
		if (local33 == 0L) {
			throw new GLException("Method \"glDeleteBuffersARB\" not available");
		}
		this.dispatch_glDeleteBuffersARB1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glDeleteFramebuffersEXT1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glDeleteFramebuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
	@Override
	public void glDeleteFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong332;
		if (local33 == 0L) {
			throw new GLException("Method \"glDeleteFramebuffersEXT\" not available");
		}
		this.dispatch_glDeleteFramebuffersEXT1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteLists", descriptor = "(II)V")
	@Override
	public void glDeleteLists(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.glDeleteLists0(arg0, arg1);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteLists0", descriptor = "(II)V")
	private native void glDeleteLists0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteObjectARB", descriptor = "(I)V")
	@Override
	public void glDeleteObjectARB(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong333;
		if (local4 == 0L) {
			throw new GLException("Method \"glDeleteObjectARB\" not available");
		}
		this.dispatch_glDeleteObjectARB0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glDeleteObjectARB0", descriptor = "(IJ)V")
	private native void dispatch_glDeleteObjectARB0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glDeleteRenderbuffersEXT1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glDeleteRenderbuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
	@Override
	public void glDeleteRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong340;
		if (local33 == 0L) {
			throw new GLException("Method \"glDeleteRenderbuffersEXT\" not available");
		}
		this.dispatch_glDeleteRenderbuffersEXT1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteTextures1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteTextures1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDeleteTextures", descriptor = "(I[II)V")
	@Override
	public void glDeleteTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"textures_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glDeleteTextures1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDepthFunc", descriptor = "(I)V")
	public native void glDepthFunc(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDepthMask", descriptor = "(Z)V")
	public native void glDepthMask(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDetachObjectARB", descriptor = "(II)V")
	@Override
	public void glDetachObjectARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong347;
		if (local4 == 0L) {
			throw new GLException("Method \"glDetachObjectARB\" not available");
		}
		this.dispatch_glDetachObjectARB0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glDetachObjectARB0", descriptor = "(IIJ)V")
	private native void dispatch_glDetachObjectARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDisable", descriptor = "(I)V")
	public native void glDisable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDisableClientState", descriptor = "(I)V")
	public native void glDisableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawBuffer", descriptor = "(I)V")
	public native void glDrawBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawElements", descriptor = "(IIILjava/nio/Buffer;)V")
	@Override
	public void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		this.method4527();
		Class183.method4479(arg3, arg1);
		@Pc(7) boolean local7 = Class183.method4474(arg3);
		if (local7) {
			this.glDrawElements0(arg0, arg1, arg2, arg3, Class183.method4475(arg3));
		} else {
			this.glDrawElements1(arg0, arg1, arg2, Class183.method4476(arg3), Class183.method4477(arg3));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawElements0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glDrawElements0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawElements1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glDrawElements1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawElements", descriptor = "(IIIJ)V")
	@Override
	public void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		this.method4528();
		this.glDrawElements0(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawElements0", descriptor = "(IIIJ)V")
	private native void glDrawElements0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawPixels", descriptor = "(IIIILjava/nio/Buffer;)V")
	@Override
	public void glDrawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Buffer arg4) {
		this.method4524();
		Class183.method4480(arg4, this.method4521(arg2, arg3, arg0, arg1, 1));
		@Pc(13) boolean local13 = Class183.method4474(arg4);
		if (local13) {
			this.glDrawPixels0(arg0, arg1, arg2, arg3, arg4, Class183.method4475(arg4));
		} else {
			this.glDrawPixels1(arg0, arg1, arg2, arg3, Class183.method4476(arg4), Class183.method4477(arg4));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawPixels0", descriptor = "(IIIILjava/lang/Object;I)V")
	private native void glDrawPixels0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glDrawPixels1", descriptor = "(IIIILjava/lang/Object;I)V")
	private native void glDrawPixels1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glEnable", descriptor = "(I)V")
	public native void glEnable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glEnableClientState", descriptor = "(I)V")
	public native void glEnableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glEnd", descriptor = "()V")
	@Override
	public void glEnd() {
		this.glEnd0();
		this.aBoolean458 = false;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glEnd0", descriptor = "()V")
	private native void glEnd0();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glEndList", descriptor = "()V")
	public native void glEndList();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glFogf", descriptor = "(IF)V")
	public native void glFogf(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glFogfv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glFogfv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glFogfv", descriptor = "(I[FI)V")
	@Override
	public void glFogfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glFogfv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glFogi", descriptor = "(II)V")
	public native void glFogi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
	@Override
	public void glFramebufferRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong423;
		if (local4 == 0L) {
			throw new GLException("Method \"glFramebufferRenderbufferEXT\" not available");
		}
		this.dispatch_glFramebufferRenderbufferEXT0(arg0, arg1, arg2, arg3, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glFramebufferRenderbufferEXT0", descriptor = "(IIIIJ)V")
	private native void dispatch_glFramebufferRenderbufferEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
	@Override
	public void glFramebufferTexture2DEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong425;
		if (local4 == 0L) {
			throw new GLException("Method \"glFramebufferTexture2DEXT\" not available");
		}
		this.dispatch_glFramebufferTexture2DEXT0(arg0, arg1, arg2, arg3, arg4, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glFramebufferTexture2DEXT0", descriptor = "(IIIIIJ)V")
	private native void dispatch_glFramebufferTexture2DEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGenBuffersARB1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glGenBuffersARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenBuffersARB", descriptor = "(I[II)V")
	@Override
	public void glGenBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong433;
		if (local33 == 0L) {
			throw new GLException("Method \"glGenBuffersARB\" not available");
		}
		this.dispatch_glGenBuffersARB1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGenFramebuffersEXT1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glGenFramebuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
	@Override
	public void glGenFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong437;
		if (local33 == 0L) {
			throw new GLException("Method \"glGenFramebuffersEXT\" not available");
		}
		this.dispatch_glGenFramebuffersEXT1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenLists", descriptor = "(I)I")
	@Override
	public int glGenLists(@OriginalArg(0) int arg0) {
		return this.glGenLists0(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenLists0", descriptor = "(I)I")
	private native int glGenLists0(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGenProgramsARB1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glGenProgramsARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenProgramsARB", descriptor = "(I[II)V")
	@Override
	public void glGenProgramsARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong439;
		if (local33 == 0L) {
			throw new GLException("Method \"glGenProgramsARB\" not available");
		}
		this.dispatch_glGenProgramsARB1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGenRenderbuffersEXT1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glGenRenderbuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
	@Override
	public void glGenRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(33) long local33 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong443;
		if (local33 == 0L) {
			throw new GLException("Method \"glGenRenderbuffersEXT\" not available");
		}
		this.dispatch_glGenRenderbuffersEXT1(arg0, arg1, arg2 * 4, local33);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenTextures1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenTextures1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGenTextures", descriptor = "(I[II)V")
	@Override
	public void glGenTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class183.method4478(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"textures_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glGenTextures1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetFloatv", descriptor = "(ILjava/nio/FloatBuffer;)V")
	@Override
	public void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) FloatBuffer arg1) {
		@Pc(2) boolean local2 = Class183.method4474(arg1);
		if (local2) {
			this.glGetFloatv0(arg0, arg1, Class183.method4475(arg1));
		} else {
			this.glGetFloatv1(arg0, Class183.method4476(arg1), Class183.method4477(arg1));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetFloatv0", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetFloatv0(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetFloatv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetFloatv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetFloatv", descriptor = "(I[FI)V")
	@Override
	public void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glGetFloatv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGetInfoLogARB1", descriptor = "(IILjava/lang/Object;ILjava/lang/Object;IJ)V")
	private native void dispatch_glGetInfoLogARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetInfoLogARB", descriptor = "(II[II[BI)V")
	@Override
	public void glGetInfoLogARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"length_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		} else if (arg4 == null || arg4.length > arg5) {
			@Pc(54) long local54 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong496;
			if (local54 == 0L) {
				throw new GLException("Method \"glGetInfoLogARB\" not available");
			}
			this.dispatch_glGetInfoLogARB1(arg0, arg1, arg2, arg3 * 4, arg4, arg5, local54);
		} else {
			throw new GLException("array offset argument \"infoLog_offset\" (" + arg5 + ") equals or exceeds array length (" + arg4.length + ")");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetIntegerv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetIntegerv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetIntegerv", descriptor = "(I[II)V")
	@Override
	public void glGetIntegerv(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glGetIntegerv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGetObjectParameterivARB1", descriptor = "(IILjava/lang/Object;IJ)V")
	private native void dispatch_glGetObjectParameterivARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetObjectParameterivARB", descriptor = "(II[II)V")
	@Override
	public void glGetObjectParameterivARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		@Pc(29) long local29 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong518;
		if (local29 == 0L) {
			throw new GLException("Method \"glGetObjectParameterivARB\" not available");
		}
		this.dispatch_glGetObjectParameterivARB1(arg0, arg1, arg2, arg3 * 4, local29);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
	public native String glGetString(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glGetUniformLocation", descriptor = "(ILjava/lang/String;)I")
	@Override
	public int glGetUniformLocation(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong564;
		if (local4 == 0L) {
			throw new GLException("Method \"glGetUniformLocation\" not available");
		}
		return this.dispatch_glGetUniformLocation0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glGetUniformLocation0", descriptor = "(ILjava/lang/String;J)I")
	private native int dispatch_glGetUniformLocation0(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glHint", descriptor = "(II)V")
	public native void glHint(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glInterleavedArrays", descriptor = "(IILjava/nio/Buffer;)V")
	@Override
	public void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		this.method4525();
		Class183.method4479(arg2, 1);
		@Pc(7) boolean local7 = Class183.method4474(arg2);
		if (local7) {
			this.glInterleavedArrays0(arg0, arg1, arg2, Class183.method4475(arg2));
		} else {
			this.glInterleavedArrays1(arg0, arg1, Class183.method4476(arg2), Class183.method4477(arg2));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glInterleavedArrays0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glInterleavedArrays0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glInterleavedArrays1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glInterleavedArrays1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glInterleavedArrays", descriptor = "(IIJ)V")
	@Override
	public void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method4526();
		this.glInterleavedArrays0(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glInterleavedArrays0", descriptor = "(IIJ)V")
	private native void glInterleavedArrays0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLightModelfv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glLightModelfv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLightModelfv", descriptor = "(I[FI)V")
	@Override
	public void glLightModelfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glLightModelfv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLightf", descriptor = "(IIF)V")
	public native void glLightf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLightfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glLightfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLightfv", descriptor = "(II[FI)V")
	@Override
	public void glLightfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		this.glLightfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLineWidth", descriptor = "(F)V")
	public native void glLineWidth(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLinkProgramARB", descriptor = "(I)V")
	@Override
	public void glLinkProgramARB(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong631;
		if (local4 == 0L) {
			throw new GLException("Method \"glLinkProgramARB\" not available");
		}
		this.dispatch_glLinkProgramARB0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glLinkProgramARB0", descriptor = "(IJ)V")
	private native void dispatch_glLinkProgramARB0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLoadIdentity", descriptor = "()V")
	public native void glLoadIdentity();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLoadMatrixf1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glLoadMatrixf1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glLoadMatrixf", descriptor = "([FI)V")
	@Override
	public void glLoadMatrixf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null && arg0.length <= arg1) {
			throw new GLException("array offset argument \"m_offset\" (" + arg1 + ") equals or exceeds array length (" + arg0.length + ")");
		}
		this.glLoadMatrixf1(arg0, arg1 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glMatrixMode", descriptor = "(I)V")
	public native void glMatrixMode(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
	@Override
	public void glMultiTexCoord2f(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong677;
		if (local4 == 0L) {
			local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong678;
			if (local4 == 0L) {
				throw new GLException("Method \"glMultiTexCoord2f\" not available");
			}
		}
		this.dispatch_glMultiTexCoord2f0(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glMultiTexCoord2f0", descriptor = "(IFFJ)V")
	private native void dispatch_glMultiTexCoord2f0(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glMultiTexCoord2i", descriptor = "(III)V")
	@Override
	public void glMultiTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong682;
		if (local4 == 0L) {
			throw new GLException("Method \"glMultiTexCoord2i\" not available");
		}
		this.dispatch_glMultiTexCoord2i0(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glMultiTexCoord2i0", descriptor = "(IIIJ)V")
	private native void dispatch_glMultiTexCoord2i0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glNewList", descriptor = "(II)V")
	public native void glNewList(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glNormalPointer", descriptor = "(IILjava/nio/Buffer;)V")
	@Override
	public void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		this.method4525();
		Class183.method4479(arg2, 1);
		if (!Class183.method4474(arg2)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glNormalPointer0(arg0, arg1, arg2, Class183.method4475(arg2));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glNormalPointer0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glNormalPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glNormalPointer", descriptor = "(IIJ)V")
	@Override
	public void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method4526();
		this.glNormalPointer0(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glNormalPointer0", descriptor = "(IIJ)V")
	private native void glNormalPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glOrtho", descriptor = "(DDDDDD)V")
	public native void glOrtho(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPointParameterfARB", descriptor = "(IF)V")
	@Override
	public void glPointParameterfARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong736;
		if (local4 == 0L) {
			throw new GLException("Method \"glPointParameterfARB\" not available");
		}
		this.dispatch_glPointParameterfARB0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glPointParameterfARB0", descriptor = "(IFJ)V")
	private native void dispatch_glPointParameterfARB0(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glPointParameterfvARB1", descriptor = "(ILjava/lang/Object;IJ)V")
	private native void dispatch_glPointParameterfvARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPointParameterfvARB", descriptor = "(I[FI)V")
	@Override
	public void glPointParameterfvARB(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"v_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		@Pc(29) long local29 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong740;
		if (local29 == 0L) {
			throw new GLException("Method \"glPointParameterfvARB\" not available");
		}
		this.dispatch_glPointParameterfvARB1(arg0, arg1, arg2 * 4, local29);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPolygonMode", descriptor = "(II)V")
	public native void glPolygonMode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPopAttrib", descriptor = "()V")
	public native void glPopAttrib();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPopMatrix", descriptor = "()V")
	public native void glPopMatrix();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
	@Override
	public void glProgramLocalParameter4fARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong767;
		if (local4 == 0L) {
			throw new GLException("Method \"glProgramLocalParameter4fARB\" not available");
		}
		this.dispatch_glProgramLocalParameter4fARB0(arg0, arg1, arg2, arg3, arg4, arg5, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glProgramLocalParameter4fARB0", descriptor = "(IIFFFFJ)V")
	private native void dispatch_glProgramLocalParameter4fARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) long arg6);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glProgramLocalParameter4fvARB", descriptor = "(IILjava/nio/FloatBuffer;)V")
	@Override
	public void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) FloatBuffer arg2) {
		@Pc(2) boolean local2 = Class183.method4474(arg2);
		@Pc(7) long local7 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong768;
		if (local7 == 0L) {
			throw new GLException("Method \"glProgramLocalParameter4fvARB\" not available");
		} else if (local2) {
			this.dispatch_glProgramLocalParameter4fvARB0(arg0, arg1, arg2, Class183.method4475(arg2), local7);
		} else {
			this.dispatch_glProgramLocalParameter4fvARB1(arg0, arg1, Class183.method4476(arg2), Class183.method4477(arg2), local7);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glProgramLocalParameter4fvARB0", descriptor = "(IILjava/lang/Object;IJ)V")
	private native void dispatch_glProgramLocalParameter4fvARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glProgramLocalParameter4fvARB1", descriptor = "(IILjava/lang/Object;IJ)V")
	private native void dispatch_glProgramLocalParameter4fvARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
	@Override
	public void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		@Pc(29) long local29 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong768;
		if (local29 == 0L) {
			throw new GLException("Method \"glProgramLocalParameter4fvARB\" not available");
		}
		this.dispatch_glProgramLocalParameter4fvARB1(arg0, arg1, arg2, arg3 * 4, local29);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glProgramStringARB", descriptor = "(IIILjava/lang/String;)V")
	@Override
	public void glProgramStringARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong787;
		if (local4 == 0L) {
			throw new GLException("Method \"glProgramStringARB\" not available");
		}
		this.dispatch_glProgramStringARB0(arg0, arg1, arg2, arg3, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glProgramStringARB0", descriptor = "(IIILjava/lang/String;J)V")
	private native void dispatch_glProgramStringARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPushAttrib", descriptor = "(I)V")
	public native void glPushAttrib(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glPushMatrix", descriptor = "()V")
	public native void glPushMatrix();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glRasterPos2i", descriptor = "(II)V")
	public native void glRasterPos2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glReadBuffer", descriptor = "(I)V")
	public native void glReadBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
	@Override
	public void glRenderbufferStorageEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong792;
		if (local4 == 0L) {
			throw new GLException("Method \"glRenderbufferStorageEXT\" not available");
		}
		this.dispatch_glRenderbufferStorageEXT0(arg0, arg1, arg2, arg3, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glRenderbufferStorageEXT0", descriptor = "(IIIIJ)V")
	private native void dispatch_glRenderbufferStorageEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glRotatef", descriptor = "(FFFF)V")
	public native void glRotatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glScalef", descriptor = "(FFF)V")
	public native void glScalef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glScissor", descriptor = "(IIII)V")
	public native void glScissor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glShadeModel", descriptor = "(I)V")
	public native void glShadeModel(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glShaderSourceARB1", descriptor = "(II[Ljava/lang/String;Ljava/lang/Object;IJ)V")
	private native void dispatch_glShaderSourceARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glShaderSourceARB", descriptor = "(II[Ljava/lang/String;[II)V")
	@Override
	public void glShaderSourceARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"length_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
		@Pc(29) long local29 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong867;
		if (local29 == 0L) {
			throw new GLException("Method \"glShaderSourceARB\" not available");
		}
		this.dispatch_glShaderSourceARB1(arg0, arg1, arg2, arg3, arg4 * 4, local29);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexCoord2f", descriptor = "(FF)V")
	public native void glTexCoord2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexCoord2i", descriptor = "(II)V")
	public native void glTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexCoordPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	@Override
	public void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		this.method4525();
		Class183.method4479(arg3, 1);
		if (!Class183.method4474(arg3)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glTexCoordPointer0(arg0, arg1, arg2, arg3, Class183.method4475(arg3));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexCoordPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glTexCoordPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
	@Override
	public void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		this.method4526();
		this.glTexCoordPointer0(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexCoordPointer0", descriptor = "(IIIJ)V")
	private native void glTexCoordPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexEnvf", descriptor = "(IIF)V")
	public native void glTexEnvf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexEnvfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glTexEnvfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexEnvfv", descriptor = "(II[FI)V")
	@Override
	public void glTexEnvfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		this.glTexEnvfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexEnvi", descriptor = "(III)V")
	public native void glTexEnvi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexGenfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glTexGenfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexGenfv", descriptor = "(II[FI)V")
	@Override
	public void glTexGenfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		this.glTexGenfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexGeni", descriptor = "(III)V")
	public native void glTexGeni(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage1D", descriptor = "(IIIIIIILjava/nio/Buffer;)V")
	@Override
	public void glTexImage1D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Buffer arg7) {
		this.method4524();
		Class183.method4480(arg7, this.method4521(arg5, arg6, arg3, 1, 1));
		@Pc(13) boolean local13 = Class183.method4474(arg7);
		if (local13) {
			this.glTexImage1D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, Class183.method4475(arg7));
		} else {
			this.glTexImage1D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, Class183.method4476(arg7), Class183.method4477(arg7));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage1D0", descriptor = "(IIIIIIILjava/lang/Object;I)V")
	private native void glTexImage1D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Object arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage1D1", descriptor = "(IIIIIIILjava/lang/Object;I)V")
	private native void glTexImage1D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Object arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	@Override
	public void glTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Buffer arg8) {
		this.method4524();
		Class183.method4480(arg8, this.method4521(arg6, arg7, arg3, arg4, 1));
		@Pc(13) boolean local13 = Class183.method4474(arg8);
		if (local13) {
			this.glTexImage2D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, Class183.method4475(arg8));
		} else {
			this.glTexImage2D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, Class183.method4476(arg8), Class183.method4477(arg8));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage2D0", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage2D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage2D1", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage2D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexImage3D", descriptor = "(IIIIIIIIILjava/nio/Buffer;)V")
	@Override
	public void glTexImage3D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Buffer arg9) {
		this.method4524();
		Class183.method4480(arg9, this.method4521(arg7, arg8, arg3, arg4, arg5));
		@Pc(13) boolean local13 = Class183.method4474(arg9);
		@Pc(18) long local18 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong915;
		if (local18 == 0L) {
			local18 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong916;
			if (local18 == 0L) {
				throw new GLException("Method \"glTexImage3D\" not available");
			}
		}
		if (local13) {
			this.dispatch_glTexImage3D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, Class183.method4475(arg9), local18);
		} else {
			this.dispatch_glTexImage3D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, Class183.method4476(arg9), Class183.method4477(arg9), local18);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glTexImage3D0", descriptor = "(IIIIIIIIILjava/lang/Object;IJ)V")
	private native void dispatch_glTexImage3D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Object arg9, @OriginalArg(10) int arg10, @OriginalArg(11) long arg11);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glTexImage3D1", descriptor = "(IIIIIIIIILjava/lang/Object;IJ)V")
	private native void dispatch_glTexImage3D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Object arg9, @OriginalArg(10) int arg10, @OriginalArg(11) long arg11);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTexParameteri", descriptor = "(III)V")
	public native void glTexParameteri(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glTranslatef", descriptor = "(FFF)V")
	public native void glTranslatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glUniform1iARB", descriptor = "(II)V")
	@Override
	public void glUniform1iARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong935;
		if (local4 == 0L) {
			throw new GLException("Method \"glUniform1iARB\" not available");
		}
		this.dispatch_glUniform1iARB0(arg0, arg1, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glUniform1iARB0", descriptor = "(IIJ)V")
	private native void dispatch_glUniform1iARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glUniform3fARB", descriptor = "(IFFF)V")
	@Override
	public void glUniform3fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong951;
		if (local4 == 0L) {
			throw new GLException("Method \"glUniform3fARB\" not available");
		}
		this.dispatch_glUniform3fARB0(arg0, arg1, arg2, arg3, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glUniform3fARB0", descriptor = "(IFFFJ)V")
	private native void dispatch_glUniform3fARB0(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glUseProgramObjectARB", descriptor = "(I)V")
	@Override
	public void glUseProgramObjectARB(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_2.getGLProcAddressTable().aLong988;
		if (local4 == 0L) {
			throw new GLException("Method \"glUseProgramObjectARB\" not available");
		}
		this.dispatch_glUseProgramObjectARB0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "dispatch_glUseProgramObjectARB0", descriptor = "(IJ)V")
	private native void dispatch_glUseProgramObjectARB0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glVertex2f", descriptor = "(FF)V")
	public native void glVertex2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glVertex2i", descriptor = "(II)V")
	public native void glVertex2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glVertexPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	@Override
	public void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		this.method4525();
		Class183.method4479(arg3, 1);
		if (!Class183.method4474(arg3)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glVertexPointer0(arg0, arg1, arg2, arg3, Class183.method4475(arg3));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glVertexPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glVertexPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glVertexPointer", descriptor = "(IIIJ)V")
	@Override
	public void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		this.method4526();
		this.glVertexPointer0(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glVertexPointer0", descriptor = "(IIIJ)V")
	private native void glVertexPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "glViewport", descriptor = "(IIII)V")
	public native void glViewport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		return this.aGLContext_Sub1_2.isExtensionAvailable(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "setSwapInterval", descriptor = "(I)V")
	@Override
	public void setSwapInterval(@OriginalArg(0) int arg0) {
		this.aGLContext_Sub1_2.setSwapInterval(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "imageSizeInBytes", descriptor = "(IIIII)I")
	private int method4521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			return 0;
		} else if (arg3 < 0) {
			return 0;
		} else {
			@Pc(19) byte local19;
			switch(arg0) {
				case 6400:
				case 6401:
					local19 = 1;
					break;
				case 6402:
				case 6403:
				case 6404:
				case 6405:
				case 6406:
				case 6409:
					local19 = 1;
					break;
				case 6407:
				case 32992:
					local19 = 3;
					break;
				case 6408:
				case 32768:
				case 32993:
					local19 = 4;
					break;
				case 6410:
					local19 = 2;
					break;
				case 34548:
					local19 = 2;
					break;
				default:
					return 0;
			}
			@Pc(56) byte local56;
			switch(arg1) {
				case 5120:
				case 5121:
					local56 = 1;
					break;
				case 5122:
				case 5123:
					local56 = 2;
					break;
				case 5124:
				case 5125:
				case 5126:
					local56 = 4;
					break;
				case 6656:
					if (arg0 == 6400) {
						return arg4 * arg3 * ((arg2 + 7) / 8);
					}
					return 0;
				case 32818:
				case 33634:
					local56 = 1;
					local19 = 1;
					break;
				case 32819:
				case 32820:
				case 33635:
				case 33636:
				case 33637:
				case 33638:
					local56 = 2;
					local19 = 1;
					break;
				case 32821:
				case 32822:
				case 33639:
				case 33640:
					local56 = 4;
					local19 = 1;
					break;
				default:
					return 0;
			}
			return local19 * local56 * arg2 * arg3 * arg4;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "initBufferObjectExtensionChecks", descriptor = "()V")
	private void method4522() {
		if (this.aBoolean459) {
			return;
		}
		this.aBoolean459 = true;
		this.aBoolean460 = this.isExtensionAvailable("GL_ARB_pixel_buffer_object");
		this.aBoolean461 = this.isExtensionAvailable("GL_EXT_pixel_buffer_object");
		this.aBoolean462 = this.isExtensionAvailable("GL_VERSION_1_5");
		this.aBoolean463 = this.isExtensionAvailable("GL_VERSION_2_1");
		this.aBoolean464 = this.isExtensionAvailable("GL_ARB_vertex_buffer_object");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "checkBufferObject", descriptor = "(ZZZZILjava/lang/String;)V")
	private void method4523(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4) {
		if (this.aBoolean458) {
			throw new GLException("May not call this between glBegin and glEnd");
		}
		@Pc(17) boolean local17 = arg0 || arg1 || arg2;
		if (!local17 && arg3) {
			throw new GLException("Required extensions not available to call this function");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "checkUnpackPBODisabled", descriptor = "()V")
	private void method4524() {
		this.method4522();
		this.method4523(this.aBoolean460, this.aBoolean461, this.aBoolean463, false, "unpack pixel_buffer_object");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "checkArrayVBODisabled", descriptor = "()V")
	private void method4525() {
		this.method4522();
		this.method4523(this.aBoolean462, this.aBoolean464, false, false, "array vertex_buffer_object");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "checkArrayVBOEnabled", descriptor = "()V")
	private void method4526() {
		this.method4522();
		this.method4523(this.aBoolean462, this.aBoolean464, false, true, "array vertex_buffer_object");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "checkElementVBODisabled", descriptor = "()V")
	private void method4527() {
		this.method4522();
		this.method4523(this.aBoolean462, this.aBoolean464, false, false, "element vertex_buffer_object");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLImpl", name = "checkElementVBOEnabled", descriptor = "()V")
	private void method4528() {
		this.method4522();
		this.method4523(this.aBoolean462, this.aBoolean464, false, true, "element vertex_buffer_object");
	}
}
