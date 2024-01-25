import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "[J")
	public static long[] aLongArray7;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "[Lclient!qb;")
	public static final Class293_Sub1[] aClass293_Sub1Array2 = new Class293_Sub1[37];

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[6][];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)[I")
	public static int[] method1423(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = new int[3];
		Static586.method8349(Static338.method5179(arg0));
		local14[0] = Static183.aCalendar2.get(5);
		local14[1] = Static183.aCalendar2.get(2);
		local14[2] = Static183.aCalendar2.get(1);
		return local14;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILclient!ha;IIIII)V")
	public static void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Interface16 local9 = (Interface16) Static34.method575(arg1, arg7, arg4);
		@Pc(18) Class128 local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(44) int local44;
		if (local9 != null) {
			local18 = Static212.aClass249_4.method6119(local9.method9501());
			local24 = local9.method9502() & 0x3;
			local28 = local9.method9498();
			if (local18.anInt2993 == -1) {
				local44 = arg3;
				if (local18.anInt2945 > 0) {
					local44 = arg6;
				}
				if (local28 == 0 || local28 == 2) {
					if (local24 == 0) {
						arg2.method6925(local44, arg0, 4, arg5);
					} else if (local24 == 1) {
						arg2.method6949(local44, arg5, 24805, 4, arg0);
					} else if (local24 == 2) {
						arg2.method6925(local44, arg0, 4, arg5 + 3);
					} else if (local24 == 3) {
						arg2.method6949(local44, arg5, 24805, 4, arg0 + 3);
					}
				}
				if (local28 == 3) {
					if (local24 == 0) {
						arg2.method6887(arg0, local44, 1, 1, arg5);
					} else if (local24 == 1) {
						arg2.method6887(arg0, local44, 1, 1, arg5 + 3);
					} else if (local24 == 2) {
						arg2.method6887(arg0 + 3, local44, 1, 1, arg5 + 3);
					} else if (local24 == 3) {
						arg2.method6887(arg0 + 3, local44, 1, 1, arg5);
					}
				}
				if (local28 == 2) {
					if (local24 == 0) {
						arg2.method6949(local44, arg5, 24805, 4, arg0);
					} else if (local24 == 1) {
						arg2.method6925(local44, arg0, 4, arg5 + 3);
					} else if (local24 == 2) {
						arg2.method6949(local44, arg5, 24805, 4, arg0 + 3);
					} else if (local24 == 3) {
						arg2.method6925(local44, arg0, 4, arg5);
					}
				}
			} else {
				Static282.method4750(local18, arg5, local24, arg2, arg0);
			}
		}
		local9 = (Interface16) Static492.method7403(arg1, arg7, arg4, aClass10 == null ? (aClass10 = Class65.a("np")) : aClass10);
		if (local9 != null) {
			local18 = Static212.aClass249_4.method6119(local9.method9501());
			local24 = local9.method9502() & 0x3;
			local28 = local9.method9498();
			if (local18.anInt2993 != -1) {
				Static282.method4750(local18, arg5, local24, arg2, arg0);
			} else if (local28 == 9) {
				local44 = -1118482;
				if (local18.anInt2945 > 0) {
					local44 = -1179648;
				}
				if (local24 == 0 || local24 == 2) {
					arg2.method6939(arg0 + 3, arg5, local44, arg5 + 3, arg0);
				} else {
					arg2.method6939(arg0, arg5, local44, arg5 + 3, arg0 + 3);
				}
			}
		}
		local9 = (Interface16) Static447.method6640(arg1, arg7, arg4);
		if (local9 == null) {
			return;
		}
		@Pc(372) Class128 local372 = Static212.aClass249_4.method6119(local9.method9501());
		local28 = local9.method9502() & 0x3;
		if (local372.anInt2993 != -1) {
			Static282.method4750(local372, arg5, local28, arg2, arg0);
			return;
		}
	}
}
