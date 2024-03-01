package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zg")
public class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!zg", name = "r", descriptor = "I")
	final int anInt5564;

	@OriginalMember(owner = "client!zg", name = "d", descriptor = "I")
	final int anInt5563;

	@OriginalMember(owner = "client!zg", name = "q", descriptor = "I")
	final int anInt5565;

	@OriginalMember(owner = "client!zg", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;III)V", line = 13)
	Class4_Sub4(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt5564 = arg3;
		this.anInt5563 = arg4;
		this.anInt5565 = arg5;
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexImage3Dub(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt5564, this.anInt5563, this.anInt5565, 0, Class21_Sub2.method4149(this.aClass121_28), 5121, null, 0);
		this.method33712(true);
	}

	@OriginalMember(owner = "client!zg", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;III[BLclient!cw;)V", line = 23)
	Class4_Sub4(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class121 arg7) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt5564 = arg3;
		this.anInt5563 = arg4;
		this.anInt5565 = arg5;
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt5564, this.anInt5563, this.anInt5565, 0, Class21_Sub2.method4149(arg7), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method33712(true);
	}

	@OriginalMember(owner = "client!zg", name = "as", descriptor = "(IIIIIII)V", line = 35)
	void method33743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glCopyTexSubImage3D(this.anInt5560, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!zg", name = "an", descriptor = "(IIIIIII)V", line = 35)
	void method33744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glCopyTexSubImage3D(this.anInt5560, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!zg", name = "aj", descriptor = "(IIIIIII)V", line = 35)
	void method33745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glCopyTexSubImage3D(this.anInt5560, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}
}
