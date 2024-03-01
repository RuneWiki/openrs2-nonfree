package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public class Class531 implements Interface56 {

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Lclient!vl;")
	public static final Class531 aClass531_1 = new Class531(0, "");

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!vl;")
	public static final Class531 aClass531_2 = new Class531(1, "");

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	final int anInt5309;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 10)
	Class531(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this.anInt5309 = arg0 * 1959569469;
	}

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "()I", line = 15)
	@Override
	public int method33764() {
		return this.anInt5309 * -70308075;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I", line = 15)
	@Override
	public int method33765() {
		return this.anInt5309 * -70308075;
	}

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method33767() {
		return this.anInt5309 * -70308075;
	}

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "()I", line = 15)
	@Override
	public int method33766() {
		return this.anInt5309 * -70308075;
	}

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "(Lclient!de;IIIIIIII)V", line = 339)
	static void method32491(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class438 local3 = client.aClass370_1.method26950();
		@Pc(11) Interface43 local11 = (Interface43) local3.method28066(arg1, arg2, arg3);
		@Pc(23) Class467 local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(49) int local49;
		if (local11 != null) {
			local23 = client.aClass370_1.method26954().method28510(local11.method11163());
			local29 = local11.method11147() & 0x3;
			local33 = local11.method11146();
			if (local23.anInt5090 * 748511055 == -1) {
				local49 = arg6;
				if (local23.anInt5082 * 1242646151 > 0) {
					local49 = arg7;
				}
				if (Class456.aClass456_4.anInt5061 * 821735799 == local33 || Class456.aClass456_3.anInt5061 * 821735799 == local33) {
					if (local29 == 0) {
						arg0.method17066(arg4, arg5, 4, local49);
					} else if (local29 == 1) {
						arg0.method17065(arg4, arg5, 4, local49);
					} else if (local29 == 2) {
						arg0.method17066(arg4 + 3, arg5, 4, local49);
					} else if (local29 == 3) {
						arg0.method17065(arg4, arg5 + 3, 4, local49);
					}
				}
				if (local33 == Class456.aClass456_14.anInt5061 * 821735799) {
					if (local29 == 0) {
						arg0.method17063(arg4, arg5, 1, 1, local49);
					} else if (local29 == 1) {
						arg0.method17063(arg4 + 3, arg5, 1, 1, local49);
					} else if (local29 == 2) {
						arg0.method17063(arg4 + 3, arg5 + 3, 1, 1, local49);
					} else if (local29 == 3) {
						arg0.method17063(arg4, arg5 + 3, 1, 1, local49);
					}
				}
				if (local33 == Class456.aClass456_3.anInt5061 * 821735799) {
					if (local29 == 0) {
						arg0.method17065(arg4, arg5, 4, local49);
					} else if (local29 == 1) {
						arg0.method17066(arg4 + 3, arg5, 4, local49);
					} else if (local29 == 2) {
						arg0.method17065(arg4, arg5 + 3, 4, local49);
					} else if (local29 == 3) {
						arg0.method17066(arg4, arg5, 4, local49);
					}
				}
			} else {
				Class3_Sub42_Sub1.method19546(arg0, local23, local29, arg4, arg5);
			}
		}
		local11 = (Interface43) local3.method28150(arg1, arg2, arg3, client.anInterface48_1);
		if (local11 != null) {
			local23 = client.aClass370_1.method26954().method28510(local11.method11163());
			local29 = local11.method11147() & 0x3;
			local33 = local11.method11146();
			if (local23.anInt5090 * 748511055 != -1) {
				Class3_Sub42_Sub1.method19546(arg0, local23, local29, arg4, arg5);
			} else if (Class456.aClass456_6.anInt5061 * 821735799 == local33) {
				local49 = -1118482;
				if (local23.anInt5082 * 1242646151 > 0) {
					local49 = -1179648;
				}
				if (local29 == 0 || local29 == 2) {
					arg0.method17067(arg4, arg5 + 3, arg4 + 3, arg5, local49);
				} else {
					arg0.method17067(arg4, arg5, arg4 + 3, arg5 + 3, local49);
				}
			}
		}
		local11 = (Interface43) local3.method28053(arg1, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local23 = client.aClass370_1.method26954().method28510(local11.method11163());
		local29 = local11.method11147() & 0x3;
		if (local23.anInt5090 * 748511055 != -1) {
			Class3_Sub42_Sub1.method19546(arg0, local23, local29, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZI)V", line = 490)
	static void method32488(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		if (!Class250.aBoolean688 && Class250.anInt3811 * -1176041819 < 513) {
			@Pc(16) int local16 = arg2 == -1 ? client.anInt3159 * -651417687 : arg2;
			@Pc(32) Class3_Sub1_Sub7 local32 = new Class3_Sub1_Sub7(arg0, arg1, local16, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			Class372.method27205(local32);
		}
	}

	@OriginalMember(owner = "client!vl", name = "pl", descriptor = "(Lclient!vs;I)V", line = 6836)
	static final void method32489(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3510 * -1926174821;
	}

	@OriginalMember(owner = "client!vl", name = "zy", descriptor = "(Lclient!vs;I)V", line = 8688)
	static final void method32492(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class511.method29584(arg0.aClass3_Sub30_3 == Class68.aClass3_Sub30_2, local12);
	}

	@OriginalMember(owner = "client!vl", name = "afe", descriptor = "(Lclient!vs;I)V", line = 9893)
	static final void method32490(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
	}
}
