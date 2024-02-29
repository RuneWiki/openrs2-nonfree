package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adx")
public class Class78_Sub4 extends Class78 {

	@OriginalMember(owner = "client!adx", name = "i", descriptor = "I")
	final int anInt315;

	@OriginalMember(owner = "client!adx", name = "k", descriptor = "I")
	final int anInt316;

	@OriginalMember(owner = "client!adx", name = "u", descriptor = "I")
	final int anInt317;

	@OriginalMember(owner = "client!adx", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;III)V", line = 13)
	Class78_Sub4(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt315 = arg3;
		this.anInt316 = arg4;
		this.anInt317 = arg5;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glTexImage3Dub(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt315, this.anInt316, this.anInt317, 0, Class86_Sub3.method6289(this.aClass212_16), 5121, null, 0);
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adx", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;III[BLclient!dt;)V", line = 23)
	Class78_Sub4(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class212 arg7) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt315 = arg3;
		this.anInt316 = arg4;
		this.anInt317 = arg5;
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt2408, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), this.anInt315, this.anInt316, this.anInt317, 0, Class86_Sub3.method6289(arg7), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adx", name = "ae", descriptor = "(IIIIIII)V", line = 35)
	void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2408, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!adx", name = "av", descriptor = "(IIIIIII)V", line = 35)
	void method1929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2408, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!adx", name = "at", descriptor = "(IIIIIII)V", line = 35)
	void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass86_Sub3_31.method6195(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2408, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}
}
