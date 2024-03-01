package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class Class91 implements Interface4 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	final int anInt2936;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!aae;")
	final Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	final int anInt2937;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!aae;II)V", line = 56)
	Class91(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2936 = arg2;
		this.aClass4_Sub2_3 = arg0;
		this.anInt2937 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "()I", line = 63)
	@Override
	public int method27217() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "()I", line = 63)
	@Override
	public int method27213() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "()I", line = 63)
	@Override
	public int method27214() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()I", line = 67)
	@Override
	public int method27212() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "()I", line = 67)
	@Override
	public int method27216() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "()I", line = 67)
	@Override
	public int method27211() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "()I", line = 67)
	@Override
	public int method27215() {
		return this.aClass4_Sub2_3.anInt80;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 71)
	@Override
	public void method22071(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt2937, this.aClass4_Sub2_3.anInt5559, this.anInt2936);
	}

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "(I)V", line = 71)
	@Override
	public void method22073(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt2937, this.aClass4_Sub2_3.anInt5559, this.anInt2936);
	}

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "(I)V", line = 71)
	@Override
	public void method22072(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt2937, this.aClass4_Sub2_3.anInt5559, this.anInt2936);
	}

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "(I)V", line = 71)
	@Override
	public void method22074(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt2937, this.aClass4_Sub2_3.anInt5559, this.anInt2936);
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "()V", line = 74)
	@Override
	public void method27209() {
	}

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "()V", line = 74)
	@Override
	public void method27208() {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V", line = 74)
	@Override
	public void method27210() {
	}
}
