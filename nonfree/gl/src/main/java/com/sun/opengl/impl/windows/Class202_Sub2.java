package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64")
public final class Class202_Sub2 extends Class202 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "size", descriptor = "()I")
	public static int method4726() {
		return 40;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class202_Sub2(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "nSize", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4698(@OriginalArg(0) short arg0) {
		this.aClass192_18.method4507(0, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "nVersion", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4699() {
		this.aClass192_18.method4507(1, (short) 1);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "dwFlags", descriptor = "(I)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4700(@OriginalArg(0) int arg0) {
		this.aClass192_18.method4504(1, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "dwFlags", descriptor = "()I")
	@Override
	public int method4701() {
		return this.aClass192_18.method4503(1);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "iPixelType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4702() {
		this.aClass192_18.method4502(8, (byte) 0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cColorBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4703(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(9, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4704(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(10, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cRedBits", descriptor = "()B")
	@Override
	public byte method4705() {
		return this.aClass192_18.method4501(10);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4706(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(12, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cGreenBits", descriptor = "()B")
	@Override
	public byte method4707() {
		return this.aClass192_18.method4501(12);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4708(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(14, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cBlueBits", descriptor = "()B")
	@Override
	public byte method4709() {
		return this.aClass192_18.method4501(14);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4710(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(16, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAlphaBits", descriptor = "()B")
	@Override
	public byte method4711() {
		return this.aClass192_18.method4501(16);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4712(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(18, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4713(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(19, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumRedBits", descriptor = "()B")
	@Override
	public byte method4714() {
		return this.aClass192_18.method4501(19);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4715(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(20, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumGreenBits", descriptor = "()B")
	@Override
	public byte method4716() {
		return this.aClass192_18.method4501(20);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4717(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(21, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBlueBits", descriptor = "()B")
	@Override
	public byte method4718() {
		return this.aClass192_18.method4501(21);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4719(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(22, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumAlphaBits", descriptor = "()B")
	@Override
	public byte method4720() {
		return this.aClass192_18.method4501(22);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cDepthBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4721(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(23, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cDepthBits", descriptor = "()B")
	@Override
	public byte method4722() {
		return this.aClass192_18.method4501(23);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cStencilBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4723(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4502(24, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cStencilBits", descriptor = "()B")
	@Override
	public byte method4724() {
		return this.aClass192_18.method4501(24);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "iLayerType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4725() {
		this.aClass192_18.method4502(26, (byte) 0);
		return this;
	}
}
