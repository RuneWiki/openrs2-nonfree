package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64")
public final class Class202_Sub2 extends Class202 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "size", descriptor = "()I")
	public static int method5204() {
		return 40;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class202_Sub2(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "nSize", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5176(@OriginalArg(0) short arg0) {
		this.aClass192_18.method4985(0, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "nVersion", descriptor = "(S)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5177() {
		this.aClass192_18.method4985(1, (short) 1);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "dwFlags", descriptor = "(I)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5178(@OriginalArg(0) int arg0) {
		this.aClass192_18.method4982(1, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "dwFlags", descriptor = "()I")
	@Override
	public int method5179() {
		return this.aClass192_18.method4981(1);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "iPixelType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5180() {
		this.aClass192_18.method4980(8, (byte) 0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cColorBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5181(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(9, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5182(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(10, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cRedBits", descriptor = "()B")
	@Override
	public byte method5183() {
		return this.aClass192_18.method4979(10);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5184(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(12, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cGreenBits", descriptor = "()B")
	@Override
	public byte method5185() {
		return this.aClass192_18.method4979(12);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5186(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(14, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cBlueBits", descriptor = "()B")
	@Override
	public byte method5187() {
		return this.aClass192_18.method4979(14);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5188(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(16, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAlphaBits", descriptor = "()B")
	@Override
	public byte method5189() {
		return this.aClass192_18.method4979(16);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5190(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(18, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumRedBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5191(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(19, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumRedBits", descriptor = "()B")
	@Override
	public byte method5192() {
		return this.aClass192_18.method4979(19);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumGreenBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5193(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(20, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumGreenBits", descriptor = "()B")
	@Override
	public byte method5194() {
		return this.aClass192_18.method4979(20);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBlueBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5195(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(21, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumBlueBits", descriptor = "()B")
	@Override
	public byte method5196() {
		return this.aClass192_18.method4979(21);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumAlphaBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5197(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(22, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cAccumAlphaBits", descriptor = "()B")
	@Override
	public byte method5198() {
		return this.aClass192_18.method4979(22);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cDepthBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5199(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(23, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cDepthBits", descriptor = "()B")
	@Override
	public byte method5200() {
		return this.aClass192_18.method4979(23);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cStencilBits", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5201(@OriginalArg(0) byte arg0) {
		this.aClass192_18.method4980(24, arg0);
		return this;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "cStencilBits", descriptor = "()B")
	@Override
	public byte method5202() {
		return this.aClass192_18.method4979(24);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR64", name = "iLayerType", descriptor = "(B)Lgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;")
	@Override
	public Class202 method5203() {
		this.aClass192_18.method4980(26, (byte) 0);
		return this;
	}
}
