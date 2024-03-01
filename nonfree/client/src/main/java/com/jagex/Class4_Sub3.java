package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aao")
public class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!aao", name = "r", descriptor = "I")
	final int anInt114;

	@OriginalMember(owner = "client!aao", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;I[BLclient!cw;)V", line = 11)
	Class4_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.anInt114 = arg3;
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.anInt5560, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), this.anInt114, 0, Class21_Sub2.method4149(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aao", name = "an", descriptor = "(Z)V", line = 21)
	void method936(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aao", name = "as", descriptor = "(Z)V", line = 21)
	void method937(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aao", name = "aj", descriptor = "(Z)V", line = 21)
	void method938(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aao", name = "ai", descriptor = "(Z)V", line = 21)
	void method939(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aao", name = "aq", descriptor = "(Z)V", line = 21)
	void method940(@OriginalArg(0) boolean arg0) {
		this.aClass21_Sub2_47.method4074(this);
		OpenGL.glTexParameteri(this.anInt5560, 10242, arg0 ? 10497 : 33071);
	}
}
