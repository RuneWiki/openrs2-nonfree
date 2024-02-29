package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public class Class519 {

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
	public final int anInt5123;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public final int anInt5124;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
	public final int anInt5125;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	public final int anInt5126;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 12)
	Class519() {
		this.anInt5123 = ((int) (Math.random() * 4.0D) + 32) * -1207019925;
		this.anInt5124 = ((int) (Math.random() * 2.0D) + 3) * -417960453;
		this.anInt5125 = ((int) (Math.random() * 3.0D) + 16) * 1700028133;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 1) {
			this.anInt5126 = (int) (Math.random() * 6.0D) * 567148163;
		} else {
			this.anInt5126 = (int) (Math.random() * 12.0D) * 567148163;
		}
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIII)V", line = 20)
	Class519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5123 = arg0 * -1207019925;
		this.anInt5124 = arg1 * -417960453;
		this.anInt5125 = arg2 * 1700028133;
		this.anInt5126 = arg3 * 567148163;
	}

	@OriginalMember(owner = "client!rs", name = "am", descriptor = "(IIII)V", line = 268)
	static void method30567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(11, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
		local4.anInt2953 = arg2 * -1621355885;
	}

	@OriginalMember(owner = "client!rs", name = "asq", descriptor = "(Lclient!yf;S)V", line = 12663)
	static final void method30568(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class145_Sub1 local2 = Class77_Sub1_Sub3.method1760();
		if (local2 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2068 * 539448607;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2063 * -1395637313;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local2.aString61;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.method15085();
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local2.method15087();
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2059 * 2098404975;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2066 * -663639827;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local2.aString60;
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
	}
}
