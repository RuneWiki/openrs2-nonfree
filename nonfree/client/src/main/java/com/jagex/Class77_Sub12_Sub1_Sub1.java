package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asp")
public class Class77_Sub12_Sub1_Sub1 extends Class77_Sub12_Sub1 {

	@OriginalMember(owner = "client!asp", name = "r", descriptor = "[I")
	int[] anIntArray293 = null;

	@OriginalMember(owner = "client!asp", name = "s", descriptor = "Lclient!agy;")
	Class112_Sub2 aClass112_Sub2_2;

	@OriginalMember(owner = "client!asp", name = "<init>", descriptor = "(Lclient!agy;Lclient!hf;)V", line = 14)
	Class77_Sub12_Sub1_Sub1(@OriginalArg(0) Class112_Sub2 arg0, @OriginalArg(1) Class297 arg1) {
		super(arg1);
		this.aClass112_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!asp", name = "n", descriptor = "()I", line = 19)
	final int method23319() {
		return this.anIntArray293[this.aClass112_Sub2_2.method9470()];
	}

	@OriginalMember(owner = "client!asp", name = "a", descriptor = "()I", line = 19)
	final int method23320() {
		return this.anIntArray293[this.aClass112_Sub2_2.method9470()];
	}

	@OriginalMember(owner = "client!asp", name = "t", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23566(@OriginalArg(0) int arg0) {
		if (this.anIntArray293 == null) {
			this.anIntArray293 = new int[this.aClass112_Sub2_2.method9460()];
		}
		@Pc(16) Class105_Sub1 local16 = (Class105_Sub1) this.aClass112_Sub2_2.method9461(arg0);
		this.anIntArray293[arg0] = OpenGL.glGetUniformLocation(local16.anInt1012, this.method23551());
		return this.anIntArray293[arg0] != -1;
	}

	@OriginalMember(owner = "client!asp", name = "p", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23564(@OriginalArg(0) int arg0) {
		if (this.anIntArray293 == null) {
			this.anIntArray293 = new int[this.aClass112_Sub2_2.method9460()];
		}
		@Pc(16) Class105_Sub1 local16 = (Class105_Sub1) this.aClass112_Sub2_2.method9461(arg0);
		this.anIntArray293[arg0] = OpenGL.glGetUniformLocation(local16.anInt1012, this.method23551());
		return this.anIntArray293[arg0] != -1;
	}

	@OriginalMember(owner = "client!asp", name = "w", descriptor = "(I)I", line = 30)
	@Override
	public final int method23565(@OriginalArg(0) int arg0) {
		return this.anIntArray293[arg0];
	}

	@OriginalMember(owner = "client!asp", name = "b", descriptor = "(I)I", line = 30)
	@Override
	public final int method23567(@OriginalArg(0) int arg0) {
		return this.anIntArray293[arg0];
	}
}
