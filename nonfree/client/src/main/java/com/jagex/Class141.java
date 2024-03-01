package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public class Class141 {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!aml;")
	static Class3_Sub1_Sub7 aClass3_Sub1_Sub7_2;

	@OriginalMember(owner = "client!ea", name = "bc", descriptor = "Lclient!zm;")
	static Class623 aClass623_1;

	@OriginalMember(owner = "client!ea", name = "nj", descriptor = "I")
	public static int anInt3427;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!ea;")
	public static final Class141 aClass141_3 = new Class141(0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!ea;")
	static final Class141 aClass141_9 = new Class141(5);

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!ea;")
	public static final Class141 aClass141_2 = new Class141(1);

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!ea;")
	static final Class141 aClass141_10 = new Class141(9);

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!ea;")
	static final Class141 aClass141_1 = new Class141(6);

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!ea;")
	static final Class141 aClass141_4 = new Class141(3);

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!ea;")
	static final Class141 aClass141_6 = new Class141(4);

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!ea;")
	static final Class141 aClass141_7 = new Class141(7);

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!ea;")
	static final Class141 aClass141_8 = new Class141(8);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!ea;")
	static final Class141 aClass141_5 = new Class141(2);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	final int anInt3426;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V", line = 17)
	Class141(@OriginalArg(0) int arg0) {
		this.anInt3426 = arg0 * -1879027945;
	}

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "(I)I", line = 22)
	public int method23024() {
		return this.anInt3426 * 504879271 | 0x2000000;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()I", line = 22)
	public int method23025() {
		return this.anInt3426 * 504879271 | 0x2000000;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "()I", line = 22)
	public int method23026() {
		return this.anInt3426 * 504879271 | 0x2000000;
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "()I", line = 22)
	public int method23027() {
		return this.anInt3426 * 504879271 | 0x2000000;
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "()I", line = 22)
	public int method23028() {
		return this.anInt3426 * 504879271 | 0x2000000;
	}

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "(Lclient!vs;I)V", line = 110)
	static void method23029(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29482(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ea", name = "hd", descriptor = "(Lclient!vs;I)V", line = 5381)
	static final void method23033(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class174.method23395(local16, local22, true, 2, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "tg", descriptor = "(Lclient!vs;I)V", line = 7683)
	static final void method23030(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1872747294;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(53) int local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		@Pc(63) int local63 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 5];
		@Pc(82) Class366 local82 = Class510.aClass183_1.method23686(Class160.aClass160_10, Class510.aClass183_1, local13, local23, local43, aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local53, false);
		if (local82 != null) {
			Class510.aClass183_1.method23597(local82, local63, local33);
		}
	}

	@OriginalMember(owner = "client!ea", name = "xh", descriptor = "(Lclient!vs;B)V", line = 8263)
	static final void method23031(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 790013775;
		arg0.anInt5319 -= 936373647;
		@Pc(20) String local20 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(33) boolean local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381] == 1;
		@Pc(48) boolean local48 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		@Pc(63) boolean local63 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2] == 1;
		@Pc(69) Class3_Sub23 local69 = Class269.method25284(Class311.aClass311_7, client.aClass82_1.aClass577_2);
		local69.aClass3_Sub41_Sub1_1.method20251(Class43_Sub2.method8763(local20) + 1);
		local69.aClass3_Sub41_Sub1_1.method20260(local20);
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
		local69.aClass3_Sub41_Sub1_1.method20250(local85);
		client.aClass82_1.method21601(local69);
	}

	@OriginalMember(owner = "client!ea", name = "ano", descriptor = "(Lclient!vs;B)V", line = 11443)
	static final void method23032(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
	}
}
