package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public class Class342 implements Interface56 {

	@OriginalMember(owner = "client!nd", name = "hk", descriptor = "Lclient!zs;")
	public static Class629 aClass629_3;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!nd;")
	public static final Class342 aClass342_5 = new Class342(3, 0, Integer.class);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!nd;")
	public static final Class342 aClass342_2 = new Class342(2, 1, Long.class);

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!nd;")
	public static final Class342 aClass342_3 = new Class342(0, 2, String.class);

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!nd;")
	static final Class342 aClass342_4 = new Class342(1, 3, Class3_Sub32.class);

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public final int anInt4604;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	final int anInt4605;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Ljava/lang/Class;")
	public final Class aClass1;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "(B)[Lclient!nd;", line = 19)
	public static Class342[] method26467() {
		return new Class342[] { aClass342_3, aClass342_5, aClass342_4, aClass342_2 };
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "()[Lclient!nd;", line = 19)
	public static Class342[] method26469() {
		return new Class342[] { aClass342_3, aClass342_5, aClass342_4, aClass342_2 };
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IILjava/lang/Class;)V", line = 22)
	Class342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2) {
		this.anInt4604 = arg0 * -354218293;
		this.anInt4605 = arg1 * 681980043;
		this.aClass1 = arg2;
	}

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "()I", line = 29)
	@Override
	public int method33767() {
		return this.anInt4605 * 1279047459;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I", line = 29)
	@Override
	public int method33765() {
		return this.anInt4605 * 1279047459;
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "()I", line = 29)
	@Override
	public int method33766() {
		return this.anInt4605 * 1279047459;
	}

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "()I", line = 29)
	@Override
	public int method33764() {
		return this.anInt4605 * 1279047459;
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V", line = 80)
	public static void method26473() {
		if (Class570.aClass585_4.anInt5458 * 146668341 != -1) {
			Class463.method28613(Class570.aClass585_4.anInt5458 * 146668341, Class570.aClass585_4.aString242);
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(Lclient!ww;I)V", line = 158)
	static void method26471(@OriginalArg(0) Class564 arg0) {
		Class338.aClass564_1 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 167)
	public static void method26468(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg0.length() > 320 || !Class404.method27638()) {
			return;
		}
		client.aClass82_1.method21604();
		Class381.method27304();
		Class190.aString178 = arg0;
		Class190.aString179 = arg1;
		Class166.method23342(19);
	}

	@OriginalMember(owner = "client!nd", name = "bp", descriptor = "(Lclient!de;I)V", line = 1283)
	static void method26470(@OriginalArg(0) Class21 arg0) {
		@Pc(3) int local3 = Class284.anInt4355 * 989672103;
		@Pc(7) int local7 = Class338.anInt4600 * 1100948139;
		@Pc(11) int local11 = Class13_Sub14.anInt663 * -1045688681;
		@Pc(17) int local17 = Class294.anInt4390 * -1006383485 - 3;
		@Pc(19) byte local19 = 20;
		if (Class60_Sub24.aClass14_6 == null || Class462.aClass611_11 == null) {
			Class60_Sub24.aClass14_6 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, Class555.anInt5334 * 1907180431, true, true);
			Class462.aClass611_11 = Class379.aClass312_1.method25786(client.anInterface34_1, Class555.anInt5334 * 1907180431);
			if (Class60_Sub24.aClass14_6 != null && Class462.aClass611_11 != null) {
				Class604.method33533();
				@Pc(55) int local55 = local11 / 2 + local3;
				if (local55 + local11 > Class128.anInt3317 * 2037417253) {
					local55 = Class128.anInt3317 * 2037417253 - local11;
				}
				if (local55 < 0) {
					local55 = 0;
				}
				Class210.method24249(local55, Class338.anInt4600 * 1100948139);
				return;
			}
		}
		@Pc(85) Class14 local85;
		if (Class60_Sub24.aClass14_6 == null || Class462.aClass611_11 == null) {
			local85 = Class568.aClass14_13;
		} else {
			local85 = Class60_Sub24.aClass14_6;
		}
		@Pc(91) Class611 local91 = Class49_Sub1.method9259();
		Class135.method22918(arg0, Class284.anInt4355 * 989672103, Class338.anInt4600 * 1100948139, Class13_Sub14.anInt663 * -1045688681, Class294.anInt4390 * -1006383485, local19, local85, local91, Class601.aClass601_134.method33512(Class469.aClass530_2));
		@Pc(123) int local123 = 255 - Class57_Sub1.anInt1371 * -240999429 - Class250.anInt3818 * 565960411;
		if (local123 < 0) {
			local123 = 0;
		}
		@Pc(131) int local131 = Class3_Sub10.aClass61_1.method12740();
		@Pc(135) int local135 = Class3_Sub10.aClass61_1.method12741();
		@Pc(139) int local139;
		@Pc(144) Class3_Sub1_Sub7 local144;
		@Pc(170) int local170;
		@Pc(245) Class3_Sub1_Sub9 local245;
		if (Class250.aBoolean687) {
			local139 = 0;
			for (local245 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local245 != null; local245 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
				local170 = local139 * Class250.anInt3804 * 192470685 + 1 + local91.anInt5537 * -1760037867 + local7 + local19;
				if (local131 > Class284.anInt4355 * 989672103 && local131 < Class13_Sub14.anInt663 * -1045688681 + Class284.anInt4355 * 989672103 && local135 > local170 - local91.anInt5537 * -1760037867 - 1 && local135 < local170 + local91.anInt5536 * -1990992757 && (local245.anInt2669 * 2127103997 > 1 || ((Class3_Sub1_Sub7) local245.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).aBoolean470)) {
					arg0.method17050(Class284.anInt4355 * 989672103, local170 - local91.anInt5537 * -1760037867, Class13_Sub14.anInt663 * -1045688681, Class250.anInt3804 * 192470685, local123 << 24 | Class13_Sub17.anInt685 * -273186203, 1);
				}
				local139++;
			}
			if (Class250.aClass3_Sub1_Sub9_1 != null) {
				Class135.method22918(arg0, Class356.anInt4637 * 1084730905, Class151.anInt3438 * 2118805765, Class381.anInt4707 * -1605305641, Class598.anInt5520 * 1979992829, local19, local85, local91, Class250.aClass3_Sub1_Sub9_1.aString112);
				local139 = 0;
				for (local144 = (Class3_Sub1_Sub7) Class250.aClass3_Sub1_Sub9_1.aClass546_9.method32623(); local144 != null; local144 = (Class3_Sub1_Sub7) Class250.aClass3_Sub1_Sub9_1.aClass546_9.method32645()) {
					local170 = local91.anInt5537 * -1760037867 + 1 + local19 + Class151.anInt3438 * 2118805765 + local139 * Class250.anInt3804 * 192470685;
					if (local131 > Class356.anInt4637 * 1084730905 && local131 < Class356.anInt4637 * 1084730905 + Class381.anInt4707 * -1605305641 && local135 > local170 - local91.anInt5537 * -1760037867 - 1 && local135 < local170 + local91.anInt5536 * -1990992757 && local144.aBoolean470) {
						arg0.method17050(Class356.anInt4637 * 1084730905, local170 - local91.anInt5537 * -1760037867, Class381.anInt4707 * -1605305641, Class250.anInt3804 * 192470685, local123 << 24 | Class13_Sub17.anInt685 * -273186203, 1);
					}
					local139++;
				}
				Class508.method29570(arg0, Class356.anInt4637 * 1084730905, Class151.anInt3438 * 2118805765, Class381.anInt4707 * -1605305641, Class598.anInt5520 * 1979992829, local19);
			}
		} else {
			local139 = 0;
			for (local144 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local144 != null; local144 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
				local170 = (Class250.anInt3811 * -1176041819 - 1 - local139) * Class250.anInt3804 * 192470685 + local7 + local19 + local91.anInt5537 * -1760037867 + 1;
				if (local131 > Class284.anInt4355 * 989672103 && local131 < Class284.anInt4355 * 989672103 + Class13_Sub14.anInt663 * -1045688681 && local135 > local170 - local91.anInt5537 * -1760037867 - 1 && local135 < local170 + local91.anInt5536 * -1990992757 && local144.aBoolean470) {
					arg0.method17050(Class284.anInt4355 * 989672103, local170 - local91.anInt5537 * -1760037867, Class13_Sub14.anInt663 * -1045688681, Class250.anInt3804 * 192470685, local123 << 24 | Class13_Sub17.anInt685 * -273186203, 1);
				}
				local139++;
			}
		}
		Class508.method29570(arg0, Class284.anInt4355 * 989672103, Class338.anInt4600 * 1100948139, Class13_Sub14.anInt663 * -1045688681, Class294.anInt4390 * -1006383485, local19);
		if (!Class250.aBoolean687) {
			local139 = 0;
			for (local144 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local144 != null; local144 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
				local170 = (Class250.anInt3811 * -1176041819 - 1 - local139) * Class250.anInt3804 * 192470685 + local19 + local7 + local91.anInt5537 * -1760037867 + 1;
				Class3_Sub14.method11264(local131, local135, local3, local7, local11, local17, local170, local144, local85, local91, Class539.anInt5324 * -546648355 | 0xFF000000, Class13_Sub15.anInt669 * -1426104165 | 0xFF000000);
				local139++;
			}
			return;
		}
		local139 = 0;
		for (local245 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local245 != null; local245 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
			local170 = local19 + 1 + Class338.anInt4600 * 1100948139 + local91.anInt5537 * -1760037867 + Class250.anInt3804 * 192470685 * local139;
			if (local245.anInt2669 * 2127103997 == 1) {
				Class3_Sub14.method11264(local131, local135, Class284.anInt4355 * 989672103, Class338.anInt4600 * 1100948139, Class13_Sub14.anInt663 * -1045688681, Class294.anInt4390 * -1006383485, local170, (Class3_Sub1_Sub7) local245.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66, local85, local91, Class539.anInt5324 * -546648355 | 0xFF000000, Class13_Sub15.anInt669 * -1426104165 | 0xFF000000);
			} else {
				Class201.method24158(local131, local135, Class284.anInt4355 * 989672103, Class338.anInt4600 * 1100948139, Class13_Sub14.anInt663 * -1045688681, Class294.anInt4390 * -1006383485, local170, local245, local85, local91, Class539.anInt5324 * -546648355 | 0xFF000000, Class13_Sub15.anInt669 * -1426104165 | 0xFF000000);
			}
			local139++;
		}
		if (Class250.aClass3_Sub1_Sub9_1 == null) {
			return;
		}
		local139 = 0;
		for (local144 = (Class3_Sub1_Sub7) Class250.aClass3_Sub1_Sub9_1.aClass546_9.method32623(); local144 != null; local144 = (Class3_Sub1_Sub7) Class250.aClass3_Sub1_Sub9_1.aClass546_9.method32645()) {
			local170 = Class250.anInt3804 * 192470685 * local139 + local91.anInt5537 * -1760037867 + Class151.anInt3438 * 2118805765 + local19 + 1;
			Class3_Sub14.method11264(local131, local135, Class356.anInt4637 * 1084730905, Class151.anInt3438 * 2118805765, Class381.anInt4707 * -1605305641, Class598.anInt5520 * 1979992829, local170, local144, local85, local91, Class539.anInt5324 * -546648355 | 0xFF000000, Class13_Sub15.anInt669 * -1426104165 | 0xFF000000);
			local139++;
		}
	}

	@OriginalMember(owner = "client!nd", name = "kz", descriptor = "(Lclient!vs;B)V", line = 5993)
	static final void method26474(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class419.method27838(local11, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "ls", descriptor = "(Lclient!vs;I)V", line = 6088)
	static final void method26472(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class408.method27667(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "ku", descriptor = "(Lclient!fo;IIZI)V", line = 10277)
	static void method26475(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) int local4 = arg0.anInt3498 * -1494060731;
		@Pc(9) int local9 = arg0.anInt3499 * -751005789;
		if (arg0.aByte125 == 0) {
			arg0.anInt3498 = arg0.anInt3495 * -426245831;
		} else if (arg0.aByte125 == 1) {
			arg0.anInt3498 = (arg1 - arg0.anInt3495 * 1566866781) * -451511923;
		} else if (arg0.aByte125 == 2) {
			arg0.anInt3498 = (arg0.anInt3495 * 1566866781 * arg1 >> 14) * -451511923;
		}
		if (arg0.aByte126 == 0) {
			arg0.anInt3499 = arg0.anInt3496 * -993885195;
		} else if (arg0.aByte126 == 1) {
			arg0.anInt3499 = (arg2 - arg0.anInt3496 * -872685569) * -1953489909;
		} else if (arg0.aByte126 == 2) {
			arg0.anInt3499 = (arg2 * -872685569 * arg0.anInt3496 >> 14) * -1953489909;
		}
		if (arg0.aByte125 == 4) {
			arg0.anInt3498 = arg0.anInt3560 * -627765393 * arg0.anInt3499 * -751005789 / (arg0.anInt3583 * 935333661) * -451511923;
		}
		if (arg0.aByte126 == 4) {
			arg0.anInt3499 = arg0.anInt3583 * 935333661 * -1494060731 * arg0.anInt3498 / (arg0.anInt3560 * -627765393) * -1953489909;
		}
		if (client.aBoolean610 && (client.method22372(arg0).anInt1353 * 1263633035 != 0 || arg0.anInt3492 * -107621169 == 0)) {
			if (arg0.anInt3499 * -751005789 < 5 && arg0.anInt3498 * -1494060731 < 5) {
				arg0.anInt3499 = -1177514953;
				arg0.anInt3498 = 2037407681;
			} else {
				if (arg0.anInt3499 * -751005789 <= 0) {
					arg0.anInt3499 = -1177514953;
				}
				if (arg0.anInt3498 * -1494060731 <= 0) {
					arg0.anInt3498 = 2037407681;
				}
			}
		}
		if (Class178.anInt3480 * -595093977 == arg0.anInt3540 * 2108263643) {
			client.aClass178_12 = arg0;
		}
		if (arg3 && arg0.anObjectArray8 != null && (arg0.anInt3498 * -1494060731 != local4 || local9 != arg0.anInt3499 * -751005789)) {
			@Pc(214) Class3_Sub17 local214 = new Class3_Sub17();
			local214.aClass178_2 = arg0;
			local214.anObjectArray1 = arg0.anObjectArray8;
			client.aClass553_45.method32702(local214);
		}
	}
}
