import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array6;

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lclient!gba;")
	public static Class115 aClass115_3 = null;

	@OriginalMember(owner = "client!dfa", name = "r", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
	public static void method2115() {
		Static236.anInt4754 = 0;
		@Pc(11) int local11 = Static487.aClass4_Sub9_Sub1_2.method6015();
		@Pc(20) boolean local20 = Static487.aClass4_Sub9_Sub1_2.method6009() == 1;
		@Pc(24) int local24 = Static487.aClass4_Sub9_Sub1_2.method5982();
		@Pc(28) int local28 = Static487.aClass4_Sub9_Sub1_2.method5982();
		Static288.method4549();
		Static274.method4405(local11);
		@Pc(41) int local41 = (Static474.anInt4412 - Static487.aClass4_Sub9_Sub1_2.anInt7219) / 16;
		Static376.anIntArrayArray61 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static376.anIntArrayArray61[local47][local51] = Static487.aClass4_Sub9_Sub1_2.method6026();
			}
		}
		Static206.anIntArray400 = new int[local41];
		Static475.aByteArrayArray33 = null;
		Static34.aByteArrayArray40 = new byte[local41][];
		Static380.anIntArray543 = new int[local41];
		Static197.anIntArray391 = null;
		Static434.aByteArrayArray31 = new byte[local41][];
		Static240.anIntArray424 = new int[local41];
		Static238.aByteArrayArray38 = new byte[local41][];
		Static220.aByteArrayArray18 = new byte[local41][];
		Static101.anIntArray236 = new int[local41];
		Static293.anIntArray459 = new int[local41];
		local41 = 0;
		for (local51 = (local28 - (Static38.anInt740 >> 4)) / 8; local51 <= ((Static38.anInt740 >> 4) + local28) / 8; local51++) {
			for (@Pc(126) int local126 = (local24 - (Static38.anInt741 >> 4)) / 8; local126 <= ((Static38.anInt741 >> 4) + local24) / 8; local126++) {
				Static380.anIntArray543[local41] = (local51 << 8) + local126;
				Static240.anIntArray424[local41] = Static370.aClass31_81.method653("m" + local51 + "_" + local126);
				Static206.anIntArray400[local41] = Static370.aClass31_81.method653("l" + local51 + "_" + local126);
				Static101.anIntArray236[local41] = Static370.aClass31_81.method653("um" + local51 + "_" + local126);
				Static293.anIntArray459[local41] = Static370.aClass31_81.method653("ul" + local51 + "_" + local126);
				local41++;
			}
		}
		Static575.method7834(11, local24, local28, local20);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)Lclient!qf;")
	public static Class281 method2117() {
		return new Class281(1, false);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)Lclient!gba;")
	public static Class115 method2118(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static458.aClass115ArrayArray2[local7] == null || Static458.aClass115ArrayArray2[local7][local11] == null) {
			@Pc(25) boolean local25 = Static474.method3731(local7);
			if (!local25) {
				return null;
			}
		}
		return Static458.aClass115ArrayArray2[local7][local11];
	}
}
