package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adp")
public class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!adp", name = "i", descriptor = "I")
	final int anInt284;

	@OriginalMember(owner = "client!adp", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;I[BLclient!dt;)V", line = 11)
	Class78_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.anInt284 = arg3;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt284, 0, Class86_Sub3.method6289(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adp", name = "av", descriptor = "(Z)V", line = 21)
	void method1730(@OriginalArg(0) boolean arg0) {
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glTexParameteri(this.anInt2408, 10242, arg0 ? 10497 : 33071);
	}
}
