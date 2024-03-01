package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aog")
public class Class3_Sub19_Sub1_Sub2 extends Class3_Sub19_Sub1 {

	@OriginalMember(owner = "client!aog", name = "z", descriptor = "[I")
	int[] anIntArray274 = null;

	@OriginalMember(owner = "client!aog", name = "c", descriptor = "Lclient!acp;")
	Class24_Sub2 aClass24_Sub2_2;

	@OriginalMember(owner = "client!aog", name = "<init>", descriptor = "(Lclient!acp;Lclient!fr;)V", line = 14)
	Class3_Sub19_Sub1_Sub2(@OriginalArg(0) Class24_Sub2 arg0, @OriginalArg(1) Class181 arg1) {
		super(arg1);
		this.aClass24_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!aog", name = "k", descriptor = "()I", line = 19)
	final int method20828() {
		return this.anIntArray274[this.aClass24_Sub2_2.method6628()];
	}

	@OriginalMember(owner = "client!aog", name = "af", descriptor = "()I", line = 19)
	final int method20829() {
		return this.anIntArray274[this.aClass24_Sub2_2.method6628()];
	}

	@OriginalMember(owner = "client!aog", name = "at", descriptor = "()I", line = 19)
	final int method20830() {
		return this.anIntArray274[this.aClass24_Sub2_2.method6628()];
	}

	@OriginalMember(owner = "client!aog", name = "p", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method20811(@OriginalArg(0) int arg0) {
		if (this.anIntArray274 == null) {
			this.anIntArray274 = new int[this.aClass24_Sub2_2.method6556()];
		}
		@Pc(16) Class25_Sub2 local16 = (Class25_Sub2) this.aClass24_Sub2_2.method6549(arg0);
		this.anIntArray274[arg0] = OpenGL.glGetUniformLocation(local16.anInt629, this.method20812());
		return this.anIntArray274[arg0] != -1;
	}

	@OriginalMember(owner = "client!aog", name = "n", descriptor = "(I)I", line = 30)
	@Override
	public final int method20814(@OriginalArg(0) int arg0) {
		return this.anIntArray274[arg0];
	}

	@OriginalMember(owner = "client!aog", name = "x", descriptor = "(I)I", line = 30)
	@Override
	public final int method20815(@OriginalArg(0) int arg0) {
		return this.anIntArray274[arg0];
	}

	@OriginalMember(owner = "client!aog", name = "i", descriptor = "(I)I", line = 30)
	@Override
	public final int method20825(@OriginalArg(0) int arg0) {
		return this.anIntArray274[arg0];
	}

	@OriginalMember(owner = "client!aog", name = "f", descriptor = "(I)I", line = 30)
	@Override
	public final int method20810(@OriginalArg(0) int arg0) {
		return this.anIntArray274[arg0];
	}

	@OriginalMember(owner = "client!aog", name = "j", descriptor = "(I)I", line = 30)
	@Override
	public final int method20824(@OriginalArg(0) int arg0) {
		return this.anIntArray274[arg0];
	}
}
