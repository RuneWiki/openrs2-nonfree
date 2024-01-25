import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "[Lclient!wd;")
	public static final Class2_Sub51[] aClass2_Sub51Array1 = new Class2_Sub51[1024];

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IB)Lclient!iga;")
	public static Class159 method1552(@OriginalArg(0) int arg0) {
		@Pc(6) Class159[] local6 = Static311.method4745();
		for (@Pc(13) int local13 = 0; local13 < local6.length; local13++) {
			@Pc(18) Class159 local18 = local6[local13];
			if (arg0 == local18.anInt4703) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)Z")
	public static boolean method1553(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
	public static int method1554(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;ZLjava/lang/String;BLclient!da;Lclient!fp;)V")
	public static void method1555(@OriginalArg(0) Class87 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class64 arg3, @OriginalArg(5) Class114 arg4) {
		@Pc(17) boolean local17 = !Static539.aBoolean658 || Static315.method5516();
		if (!local17) {
			return;
		}
		@Pc(39) int local39;
		@Pc(48) int local48;
		if (Static539.aBoolean658 && local17) {
			@Pc(26) Class114 local26 = Static258.aClass114_43;
			@Pc(32) Class64 local32 = arg0.method7965(local26, Static150.aClass120Array1);
			local39 = local26.method3012(250, null, arg2);
			local48 = local26.method3017(null, local26.anInt3643, 250, arg2);
			@Pc(51) int local51 = Static49.aClass120_1.anInt3710;
			@Pc(55) int local55 = local51 + 4;
			local48 += local55 * 2;
			local39 += local55 * 2;
			if (local39 < Static473.anInt8101) {
				local39 = Static473.anInt8101;
			}
			if (local48 < Static272.anInt5251) {
				local48 = Static272.anInt5251;
			}
			@Pc(94) int local94 = Static487.aClass174_12.method4260(Static386.anInt6961, local39) + Static478.anInt8172;
			@Pc(102) int local102 = Static430.aClass176_11.method4289(local48, Static135.anInt3053) + Static179.anInt3992;
			if (Static558.aBoolean680) {
				local94 += Static257.method4233();
				local102 += Static290.method4545();
			}
			arg0.method7969(Static329.aClass120_9, false).method4577(Static85.aClass120_2.anInt3710 + local94, local102 - -Static85.aClass120_2.anInt3707, local39 - Static85.aClass120_2.anInt3710 * 2, -(Static85.aClass120_2.anInt3707 * 2) + local48, 1, 0, 0);
			arg0.method7969(Static85.aClass120_2, true).method4582(local94, local102);
			Static85.aClass120_2.method3072();
			arg0.method7969(Static85.aClass120_2, true).method4582(local94 + local39 - local51, local102);
			Static85.aClass120_2.method3076();
			arg0.method7969(Static85.aClass120_2, true).method4582(local39 + local94 - local51, local102 - (-local48 - -local51));
			Static85.aClass120_2.method3072();
			arg0.method7969(Static85.aClass120_2, true).method4582(local94, local48 + local102 - local51);
			Static85.aClass120_2.method3076();
			arg0.method7969(Static49.aClass120_1, true).method4584(local94, Static85.aClass120_2.anInt3707 + local102, local51, local48 - Static85.aClass120_2.anInt3707 * 2);
			Static49.aClass120_1.method3065();
			arg0.method7969(Static49.aClass120_1, true).method4584(local94 + Static85.aClass120_2.anInt3710, local102, local39 - Static85.aClass120_2.anInt3710 * 2, local51);
			Static49.aClass120_1.method3065();
			arg0.method7969(Static49.aClass120_1, true).method4584(local39 + local94 - local51, Static85.aClass120_2.anInt3707 + local102, local51, local48 - Static85.aClass120_2.anInt3707 * 2);
			Static49.aClass120_1.method3065();
			arg0.method7969(Static49.aClass120_1, true).method4584(Static85.aClass120_2.anInt3710 + local94, local48 + local102 - local51, local39 - Static85.aClass120_2.anInt3710 * 2, local51);
			Static49.aClass120_1.method3065();
			local32.method7490(0, 0, local55 + local94, null, local55 + local102, -(local55 * 2) + local48, null, -1, local39 - local55 * 2, Static342.anInt6256 | 0xFF000000, arg2, 1, 1, 0, null);
			Static122.method2496(local39, local94, local48, local102);
		} else {
			local39 = arg4.method3012(250, null, arg2);
			local48 = arg4.method3016(250, arg2, null) * 13;
			arg0.aa(6, 6, local39 + 4 + 4, local48 + 8, -16777216, 0);
			arg0.method7954(6, 6, local39 + 4 + 4, local48 - -4 + 4, -1, 0);
			arg3.method7490(0, 0, 10, null, 10, local48, null, -1, local39, -1, arg2, 1, 1, 0, null);
			Static122.method2496(local39 + 8, 6, local48 + 4 + 4, 6);
		}
		if (!arg1) {
			return;
		}
		try {
			if (Static558.aBoolean680) {
				Static256.method4212();
			} else {
				arg0.method7932();
			}
		} catch (@Pc(458) Exception_Sub1 local458) {
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
	public static void method1556(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static605.aHashtable7.put(arg0, arg1);
	}
}
