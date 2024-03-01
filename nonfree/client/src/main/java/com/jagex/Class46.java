package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public abstract class Class46 {

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 4)
	Class46() {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I", line = 16)
	public static int method8524() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(16) Class21 local16 = Class544.method32605(0, local3, null, null, null, 0);
		@Pc(19) long local19 = Class176.method23413();
		@Pc(21) int local21;
		for (local21 = 0; local21 < 10000; local21++) {
			local16.method17070(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local21 = (int) (Class176.method23413() - local19);
		local16.method17063(0, 0, 100, 100, -16777216);
		local16.method17020();
		return local21;
	}

	@OriginalMember(owner = "client!mn", name = "rf", descriptor = "(Lclient!vs;I)V", line = 7278)
	static final void method8522(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3573 * 598019781;
	}

	@OriginalMember(owner = "client!mn", name = "zb", descriptor = "(Lclient!vs;I)V", line = 8669)
	static final void method8521(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass3_Sub30_3.anInt1331 * 132295085;
	}

	@OriginalMember(owner = "client!mn", name = "ly", descriptor = "(Lclient!fo;III)V", line = 11295)
	static void method8523(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class169 local4 = arg0.method23435(Class613.aClass21_13);
		if (local4 == null) {
			return;
		}
		Class613.aClass21_13.method17079(arg1, arg2, arg0.anInt3498 * -1494060731 + arg1, arg0.anInt3499 * -751005789 + arg2);
		if (Class2.anInt4 * -741112023 >= 3) {
			Class613.aClass21_13.method17095(-16777216, local4.aClass5_1, arg1, arg2);
			return;
		}
		@Pc(43) int local43;
		if (Class72.anInt2086 * 81180077 == 3) {
			local43 = (int) -((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D);
		} else {
			local43 = (int) -client.aFloat238;
		}
		local43 = local43 + client.anInt3081 * 1464694014 & 0x3FFF;
		local43 <<= 0x2;
		Class568.aClass6_36.method16833((float) (arg0.anInt3498 * -1494060731) / 2.0F + (float) arg1, (float) arg2 + (float) (arg0.anInt3499 * -751005789) / 2.0F, 4366, local43, local4.aClass5_1, arg1, arg2);
	}

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "(I)I")
	abstract int method8505(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "(I)Lclient!md;")
	abstract Class316 method8506();

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[B")
	abstract byte[] method8507(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(II)V")
	abstract void method8508(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "(II)I")
	abstract int method8509(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "()Lclient!md;")
	abstract Class316 method8510();

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "()Lclient!md;")
	abstract Class316 method8511();

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "(I)[B")
	abstract byte[] method8512(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	abstract void method8513(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	abstract void method8514(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "(I)I")
	abstract int method8515(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "(I)V")
	abstract void method8516(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)I")
	abstract int method8517(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "(I)[B")
	abstract byte[] method8518(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "(I)[B")
	abstract byte[] method8519(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "(I)I")
	abstract int method8520(@OriginalArg(0) int arg0);
}
