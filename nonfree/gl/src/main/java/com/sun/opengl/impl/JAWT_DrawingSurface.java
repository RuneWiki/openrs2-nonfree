package com.sun.opengl.impl;

import com.sun.gluegen.runtime.Class184;
import com.sun.gluegen.runtime.Class192;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/JAWT_DrawingSurface")
public abstract class JAWT_DrawingSurface {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	private Class192 aClass192_6;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "create", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/JAWT_DrawingSurface;")
	public static JAWT_DrawingSurface method4506(@OriginalArg(0) ByteBuffer arg0) {
		return Class184.method4412() ? new JAWT_DrawingSurface_Sub1(arg0) : new JAWT_DrawingSurface_Sub2(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public JAWT_DrawingSurface(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_6 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public final ByteBuffer method4507() {
		return this.aClass192_6.method4431();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "Lock", descriptor = "()I")
	public final int method4508() {
		return this.Lock0(this.method4507());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "Lock0", descriptor = "(Ljava/nio/ByteBuffer;)I")
	private native int Lock0(@OriginalArg(0) ByteBuffer arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "GetDrawingSurfaceInfo", descriptor = "()Lgl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo;")
	public final JAWT_DrawingSurfaceInfo method4509() {
		@Pc(4) ByteBuffer local4 = this.GetDrawingSurfaceInfo0(this.method4507());
		return local4 == null ? null : JAWT_DrawingSurfaceInfo.method4520(local4.order(ByteOrder.nativeOrder()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "GetDrawingSurfaceInfo0", descriptor = "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;")
	private native ByteBuffer GetDrawingSurfaceInfo0(@OriginalArg(0) ByteBuffer arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "FreeDrawingSurfaceInfo", descriptor = "(Lgl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo;)V")
	public final void method4510(@OriginalArg(0) JAWT_DrawingSurfaceInfo arg0) {
		this.FreeDrawingSurfaceInfo0(this.method4507(), arg0 == null ? null : arg0.method4521());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "FreeDrawingSurfaceInfo0", descriptor = "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V")
	private native void FreeDrawingSurfaceInfo0(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) ByteBuffer arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "Unlock", descriptor = "()V")
	public final void method4511() {
		this.Unlock0(this.method4507());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface", name = "Unlock0", descriptor = "(Ljava/nio/ByteBuffer;)V")
	private native void Unlock0(@OriginalArg(0) ByteBuffer arg0);
}
