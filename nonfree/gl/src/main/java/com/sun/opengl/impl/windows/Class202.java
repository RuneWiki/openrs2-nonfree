package com.sun.opengl.impl.windows;

import com.sun.gluegen.runtime.Class183;
import com.sun.gluegen.runtime.Class184;
import com.sun.gluegen.runtime.Class192;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR")
public abstract class Class202 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	protected Class192 aClass192_18;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "size", descriptor = "()I")
	public static int method4562() {
		return Class184.method4412() ? Class202_Sub1.method4625() : Class202_Sub2.method4657();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "create", descriptor = "()Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public static Class202 method4626() {
		return method4627(Class183.method4404(method4562()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "create", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	private static Class202 method4627(@OriginalArg(0) ByteBuffer arg0) {
		return Class184.method4412() ? new Class202_Sub1(arg0) : new Class202_Sub2(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class202(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_18 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public final ByteBuffer method4628() {
		return this.aClass192_18.method4431();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "nSize", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4629(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "nVersion", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4630();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "dwFlags", descriptor = "(I)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4631(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "dwFlags", descriptor = "()I")
	public abstract int method4632();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "iPixelType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4633();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cColorBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4634(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4635(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cRedBits", descriptor = "()B")
	public abstract byte method4636();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4637(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cGreenBits", descriptor = "()B")
	public abstract byte method4638();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4639(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cBlueBits", descriptor = "()B")
	public abstract byte method4640();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4641(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAlphaBits", descriptor = "()B")
	public abstract byte method4642();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4643(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4644(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumRedBits", descriptor = "()B")
	public abstract byte method4645();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4646(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumGreenBits", descriptor = "()B")
	public abstract byte method4647();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4648(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumBlueBits", descriptor = "()B")
	public abstract byte method4649();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4650(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumAlphaBits", descriptor = "()B")
	public abstract byte method4651();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cDepthBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4652(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cDepthBits", descriptor = "()B")
	public abstract byte method4653();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cStencilBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4654(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cStencilBits", descriptor = "()B")
	public abstract byte method4655();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "iLayerType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4656();
}
