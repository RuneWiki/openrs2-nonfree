import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Lclient!ua;")
	public static Class171 method1495(@OriginalArg(1) int arg0) {
		@Pc(10) Class171 local10 = (Class171) Static113.aClass26_22.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static311.aClass58_104.method1372(Static179.method2821(arg0), Static168.method2703(arg0));
		local10 = new Class171();
		local10.anInt5256 = arg0;
		if (local26 != null) {
			local10.method4300(new Class4_Sub10(local26));
		}
		local10.method4298();
		Static113.aClass26_22.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)V")
	public static void method1496() {
		if (Static194.anInt5196 == -1 || Static153.anInt3024 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static56.anInt1165 - Static308.anInt5950) * Static48.anInt915 >> 16) + Static308.anInt5950;
		@Pc(27) float[] local27 = new float[3];
		Static48.anInt915 += local24;
		if (Static48.anInt915 < 65535) {
			Static36.aBoolean35 = false;
			Static285.aBoolean389 = false;
		} else {
			Static48.anInt915 = 65535;
			if (Static285.aBoolean389) {
				Static36.aBoolean35 = false;
			} else {
				Static36.aBoolean35 = true;
			}
			Static285.aBoolean389 = true;
		}
		@Pc(65) float local65 = (float) Static48.anInt915 / 65535.0F;
		@Pc(69) int local69 = Static228.anInt4385 * 2;
		@Pc(86) int local86;
		@Pc(98) int local98;
		@Pc(131) int local131;
		@Pc(139) int local139;
		@Pc(143) int local143;
		@Pc(153) int local153;
		@Pc(170) int local170;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			local86 = Static29.anIntArrayArrayArray1[Static194.anInt5196][local69][local71] * 3;
			local98 = Static29.anIntArrayArrayArray1[Static194.anInt5196][local69 + 1][local71] * 3;
			local131 = (Static29.anIntArrayArrayArray1[Static194.anInt5196][local69 + 2][local71] + Static29.anIntArrayArrayArray1[Static194.anInt5196][local69 + 2][local71] - Static29.anIntArrayArrayArray1[Static194.anInt5196][local69 + 3][local71]) * 3;
			local139 = Static29.anIntArrayArrayArray1[Static194.anInt5196][local69][local71];
			local143 = local98 - local86;
			local153 = local86 + local131 - local98 * 2;
			local170 = Static29.anIntArrayArrayArray1[Static194.anInt5196][local69 + 2][local71] + local98 - local131 - local139;
			local27[local71] = (float) local139 + ((float) local143 + ((float) local153 + (float) local170 * local65) * local65) * local65;
		}
		Static302.anInt5682 = (int) local27[2] - Static295.anInt5480 * 128;
		Static82.anInt1931 = (int) local27[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		Static129.anInt2519 = (int) local27[0] - Static220.anInt3983 * 128;
		local86 = Static9.anInt126 * 2;
		for (local98 = 0; local98 < 3; local98++) {
			local131 = Static29.anIntArrayArrayArray1[Static153.anInt3024][local86][local98] * 3;
			local139 = Static29.anIntArrayArrayArray1[Static153.anInt3024][local86 + 1][local98] * 3;
			local143 = (Static29.anIntArrayArrayArray1[Static153.anInt3024][local86 + 2][local98] + Static29.anIntArrayArrayArray1[Static153.anInt3024][local86 + 2][local98] - Static29.anIntArrayArrayArray1[Static153.anInt3024][local86 + 3][local98]) * 3;
			local153 = Static29.anIntArrayArrayArray1[Static153.anInt3024][local86][local98];
			local170 = local139 - local131;
			@Pc(320) int local320 = local139 + Static29.anIntArrayArrayArray1[Static153.anInt3024][local86 + 2][local98] - local143 - local153;
			@Pc(329) int local329 = local143 + local131 - local139 * 2;
			local213[local98] = local65 * ((local65 * (float) local320 + (float) local329) * local65 + (float) local170) + (float) local153;
		}
		@Pc(361) float local361 = local213[0] - local27[0];
		@Pc(369) float local369 = local213[2] - local27[2];
		@Pc(379) float local379 = (local213[1] - local27[1]) * -1.0F;
		@Pc(389) double local389 = Math.sqrt((double) (local361 * local361 + local369 * local369));
		Static27.aFloat15 = (float) Math.atan2((double) local379, local389);
		Static314.aFloat154 = -((float) Math.atan2((double) local361, (double) local369));
		Static193.anInt3656 = (int) ((double) Static314.aFloat154 * 325.949D) & 0x7FF;
		Static207.anInt4066 = (int) ((double) Static27.aFloat15 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(JIILjava/lang/String;Ljava/lang/String;SIB)V")
	public static void method1497(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) short arg5, @OriginalArg(6) int arg6) {
		if (Static18.aBoolean17 || Static300.anInt5638 >= 500) {
			return;
		}
		Static259.aStringArray30[Static300.anInt5638] = arg4;
		Static249.aStringArray27[Static300.anInt5638] = arg3;
		Static86.anIntArray160[Static300.anInt5638] = arg6 == -1 ? Static313.anInt6054 : arg6;
		Static262.aShortArray100[Static300.anInt5638] = arg5;
		Static141.aLongArray56[Static300.anInt5638] = arg0;
		Static73.anIntArray117[Static300.anInt5638] = arg1;
		Static262.anIntArray543[Static300.anInt5638] = arg2;
		Static300.anInt5638++;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static void method1498() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static20.method279(local7, local13, true, local18, Static6.aClass4_Sub19ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
