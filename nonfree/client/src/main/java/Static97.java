import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!er", name = "C", descriptor = "I")
	public static int anInt2096;

	@OriginalMember(owner = "client!er", name = "H", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_25 = new Class21("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!er", name = "D", descriptor = "I")
	public static int anInt2097 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ci;BLclient!ci;Lclient!qa;)V")
	public static void method1858(@OriginalArg(0) Class38 arg0, @OriginalArg(2) Class38 arg1, @OriginalArg(3) Class30 arg2) {
		Static94.aClass84_3 = Static413.method5731(arg0, Static455.anInt7784);
		Static142.aClass18_1 = arg2.method2054(Static94.aClass84_3, Static472.method2843(arg1, Static455.anInt7784));
		Static115.aClass84_4 = Static413.method5731(arg0, Static107.anInt2318);
		Static330.aClass18_3 = arg2.method2054(Static115.aClass84_4, Static472.method2843(arg1, Static107.anInt2318));
		Static296.aClass84_10 = Static413.method5731(arg0, Static38.anInt907);
		Static247.aClass18_2 = arg2.method2054(Static296.aClass84_10, Static472.method2843(arg1, Static38.anInt907));
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ki;Lclient!iu;II)V")
	public static void method1859(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg1, @OriginalArg(2) Class4_Sub20_Sub1 arg2, @OriginalArg(3) int arg3) {
		if ((arg3 & 0x1) != 0) {
			arg1.anInt4185 = arg2.method4623();
			if (arg1.anInt6549 == 0) {
				arg1.method5301(arg1.anInt4185);
				arg1.anInt4185 = -1;
			}
		}
		@Pc(32) byte local32 = -1;
		@Pc(40) int local40;
		if ((arg3 & 0x40) != 0) {
			local40 = arg2.method4606();
			if (local40 == 65535) {
				local40 = -1;
			}
			arg1.anInt6495 = local40;
		}
		@Pc(62) int local62;
		@Pc(73) int local73;
		if ((arg3 & 0x200) != 0) {
			local40 = arg2.method4607();
			local62 = arg2.method4564();
			if (local40 == 65535) {
				local40 = -1;
			}
			local73 = arg2.method4614();
			arg1.method5299(false, local73, local40, local62);
		}
		if ((arg3 & 0x100) != 0) {
			local40 = Static277.anInt2834;
			local62 = arg2.method4575();
			local73 = arg2.method4618();
			arg1.method5292(local62, local40, local73);
		}
		if ((arg3 & 0x8) != 0) {
			local40 = arg2.method4575();
			local62 = arg2.method4614();
			arg1.method5292(local40, Static277.anInt2834, local62);
			arg1.anInt6542 = Static277.anInt2834 + 300;
			arg1.anInt6477 = arg2.method4602();
		}
		if ((arg3 & 0x40000) != 0) {
			arg1.aByte80 = arg2.method4568();
			arg1.aByte79 = arg2.method4605();
			arg1.aByte77 = arg2.method4576();
			arg1.aByte78 = (byte) arg2.method4618();
			arg1.anInt6492 = Static277.anInt2834 + arg2.method4623();
			arg1.anInt6524 = Static277.anInt2834 + arg2.method4606();
		}
		if ((arg3 & 0x10000) != 0) {
			local40 = arg2.method4623();
			local62 = arg2.method4580();
			if (local40 == 65535) {
				local40 = -1;
			}
			local73 = arg2.method4614();
			arg1.method5299(true, local73, local40, local62);
		}
		if ((arg3 & 0x2) != 0) {
			local40 = arg2.method4618();
			@Pc(225) byte[] local225 = new byte[local40];
			@Pc(230) Class4_Sub20 local230 = new Class4_Sub20(local225);
			arg2.method4611(local40, local225);
			Static116.aClass4_Sub20Array1[arg0] = local230;
			arg1.method3619(local230);
		}
		if ((arg3 & 0x80) != 0) {
			Static326.aByteArray82[arg0] = arg2.method4605();
		}
		if ((arg3 & 0x800) != 0) {
			local32 = arg2.method4576();
		}
		if ((arg3 & 0x20) != 0) {
			local40 = arg2.method4606();
			if (local40 == 65535) {
				local40 = -1;
			}
			local62 = arg2.method4602();
			Static2.method14(local40, arg1, local62);
		}
		if ((arg3 & 0x4) != 0) {
			local40 = arg2.method4607();
			local62 = arg2.method4617();
			local73 = arg2.method4617();
			@Pc(318) int local318 = arg2.anInt5526;
			@Pc(329) boolean local329 = (local40 & 0x8000) != 0;
			if (arg1.aString31 != null && arg1.aClass90_1 != null) {
				@Pc(337) boolean local337 = false;
				if (local62 <= 1) {
					if (!local329 && (Static238.aBoolean310 && !Static53.aBoolean301 || Static317.aBoolean427)) {
						local337 = true;
					} else if (Static75.method1641(arg1.aString31)) {
						local337 = true;
					}
				}
				if (!local337 && Static304.anInt5641 == 0) {
					Static243.aClass4_Sub20_4.anInt5526 = 0;
					arg2.method4572(Static243.aClass4_Sub20_4.aByteArray77, local73);
					Static243.aClass4_Sub20_4.anInt5526 = 0;
					@Pc(380) int local380 = -1;
					@Pc(399) String local399;
					if (local329) {
						local40 &= 0x7FFF;
						@Pc(390) Class187 local390 = Static188.method3405(Static243.aClass4_Sub20_4);
						local380 = local390.anInt5359;
						local399 = local390.aClass4_Sub1_Sub4_1.method468(Static243.aClass4_Sub20_4);
					} else {
						local399 = Static105.method2007(Static110.method2178(Static243.aClass4_Sub20_4));
					}
					arg1.aString56 = local399.trim();
					arg1.anInt6537 = local40 & 0xFF;
					arg1.anInt6485 = local40 >> 8;
					arg1.anInt6531 = 150;
					@Pc(436) int local436;
					if (local62 == 1 || local62 == 2) {
						local436 = local329 ? 17 : 1;
					} else {
						local436 = local329 ? 17 : 2;
					}
					if (local62 == 2) {
						Static7.method71("<img=1>" + arg1.method3624(), local399, 0, "<img=1>" + arg1.method3625(), null, local380, local436);
					} else if (local62 == 1) {
						Static7.method71("<img=0>" + arg1.method3624(), local399, 0, "<img=0>" + arg1.method3625(), null, local380, local436);
					} else {
						Static7.method71(arg1.method3624(), local399, 0, arg1.method3625(), null, local380, local436);
					}
				}
			}
			arg2.anInt5526 = local73 + local318;
		}
		if ((arg3 & 0x400) != 0) {
			local40 = arg2.method4560();
			arg1.anInt6519 = arg2.method4614();
			arg1.anInt6498 = arg2.method4614();
			arg1.anInt6529 = local40 & 0x7FFF;
			arg1.aBoolean476 = (local40 & 0x8000) != 0;
			arg1.anInt6535 = arg1.anInt6519 + arg1.anInt6529 + Static277.anInt2834;
		}
		if ((arg3 & 0x20000) != 0) {
			local40 = arg2.method4602();
			@Pc(589) int[] local589 = new int[local40];
			@Pc(592) int[] local592 = new int[local40];
			@Pc(595) int[] local595 = new int[local40];
			for (@Pc(597) int local597 = 0; local597 < local40; local597++) {
				@Pc(603) int local603 = arg2.method4623();
				if (local603 == 65535) {
					local603 = -1;
				}
				local589[local597] = local603;
				local592[local597] = arg2.method4602();
				local595[local597] = arg2.method4560();
			}
			Static395.method5580(local589, local595, local592, arg1);
		}
		if ((arg3 & 0x1000) != 0) {
			arg1.aBoolean262 = arg2.method4614() == 1;
		}
		if ((arg3 & 0x8000) != 0) {
			arg1.anInt6474 = arg2.method4576();
			arg1.anInt6509 = arg2.method4576();
			arg1.anInt6547 = arg2.method4576();
			arg1.anInt6508 = arg2.method4578();
			arg1.anInt6533 = arg2.method4607() + Static277.anInt2834;
			arg1.anInt6538 = arg2.method4560() + Static277.anInt2834;
			arg1.anInt6500 = arg2.method4617();
			if (arg1.aBoolean263) {
				arg1.anInt6547 += arg1.anInt4171;
				arg1.anInt6549 = 0;
				arg1.anInt6474 += arg1.anInt4171;
				arg1.anInt6509 += arg1.anInt4165;
				arg1.anInt6508 += arg1.anInt4165;
			} else {
				arg1.anInt6508 += arg1.anIntArray524[0];
				arg1.anInt6474 += arg1.anIntArray523[0];
				arg1.anInt6547 += arg1.anIntArray523[0];
				arg1.anInt6509 += arg1.anIntArray524[0];
				arg1.anInt6549 = 1;
			}
			arg1.anInt6550 = 0;
		}
		if ((arg3 & 0x2000) != 0) {
			arg1.aString56 = arg2.method4624();
			if (arg1.aString56.charAt(0) == '~') {
				arg1.aString56 = arg1.aString56.substring(1);
				Static238.method4006(arg1.method3625(), 2, arg1.aString56, arg1.method3624(), 0);
			} else if (arg1 == Static52.aClass11_Sub5_Sub2_Sub1_2) {
				Static238.method4006(arg1.method3625(), 2, arg1.aString56, arg1.method3624(), 0);
			}
			arg1.anInt6485 = 0;
			arg1.anInt6537 = 0;
			arg1.anInt6531 = 150;
		}
		if (!arg1.aBoolean263) {
			return;
		}
		if (local32 == 127) {
			arg1.method3617(arg1.anInt4171, arg1.anInt4165);
			return;
		}
		@Pc(869) byte local869;
		if (local32 == -1) {
			local869 = Static326.aByteArray82[arg0];
		} else {
			local869 = local32;
		}
		arg1.method3621(local869, arg1.anInt4165, arg1.anInt4171);
	}
}
