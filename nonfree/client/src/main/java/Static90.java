import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7665(@OriginalArg(1) Class33 arg0) {
		Static14.aClass221Array1 = new Class221[Static368.anIntArray419.length];
		for (@Pc(11) int local11 = 0; local11 < Static368.anIntArray419.length; local11++) {
			@Pc(17) int local17 = Static368.anIntArray419[local11];
			@Pc(22) Class31 local22 = Static662.method8784(Static456.aClass34_96, local17);
			@Pc(30) Class56 local30 = arg0.method8081(local22, Static682.method1652(Static201.aClass34_51, local17));
			Static14.aClass221Array1[local11] = new Class221(local30, local22);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZ)V")
	public static void method7669(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static154.aClass4_Sub5_Sub3_2 != null) {
			Static143.anInt2618 = Static154.aClass4_Sub5_Sub3_2.anInt874;
		} else {
			Static143.anInt2618 = -1;
		}
		Static277.aClass199_7 = null;
		Static600.aClass163_64 = null;
		Static154.aClass4_Sub5_Sub3_2 = null;
		Static532.anInt8252 = 0;
		Static154.method456();
		Static154.aClass163_6.method3643();
		Static451.anInt7047 = -1;
		Static527.anInt8178 = -1;
		Static37.aClass157_1 = null;
		Static150.aClass157_3 = null;
		Static355.aClass157_6 = null;
		Static185.aClass17_28 = null;
		Static312.aClass157_5 = null;
		Static154.aClass225_2 = null;
		Static299.aClass157_4 = null;
		Static384.aClass157_7 = null;
		Static510.aClass157_8 = null;
		Static66.aClass157_2 = null;
		if (Static154.aClass59_2 != null) {
			Static154.aClass59_2.method1795();
			Static154.aClass59_2.method1797(128, 64);
		}
		if (Static154.aClass132_2 != null) {
			Static154.aClass132_2.method2916(64, 64);
		}
		if (Static154.aClass74_13 != null) {
			Static154.aClass74_13.method2070(64);
		}
		Static110.aClass184_1.method4123(64);
	}
}
