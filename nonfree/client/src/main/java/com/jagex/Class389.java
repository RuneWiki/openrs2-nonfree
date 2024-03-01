package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public class Class389 {

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!ph;")
	public static final Class389 aClass389_3 = new Class389();

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!ph;")
	static final Class389 aClass389_4 = new Class389();

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Lclient!ph;")
	static final Class389 aClass389_5 = new Class389();

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "(Lclient!ahb;I)Lclient!ki;", line = 37)
	public static Class278 method27402(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) String local3 = arg0.method20283();
		@Pc(10) Class277 local10 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(17) Class276 local17 = Class400.method27575()[arg0.method20269()];
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20272();
		@Pc(29) int local29 = arg0.method20269();
		@Pc(33) int local33 = arg0.method20269();
		@Pc(37) int local37 = arg0.method20269();
		@Pc(41) int local41 = arg0.method20271();
		@Pc(45) int local45 = arg0.method20271();
		@Pc(49) int local49 = arg0.method20375();
		@Pc(53) int local53 = arg0.method20275();
		@Pc(57) int local57 = arg0.method20275();
		return new Class278(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 863)
	Class389() {
	}

	@OriginalMember(owner = "client!ph", name = "gi", descriptor = "(B)V", line = 3530)
	public static final void method27407() {
		if (!client.aBoolean585) {
			client.aFloat239 += (-24.0F - client.aFloat239) / 2.0F;
			client.aBoolean586 = true;
			client.aBoolean585 = true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "aa", descriptor = "(Lclient!vs;B)V", line = 4016)
	static final void method27405(@OriginalArg(0) Class536 arg0) {
		@Pc(9) Class290 local9 = (Class290) arg0.aClass3_Sub1_Sub6_2.anObjectArray4[arg0.anInt5318 * -2140198955];
		@Pc(32) Interface6 local32 = (Interface6) (arg0.anIntArray497[arg0.anInt5318 * -2140198955] == 0 ? arg0.aMap15.get(local9.aClass11_1.aClass43_3) : arg0.aMap16.get(local9.aClass11_1.aClass43_3));
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local32.method32384(local9);
	}

	@OriginalMember(owner = "client!ph", name = "ea", descriptor = "(Lclient!vs;I)V", line = 4854)
	static final void method27406(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class146.method23082(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "aqk", descriptor = "(Lclient!vs;I)V", line = 11903)
	static final void method27403(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3125 * -1579500007;
	}

	@OriginalMember(owner = "client!ph", name = "are", descriptor = "(Lclient!vs;B)V", line = 12115)
	static final void method27404(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (Class545.aLong284 * -1465639016483960081L / 60000L);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) ((Class545.aLong284 * -1465639016483960081L - Class176.method23413() - Class215.aLong243 * 4184660209050375353L) / 60000L);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class174.aBoolean625 ? 1 : 0;
	}
}
