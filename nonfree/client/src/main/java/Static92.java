import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!je;")
	public static Class2_Sub8_Sub5 aClass2_Sub8_Sub5_2;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Z")
	public static boolean aBoolean145 = true;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!sf;")
	public static Class157 aClass157_21 = new Class157(128);

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString80 = "Continue";

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	public static int anInt2206 = 0;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ek;II)[Lclient!bn;")
	public static Class2_Sub8_Sub1[] method1629(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return Static187.method3282(arg0, arg1, 0) ? Static47.method886() : null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public static void method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class2_Sub13 local30 = Static52.aClass2_Sub13ArrayArrayArray1[local9][arg0][arg1] = Static52.aClass2_Sub13ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt1548--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt1544; local40++) {
					@Pc(49) Class170 local49 = local30.aClass170Array1[local40];
					if ((local49.aLong195 >> 29 & 0x3L) == 2L && local49.anInt5433 == arg0 && local49.anInt5437 == arg1) {
						local49.anInt5439--;
					}
				}
			}
		}
		if (Static52.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1] == null) {
			Static52.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub13(0, arg0, arg1);
		}
		Static52.aClass2_Sub13ArrayArrayArray1[0][arg0][arg1].aClass2_Sub13_1 = local7;
		Static52.aClass2_Sub13ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIILjava/lang/String;ZLjava/lang/String;IZJZ)V")
	public static void method1632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) long arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(34) Class2_Sub16 local34 = new Class2_Sub16(128);
		local34.method2168(10);
		local34.method2143((arg9 ? 4 : 0) | (arg7 ? 2 : 0) | (arg4 ? 1 : 0));
		local34.method2144(arg8);
		local34.method2186(local8[0]);
		local34.method2153(arg3);
		local34.method2186(local8[1]);
		local34.method2143(Static21.anInt460);
		local34.method2168(arg1);
		local34.method2168(arg2);
		local34.method2186(local8[2]);
		local34.method2143(arg0);
		local34.method2143(arg6);
		local34.method2186(local8[3]);
		local34.method2136(Static119.aBigInteger5, Static210.aBigInteger4);
		@Pc(120) Class2_Sub16 local120 = new Class2_Sub16(350);
		local120.method2153(arg5);
		@Pc(133) int local133 = 8 - Static223.method3684(arg5) % 8;
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			local120.method2168((int) (Math.random() * 255.0D));
		}
		local120.method2179(local8);
		Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
		Static211.aClass2_Sub16_Sub1_2.method2168(22);
		Static211.aClass2_Sub16_Sub1_2.method2143(local34.anInt2789 + local120.anInt2789 + 2);
		Static211.aClass2_Sub16_Sub1_2.method2143(553);
		Static211.aClass2_Sub16_Sub1_2.method2178(local34.aByteArray17, local34.anInt2789);
		Static211.aClass2_Sub16_Sub1_2.method2178(local120.aByteArray17, local120.anInt2789);
		anInt2207 = 0;
		Static194.anInt4084 = 0;
		Static195.anInt6028 = -3;
		Static259.anInt5132 = 1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)Lclient!ig;")
	public static Class2_Sub8_Sub10 method1633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub8_Sub10 local15 = (Class2_Sub8_Sub10) Static150.aClass101_11.method2867((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class2_Sub8_Sub10(arg0, arg1);
			Static150.aClass101_11.method2860(local15, local15.aLong214);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public static boolean method1634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static196.aBoolean281) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static262.aClass56ArrayArray1[local13] == null || Static262.aClass56ArrayArray1[local13][local25] == null) {
			return false;
		}
		@Pc(45) Class56 local45 = Static262.aClass56ArrayArray1[local13][local25];
		@Pc(54) int local54;
		if (arg1 == -1 && local45.anInt2092 == 0) {
			for (local54 = 0; local54 < Static68.anInt1741; local54++) {
				if (Static290.aShortArray85[local54] == 11 || Static290.aShortArray85[local54] == 1011 || Static290.aShortArray85[local54] == 20 || Static290.aShortArray85[local54] == 41 || Static290.aShortArray85[local54] == 12) {
					for (@Pc(149) Class56 local149 = Static38.method715(Static56.anIntArray123[local54]); local149 != null; local149 = Static157.method2862(local149)) {
						if (local149.anInt2096 == local45.anInt2096) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < Static68.anInt1741; local54++) {
				if (Static67.anIntArray144[local54] == arg1 && local45.anInt2096 == Static56.anIntArray123[local54] && (Static290.aShortArray85[local54] == 11 || Static290.aShortArray85[local54] == 1011 || Static290.aShortArray85[local54] == 20 || Static290.aShortArray85[local54] == 41 || Static290.aShortArray85[local54] == 12)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lclient!oe;")
	public static Class2_Sub16 method1635() {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(34);
		local8.method2168(11);
		local8.method2168(Static178.anInt5291);
		local8.method2168(Static47.aBoolean81 ? 1 : 0);
		local8.method2168(Static3.aBoolean8 ? 1 : 0);
		local8.method2168(Static185.aBoolean365 ? 1 : 0);
		local8.method2168(Static19.aBoolean30 ? 1 : 0);
		local8.method2168(Static226.aBoolean403 ? 1 : 0);
		local8.method2168(Static154.aBoolean236 ? 1 : 0);
		local8.method2168(Static206.aBoolean292 ? 1 : 0);
		local8.method2168(Static191.aBoolean276 ? 1 : 0);
		local8.method2168(Static243.anInt4839);
		local8.method2168(Static265.aBoolean348 ? 1 : 0);
		local8.method2168(Static74.aBoolean118 ? 1 : 0);
		local8.method2168(Static40.aBoolean64 ? 1 : 0);
		local8.method2168(Static262.anInt5150);
		local8.method2168(Static49.aBoolean87 ? 1 : 0);
		local8.method2168(Static99.anInt2343);
		local8.method2168(Static287.anInt5651);
		local8.method2168(Static201.anInt4203);
		local8.method2143(Static248.anInt2151);
		local8.method2143(Static202.anInt2813);
		local8.method2168(Static97.method1697());
		local8.method2186(Static215.anInt4387);
		local8.method2168(Static119.anInt5242);
		local8.method2168(Static128.aBoolean205 ? 1 : 0);
		local8.method2168(Static41.aBoolean65 ? 1 : 0);
		local8.method2168(Static272.anInt5414);
		local8.method2168(Static60.aBoolean96 ? 1 : 0);
		local8.method2168(Static261.aBoolean343 ? 1 : 0);
		return local8;
	}
}
