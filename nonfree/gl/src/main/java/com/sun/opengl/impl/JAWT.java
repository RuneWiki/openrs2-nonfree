package com.sun.opengl.impl;

import com.sun.gluegen.runtime.Class183;
import com.sun.gluegen.runtime.Class184;
import com.sun.gluegen.runtime.Class192;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/JAWT")
public abstract class JAWT {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "jawt", descriptor = "Lgl!com/sun/opengl/impl/JAWT;")
	private static volatile JAWT aJAWT3;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	protected Class192 aClass192_3;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "size", descriptor = "()I")
	private static int method4614() {
		return Class184.method4566() ? JAWT_Sub1.method4635() : JAWT_Sub2.method4646();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "create", descriptor = "()Lgl!com/sun/opengl/impl/JAWT;")
	public static JAWT method4636() {
		return method4637(Class183.method4558(method4614()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "create", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/JAWT;")
	private static JAWT method4637(@OriginalArg(0) ByteBuffer arg0) {
		return Class184.method4566() ? new JAWT_Sub1(arg0) : new JAWT_Sub2(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "getJAWT", descriptor = "()Lgl!com/sun/opengl/impl/JAWT;")
	public static JAWT method4644() {
		if (aJAWT3 == null) {
			@Pc(11) Class local11 = JAWT.class;
			synchronized (JAWT.class) {
				if (aJAWT3 == null) {
					AccessController.doPrivileged(new PrivilegedAction() {

						@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT$1", name = "run", descriptor = "()Ljava/lang/Object;")
						@Override
						public Object run() {
							@Pc(1) JAWT local1 = JAWT.method4636();
							local1.method4639();
							if (!JAWTFactory.method4647(local1)) {
								throw new RuntimeException("Unable to initialize JAWT");
							}
							JAWT.aJAWT3 = local1;
							return null;
						}
					});
				}
			}
		}
		return aJAWT3;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public JAWT(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_3 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public final ByteBuffer method4638() {
		return this.aClass192_3.method4585();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "version", descriptor = "(I)Lgl!com/sun/opengl/impl/JAWT;")
	public abstract JAWT method4639();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "GetDrawingSurface", descriptor = "(Ljava/lang/Object;)Lgl!com/sun/opengl/impl/JAWT_DrawingSurface;")
	public final JAWT_DrawingSurface method4640(@OriginalArg(0) Object arg0) {
		@Pc(5) ByteBuffer local5 = this.GetDrawingSurface0(this.method4638(), arg0);
		return local5 == null ? null : JAWT_DrawingSurface.method4660(local5.order(ByteOrder.nativeOrder()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "GetDrawingSurface0", descriptor = "(Ljava/nio/ByteBuffer;Ljava/lang/Object;)Ljava/nio/ByteBuffer;")
	private native ByteBuffer GetDrawingSurface0(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) Object arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "FreeDrawingSurface", descriptor = "(Lgl!com/sun/opengl/impl/JAWT_DrawingSurface;)V")
	public final void method4641(@OriginalArg(0) JAWT_DrawingSurface arg0) {
		this.FreeDrawingSurface0(this.method4638(), arg0 == null ? null : arg0.method4661());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "FreeDrawingSurface0", descriptor = "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V")
	private native void FreeDrawingSurface0(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) ByteBuffer arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "Lock", descriptor = "()V")
	public final void method4642() {
		this.Lock0(this.method4638());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "Lock0", descriptor = "(Ljava/nio/ByteBuffer;)V")
	private native void Lock0(@OriginalArg(0) ByteBuffer arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "Unlock", descriptor = "()V")
	public final void method4643() {
		this.Unlock0(this.method4638());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT", name = "Unlock0", descriptor = "(Ljava/nio/ByteBuffer;)V")
	private native void Unlock0(@OriginalArg(0) ByteBuffer arg0);
}
