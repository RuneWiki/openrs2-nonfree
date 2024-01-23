package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64")
public final class Class202_Sub2 extends Class202 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "size", descriptor = "()I")
	public static int method4811() {
		return 40;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class202_Sub2(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "nSize", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4783(@OriginalArg(0) short arg0) {
		this.aClass192_18.method4592(0, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "nVersion", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4784() {
		this.aClass192_18.method4592(1, (short) 1);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "dwFlags", descriptor = "(I)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4785(@OriginalArg(0) int arg0) {
		this.aClass192_18.method4589(1, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "dwFlags", descriptor = "()I")
	@Override
	public int method4786() {
		return this.aClass192_18.method4588(1);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "iPixelType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4787() {
		this.aClass192_18.method4587(8, (byte) 0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cColorBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4788(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(9, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4789(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(10, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cRedBits", descriptor = "()B")
	@Override
	public byte method4790() {
		return this.aClass192_18.method4586(10);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4791(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(12, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cGreenBits", descriptor = "()B")
	@Override
	public byte method4792() {
		return this.aClass192_18.method4586(12);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4793(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(14, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cBlueBits", descriptor = "()B")
	@Override
	public byte method4794() {
		return this.aClass192_18.method4586(14);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4795(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(16, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAlphaBits", descriptor = "()B")
	@Override
	public byte method4796() {
		return this.aClass192_18.method4586(16);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4797(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(18, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4798(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(19, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumRedBits", descriptor = "()B")
	@Override
	public byte method4799() {
		return this.aClass192_18.method4586(19);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4800(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(20, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumGreenBits", descriptor = "()B")
	@Override
	public byte method4801() {
		return this.aClass192_18.method4586(20);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4802(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(21, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBlueBits", descriptor = "()B")
	@Override
	public byte method4803() {
		return this.aClass192_18.method4586(21);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4804(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(22, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumAlphaBits", descriptor = "()B")
	@Override
	public byte method4805() {
		return this.aClass192_18.method4586(22);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cDepthBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4806(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(23, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cDepthBits", descriptor = "()B")
	@Override
	public byte method4807() {
		return this.aClass192_18.method4586(23);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cStencilBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4808(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4587(24, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cStencilBits", descriptor = "()B")
	@Override
	public byte method4809() {
		return this.aClass192_18.method4586(24);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "iLayerType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method4810() {
		this.aClass192_18.method4587(26, (byte) 0);
		return this;
	}
}
