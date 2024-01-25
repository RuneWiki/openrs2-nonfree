import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIILclient!tl;)V")
	public static void method1887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub5 arg4) {
		@Pc(4) Class51 local4 = Static261.method4461(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6148 = (arg1 << Static325.anInt6336) + Static31.anInt496;
		arg4.anInt6156 = arg3;
		arg4.anInt6154 = (arg2 << Static325.anInt6336) + Static31.anInt496;
		for (@Pc(28) Class11 local28 = local4.aClass11_2; local28 != null; local28 = local28.aClass11_1) {
			if (local28.aClass1_Sub2_1.aBoolean612) {
				@Pc(38) int local38 = local28.aClass1_Sub2_1.method5766();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6156 += local8;
			arg4.aBoolean548 = true;
		}
		local4.aClass1_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
	public static void method1892() {
		Static304.aClass104_159.anInt3077 = 1;
		Static2.aClient1.method866();
		Static107.aBoolean216 = true;
		Static297.aBoolean519 = true;
		Static327.method5350();
		Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
		Static201.anInt4409 = 0;
		Static139.aClass221_102 = null;
		Static40.aClass221_34 = null;
		Static99.anInt2030 = 0;
		Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
		Static279.aClass221_135 = null;
		Static101.anInt2051 = 0;
		Static67.aClass221_143 = null;
		for (@Pc(4384) int local4384 = 0; local4384 < Static223.aClass52Array1.length; local4384++) {
			Static223.aClass52Array1[local4384] = null;
		}
		for (@Pc(4403) int local4403 = 0; local4403 < 100; local4403++) {
			Static153.aStringArray22[local4403] = null;
		}
		Static159.anInt2742 = (int) (Math.random() * 100.0D) - 50;
		Static267.anInt5561 = (int) (Math.random() * 30.0D) - 20;
		Static60.aBoolean109 = false;
		Static20.anInt316 = 0;
		Static206.anInt4521 = (int) (Math.random() * 80.0D) - 40;
		Static366.aFloat48 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static85.anInt1601 = (int) (Math.random() * 120.0D) - 60;
		Static222.anInt6840 = (int) (Math.random() * 110.0D) - 55;
		Static191.anInt4213 = 0;
		Static8.method147();
		for (@Pc(4468) int local4468 = 0; local4468 < 2048; local4468++) {
			Static164.aClass1_Sub2_Sub3_Sub1Array1[local4468] = null;
		}
		Static186.anInt4092 = 0;
		for (@Pc(4484) int local4484 = 0; local4484 < 32768; local4484++) {
			Static95.aClass1_Sub2_Sub3_Sub2Array1[local4484] = null;
		}
		Static129.aClass180_22.method4917();
		Static30.aClass180_3.method4917();
		Static8.aClass193_1.method5218();
		Static198.aClass41_24.method907();
		Static108.aClass180_15 = new Class180();
		Static362.anInt6988 = 0;
		Static209.anInt6939 = 0;
		Static307.method5138();
		Static275.method4756();
		Static234.anInt5027 = 0;
		Static354.anInt6770 = 0;
		Static87.anInt1642 = 0;
		Static309.anInt6122 = 0;
		Static236.anInt929 = 0;
		Static20.anInt317 = 0;
		Static241.anInt5137 = 0;
		Static243.anInt5174 = 0;
		Static133.anInt2845 = 0;
		Static132.anInt2841 = 0;
		for (@Pc(4542) int local4542 = 0; local4542 < Static20.anIntArray40.length; local4542++) {
			if (!Static18.aBooleanArray4[local4542]) {
				Static20.anIntArray40[local4542] = -1;
			}
		}
		if (Static269.anInt6658 != -1) {
			Static25.method324(Static269.anInt6658);
		}
		for (@Pc(4569) Class2_Sub40 local4569 = (Class2_Sub40) Static303.aClass41_32.method896(); local4569 != null; local4569 = (Class2_Sub40) Static303.aClass41_32.method904()) {
			if (!local4569.method5722()) {
				local4569 = (Class2_Sub40) Static303.aClass41_32.method896();
				if (local4569 == null) {
					break;
				}
			}
			Static357.method5709(true, false, local4569);
		}
		Static269.anInt6658 = -1;
		Static303.aClass41_32 = new Class41(8);
		Static328.method5595();
		Static91.aClass68_12 = null;
		for (@Pc(4609) int local4609 = 0; local4609 < 8; local4609++) {
			Static153.aStringArray21[local4609] = null;
			Static304.aBooleanArray27[local4609] = false;
			Static215.anIntArray348[local4609] = -1;
		}
		Static361.method5747();
		Static278.aBoolean498 = true;
		for (@Pc(4635) int local4635 = 0; local4635 < 100; local4635++) {
			Static269.aBooleanArray29[local4635] = true;
		}
		Static167.aString36 = null;
		Static210.anInt4592 = 0;
		Static51.aClass210Array1 = null;
		for (@Pc(4653) int local4653 = 0; local4653 < 6; local4653++) {
			Static187.aClass159Array1[local4653] = new Class159();
		}
		for (@Pc(4669) int local4669 = 0; local4669 < 25; local4669++) {
			Static288.anIntArray453[local4669] = 0;
			Static50.anIntArray72[local4669] = 0;
			Static308.anIntArray470[local4669] = 0;
		}
		Static225.method4189();
		Static273.aBoolean493 = true;
		Static235.aShortArray92 = Static17.aShortArray1 = Static219.aShortArray86 = Static249.aShortArray95 = new short[256];
		Static79.aString14 = Static223.aClass140_116.method4155(Static239.anInt2803);
		Static281.anInt5678 = 0;
		Static135.aBoolean276 = false;
		Static237.method4311();
		Static227.method4205();
		Static319.aClass2_Sub2_2 = null;
		Static304.aClass104_159.anInt3077 = 2;
		Static236.aLong31 = 0L;
	}
}
