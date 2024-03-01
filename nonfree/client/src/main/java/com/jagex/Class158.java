package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public class Class158 {

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Lclient!et;")
	public static final Class158 aClass158_5 = new Class158();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!et;")
	static final Class158 aClass158_2 = new Class158();

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!et;")
	static final Class158 aClass158_3 = new Class158();

	@OriginalMember(owner = "client!et", name = "l", descriptor = "Lclient!et;")
	static final Class158 aClass158_4 = new Class158();

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!et;")
	public static final Class158 aClass158_1 = new Class158();

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 10)
	Class158() {
	}

	@OriginalMember(owner = "client!et", name = "bs", descriptor = "(IIB)V", line = 293)
	static void method23200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(15, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!et", name = "ha", descriptor = "(IIB)V", line = 3642)
	public static final void method23198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		arg0 -= local3.anInt5071 * -1567811631;
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= client.aClass370_1.method26943()) {
			arg0 = client.aClass370_1.method26943();
		}
		arg1 -= local3.anInt5073 * 1360175441;
		if (arg1 < 0) {
			arg1 = 0;
		} else if (arg1 >= client.aClass370_1.method27062()) {
			arg1 = client.aClass370_1.method27062();
		}
		Class324.method25999();
		Class403.anInt4808 = Class586.anInt5460 * -474675793;
		Class48.anInt1088 = Class149.anInt3434 * 1562921949;
		client.anInt3085 = ((arg0 << 9) + 256) * 885393701;
		client.anInt3086 = ((arg1 << 9) + 256) * -546211981;
		Class72.anInt2086 = 898226324;
		Class47.anInt1011 = -1801069635;
		Class449.anInt5013 = 2127832081;
	}

	@OriginalMember(owner = "client!et", name = "bv", descriptor = "(Lclient!vs;I)V", line = 4377)
	static final void method23196(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class237.method24611(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!et", name = "tq", descriptor = "(Lclient!vs;I)V", line = 7703)
	static final void method23197(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		Class510.aClass183_1.method23606(local13);
	}

	@OriginalMember(owner = "client!et", name = "xj", descriptor = "(Lclient!vs;B)V", line = 8307)
	static final void method23199(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass313Array1[local12].anInt4531 * 932041285;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!et", name = "aje", descriptor = "(Lclient!vs;Lclient!act;I)V", line = 10765)
	static final void method23201(@OriginalArg(0) Class536 arg0, @OriginalArg(1) Class26_Sub1_Sub1_Sub1 arg1) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(48) boolean local48 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] == 1;
		if (Class80.aClass23_Sub1_1.method5830() != Class208.aClass208_3) {
			throw new RuntimeException();
		}
		@Pc(62) Class69_Sub5 local62 = (Class69_Sub5) Class80.aClass23_Sub1_1.method5799();
		if (arg1 != null) {
			local62.method14690(arg1, new Class320((float) local13, (float) local23, (float) local33), local48);
		}
		client.aBoolean586 = true;
	}
}
