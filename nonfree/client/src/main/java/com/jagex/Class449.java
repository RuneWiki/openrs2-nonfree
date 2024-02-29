package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public class Class449 {

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
	public static final int anInt4951 = 0;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public static final int anInt4952 = 2;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
	public static final int anInt4953 = 4;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
	public static final int anInt4954 = 3;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
	public static final int anInt4955 = 1;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V", line = 10)
	Class449() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "(Lclient!dx;Lclient!gm;B)V", line = 20)
	static void method29226(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class277 arg1) {
		@Pc(37) boolean local37 = Class537.aClass35_Sub7_1.method17008(arg0, arg1.anInt3936 * 403396513, arg1.anInt3934 * -148110895, arg1.anInt3887 * 973326593, arg1.anInt3930 * 2071487835 | 0xFF000000, arg1.anInt3900 * 1245616333, arg1.aBoolean683 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 : null) == null;
		if (local37) {
			Class132.aClass695_16.method36383(new Class77_Sub8(arg1.anInt3936 * 403396513, arg1.anInt3934 * -148110895, arg1.anInt3887 * 973326593, arg1.anInt3930 * 2071487835 | 0xFF000000, arg1.anInt3900 * 1245616333, arg1.aBoolean683));
			Class461.method29531(arg1);
		}
	}

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "(IIZB)I", line = 30)
	public static int method29227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray192.length) {
			return local4.anIntArray192[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "(II)V", line = 117)
	public static void method29228(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(7, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "(I)V", line = 127)
	public static final void method29229() {
		Class589.anInt5485 = 850224666;
		Class589.anInt5490 = 1524080378;
		Class589.anInt5465 = 1659880394;
	}

	@OriginalMember(owner = "client!oq", name = "wc", descriptor = "(Lclient!yf;B)V", line = 8529)
	static final void method29230(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean599 ? 1 : 0;
	}

	@OriginalMember(owner = "client!oq", name = "xw", descriptor = "(Lclient!yf;I)V", line = 8824)
	static final void method29231(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= 1460193483;
		arg0.anInt5784 -= 926998689;
		@Pc(20) String local20 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(33) boolean local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] == 1;
		@Pc(48) boolean local48 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		@Pc(63) boolean local63 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] == 1;
		@Pc(69) Class77_Sub20 local69 = Class365.method28132(Class414.aClass414_101, client.aClass82_1.aClass16_1);
		local69.aClass77_Sub39_Sub1_2.method22408(Class664.method33107(local20) + 1);
		local69.aClass77_Sub39_Sub1_2.method22440(local20);
		@Pc(85) int local85 = 0;
		if (local33) {
			local85 |= 0x1;
		}
		if (local48) {
			local85 |= 0x2;
		}
		if (local63) {
			local85 |= 0x4;
		}
		local69.aClass77_Sub39_Sub1_2.method22403(local85);
		client.aClass82_1.method2004(local69);
	}

	@OriginalMember(owner = "client!oq", name = "ajl", descriptor = "(Lclient!yf;I)V", line = 11197)
	static final void method29232(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		client.anInt3396 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] * 1990883323;
		client.anInt3473 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] * 186586621;
	}

	@OriginalMember(owner = "client!oq", name = "axm", descriptor = "(Lclient!yf;I)V", line = 13367)
	static final void method29233(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
