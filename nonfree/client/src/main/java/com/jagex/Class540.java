package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public class Class540 {

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "Lclient!vw;")
	static final Class540 aClass540_1 = new Class540();

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "Lclient!vw;")
	public static final Class540 aClass540_2 = new Class540();

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "Lclient!vw;")
	static final Class540 aClass540_3 = new Class540();

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V", line = 8)
	Class540() {
	}

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V", line = 93)
	public static void method32580(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_47, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg1);
		local11.aClass3_Sub41_Sub1_1.method20250(arg2);
		local11.aClass3_Sub41_Sub1_1.method20250(arg3 ? 1 : 0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg4);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(Class338.anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		if (arg2 < 13) {
			client.aBoolean579 = true;
			Class70_Sub1.method14734();
		}
		Class338.aClass550_1 = Class550.aClass550_4;
	}

	@OriginalMember(owner = "client!vw", name = "hc", descriptor = "(I)V", line = 3674)
	public static final void method32578() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray22[local1] = false;
		}
		client.anInt3093 = 1952465969;
		client.anInt3137 = 216741911;
		Class60_Sub10.anInt1865 = 0;
		Class117.anInt3204 = 0;
		Class72.anInt2086 = 1347339486;
		if (Class205.method24189() == 3) {
			@Pc(28) Class464 local28 = client.aClass370_1.method26942();
			@Pc(35) int local35 = local28.anInt5071 * -1567811631 << 9;
			@Pc(42) int local42 = local28.anInt5073 * 1360175441 << 9;
			@Pc(47) int local47 = 1000 / Class498.method29361();
			Class80.aClass23_Sub1_1.method5896((float) local47 / 1000.0F, client.aClass370_1.method26959().anIntArrayArrayArray14, client.aClass370_1.method27075(), local35, local42);
		}
		Class47.anInt1011 = -1801069635;
		Class449.anInt5013 = 2127832081;
		client.anInt3165 = client.anInt3034 * 434923139;
		Class36_Sub2.anInt886 = Class586.anInt5460 * 1285984109;
		Class3_Sub27.anInt1312 = Class140.anInt3424 * 1266577931;
		Class462.anInt5068 = Class149.anInt3434 * 791941081;
		Class542.anInt5325 = Class30.anInt2350 * -1900110513;
		Class44.anInt2202 = Class3_Sub35_Sub1.anInt2644 * -1044662693;
		Class404.anInt4809 = client.anInt3171 * -1351219281;
	}

	@OriginalMember(owner = "client!vw", name = "aaf", descriptor = "(Lclient!vs;B)V", line = 8715)
	static final void method32579(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass367Array1[local12].anInt4653 * -1802820165;
	}
}
