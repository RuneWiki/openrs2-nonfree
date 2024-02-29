package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public class Class602 implements Interface75 {

	@OriginalMember(owner = "client!vp", name = "aa", descriptor = "I")
	static int anInt5558;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "Lclient!vp;")
	static final Class602 aClass602_1 = new Class602(0);

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "Lclient!vp;")
	static final Class602 aClass602_3 = new Class602(1);

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "Lclient!vp;")
	static final Class602 aClass602_2 = new Class602(2);

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	final int anInt5557;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "()[Lclient!vp;", line = 14)
	public static Class602[] method32046() {
		return new Class602[] { aClass602_3, aClass602_1, aClass602_2 };
	}

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "()[Lclient!vp;", line = 14)
	public static Class602[] method32047() {
		return new Class602[] { aClass602_3, aClass602_1, aClass602_2 };
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I)V", line = 17)
	Class602(@OriginalArg(0) int arg0) {
		this.anInt5557 = arg0 * -1805716165;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "()I", line = 22)
	@Override
	public int method36479() {
		return this.anInt5557 * 301997043;
	}

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method36478() {
		return this.anInt5557 * 301997043;
	}

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "()I", line = 22)
	@Override
	public int method36477() {
		return this.anInt5557 * 301997043;
	}

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "([J[Ljava/lang/Object;III)V", line = 222)
	static void method32048(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) Object local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method32048(arg0, arg1, arg2, local10 - 1);
		method32048(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "(IIILclient!vm;B)V", line = 240)
	public static void method32049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class599 arg3) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36406()) {
			if (local4.anInt1489 * 377042463 == arg0 && arg1 << 9 == local4.anInt1490 * 1285097747 && arg2 << 9 == local4.anInt1491 * -1700987663 && arg3.anInt5510 * -1562722583 == local4.aClass599_1.anInt5510 * -1562722583) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "any", descriptor = "(Lclient!yf;I)V", line = 11944)
	static final void method32050(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class697 local2 = Class622.method32432();
		@Pc(5) String local5 = Class403.method28514();
		if (local5 == null) {
			local5 = "";
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.method36479();
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local5;
	}

	@OriginalMember(owner = "client!vp", name = "aoy", descriptor = "(Lclient!yf;I)V", line = 11996)
	static final void method32051(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3384 * 655301323;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3383 * -1383240089;
	}
}
