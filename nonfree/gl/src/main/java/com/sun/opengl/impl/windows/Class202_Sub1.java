package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32")
public final class Class202_Sub1 extends Class202 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "size", descriptor = "()I")
	public static int method4625() {
		return 40;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class202_Sub1(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "nSize", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4629(@OriginalArg(0) short arg0) {
		this.aClass192_18.method4438(0, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "nVersion", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4630() {
		this.aClass192_18.method4438(1, (short) 1);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "dwFlags", descriptor = "(I)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4631(@OriginalArg(0) int arg0) {
		this.aClass192_18.method4435(1, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "dwFlags", descriptor = "()I")
	@Override
	public int method4632() {
		return this.aClass192_18.method4434(1);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "iPixelType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4633() {
		this.aClass192_18.method4433(8, (byte) 0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cColorBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4634(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(9, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4635(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(10, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cRedBits", descriptor = "()B")
	@Override
	public byte method4636() {
		return this.aClass192_18.method4432(10);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4637(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(12, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cGreenBits", descriptor = "()B")
	@Override
	public byte method4638() {
		return this.aClass192_18.method4432(12);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4639(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(14, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cBlueBits", descriptor = "()B")
	@Override
	public byte method4640() {
		return this.aClass192_18.method4432(14);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4641(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(16, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAlphaBits", descriptor = "()B")
	@Override
	public byte method4642() {
		return this.aClass192_18.method4432(16);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4643(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(18, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4644(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(19, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumRedBits", descriptor = "()B")
	@Override
	public byte method4645() {
		return this.aClass192_18.method4432(19);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4646(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(20, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumGreenBits", descriptor = "()B")
	@Override
	public byte method4647() {
		return this.aClass192_18.method4432(20);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4648(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(21, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumBlueBits", descriptor = "()B")
	@Override
	public byte method4649() {
		return this.aClass192_18.method4432(21);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4650(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(22, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cAccumAlphaBits", descriptor = "()B")
	@Override
	public byte method4651() {
		return this.aClass192_18.method4432(22);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cDepthBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4652(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(23, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cDepthBits", descriptor = "()B")
	@Override
	public byte method4653() {
		return this.aClass192_18.method4432(23);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cStencilBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4654(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4433(24, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "cStencilBits", descriptor = "()B")
	@Override
	public byte method4655() {
		return this.aClass192_18.method4432(24);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR32", name = "iLayerType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4656() {
		this.aClass192_18.method4433(26, (byte) 0);
		return this;
	}
}
