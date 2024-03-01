package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adq")
public class Class41_Sub1 extends Class41 implements Interface23 {

	@OriginalMember(owner = "client!adq", name = "n", descriptor = "I")
	final int anInt875;

	@OriginalMember(owner = "client!adq", name = "e", descriptor = "I")
	final int anInt876;

	@OriginalMember(owner = "client!adq", name = "r", descriptor = "I")
	final int anInt877;

	@OriginalMember(owner = "client!adq", name = "<init>", descriptor = "(Lclient!akk;Lclient!cw;IIIZ[B)V", line = 15)
	Class41_Sub1(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, 32879, arg1, Class127.aClass127_23, arg2 * arg3 * arg4, arg5);
		this.anInt875 = arg2;
		this.anInt876 = arg3;
		this.anInt877 = arg4;
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt1118, 0, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), this.anInt875, this.anInt876, this.anInt877, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method9883();
		}
	}

	@OriginalMember(owner = "client!adq", name = "au", descriptor = "()V", line = 29)
	@Override
	public void method9873() {
		super.method9872();
	}

	@OriginalMember(owner = "client!adq", name = "ab", descriptor = "()V", line = 29)
	@Override
	public void method9868() {
		super.method9872();
	}

	@OriginalMember(owner = "client!adq", name = "ao", descriptor = "()V", line = 29)
	@Override
	public void method9872() {
		super.method9872();
	}

	@OriginalMember(owner = "client!adq", name = "ap", descriptor = "(Lclient!jn;)V", line = 33)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!adq", name = "ay", descriptor = "(Lclient!jn;)V", line = 33)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!adq", name = "g", descriptor = "()V", line = 37)
	@Override
	public void method27209() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adq", name = "y", descriptor = "()V", line = 37)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adq", name = "b", descriptor = "()V", line = 37)
	@Override
	public void method27210() {
		super.method27209();
	}
}
