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
	public static int method4716() {
		return Class184.method4566() ? Class202_Sub1.method4779() : Class202_Sub2.method4811();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "create", descriptor = "()Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public static Class202 method4780() {
		return method4781(Class183.method4558(method4716()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "create", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	private static Class202 method4781(@OriginalArg(0) ByteBuffer arg0) {
		return Class184.method4566() ? new Class202_Sub1(arg0) : new Class202_Sub2(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class202(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_18 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public final ByteBuffer method4782() {
		return this.aClass192_18.method4585();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "nSize", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4783(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "nVersion", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4784();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "dwFlags", descriptor = "(I)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4785(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "dwFlags", descriptor = "()I")
	public abstract int method4786();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "iPixelType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4787();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cColorBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4788(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4789(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cRedBits", descriptor = "()B")
	public abstract byte method4790();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4791(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cGreenBits", descriptor = "()B")
	public abstract byte method4792();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4793(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cBlueBits", descriptor = "()B")
	public abstract byte method4794();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4795(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAlphaBits", descriptor = "()B")
	public abstract byte method4796();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4797(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4798(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumRedBits", descriptor = "()B")
	public abstract byte method4799();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4800(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumGreenBits", descriptor = "()B")
	public abstract byte method4801();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4802(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumBlueBits", descriptor = "()B")
	public abstract byte method4803();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4804(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cAccumAlphaBits", descriptor = "()B")
	public abstract byte method4805();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cDepthBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4806(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cDepthBits", descriptor = "()B")
	public abstract byte method4807();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cStencilBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4808(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "cStencilBits", descriptor = "()B")
	public abstract byte method4809();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR", name = "iLayerType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	public abstract Class202 method4810();
}
