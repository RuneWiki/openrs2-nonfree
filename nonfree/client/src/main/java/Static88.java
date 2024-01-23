import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!g", name = "Pc", descriptor = "Z")
	public static boolean aBoolean137;

	@OriginalMember(owner = "client!g", name = "ad", descriptor = "Lclient!en;")
	public static Class44 aClass44_8 = new Class44();

	@OriginalMember(owner = "client!g", name = "Cd", descriptor = "Lclient!qa;")
	public static Class142 aClass142_1 = new Class142();

	@OriginalMember(owner = "client!g", name = "Dd", descriptor = "I")
	public static int anInt2123 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIC)I")
	public static int method1564(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method1565() {
		if (Static250.aClass2_Sub8_Sub16_3 == null) {
			return;
		}
		if (Static91.anInt2195 < 10) {
			if (!Static250.aClass42_38.method1277(Static250.aClass2_Sub8_Sub16_3.aString151)) {
				Static91.anInt2195 = Static278.aClass42_98.method1268(Static250.aClass2_Sub8_Sub16_3.aString151) / 10;
				return;
			}
			Static108.method1846();
			Static91.anInt2195 = 10;
		}
		if (Static91.anInt2195 == 10) {
			Static250.anInt3122 = Static250.aClass2_Sub8_Sub16_3.anInt4416 >> 6 << 6;
			Static250.anInt3118 = Static250.aClass2_Sub8_Sub16_3.anInt4414 >> 6 << 6;
			@Pc(60) int[] local60 = new int[3];
			Static250.anInt3119 = (Static250.aClass2_Sub8_Sub16_3.anInt4411 >> 6 << 6) + 64 - Static250.anInt3118;
			@Pc(74) int local74 = -1;
			Static250.anInt3121 = (Static250.aClass2_Sub8_Sub16_3.anInt4419 >> 6 << 6) - (Static250.anInt3122 - 64);
			@Pc(87) int local87 = -1;
			if (Static250.aClass2_Sub8_Sub16_3.method3595(Static32.anInt876, (Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7) + Static234.anInt4705, local60, (Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7) + Static160.anInt5159)) {
				local87 = Static250.anInt3118 + Static250.anInt3119 - local60[2] - 1;
				local74 = local60[1] - Static250.anInt3122;
			}
			if (!Static51.aBoolean307 && local74 >= 0 && local74 < Static250.anInt3121 && local87 >= 0 && Static250.anInt3119 > local87) {
				local74 += (int) (Math.random() * 10.0D) - 5;
				Static237.anInt4776 = local74;
				local87 += (int) (Math.random() * 10.0D) - 5;
				Static67.anInt1659 = local87;
			} else if (Static262.anInt5152 == -1 || Static13.anInt256 == -1) {
				Static250.aClass2_Sub8_Sub16_3.method3594(Static250.aClass2_Sub8_Sub16_3.anInt4422 >> 14 & 0x3FFF, Static250.aClass2_Sub8_Sub16_3.anInt4422 & 0x3FFF, local60);
				Static237.anInt4776 = local60[1] - Static250.anInt3122;
				Static67.anInt1659 = Static250.anInt3118 + Static250.anInt3119 - local60[2] - 1;
			} else {
				Static250.aClass2_Sub8_Sub16_3.method3594(Static262.anInt5152, Static13.anInt256, local60);
				Static51.aBoolean307 = false;
				if (local60 != null) {
					Static237.anInt4776 = local60[1] - Static250.anInt3122;
					Static67.anInt1659 = Static250.anInt3119 + Static250.anInt3118 - local60[2] - 1;
				}
				Static13.anInt256 = -1;
				Static262.anInt5152 = -1;
			}
			if (Static250.aClass2_Sub8_Sub16_3.anInt4412 == 37) {
				Static250.aFloat32 = 3.0F;
				Static250.aFloat31 = 3.0F;
			} else if (Static250.aClass2_Sub8_Sub16_3.anInt4412 == 50) {
				Static250.aFloat32 = 4.0F;
				Static250.aFloat31 = 4.0F;
			} else if (Static250.aClass2_Sub8_Sub16_3.anInt4412 == 75) {
				Static250.aFloat32 = 6.0F;
				Static250.aFloat31 = 6.0F;
			} else if (Static250.aClass2_Sub8_Sub16_3.anInt4412 == 100) {
				Static250.aFloat32 = 8.0F;
				Static250.aFloat31 = 8.0F;
			} else if (Static250.aClass2_Sub8_Sub16_3.anInt4412 == 200) {
				Static250.aFloat32 = 16.0F;
				Static250.aFloat31 = 16.0F;
			} else {
				Static250.aFloat32 = 8.0F;
				Static250.aFloat31 = 8.0F;
			}
			Static202.method2140();
			Static250.anIntArray314 = new int[Static247.anInt1735 + 1];
			@Pc(315) int local315 = Static250.anInt3119 >> 6;
			@Pc(319) int local319 = Static250.anInt3121 >> 6;
			Static250.aByteArrayArrayArray16 = new byte[local319][local315][];
			Static250.aByteArrayArrayArray13 = new byte[local319][local315][];
			Static250.anIntArrayArrayArray10 = new int[local319][local315][];
			Static250.anIntArrayArrayArray11 = new int[local319][local315][];
			Static250.aByteArrayArrayArray14 = new byte[local319][local315][];
			Static250.aByteArrayArrayArray17 = new byte[local319][local315][];
			Static250.aByteArrayArrayArray15 = new byte[local319][local315][];
			Static94.aClass44_9 = new Class44();
			Static32.aClass128_1 = new Class128();
			@Pc(361) int local361 = Static263.anInt5195 >> 2 << 10;
			@Pc(365) int local365 = Static25.anInt551 >> 1;
			Static250.method2531(local361, local365);
			Static160.method4109(1024, 256);
			Static99.method1708(256, 256);
			Static10.method163(256);
			Static91.anInt2195 = 20;
		} else if (Static91.anInt2195 == 20) {
			Static98.method1703(new Class2_Sub16(Static250.aClass42_38.method1252(Static250.aClass2_Sub8_Sub16_3.aString151, "underlay")));
			Static91.anInt2195 = 30;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 30) {
			Static250.method2522(new Class2_Sub16(Static250.aClass42_38.method1252(Static250.aClass2_Sub8_Sub16_3.aString151, "overlay")));
			Static91.anInt2195 = 40;
			Static226.method4757();
		} else if (Static91.anInt2195 == 40) {
			Static250.method2525(new Class2_Sub16(Static250.aClass42_38.method1252(Static250.aClass2_Sub8_Sub16_3.aString151, "overlay2")));
			Static91.anInt2195 = 50;
			Static226.method4757();
		} else if (Static91.anInt2195 == 50) {
			Static250.method2526(new Class2_Sub16(Static250.aClass42_38.method1252(Static250.aClass2_Sub8_Sub16_3.aString151, "loc")), Static108.aBoolean163);
			Static91.anInt2195 = 60;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 60) {
			if (Static250.aClass42_38.method1261(Static250.aClass2_Sub8_Sub16_3.aString151 + "_labels")) {
				if (!Static250.aClass42_38.method1277(Static250.aClass2_Sub8_Sub16_3.aString151 + "_labels")) {
					return;
				}
				Static250.aClass57_3 = Static220.method3668(Static108.aBoolean163, Static250.aClass2_Sub8_Sub16_3.aString151 + "_labels", Static250.aClass42_38);
			} else {
				Static250.aClass57_3 = new Class57(0);
			}
			Static250.method2538();
			Static91.anInt2195 = 70;
			Static226.method4757();
		} else if (Static91.anInt2195 == 70) {
			Static31.aClass87_2 = new Class87(11, true, Static227.aCanvas1);
			Static91.anInt2195 = 73;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 73) {
			Static89.aClass87_4 = new Class87(12, true, Static227.aCanvas1);
			Static91.anInt2195 = 76;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 76) {
			Static279.aClass87_7 = new Class87(14, true, Static227.aCanvas1);
			Static91.anInt2195 = 79;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 79) {
			Static73.aClass87_3 = new Class87(17, true, Static227.aCanvas1);
			Static91.anInt2195 = 82;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 82) {
			Static180.aClass87_5 = new Class87(19, true, Static227.aCanvas1);
			Static91.anInt2195 = 85;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 85) {
			Static281.aClass87_8 = new Class87(22, true, Static227.aCanvas1);
			Static91.anInt2195 = 88;
			Static244.method3897(true);
			Static226.method4757();
		} else if (Static91.anInt2195 == 88) {
			Static256.aClass87_6 = new Class87(26, true, Static227.aCanvas1);
			Static91.anInt2195 = 91;
			Static244.method3897(true);
			Static226.method4757();
		} else {
			Static13.aClass87_1 = new Class87(30, true, Static227.aCanvas1);
			Static91.anInt2195 = 100;
			Static244.method3897(true);
			Static226.method4757();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 - arg3;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 == 0) {
			if (local6 != 0) {
				Static234.method3796(arg4, arg2, arg0, arg3);
			}
		} else if (local6 == 0) {
			Static130.method2398(arg1, arg0, arg2, arg3);
		} else {
			if (local6 < 0) {
				local6 = -local6;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(64) boolean local64 = local15 < local6;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local64) {
				local68 = arg2;
				local70 = arg1;
				arg1 = arg4;
				arg2 = arg3;
				arg3 = local68;
				arg4 = local70;
			}
			if (arg2 > arg1) {
				local68 = arg2;
				arg2 = arg1;
				arg1 = local68;
				local70 = arg3;
				arg3 = arg4;
				arg4 = local70;
			}
			local70 = arg1 - arg2;
			local68 = arg3;
			@Pc(115) int local115 = -(local70 >> 1);
			@Pc(120) int local120 = arg4 - arg3;
			if (local120 < 0) {
				local120 = -local120;
			}
			@Pc(133) int local133 = arg3 < arg4 ? 1 : -1;
			@Pc(137) int local137;
			if (local64) {
				for (local137 = arg2; local137 <= arg1; local137++) {
					Static275.anIntArrayArray37[local137][local68] = arg0;
					local115 += local120;
					if (local115 > 0) {
						local115 -= local70;
						local68 += local133;
					}
				}
			} else {
				for (local137 = arg2; local137 <= arg1; local137++) {
					local115 += local120;
					Static275.anIntArrayArray37[local68][local137] = arg0;
					if (local115 > 0) {
						local68 += local133;
						local115 -= local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < arg2 + arg0 && arg7 + arg4 > arg0) {
			return arg3 < arg5 + arg6 && arg5 < arg1 + arg3;
		} else {
			return false;
		}
	}
}
