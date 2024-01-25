import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "[[[Lclient!lo;")
	public static Class217[][][] aClass217ArrayArrayArray2;

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_21 = new Class46(65, 0);

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_4 = new Class376(9, -1);

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!gba;)V")
	public static void method1590(@OriginalArg(1) Class5_Sub22_Sub1 arg0) {
		arg0.method2658();
		@Pc(10) int local10 = Static337.anInt5722;
		@Pc(20) Class4_Sub2_Sub1_Sub1_Sub1 local20 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local10] = new Class4_Sub2_Sub1_Sub1_Sub1();
		local20.anInt1225 = local10;
		@Pc(30) int local30 = arg0.method2655(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		local20.anIntArray94[0] = local41 - Static565.anInt9560;
		@Pc(53) int local53 = local30 & 0x3FFF;
		local20.anInt10231 = (local20.anIntArray94[0] << 9) + (local20.method1018() << 8);
		local20.anIntArray95[0] = local53 - Static567.anInt9589;
		local20.anInt10229 = (local20.anIntArray95[0] << 9) + (local20.method1018() << 8);
		Static636.anInt10567 = local20.aByte132 = local20.aByte131 = local35;
		if (Static23.method285(local20.anIntArray94[0], local20.anIntArray95[0])) {
			local20.aByte131++;
		}
		if (Static14.aClass5_Sub22Array1[local10] != null) {
			local20.method744(Static14.aClass5_Sub22Array1[local10]);
		}
		Static320.anInt5442 = 0;
		Static278.anIntArray264[Static320.anInt5442++] = local10;
		Static466.aByteArray75[local10] = 0;
		Static188.anInt9410 = 0;
		for (@Pc(146) int local146 = 1; local146 < 2048; local146++) {
			if (local10 != local146) {
				@Pc(156) int local156 = arg0.method2655(18);
				@Pc(160) int local160 = local156 >> 16;
				@Pc(166) int local166 = local156 >> 8 & 0xFF;
				@Pc(170) int local170 = local156 & 0xFF;
				@Pc(178) Class264 local178 = Static120.aClass264Array1[local146] = new Class264();
				local178.anInt7222 = -1;
				local178.anInt7223 = 0;
				local178.aBoolean516 = false;
				local178.anInt7221 = (local160 << 28) + (local166 << 14) + local170;
				Static289.anIntArray272[Static188.anInt9410++] = local146;
				Static466.aByteArray75[local146] = 0;
			}
		}
		arg0.method2659();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZD)V")
	public static void method1591(@OriginalArg(1) double arg0) {
		Static633.aClass113_9.method8456(Static10.aClass113_1);
		Static633.aClass113_9.method8454(0, 0, (int) arg0);
		Static9.aClass133_1.method7269(Static633.aClass113_9);
	}
}
