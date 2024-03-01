package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public class Class424 implements Interface47 {

	@OriginalMember(owner = "client!ra", name = "dw", descriptor = "Lclient!f;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!ra", name = "pt", descriptor = "Lclient!fo;")
	static Class178 aClass178_16;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	final int anInt4852;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V", line = 60)
	Class424(@OriginalArg(0) int arg0) {
		this.anInt4852 = arg0 * -1180860169;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "()V", line = 65)
	@Override
	public void method28241() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_90, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4852 * -628801337);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "(B)V", line = 65)
	@Override
	public void method28244() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_90, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4852 * -628801337);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 65)
	@Override
	public void method28242() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_90, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4852 * -628801337);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()V", line = 65)
	@Override
	public void method28243() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_90, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4852 * -628801337);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!ra", name = "bl", descriptor = "(Lclient!akj;ZI)V", line = 1450)
	static void method27891(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Class250.anInt3811 * -1176041819 >= 405) {
			return;
		}
		@Pc(8) Class571 local8 = arg0.aClass571_1;
		@Pc(11) String local11 = arg0.aString72;
		if (local8.anIntArray508 != null) {
			local8 = local8.method33044(aClass165_1, aClass165_1);
			if (local8 == null) {
				return;
			}
			local11 = local8.aString239;
		}
		if (!local8.aBoolean832) {
			return;
		}
		if (arg0.anInt2270 * 1652771427 != 0) {
			@Pc(49) String local49 = client.aClass543_2 == Class543.aClass543_5 ? Class601.aClass601_53.method33512(Class469.aClass530_2) : Class601.aClass601_138.method33512(Class469.aClass530_2);
			local11 = local11 + Class340.method26440(arg0.anInt2270 * 1652771427, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615) + Class1.aString1 + local49 + arg0.anInt2270 * 1652771427 + Class1.aString7;
		}
		if (client.aBoolean596 && !arg1) {
			@Pc(96) Class630 local96 = Class354.anInt4634 * 670813509 == -1 ? null : Class3_Sub20.aClass625_1.method33783(Class354.anInt4634 * 670813509);
			if ((Class162.anInt3446 * -1948586859 & 0x2) != 0 && (local96 == null || local8.method33038(Class354.anInt4634 * 670813509, local96.anInt5585 * 100041865) != local96.anInt5585 * 100041865)) {
				Class531.method32488(client.aString153, client.aString152 + " " + Class1.aString2 + " " + Class271.method25310(16776960) + local11, Class484.anInt5179 * -823340541, 8, -1, (long) (arg0.anInt2355 * 144783765), 0, 0, true, false, (long) (arg0.anInt2355 * 144783765), false);
			}
		}
		if (arg1) {
			return;
		}
		@Pc(166) String[] local166 = local8.aStringArray21;
		if (client.aBoolean598) {
			local166 = Class70.method33882(local166);
		}
		if (local166 == null) {
			return;
		}
		@Pc(180) int local180;
		@Pc(210) short local210;
		@Pc(249) int local249;
		for (local180 = local166.length - 1; local180 >= 0; local180--) {
			if (local166[local180] != null && (local8.aByte173 == 0 || !local166[local180].equalsIgnoreCase(Class601.aClass601_113.method33512(Class469.aClass530_2)) && !local166[local180].equalsIgnoreCase(Class601.aClass601_132.method33512(Class469.aClass530_2)))) {
				local210 = 0;
				@Pc(214) int local214 = client.anInt3145 * 687914897;
				if (local180 == 0) {
					local210 = 9;
				}
				if (local180 == 1) {
					local210 = 10;
				}
				if (local180 == 2) {
					local210 = 11;
				}
				if (local180 == 3) {
					local210 = 12;
				}
				if (local180 == 4) {
					local210 = 13;
				}
				if (local180 == 5) {
					local210 = 1003;
				}
				local249 = local8.method33047(local180);
				if (local249 != -1) {
					local214 = local249;
				}
				Class531.method32488(local166[local180], Class271.method25310(16776960) + local11, local166[local180].equalsIgnoreCase(Class601.aClass601_113.method33512(Class469.aClass530_2)) ? local8.anInt5394 * 1605839233 : local214, local210, -1, (long) (arg0.anInt2355 * 144783765), 0, 0, true, false, (long) (arg0.anInt2355 * 144783765), false);
			}
		}
		if (local8.aByte173 != 1) {
			return;
		}
		for (local180 = 0; local180 < local166.length; local180++) {
			if (local166[local180] != null && (local166[local180].equalsIgnoreCase(Class601.aClass601_113.method33512(Class469.aClass530_2)) || local166[local180].equalsIgnoreCase(Class601.aClass601_132.method33512(Class469.aClass530_2)))) {
				local210 = 0;
				if (arg0.anInt2270 * 1652771427 > Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615) {
					local210 = 2000;
				}
				@Pc(350) short local350 = 0;
				local249 = client.anInt3145 * 687914897;
				if (local180 == 0) {
					local350 = 9;
				}
				if (local180 == 1) {
					local350 = 10;
				}
				if (local180 == 2) {
					local350 = 11;
				}
				if (local180 == 3) {
					local350 = 12;
				}
				if (local180 == 4) {
					local350 = 13;
				}
				if (local180 == 5) {
					local350 = 1003;
				}
				if (local350 != 0) {
					local350 += local210;
				}
				@Pc(395) int local395 = local8.method33047(local180);
				if (local395 != -1) {
					local249 = local395;
				}
				Class531.method32488(local166[local180], Class271.method25310(16776960) + local11, local166[local180].equalsIgnoreCase(Class601.aClass601_113.method33512(Class469.aClass530_2)) ? local8.anInt5394 * 1605839233 : local249, local350, -1, (long) (arg0.anInt2355 * 144783765), 0, 0, true, false, (long) (arg0.anInt2355 * 144783765), false);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "nb", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6532)
	static final void method27888(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray29 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!ra", name = "vl", descriptor = "(Lclient!vs;I)V", line = 8011)
	static final void method27889(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class46.method8524();
	}

	@OriginalMember(owner = "client!ra", name = "zi", descriptor = "(Lclient!vs;I)V", line = 8577)
	static final void method27890(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.aClass245_4.aStringArray14[local12];
	}
}
