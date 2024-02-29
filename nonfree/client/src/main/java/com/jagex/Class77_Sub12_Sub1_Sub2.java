package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asw")
public final class Class77_Sub12_Sub1_Sub2 extends Class77_Sub12_Sub1 {

	@OriginalMember(owner = "client!asw", name = "r", descriptor = "[I")
	int[] anIntArray295 = null;

	@OriginalMember(owner = "client!asw", name = "g", descriptor = "[I")
	int[] anIntArray294 = null;

	@OriginalMember(owner = "client!asw", name = "s", descriptor = "Lclient!agx;")
	Class112_Sub1 aClass112_Sub1_2;

	@OriginalMember(owner = "client!asw", name = "<init>", descriptor = "(Lclient!agx;Lclient!hf;)V", line = 14)
	Class77_Sub12_Sub1_Sub2(@OriginalArg(0) Class112_Sub1 arg0, @OriginalArg(1) Class297 arg1) {
		super(arg1);
		this.aClass112_Sub1_2 = arg0;
		this.anIntArray295 = arg1.anIntArray417;
		this.anIntArray294 = arg1.anIntArray416;
	}

	@OriginalMember(owner = "client!asw", name = "t", descriptor = "(I)Z", line = 21)
	@Override
	public boolean method23566(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!asw", name = "p", descriptor = "(I)Z", line = 21)
	@Override
	public boolean method23564(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!asw", name = "m", descriptor = "()I", line = 25)
	final int method23568() {
		return this.anIntArray295[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "h", descriptor = "()I", line = 25)
	final int method23569() {
		return this.anIntArray295[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "n", descriptor = "()I", line = 25)
	final int method23570() {
		return this.anIntArray295[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "a", descriptor = "()I", line = 29)
	final int method23571() {
		return this.anIntArray294[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "aj", descriptor = "()I", line = 29)
	final int method23572() {
		return this.anIntArray294[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "ai", descriptor = "()I", line = 29)
	final int method23573() {
		return this.anIntArray294[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "ag", descriptor = "()I", line = 29)
	final int method23574() {
		return this.anIntArray294[this.aClass112_Sub1_2.method9470()];
	}

	@OriginalMember(owner = "client!asw", name = "w", descriptor = "(I)I", line = 33)
	@Override
	public final int method23565(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray295[arg0];
		@Pc(9) int local9 = this.anIntArray294[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!asw", name = "b", descriptor = "(I)I", line = 33)
	@Override
	public final int method23567(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray295[arg0];
		@Pc(9) int local9 = this.anIntArray294[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}
}
