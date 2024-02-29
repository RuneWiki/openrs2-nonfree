package com.jagex;

import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xm")
public class Class648 implements Interface75 {

	@OriginalMember(owner = "client!xm", name = "gh", descriptor = "Lclient!ani;")
	public static Class35_Sub5 aClass35_Sub5_1;

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "Lclient!xm;")
	public static final Class648 aClass648_2 = new Class648(0);

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "Lclient!xm;")
	static final Class648 aClass648_1 = new Class648(1);

	@OriginalMember(owner = "client!xm", name = "v", descriptor = "Lclient!xm;")
	static final Class648 aClass648_5 = new Class648(2);

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "Lclient!xm;")
	static final Class648 aClass648_3 = new Class648(3);

	@OriginalMember(owner = "client!xm", name = "y", descriptor = "Lclient!xm;")
	static final Class648 aClass648_4 = new Class648(4);

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "I")
	int anInt5726;

	@OriginalMember(owner = "client!xm", name = "<init>", descriptor = "(I)V", line = 14)
	Class648(@OriginalArg(0) int arg0) {
		this.anInt5726 = arg0 * 1431316541;
	}

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "()I", line = 19)
	@Override
	public int method36478() {
		return this.anInt5726 * -62410987;
	}

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "()I", line = 19)
	@Override
	public int method36479() {
		return this.anInt5726 * -62410987;
	}

	@OriginalMember(owner = "client!xm", name = "y", descriptor = "()I", line = 19)
	@Override
	public int method36477() {
		return this.anInt5726 * -62410987;
	}

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "(I)Ljava/lang/String;", line = 22)
	public static String method32858() {
		return Class509.aFile3.getAbsolutePath();
	}

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "(I)[Lclient!vd;", line = 35)
	public static Class593[] method32859() {
		return new Class593[] { Class593.aClass593_23, Class593.aClass593_3, Class593.aClass593_15, Class593.aClass593_12, Class593.aClass593_16, Class593.aClass593_2, Class593.aClass593_10, Class593.aClass593_24, Class593.aClass593_13, Class593.aClass593_20, Class593.aClass593_17, Class593.aClass593_6, Class593.aClass593_22, Class593.aClass593_5, Class593.aClass593_7, Class593.aClass593_14, Class593.aClass593_11, Class593.aClass593_4, Class593.aClass593_19, Class593.aClass593_9, Class593.aClass593_8, Class593.aClass593_18, Class593.aClass593_21 };
	}

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "(I)[Lclient!hd;", line = 134)
	static Class295[] method32860() {
		return new Class295[] { Class295.aClass295_125, Class295.aClass295_8, Class295.aClass295_9, Class295.aClass295_10, Class295.aClass295_11, Class295.aClass295_52, Class295.aClass295_13, Class295.aClass295_14, Class295.aClass295_15, Class295.aClass295_122, Class295.aClass295_17, Class295.aClass295_128, Class295.aClass295_19, Class295.aClass295_49, Class295.aClass295_33, Class295.aClass295_22, Class295.aClass295_23, Class295.aClass295_24, Class295.aClass295_69, Class295.aClass295_26, Class295.aClass295_16, Class295.aClass295_84, Class295.aClass295_60, Class295.aClass295_101, Class295.aClass295_129, Class295.aClass295_32, Class295.aClass295_18, Class295.aClass295_34, Class295.aClass295_35, Class295.aClass295_36, Class295.aClass295_123, Class295.aClass295_38, Class295.aClass295_39, Class295.aClass295_40, Class295.aClass295_29, Class295.aClass295_42, Class295.aClass295_43, Class295.aClass295_44, Class295.aClass295_28, Class295.aClass295_46, Class295.aClass295_98, Class295.aClass295_48, Class295.aClass295_100, Class295.aClass295_41, Class295.aClass295_51, Class295.aClass295_30, Class295.aClass295_53, Class295.aClass295_61, Class295.aClass295_55, Class295.aClass295_56, Class295.aClass295_57, Class295.aClass295_58, Class295.aClass295_59, Class295.aClass295_90, Class295.aClass295_87, Class295.aClass295_62, Class295.aClass295_63, Class295.aClass295_64, Class295.aClass295_65, Class295.aClass295_66, Class295.aClass295_67, Class295.aClass295_68, Class295.aClass295_21, Class295.aClass295_7, Class295.aClass295_71, Class295.aClass295_72, Class295.aClass295_73, Class295.aClass295_81, Class295.aClass295_75, Class295.aClass295_76, Class295.aClass295_77, Class295.aClass295_31, Class295.aClass295_79, Class295.aClass295_80, Class295.aClass295_93, Class295.aClass295_45, Class295.aClass295_83, Class295.aClass295_70, Class295.aClass295_85, Class295.aClass295_86, Class295.aClass295_50, Class295.aClass295_88, Class295.aClass295_89, Class295.aClass295_82, Class295.aClass295_91, Class295.aClass295_92, Class295.aClass295_20, Class295.aClass295_94, Class295.aClass295_95, Class295.aClass295_96, Class295.aClass295_113, Class295.aClass295_97, Class295.aClass295_99, Class295.aClass295_106, Class295.aClass295_54, Class295.aClass295_110, Class295.aClass295_103, Class295.aClass295_104, Class295.aClass295_105, Class295.aClass295_102, Class295.aClass295_107, Class295.aClass295_108, Class295.aClass295_109, Class295.aClass295_47, Class295.aClass295_111, Class295.aClass295_37, Class295.aClass295_78, Class295.aClass295_114, Class295.aClass295_115, Class295.aClass295_116, Class295.aClass295_117, Class295.aClass295_118, Class295.aClass295_119, Class295.aClass295_120, Class295.aClass295_121, Class295.aClass295_130, Class295.aClass295_25, Class295.aClass295_124, Class295.aClass295_12, Class295.aClass295_126, Class295.aClass295_127, Class295.aClass295_27, Class295.aClass295_112, Class295.aClass295_74, Class295.aClass295_131 };
	}

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "(I)V", line = 262)
	static final void method32861() {
		if (Class589.anInt5485 * 1114067909 == 2 || Class589.anInt5485 * 1114067909 == 106) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Class589.anInt5472 * 804115323 == 0 && Class589.anInt5485 * 1114067909 < 94) {
				local21 = 500;
			} else {
				local21 = 2000;
			}
			if (Class589.aBoolean811 && Class589.anInt5485 * 1114067909 >= 68) {
				local21 = 6000;
			}
			if (Class675.anInt5802 * 513656689 == 220 && Class589.anInt5485 * 1114067909 != 212 && Class589.anInt5490 * 1245290027 != 42 || Class675.anInt5802 * 513656689 == 131 && Class589.anInt5465 * 490572819 != 49 && Class589.anInt5465 * 490572819 != 52) {
				Class589.anInt5487 += -1692059527;
			}
			if (Class589.anInt5487 * 684962249 > local21) {
				Class589.aClass82_3.method2014();
				if (Class589.anInt5472 * 804115323 >= 3) {
					Class589.anInt5485 = 850224666;
					Class528.method30709(-5);
					Class305.method27241();
					return;
				}
				if (Class675.anInt5802 * 513656689 == 220) {
					Class680.aClass25_8.method450();
				} else {
					Class8.aClass25_4.method450();
				}
				Class589.anInt5487 = 0;
				Class589.anInt5472 += -585559117;
				Class589.anInt5485 = -937912598;
			}
			@Pc(148) Class77_Sub20 local148;
			if (Class589.anInt5485 * 1114067909 == 18) {
				if (Class675.anInt5802 * 513656689 == 220) {
					Class589.aClass82_3.method2012(Class142.method14871(Class680.aClass25_8.method446(), 40000), Class680.aClass25_8.aString5);
				} else {
					Class589.aClass82_3.method2012(Class142.method14871(Class8.aClass25_4.method446(), 40000), Class8.aClass25_4.aString5);
				}
				Class589.aClass82_3.method1999();
				local148 = Class41.method692();
				local148.aClass77_Sub39_Sub1_2.method22403(Class422.aClass422_10.anInt4805 * -100453045);
				Class589.aClass82_3.method2004(local148);
				Class589.aClass82_3.method2000();
				Class589.anInt5485 = 1568917434;
			}
			@Pc(198) int local198;
			if (Class589.anInt5485 * 1114067909 == 34) {
				if (!Class589.aClass82_3.method2022().method14347(9)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 9);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				local198 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22478();
				if (local198 != 0) {
					Class589.anInt5485 = 850224666;
					Class635.method32677(local198);
					Class528.method30709(local198);
					Class589.aClass82_3.method2014();
					Class305.method27241();
					return;
				}
				Class446.aLong274 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22510() * 4180615252336247547L;
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				if (Class589.aBoolean811) {
					Class589.anInt5485 = 1366886916;
				} else {
					Class589.anInt5485 = -1244820360;
				}
			}
			@Pc(259) int local259;
			@Pc(319) int local319;
			if (Class589.anInt5485 * 1114067909 == 276) {
				local148 = Class41.method692();
				local148.aClass77_Sub39_Sub1_2.method22403(Class422.aClass422_9.anInt4805 * -100453045);
				local148.aClass77_Sub39_Sub1_2.method22408(0);
				local259 = local148.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
				local148.aClass77_Sub39_Sub1_2.method22417(881);
				local148.aClass77_Sub39_Sub1_2.method22417(1);
				if (Class675.anInt5802 * 513656689 == 220) {
					local148.aClass77_Sub39_Sub1_2.method22403(client.anInt3390 * -1850530127 == 5 ? 1 : 0);
				}
				@Pc(289) Class77_Sub39 local289 = Class109_Sub1.method9095();
				Class92_Sub2.method23346(local289, (long) (Class589.anInt5459 * 1832109523));
				Class143_Sub2.aLong104 = (long) Class589.anInt5459 * 3077592020303809937L;
				local289.method22403(Class589.anInt5459 * 1832109523);
				local289.method22403(Class128.aClass667_3.method36479());
				local289.method22417(client.anInt3378 * 1844562269);
				for (local319 = 0; local319 < 5; local319++) {
					local289.method22417((int) (Math.random() * 9.9999999E7D));
				}
				local289.method22428(client.aLong240 * -4748671220908374923L);
				local289.method22403(client.aClass670_4.anInt5791 * -1082924039);
				local289.method22403((int) (Math.random() * 9.9999999E7D));
				local289.method22572(Class291.aBigInteger2, Class291.aBigInteger3);
				local148.aClass77_Sub39_Sub1_2.method22452(local289.aByteArray53, 0, local289.anInt3089 * 31645619);
				local148.aClass77_Sub39_Sub1_2.method22462(local148.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local259);
				Class589.aClass82_3.method2004(local148);
				Class589.aClass82_3.method2000();
				Class589.anInt5485 = -175375864;
			}
			if (Class589.anInt5485 * 1114067909 == 40) {
				if (!Class589.aClass82_3.method2022().method14347(2)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 2);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22483() * -1387468933;
				Class589.anInt5485 = -1963513128;
			}
			if (Class589.anInt5485 * 1114067909 == 56) {
				if (!Class589.aClass82_3.method2022().method14347(Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22561(Class589.anIntArray506);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				@Pc(471) String local471 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22526();
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				@Pc(479) String local479 = Class413.aClass413_11.method28593();
				Class413.method28592(local471, true, local479, client.aBoolean591);
				Class589.anInt5485 = -1157132428;
			}
			if (Class589.anInt5485 * 1114067909 == 68) {
				if (!Class589.aClass82_3.method2022().method14347(1)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				if ((Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF) == 1) {
					Class589.anInt5485 = -1200976394;
				}
			}
			if (Class589.anInt5485 * 1114067909 == 78) {
				if (!Class589.aClass82_3.method2022().method14347(16)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 16);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = -724666448;
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22561(Class589.anIntArray506);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class589.aLong290 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22510() * -8972729624098644529L;
				Class589.aLong291 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22510() * 7601348613429507741L;
				Class589.anInt5485 = -1244820360;
			}
			if (Class589.anInt5485 * 1114067909 == 88) {
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class589.aClass82_3.method1999();
				local148 = Class41.method692();
				@Pc(593) Class77_Sub39_Sub1 local593 = local148.aClass77_Sub39_Sub1_2;
				@Pc(626) int local626;
				@Pc(655) Class77_Sub39 local655;
				@Pc(765) Class77_Sub39 local765;
				@Pc(602) Class422 local602;
				if (Class675.anInt5802 * 513656689 == 220) {
					if (Class589.aBoolean811) {
						local602 = Class422.aClass422_12;
					} else {
						local602 = Class422.aClass422_3;
					}
					local593.method22403(local602.anInt4805 * -100453045);
					local593.method22408(0);
					local319 = local593.anInt3089 * 31645619;
					local626 = local593.anInt3089 * 31645619;
					if (!Class589.aBoolean811) {
						local593.method22417(881);
						local593.method22417(1);
						local593.method22403(client.anInt3390 * -1850530127 == 5 ? 1 : 0);
						local626 = local593.anInt3089 * 31645619;
						local655 = Class498.method30205();
						local593.method22452(local655.aByteArray53, 0, local655.anInt3089 * 31645619);
						local626 = local593.anInt3089 * 31645619;
						local593.method22403(Class589.aLong290 * 5952060205682133295L == -1L ? 1 : 0);
						if (Class589.aLong290 * 5952060205682133295L == -1L) {
							local593.method22440(Class589.aString234);
						} else {
							local593.method22428(Class589.aLong290 * 5952060205682133295L);
						}
					}
					local593.method22403(Class569.method31421());
					local593.method22408(Class149_Sub4.anInt2368 * 1771907305);
					local593.method22408(Class19.anInt108 * -1091172141);
					local593.method22403(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method15926());
					Class644.method32825(local593);
					local593.method22440(client.aString157);
					local593.method22417(client.anInt3378 * 1844562269);
					local655 = Class35_Sub6.aClass77_Sub35_45.method14377();
					local593.method22403(local655.anInt3089 * 31645619);
					local593.method22452(local655.aByteArray53, 0, local655.anInt3089 * 31645619);
					client.aBoolean593 = true;
					local765 = new Class77_Sub39(Class96_Sub23.aClass77_Sub28_1.method13742());
					Class96_Sub23.aClass77_Sub28_1.method13738(local765);
					local593.method22452(local765.aByteArray53, 0, local765.aByteArray53.length);
					local593.method22417(client.anInt3435 * -983036913);
					local593.method22417(client.anInt3382 * -1608886643);
					local593.method22417(client.anInt3510 * 1306630125);
					local593.method22417(client.anInt3384 * 655301323);
					local593.method22417(client.anInt3383 * -1383240089);
					local593.method22440(Class184.aString139);
					local593.method22403(client.aString154 == null ? 0 : 1);
					if (client.aString154 != null) {
						local593.method22440(client.aString154);
					}
					local593.method22403(client.aBoolean588 ? 1 : 0);
					local593.method22403(client.aBoolean592 ? 1 : 0);
					local593.method22403(Class578.anInt5428 * -506156481 & 0x1);
					local593.method22417(client.anInt3388 * -1840306525);
					local593.method22440(client.aString159);
					local593.method22403(Class8.aClass25_2 != null && Class680.aClass25_8.anInt122 * -1664252895 == Class8.aClass25_2.anInt122 * -1664252895 ? 0 : 1);
					local593.method22408(Class8.aClass25_4.anInt122 * -1664252895);
					Class529.method30717(local593);
					local593.method22567(Class589.anIntArray506, local626, local593.anInt3089 * 31645619);
					local593.method22462(local593.anInt3089 * 31645619 - local319);
				} else {
					if (Class589.aBoolean811) {
						local602 = Class422.aClass422_12;
					} else {
						local602 = Class422.aClass422_4;
					}
					local593.method22403(local602.anInt4805 * -100453045);
					local593.method22408(0);
					local319 = local593.anInt3089 * 31645619;
					local626 = local593.anInt3089 * 31645619;
					if (!Class589.aBoolean811) {
						local593.method22417(881);
						local593.method22417(1);
						local655 = Class498.method30205();
						local593.method22452(local655.aByteArray53, 0, local655.anInt3089 * 31645619);
						local626 = local593.anInt3089 * 31645619;
						local593.method22403(Class589.aLong290 * 5952060205682133295L == -1L ? 1 : 0);
						if (Class589.aLong290 * 5952060205682133295L == -1L) {
							local593.method22440(Class589.aString234);
						} else {
							local593.method22428(Class589.aLong290 * 5952060205682133295L);
						}
					}
					local593.method22403(client.aClass670_4.anInt5791 * -1082924039);
					local593.method22403(Class128.aClass667_3.method36479());
					local593.method22403(Class569.method31421());
					local593.method22408(Class149_Sub4.anInt2368 * 1771907305);
					local593.method22408(Class19.anInt108 * -1091172141);
					local593.method22403(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method15926());
					Class644.method32825(local593);
					local593.method22440(client.aString157);
					local655 = Class35_Sub6.aClass77_Sub35_45.method14377();
					local593.method22403(local655.anInt3089 * 31645619);
					local593.method22452(local655.aByteArray53, 0, local655.anInt3089 * 31645619);
					local765 = new Class77_Sub39(Class96_Sub23.aClass77_Sub28_1.method13742());
					Class96_Sub23.aClass77_Sub28_1.method13738(local765);
					local593.method22452(local765.aByteArray53, 0, local765.aByteArray53.length);
					local593.method22417(client.anInt3435 * -983036913);
					local593.method22440(Class184.aString139);
					local593.method22417(client.anInt3378 * 1844562269);
					local593.method22417(client.anInt3388 * -1840306525);
					local593.method22440(client.aString159);
					local593.method22403(Class578.anInt5428 * -506156481 & 0x1);
					Class529.method30717(local593);
					local593.method22567(Class589.anIntArray506, local626, local593.anInt3089 * 31645619);
					local593.method22462(local593.anInt3089 * 31645619 - local319);
				}
				Class589.aClass82_3.method2004(local148);
				Class589.aClass82_3.method2000();
				Class589.aClass82_3.aClass16_1 = new Class16(Class589.anIntArray506);
				for (@Pc(1145) int local1145 = 0; local1145 < 4; local1145++) {
					Class589.anIntArray506[local1145] += 50;
				}
				Class589.aClass82_3.aClass16_2 = new Class16(Class589.anIntArray506);
				new Class16(Class589.anIntArray506);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22167(Class589.aClass82_3.aClass16_2);
				Class589.anIntArray506 = null;
				Class589.anInt5485 = 1305853638;
			}
			if (Class589.anInt5485 * 1114067909 == 94) {
				if (!Class589.aClass82_3.method2022().method14347(1)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				local198 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22478();
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				if (local198 == 21) {
					Class589.anInt5485 = -101015259;
				} else if (local198 == 1) {
					Class589.anInt5485 = 2112234338;
					Class528.method30709(local198);
					return;
				} else if (local198 == 52) {
					Class134.anInt1572 = local198 * 1894907683;
					Class589.anInt5485 = 735882080;
				} else if (local198 == 2) {
					if (Class589.aBoolean815) {
						Class589.aBoolean815 = false;
						Class589.anInt5485 = -937912598;
						return;
					}
					if (Class675.anInt5802 * 513656689 == 220) {
						Class56.aClass93_Sub1_1.method6427();
						Class589.anInt5485 = 179237849;
					} else {
						Class589.anInt5485 = -1507884156;
					}
				} else if (local198 == 15) {
					Class589.aClass82_3.anInt327 = -1853330870;
					Class589.anInt5485 = 398457679;
				} else if (local198 == 23 && Class589.anInt5472 * 804115323 < 3) {
					Class589.anInt5487 = 0;
					Class589.anInt5472 += -585559117;
					Class589.anInt5485 = -937912598;
					Class589.aClass82_3.method2014();
					return;
				} else if (local198 == 42) {
					Class589.anInt5485 = -70498620;
					Class528.method30709(local198);
					return;
				} else if (Class675.anInt5802 * 513656689 == 131 && local198 == 49 && client.anInt3390 * -1850530127 != 14) {
					if (Class589.anInt5465 * 490572819 != 52) {
						Class528.method30709(local198);
					}
					return;
				} else if (!Class589.aBoolean812 || Class589.aBoolean811 || Class589.anInt5459 * 1832109523 == -1 || local198 != 35) {
					if (local198 != 53) {
						Class589.anInt5485 = 850224666;
						Class528.method30709(local198);
						Class589.aClass82_3.method2014();
						Class305.method27241();
						return;
					}
					Class589.anInt5485 = 1073306481;
				} else {
					Class589.aBoolean811 = true;
					Class589.anInt5487 = 0;
					Class589.anInt5485 = -937912598;
					Class589.aClass82_3.method2014();
					return;
				}
			}
			if (Class589.anInt5485 * 1114067909 == 121) {
				if (!Class589.aClass82_3.method2022().method14347(1)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				local198 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF;
				Class589.anInt5494 = local198 * -279730794;
				Class589.anInt5485 = 850224666;
				Class528.method30709(21);
				Class589.aClass82_3.method2014();
				Class305.method27241();
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 212) {
				if (!Class589.aClass82_3.method2022().method14347(2)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 2);
				Class589.anInt5497 = (((Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF) << 8) + (Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[1] & 0xFF)) * 650198321;
				Class589.anInt5485 = 1305853638;
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 245) {
				if (!Class589.aClass82_3.method2022().method14347(4)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 4);
				Class589.anInt5457 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22500() * -316457055;
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class589.anInt5485 = 850224666;
				Class528.method30709(53);
				Class589.aClass82_3.method2014();
				Class305.method27241();
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 197) {
				if (Class134.anInt1572 * 1654597771 == 29) {
					if (!Class589.aClass82_3.method2022().method14347(1)) {
						return;
					}
					Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
					Class589.anInt5471 = (Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF) * -217400935;
				} else if (Class134.anInt1572 * 1654597771 == 45) {
					if (!Class589.aClass82_3.method2022().method14347(3)) {
						return;
					}
					Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 3);
					Class589.anInt5471 = (Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF) * -217400935;
					Class589.anInt5495 = ((Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[2] & 0xFF) + ((Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[1] & 0xFF) << 8)) * 1087612101;
				} else {
					throw new IllegalStateException();
				}
				Class589.anInt5485 = 850224666;
				Class528.method30709(Class134.anInt1572 * 1654597771);
				Class589.aClass82_3.method2014();
				Class305.method27241();
				if (Class222.method25761(client.anInt3390 * -1850530127)) {
					Class619.method32395(true);
					Class589.anInt5490 = Class134.anInt1572 * 1164431137;
				}
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 224) {
				if (!Class589.aClass82_3.method2022().method14347(2)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 2);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class602.anInt5558 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22483() * -2034198373;
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class589.anInt5485 = -1008411218;
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 230) {
				if (!Class589.aClass82_3.method2022().method14347(Class602.anInt5558 * 608275859)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, Class602.anInt5558 * 608275859);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				@Pc(1705) byte[] local1705 = new byte[Class602.anInt5558 * 608275859 + 1];
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22182(local1705, 0, Class602.anInt5558 * 608275859);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				@Pc(1723) Class77_Sub39 local1723 = new Class77_Sub39(local1705);
				@Pc(1727) String local1727 = local1723.method22523();
				Class474.method29663(local1727, true, client.aBoolean591);
				Class528.method30709(Class134.anInt1572 * 1654597771);
				if (Class675.anInt5802 * 513656689 == 131 && client.anInt3390 * -1850530127 != 14) {
					Class589.anInt5485 = 1305853638;
				} else {
					Class589.anInt5485 = 850224666;
					Class589.aClass82_3.method2014();
					Class305.method27241();
				}
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 253) {
				if (!Class589.aClass82_3.method2022().method14347(2)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 2);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				Class589.aClass82_3.anInt327 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22483() * -1220818213;
				Class589.anInt5485 = -2034011748;
			}
			@Pc(1875) Class77_Sub39_Sub1 local1875;
			if (Class589.anInt5485 * 1114067909 == 268) {
				if (!Class589.aClass82_3.method2022().method14347(Class589.aClass82_3.anInt327 * -1013636781)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, Class589.aClass82_3.anInt327 * -1013636781);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				@Pc(1840) boolean local1840 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22478() == 1;
				while (true) {
					if (Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619 >= Class589.aClass82_3.anInt327 * -1013636781) {
						if (local1840) {
							@Pc(1872) Class77_Sub20 local1872 = Class41.method692();
							local1875 = local1872.aClass77_Sub39_Sub1_2;
							local1875.method22403(Class422.aClass422_5.anInt4805 * -100453045);
							Class589.aClass82_3.method2004(local1872);
							Class589.aClass82_3.method2000();
							Class589.anInt5485 = 1555590107;
						} else {
							Class589.anInt5485 = 179237849;
						}
						break;
					}
					@Pc(1856) Class438 local1856 = Class416.aClass80_Sub1_Sub2_4.method1949(Class589.aClass82_3.aClass77_Sub39_Sub1_1);
					Class56.aClass93_Sub1_1.anInterface3_2.method128(local1856.anInt4927 * -608978823, local1856.anObject19);
				}
			}
			if (Class589.anInt5485 * 1114067909 == 135) {
				if (!Class589.aClass82_3.method2022().method14347(1)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				local198 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF;
				if (local198 != 2) {
					if (local198 != 29 && local198 != 45) {
						Class589.anInt5485 = 850224666;
						Class528.method30709(local198);
						Class589.aClass82_3.method2014();
						Class305.method27241();
						if (Class222.method25761(client.anInt3390 * -1850530127)) {
							Class619.method32395(true);
							Class589.anInt5490 = local198 * 1385443459;
						}
						return;
					}
					Class134.anInt1572 = local198 * 1894907683;
					Class589.anInt5485 = 2142750977;
					return;
				}
				Class589.anInt5485 = -1507884156;
			}
			if (Class589.anInt5485 * 1114067909 == 148) {
				if (!Class589.aClass82_3.method2022().method14347(1)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				Class77_Sub41.anInt2007 = (Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF) * 2019631559;
				Class589.anInt5485 = 1893014508;
			}
			@Pc(2012) Class77_Sub39_Sub1 local2012;
			if (Class589.anInt5485 * 1114067909 == 156) {
				local2012 = Class589.aClass82_3.aClass77_Sub39_Sub1_1;
				if (Class675.anInt5802 * 513656689 == 220) {
					if (!Class589.aClass82_3.method2022().method14347(Class77_Sub41.anInt2007 * -666611721)) {
						return;
					}
					Class589.aClass82_3.method2022().method14339(local2012.aByteArray53, 0, Class77_Sub41.anInt2007 * -666611721);
					local2012.anInt3089 = 0;
					Class494.method30052(local2012);
					client.anInt3466 = local2012.method22478() * 1147858925;
					client.anInt3467 = local2012.method22478() * -1286726269;
					client.aBoolean620 = local2012.method22478() == 1;
					client.aBoolean616 = local2012.method22478() == 1;
					client.aBoolean617 = local2012.method22478() == 1;
					client.aBoolean599 = local2012.method22478() == 1;
					client.anInt3389 = local2012.method22483() * -2083494349;
					client.aBoolean629 = local2012.method22478() == 1;
					Class96_Sub3.anInt810 = local2012.method22496() * -1278504939;
					client.aBoolean613 = local2012.method22478() == 1;
					Class157.aString127 = local2012.method22523();
					Class241.aLong246 = (local2012.method22509() - Class280.method26667()) * -886165369587119355L;
					client.aClass517_1.method30444().method17261(client.aBoolean613);
					Class196.aClass514_1.method30355().method30444().method17261(client.aBoolean613);
					Class537.aClass35_Sub7_1.method17016(client.aBoolean613);
					Class578.aClass35_Sub3_1.method16381(client.aBoolean613);
				} else if (Class589.aClass82_3.method2022().method14347(Class77_Sub41.anInt2007 * -666611721)) {
					Class589.aClass82_3.method2022().method14339(local2012.aByteArray53, 0, Class77_Sub41.anInt2007 * -666611721);
					local2012.anInt3089 = 0;
					Class494.method30052(local2012);
					client.anInt3466 = local2012.method22478() * 1147858925;
					client.anInt3467 = local2012.method22478() * -1286726269;
					client.aBoolean620 = local2012.method22478() == 1;
					Class96_Sub3.anInt810 = local2012.method22496() * -1278504939;
					Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte77 = (byte) local2012.method22478();
					client.aBoolean616 = local2012.method22478() == 1;
					client.aBoolean617 = local2012.method22478() == 1;
					Class537.aLong285 = local2012.method22510() * 5369997409366051919L;
					Class241.aLong246 = (-4861593676329809233L * Class537.aLong285 - Class280.method26667() - local2012.method22505()) * -886165369587119355L;
					local259 = local2012.method22478();
					client.aBoolean629 = (local259 & 0x1) != 0;
					Class262.aBoolean659 = (local259 & 0x2) != 0;
					Class497.anInt5063 = local2012.method22500() * -1461317767;
					Class250.anInt3804 = local2012.method22500() * -2075541409;
					Class309.anInt4059 = local2012.method22483() * 1442610963;
					Class349.anInt4495 = local2012.method22483() * 1217957533;
					Class615.anInt5589 = local2012.method22483() * 812300401;
					Class130_Sub1.anInt1413 = local2012.method22500() * -650478585;
					Class386.aClass355_1 = new Class355(Class130_Sub1.anInt1413 * -1712574025);
					(new Thread(Class386.aClass355_1)).start();
					Class630.anInt5703 = local2012.method22478() * 1860026049;
					Class235.anInt3777 = local2012.method22483() * 1168569291;
					Class578.anInt5429 = local2012.method22483() * -360849473;
					Class107_Sub1.aBoolean193 = local2012.method22478() == 1;
					Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString85 = RuntimeException_Sub1.aString115 = local2012.method22526();
					Class73.anInt217 = local2012.method22478() * 1198047845;
					Class479.anInt5014 = local2012.method22500() * -2104794943;
					Class8.aClass25_2 = new Class25();
					Class8.aClass25_2.anInt122 = local2012.method22483() * 1619197921;
					if (Class8.aClass25_2.anInt122 * -1664252895 == 65535) {
						Class8.aClass25_2.anInt122 = -1619197921;
					}
					Class8.aClass25_2.aString5 = local2012.method22526();
					Class8.aClass25_2.anInt120 = local2012.method22483() * 1852523987;
					Class8.aClass25_2.anInt121 = local2012.method22483() * -102059163;
					if (client.aClass661_1 != Class661.aClass661_3 && (Class661.aClass661_14 != client.aClass661_1 || client.anInt3466 * 365872613 < 2) && Class680.aClass25_8.method452(Class98.aClass25_7)) {
						Class345.method27829();
					}
				} else {
					return;
				}
				if (client.aBoolean617) {
					try {
						Class31.method519(Class331.anApplet2, "zap");
					} catch (@Pc(2442) Throwable local2442) {
						if (client.aBoolean602) {
							try {
								Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2456) Exception local2456) {
							}
						}
					}
				} else {
					try {
						Class31.method519(Class331.anApplet2, "unzap");
					} catch (@Pc(2464) Throwable local2464) {
					}
				}
				if (Class661.aClass661_5 == client.aClass661_1) {
					Class413.aClass413_1.method28607();
				}
				if (Class675.anInt5802 * 513656689 != 220) {
					Class589.anInt5485 = 850224666;
					Class528.method30709(2);
					Class635.method32678();
					Class668.method33179(9);
					Class589.aClass82_3.aClass418_1 = null;
					return;
				}
				Class589.anInt5485 = -1639416054;
			}
			if (Class589.anInt5485 * 1114067909 == 178) {
				if (!Class589.aClass82_3.method2022().method14347(3)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 3);
				Class589.anInt5485 = 486145611;
			}
			if (Class589.anInt5485 * 1114067909 == 183) {
				local2012 = Class589.aClass82_3.aClass77_Sub39_Sub1_1;
				local2012.anInt3089 = 0;
				if (local2012.method22175()) {
					if (!Class589.aClass82_3.method2022().method14347(1)) {
						return;
					}
					Class589.aClass82_3.method2022().method14339(local2012.aByteArray53, 3, 1);
				}
				Class589.aClass82_3.aClass418_1 = Class614.method32336()[local2012.method22181()];
				Class589.aClass82_3.anInt327 = local2012.method22483() * -1220818213;
				Class589.anInt5485 = 1849170542;
			}
			if (Class589.anInt5485 * 1114067909 == 166) {
				if (!Class589.aClass82_3.method2022().method14347(Class589.aClass82_3.anInt327 * -1013636781)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, Class589.aClass82_3.anInt327 * -1013636781);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				local198 = Class589.aClass82_3.anInt327 * -1013636781;
				Class589.anInt5485 = 850224666;
				Class528.method30709(2);
				Class540.method30914();
				Class509.method30280(Class589.aClass82_3.aClass77_Sub39_Sub1_1);
				local259 = local198 - Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619;
				local1875 = new Class77_Sub39_Sub1(local259);
				System.arraycopy(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619, local1875.aByteArray53, 0, local259);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 += local259 * -1387468933;
				if (Class589.aClass82_3.aClass418_1 == Class418.aClass418_97) {
					client.aClass517_1.method30488(new Class516(Class505.aClass505_5, local1875));
				} else {
					client.aClass517_1.method30488(new Class516(Class505.aClass505_2, local1875));
				}
				if (local198 != Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619) {
					throw new RuntimeException(Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619 + " " + local198);
				}
				Class589.aClass82_3.aClass418_1 = null;
				return;
			}
			if (Class589.anInt5485 * 1114067909 == 203) {
				if (-1013636781 * Class589.aClass82_3.anInt327 == -2) {
					if (!Class589.aClass82_3.method2022().method14347(2)) {
						return;
					}
					Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, 2);
					Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
					Class589.aClass82_3.anInt327 = Class589.aClass82_3.aClass77_Sub39_Sub1_1.method22483() * -1220818213;
				}
				if (!Class589.aClass82_3.method2022().method14347(Class589.aClass82_3.anInt327 * -1013636781)) {
					return;
				}
				Class589.aClass82_3.method2022().method14339(Class589.aClass82_3.aClass77_Sub39_Sub1_1.aByteArray53, 0, Class589.aClass82_3.anInt327 * -1013636781);
				Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
				local198 = Class589.aClass82_3.anInt327 * -1013636781;
				Class589.anInt5485 = 850224666;
				Class528.method30709(15);
				Class422.method28709();
				Class509.method30280(Class589.aClass82_3.aClass77_Sub39_Sub1_1);
				if (local198 != Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619) {
					throw new RuntimeException(Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 * 31645619 + " " + local198);
				}
				Class589.aClass82_3.aClass418_1 = null;
				return;
			}
		} catch (@Pc(2821) IOException local2821) {
			Class589.aClass82_3.method2014();
			if (Class589.anInt5472 * 804115323 < 3) {
				if (Class675.anInt5802 * 513656689 == 220) {
					Class680.aClass25_8.method450();
				} else {
					Class8.aClass25_4.method450();
				}
				Class589.anInt5487 = 0;
				Class589.anInt5472 += -585559117;
				Class589.anInt5485 = -937912598;
			} else {
				Class589.anInt5485 = 850224666;
				Class528.method30709(-4);
				Class305.method27241();
			}
		}
	}

	@OriginalMember(owner = "client!xm", name = "gv", descriptor = "(Lclient!yf;I)V", line = 5703)
	static final void method32862(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class514.method30368(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xm", name = "aja", descriptor = "(Lclient!yf;I)V", line = 11124)
	static final void method32863(@OriginalArg(0) Class665 arg0) {
		if (Class706.aBoolean868 && Class184.aFrame1 != null) {
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
		}
		if (Class335.method27670() == Class513.aClass513_4) {
			Class567.method31382();
			System.exit(0);
		} else {
			Class96.method19906();
		}
	}

	@OriginalMember(owner = "client!xm", name = "alj", descriptor = "(Lclient!yf;B)V", line = 11610)
	static final void method32864(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class597.aClass107_Sub1_2.method8880() == null ? -1 : Class597.aClass107_Sub1_2.method8880().anInt4097 * -1861794503;
	}
}
