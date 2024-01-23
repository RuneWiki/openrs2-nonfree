import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!ph;")
	public static Class138 aClass138_27;

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "Lclient!ph;")
	public static Class138 aClass138_28;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	public static int anInt1753 = 0;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	public static int anInt1758 = 0;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Lclient!qf;")
	public static Class146 aClass146_7 = null;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	public static int anInt1760 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBIIZIIIIII)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		for (local7 = 0; local7 < 104; local7++) {
			for (local12 = 0; local12 < 104; local12++) {
				Static173.anIntArrayArray23[local7][local12] = 0;
				Static254.anIntArrayArray38[local7][local12] = 99999999;
			}
		}
		Static173.anIntArrayArray23[arg1][arg0] = 99;
		Static254.anIntArrayArray38[arg1][arg0] = 0;
		local7 = arg1;
		@Pc(56) byte local56 = 0;
		@Pc(58) int local58 = 0;
		local12 = arg0;
		Static229.anIntArray419[0] = arg1;
		@Pc(66) boolean local66 = false;
		@Pc(69) int local69 = local56 + 1;
		Static81.anIntArray123[0] = arg0;
		@Pc(76) int[][] local76 = Static56.aClass122Array1[Static295.anInt5586].anIntArrayArray28;
		@Pc(201) int local201;
		while (local58 != local69) {
			local7 = Static229.anIntArray419[local58];
			local12 = Static81.anIntArray123[local58];
			local58 = local58 + 1 & 0xFFF;
			if (local7 == arg5 && arg2 == local12) {
				local66 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static56.aClass122Array1[Static295.anInt5586].method3135(arg5, local12, arg6 - 1, local7, arg4, 2, arg2)) {
					local66 = true;
					break;
				}
				if (arg6 < 10 && Static56.aClass122Array1[Static295.anInt5586].method3127(2, arg6 - 1, arg4, local7, arg5, local12, arg2)) {
					local66 = true;
					break;
				}
			}
			if (arg7 != 0 && arg8 != 0 && Static56.aClass122Array1[Static295.anInt5586].method3140(local12, arg7, arg3, arg5, arg8, arg2, 2, local7)) {
				local66 = true;
				break;
			}
			local201 = Static254.anIntArrayArray38[local7][local12] + 1;
			if (local7 > 0 && Static173.anIntArrayArray23[local7 - 1][local12] == 0 && (local76[local7 - 1][local12] & 0x2C010E) == 0 && (local76[local7 - 1][local12 + 1] & 0x2C0138) == 0) {
				Static229.anIntArray419[local69] = local7 - 1;
				Static81.anIntArray123[local69] = local12;
				Static173.anIntArrayArray23[local7 - 1][local12] = 2;
				Static254.anIntArrayArray38[local7 - 1][local12] = local201;
				local69 = local69 + 1 & 0xFFF;
			}
			if (local7 < 102 && Static173.anIntArrayArray23[local7 + 1][local12] == 0 && (local76[local7 + 2][local12] & 0x2C0183) == 0 && (local76[local7 + 2][local12 + 1] & 0x2C01E0) == 0) {
				Static229.anIntArray419[local69] = local7 + 1;
				Static81.anIntArray123[local69] = local12;
				Static173.anIntArrayArray23[local7 + 1][local12] = 8;
				local69 = local69 + 1 & 0xFFF;
				Static254.anIntArrayArray38[local7 + 1][local12] = local201;
			}
			if (local12 > 0 && Static173.anIntArrayArray23[local7][local12 - 1] == 0 && (local76[local7][local12 - 1] & 0x2C010E) == 0 && (local76[local7 + 1][local12 - 1] & 0x2C0183) == 0) {
				Static229.anIntArray419[local69] = local7;
				Static81.anIntArray123[local69] = local12 - 1;
				local69 = local69 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local7][local12 - 1] = 1;
				Static254.anIntArrayArray38[local7][local12 - 1] = local201;
			}
			if (local12 < 102 && Static173.anIntArrayArray23[local7][local12 + 1] == 0 && (local76[local7][local12 + 2] & 0x2C0138) == 0 && (local76[local7 + 1][local12 + 2] & 0x2C01E0) == 0) {
				Static229.anIntArray419[local69] = local7;
				Static81.anIntArray123[local69] = local12 + 1;
				local69 = local69 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local7][local12 + 1] = 4;
				Static254.anIntArrayArray38[local7][local12 + 1] = local201;
			}
			if (local7 > 0 && local12 > 0 && Static173.anIntArrayArray23[local7 - 1][local12 - 1] == 0 && (local76[local7 - 1][local12] & 0x2C013E) == 0 && (local76[local7 - 1][local12 - 1] & 0x2C010E) == 0 && (local76[local7][local12 - 1] & 0x2C018F) == 0) {
				Static229.anIntArray419[local69] = local7 - 1;
				Static81.anIntArray123[local69] = local12 - 1;
				local69 = local69 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local7 - 1][local12 - 1] = 3;
				Static254.anIntArrayArray38[local7 - 1][local12 - 1] = local201;
			}
			if (local7 < 102 && local12 > 0 && Static173.anIntArrayArray23[local7 + 1][local12 - 1] == 0 && (local76[local7 + 1][local12 - 1] & 0x2C018F) == 0 && (local76[local7 + 2][local12 - 1] & 0x2C0183) == 0 && (local76[local7 + 2][local12] & 0x2C01E3) == 0) {
				Static229.anIntArray419[local69] = local7 + 1;
				Static81.anIntArray123[local69] = local12 - 1;
				Static173.anIntArrayArray23[local7 + 1][local12 - 1] = 9;
				Static254.anIntArrayArray38[local7 + 1][local12 - 1] = local201;
				local69 = local69 + 1 & 0xFFF;
			}
			if (local7 > 0 && local12 < 102 && Static173.anIntArrayArray23[local7 - 1][local12 + 1] == 0 && (local76[local7 - 1][local12 + 1] & 0x2C013E) == 0 && (local76[local7 - 1][local12 + 2] & 0x2C0138) == 0 && (local76[local7][local12 + 2] & 0x2C01F8) == 0) {
				Static229.anIntArray419[local69] = local7 - 1;
				Static81.anIntArray123[local69] = local12 + 1;
				Static173.anIntArrayArray23[local7 - 1][local12 + 1] = 6;
				Static254.anIntArrayArray38[local7 - 1][local12 + 1] = local201;
				local69 = local69 + 1 & 0xFFF;
			}
			if (local7 < 102 && local12 < 102 && Static173.anIntArrayArray23[local7 + 1][local12 + 1] == 0 && (local76[local7 + 1][local12 + 2] & 0x2C01F8) == 0 && (local76[local7 + 2][local12 + 2] & 0x2C01E0) == 0 && (local76[local7 + 2][local12 + 1] & 0x2C01E3) == 0) {
				Static229.anIntArray419[local69] = local7 + 1;
				Static81.anIntArray123[local69] = local12 + 1;
				local69 = local69 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local7 + 1][local12 + 1] = 12;
				Static254.anIntArrayArray38[local7 + 1][local12 + 1] = local201;
			}
		}
		if (!local66) {
			@Pc(911) int local911 = 100;
			local201 = 1000;
			for (@Pc(918) int local918 = arg5 - 10; local918 <= arg5 + 10; local918++) {
				for (@Pc(927) int local927 = arg2 - 10; local927 <= arg2 + 10; local927++) {
					if (local918 >= 0 && local927 >= 0 && local918 < 104 && local927 < 104 && Static254.anIntArrayArray38[local918][local927] < 100) {
						@Pc(960) int local960 = 0;
						@Pc(962) int local962 = 0;
						if (arg2 > local927) {
							local962 = arg2 - local927;
						} else if (arg2 + arg8 - 1 < local927) {
							local962 = local927 + 1 - arg8 - arg2;
						}
						if (local918 < arg5) {
							local960 = arg5 - local918;
						} else if (arg5 + arg7 - 1 < local918) {
							local960 = local918 + 1 - arg5 - arg7;
						}
						@Pc(1034) int local1034 = local960 * local960 + local962 * local962;
						if (local1034 < local201 || local201 == local1034 && local911 > Static254.anIntArrayArray38[local918][local927]) {
							local201 = local1034;
							local911 = Static254.anIntArrayArray38[local918][local927];
							local12 = local927;
							local7 = local918;
						}
					}
				}
			}
			if (local201 == 1000) {
				return;
			}
			if (local7 == arg1 && arg0 == local12) {
				return;
			}
		}
		Static127.anInt2540 = local12;
		Static263.aBoolean357 = false;
		Static62.anInt1244 = local7;
	}
}
