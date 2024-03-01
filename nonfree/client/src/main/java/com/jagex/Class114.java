package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class Class114 implements Interface4 {

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	final int anInt3003;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Lclient!aab;")
	final Class4_Sub1 aClass4_Sub1_7;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!aab;I)V", line = 181)
	Class114(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3003 = arg1;
		this.aClass4_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "()I", line = 187)
	@Override
	public int method27217() {
		return this.aClass4_Sub1_7.anInt2029;
	}

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "()I", line = 187)
	@Override
	public int method27214() {
		return this.aClass4_Sub1_7.anInt2029;
	}

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "()I", line = 187)
	@Override
	public int method27213() {
		return this.aClass4_Sub1_7.anInt2029;
	}

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "()I", line = 191)
	@Override
	public int method27216() {
		return this.aClass4_Sub1_7.anInt2028;
	}

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "()I", line = 191)
	@Override
	public int method27211() {
		return this.aClass4_Sub1_7.anInt2028;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()I", line = 191)
	@Override
	public int method27212() {
		return this.aClass4_Sub1_7.anInt2028;
	}

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "()I", line = 191)
	@Override
	public int method27215() {
		return this.aClass4_Sub1_7.anInt2028;
	}

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "(I)V", line = 195)
	@Override
	public void method22073(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass4_Sub1_7.anInt5560, this.aClass4_Sub1_7.anInt5559, this.anInt3003);
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 195)
	@Override
	public void method22071(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass4_Sub1_7.anInt5560, this.aClass4_Sub1_7.anInt5559, this.anInt3003);
	}

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "(I)V", line = 195)
	@Override
	public void method22072(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass4_Sub1_7.anInt5560, this.aClass4_Sub1_7.anInt5559, this.anInt3003);
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V", line = 195)
	@Override
	public void method22074(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass4_Sub1_7.anInt5560, this.aClass4_Sub1_7.anInt5559, this.anInt3003);
	}

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "()V", line = 198)
	@Override
	public void method27208() {
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "()V", line = 198)
	@Override
	public void method27209() {
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V", line = 198)
	@Override
	public void method27210() {
	}
}
