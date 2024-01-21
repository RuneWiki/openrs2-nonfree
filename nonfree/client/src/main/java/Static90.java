import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "J")
	public static long aLong72;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!v;")
	private static Class62 aClass62_1086 = Static45.method753("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_1087 = Static45.method753("(Y");

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!v;")
	private static Class62 aClass62_1090 = Static45.method753("Error connecting to server)3");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_1088 = aClass62_1090;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_1089 = Static45.method753(" x");

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public static int anInt2425 = -1;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "Lclient!v;")
	public static Class62 aClass62_1091 = aClass62_1086;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "I")
	public static int anInt2427 = 0;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_1092 = Static45.method753("Classic");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
	public static void method1534(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method1535() {
		aFontMetrics1 = null;
		aClass62_1089 = null;
		aClass62_1086 = null;
		aClass62_1091 = null;
		aClass62_1092 = null;
		Class56.anIntArray267 = null;
		aClass62_1088 = null;
		aClass62_1087 = null;
		aClass62_1090 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBIIII)I")
	public static int method1536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(8) int local8 = arg3;
			arg3 = arg4;
			arg4 = local8;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg5;
		} else if (local20 == 1) {
			return arg1;
		} else if (local20 == 2) {
			return 1 + 7 - arg3 - arg5;
		} else {
			return 7 + 1 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!he;)V")
	public static void method1538(@OriginalArg(1) Class30 arg0) {
		Static15.aClass30_1 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!v;I)V")
	public static void method1539(@OriginalArg(0) Class62 arg0) {
		if (arg0 == null || arg0.method1688() == 0) {
			Static4.anInt182 = 0;
			return;
		}
		@Pc(16) Class62 local16 = arg0;
		@Pc(19) Class62[] local19 = new Class62[100];
		@Pc(25) int local25 = 0;
		while (true) {
			@Pc(30) int local30 = local16.method1677();
			if (local30 == -1) {
				local16 = local16.method1699();
				if (local16.method1688() > 0) {
					local19[local25++] = local16.method1704();
				}
				Static4.anInt182 = 0;
				label46: for (local30 = 0; local30 < Static62.anInt1720; local30++) {
					@Pc(89) Class3_Sub1_Sub2 local89 = Static4.method160(local30);
					if (local89.anInt280 == -1 && local89.aClass62_116 != null) {
						@Pc(102) Class62 local102 = local89.aClass62_116.method1704();
						for (@Pc(104) int local104 = 0; local104 < local25; local104++) {
							if (local102.method1697(local19[local104]) == -1) {
								continue label46;
							}
						}
						Static93.aClass62Array12[Static4.anInt182] = local102;
						Static56.anIntArray122[Static4.anInt182] = local30;
						Static4.anInt182++;
						if (Static93.aClass62Array12.length <= Static4.anInt182) {
							return;
						}
					}
				}
				return;
			}
			@Pc(59) Class62 local59 = local16.method1693(local30, 0).method1699();
			if (local59.method1688() > 0) {
				local19[local25++] = local59.method1704();
			}
			local16 = local16.method1702(local30 + 1);
		}
	}
}
