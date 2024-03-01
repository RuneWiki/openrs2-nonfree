package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public class Class169 {

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	public final int anInt3457;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public final int anInt3456;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[I")
	public final int[] anIntArray356;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!ch;")
	public final Class5 aClass5_1;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	final int anInt3458;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(II[I[ILclient!ch;I)V", line = 913)
	Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5) {
		this.anInt3457 = arg0 * 1451707075;
		this.anInt3456 = arg1 * 548006013;
		this.anIntArray357 = arg2;
		this.anIntArray356 = arg3;
		this.aClass5_1 = arg4;
		this.anInt3458 = arg5 * -1545297539;
	}

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "(III)Z", line = 923)
	public boolean method23352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray356.length) {
			@Pc(11) int local11 = this.anIntArray356[arg1];
			if (arg0 >= local11 && arg0 <= this.anIntArray357[arg1] + local11) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z", line = 923)
	public boolean method23353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray356.length) {
			@Pc(11) int local11 = this.anIntArray356[arg1];
			if (arg0 >= local11 && arg0 <= this.anIntArray357[arg1] + local11) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "ov", descriptor = "(Lclient!vs;B)V", line = 6686)
	static final void method23354(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class472.method28778(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!fe", name = "ang", descriptor = "(Lclient!vs;B)V", line = 11448)
	static final void method23355(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 1 : 0);
		Class26_Sub1_Sub1_Sub1.method16728();
		Class457.method28515();
		Class412.method27705();
		client.aBoolean573 = false;
	}
}
