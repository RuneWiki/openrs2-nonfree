import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!d;")
	public static Class1_Sub2_Sub6 aClass1_Sub2_Sub6_16;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "Z")
	public static boolean aBoolean189;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Z")
	public static boolean aBoolean190;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt2097 = 0;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_584 = Static231.method3737("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public static int anInt2101 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1639(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static146.aClass102_1);
		arg0.removeMouseMotionListener(Static146.aClass102_1);
		arg0.removeFocusListener(Static146.aClass102_1);
		Static180.anInt4993 = 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method1642() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static23.aBooleanArray2[local7] = false;
		}
		Static59.anInt1431 = -1;
		Static61.anInt1480 = 1;
		Static127.anInt2766 = -1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	public static boolean method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static201.anIntArrayArray39[local7][local11] = 0;
				Static181.anIntArrayArray38[local7][local11] = 99999999;
			}
		}
		local11 = arg8;
		Static201.anIntArrayArray39[arg8][arg1] = 99;
		@Pc(51) byte local51 = 0;
		@Pc(53) int local53 = arg1;
		Static181.anIntArrayArray38[arg8][arg1] = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) boolean local63 = false;
		Static157.anIntArray302[0] = arg8;
		@Pc(70) int local70 = local51 + 1;
		Static11.anIntArray34[0] = arg1;
		@Pc(77) int[][] local77 = Static107.aClass60Array1[Static191.anInt4237].anIntArrayArray24;
		@Pc(192) int local192;
		while (local70 != local61) {
			local11 = Static157.anIntArray302[local61];
			local53 = Static11.anIntArray34[local61];
			local61 = local61 + 1 & 0xFFF;
			if (local11 == arg9 && local53 == arg3) {
				local63 = true;
				break;
			}
			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && Static107.aClass60Array1[Static191.anInt4237].method1685(local11, arg2, local53, arg10 - 1, arg9, arg3, 2)) {
					local63 = true;
					break;
				}
				if (arg10 < 10 && Static107.aClass60Array1[Static191.anInt4237].method1675(arg2, local53, local11, arg3, arg9, 2, arg10 - 1)) {
					local63 = true;
					break;
				}
			}
			if (arg7 != 0 && arg0 != 0 && Static107.aClass60Array1[Static191.anInt4237].method1687(arg9, arg3, arg5, 2, arg7, arg0, local53, local11)) {
				local63 = true;
				break;
			}
			local192 = Static181.anIntArrayArray38[local11][local53] + 1;
			if (local11 > 0 && Static201.anIntArrayArray39[local11 - 1][local53] == 0 && (local77[local11 - 1][local53] & 0x12C010E) == 0 && (local77[local11 - 1][local53 + 1] & 0x12C0138) == 0) {
				Static157.anIntArray302[local70] = local11 - 1;
				Static11.anIntArray34[local70] = local53;
				Static201.anIntArrayArray39[local11 - 1][local53] = 2;
				local70 = local70 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local11 - 1][local53] = local192;
			}
			if (local11 < 102 && Static201.anIntArrayArray39[local11 + 1][local53] == 0 && (local77[local11 + 2][local53] & 0x12C0183) == 0 && (local77[local11 + 2][local53 + 1] & 0x12C01E0) == 0) {
				Static157.anIntArray302[local70] = local11 + 1;
				Static11.anIntArray34[local70] = local53;
				Static201.anIntArrayArray39[local11 + 1][local53] = 8;
				Static181.anIntArrayArray38[local11 + 1][local53] = local192;
				local70 = local70 + 1 & 0xFFF;
			}
			if (local53 > 0 && Static201.anIntArrayArray39[local11][local53 - 1] == 0 && (local77[local11][local53 - 1] & 0x12C010E) == 0 && (local77[local11 + 1][local53 - 1] & 0x12C0183) == 0) {
				Static157.anIntArray302[local70] = local11;
				Static11.anIntArray34[local70] = local53 - 1;
				local70 = local70 + 1 & 0xFFF;
				Static201.anIntArrayArray39[local11][local53 - 1] = 1;
				Static181.anIntArrayArray38[local11][local53 - 1] = local192;
			}
			if (local53 < 102 && Static201.anIntArrayArray39[local11][local53 + 1] == 0 && (local77[local11][local53 + 2] & 0x12C0138) == 0 && (local77[local11 + 1][local53 + 2] & 0x12C01E0) == 0) {
				Static157.anIntArray302[local70] = local11;
				Static11.anIntArray34[local70] = local53 + 1;
				Static201.anIntArrayArray39[local11][local53 + 1] = 4;
				local70 = local70 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local11][local53 + 1] = local192;
			}
			if (local11 > 0 && local53 > 0 && Static201.anIntArrayArray39[local11 - 1][local53 - 1] == 0 && (local77[local11 - 1][local53] & 0x12C0138) == 0 && (local77[local11 - 1][local53 - 1] & 0x12C010E) == 0 && (local77[local11][local53 - 1] & 0x12C0183) == 0) {
				Static157.anIntArray302[local70] = local11 - 1;
				Static11.anIntArray34[local70] = local53 - 1;
				Static201.anIntArrayArray39[local11 - 1][local53 - 1] = 3;
				local70 = local70 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local11 - 1][local53 - 1] = local192;
			}
			if (local11 < 102 && local53 > 0 && Static201.anIntArrayArray39[local11 + 1][local53 - 1] == 0 && (local77[local11 + 1][local53 - 1] & 0x12C010E) == 0 && (local77[local11 + 2][local53 - 1] & 0x12C0183) == 0 && (local77[local11 + 2][local53] & 0x12C01E0) == 0) {
				Static157.anIntArray302[local70] = local11 + 1;
				Static11.anIntArray34[local70] = local53 - 1;
				Static201.anIntArrayArray39[local11 + 1][local53 - 1] = 9;
				local70 = local70 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local11 + 1][local53 - 1] = local192;
			}
			if (local11 > 0 && local53 < 102 && Static201.anIntArrayArray39[local11 - 1][local53 + 1] == 0 && (local77[local11 - 1][local53 + 1] & 0x12C010E) == 0 && (local77[local11 - 1][local53 + 2] & 0x12C0138) == 0 && (local77[local11][local53 + 2] & 0x12C01E0) == 0) {
				Static157.anIntArray302[local70] = local11 - 1;
				Static11.anIntArray34[local70] = local53 + 1;
				Static201.anIntArrayArray39[local11 - 1][local53 + 1] = 6;
				Static181.anIntArrayArray38[local11 - 1][local53 + 1] = local192;
				local70 = local70 + 1 & 0xFFF;
			}
			if (local11 < 102 && local53 < 102 && Static201.anIntArrayArray39[local11 + 1][local53 + 1] == 0 && (local77[local11 + 1][local53 + 2] & 0x12C0138) == 0 && (local77[local11 + 2][local53 + 2] & 0x12C01E0) == 0 && (local77[local11 + 2][local53 + 1] & 0x12C0183) == 0) {
				Static157.anIntArray302[local70] = local11 + 1;
				Static11.anIntArray34[local70] = local53 + 1;
				local70 = local70 + 1 & 0xFFF;
				Static201.anIntArrayArray39[local11 + 1][local53 + 1] = 12;
				Static181.anIntArrayArray38[local11 + 1][local53 + 1] = local192;
			}
		}
		Static36.anInt763 = 0;
		@Pc(868) int local868;
		if (!local63) {
			if (!arg6) {
				return false;
			}
			local192 = 1000;
			local868 = 100;
			for (@Pc(874) int local874 = arg9 - 10; local874 <= arg9 + 10; local874++) {
				for (@Pc(880) int local880 = arg3 - 10; local880 <= arg3 + 10; local880++) {
					if (local874 >= 0 && local880 >= 0 && local874 < 104 && local880 < 104 && Static181.anIntArrayArray38[local874][local880] < 100) {
						@Pc(910) int local910 = 0;
						if (arg9 > local874) {
							local910 = arg9 - local874;
						} else if (arg9 + arg7 - 1 < local874) {
							local910 = local874 + 1 - arg9 - arg7;
						}
						@Pc(941) int local941 = 0;
						if (arg3 > local880) {
							local941 = arg3 - local880;
						} else if (local880 > arg3 + arg0 - 1) {
							local941 = local880 + 1 - arg3 - arg0;
						}
						@Pc(981) int local981 = local941 * local941 + local910 * local910;
						if (local981 < local192 || local981 == local192 && Static181.anIntArrayArray38[local874][local880] < local868) {
							local868 = Static181.anIntArrayArray38[local874][local880];
							local192 = local981;
							local11 = local874;
							local53 = local880;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (local11 == arg8 && local53 == arg1) {
				return false;
			}
			Static36.anInt763 = 1;
		}
		@Pc(1061) byte local1061 = 0;
		Static157.anIntArray302[0] = local11;
		local61 = local1061 + 1;
		Static11.anIntArray34[0] = local53;
		local192 = local868 = Static201.anIntArrayArray39[local11][local53];
		while (arg8 != local11 || local53 != arg1) {
			if (local192 != local868) {
				Static157.anIntArray302[local61] = local11;
				Static11.anIntArray34[local61++] = local53;
				local868 = local192;
			}
			if ((local192 & 0x2) != 0) {
				local11++;
			} else if ((local192 & 0x8) != 0) {
				local11--;
			}
			if ((local192 & 0x1) != 0) {
				local53++;
			} else if ((local192 & 0x4) != 0) {
				local53--;
			}
			local192 = Static201.anIntArrayArray39[local11][local53];
		}
		if (local61 > 0) {
			Static114.method1973(local61, arg4);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BZLclient!sc;)V")
	public static void method1646(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class107 arg1) {
		if (arg0) {
			try {
				Static39.anApplet_Sub1_1.getAppletContext().showDocument(arg1.method3079(Static39.anApplet_Sub1_1.getCodeBase()), "_blank");
			} catch (@Pc(17) Exception local17) {
			}
		} else {
			try {
				Static39.anApplet_Sub1_1.getAppletContext().showDocument(arg1.method3079(Static39.anApplet_Sub1_1.getCodeBase()), "_top");
			} catch (@Pc(30) Exception local30) {
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IZ)V")
	public static void method1648(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static179.aBoolean356) {
			Static55.method1108();
		} else if (arg0 != -1 && (arg0 != Static10.anInt276 || !Static193.method3154()) && Static157.anInt3449 != 0 && !Static179.aBoolean356) {
			Static224.method3668(arg0, Static80.aClass28_Sub1_47, Static157.anInt3449);
		}
		Static10.anInt276 = arg0;
	}
}
