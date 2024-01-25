import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!iq;")
	public static Class104 aClass104_63;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	public static int anInt1809;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public static void method1832(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub9_Sub4 local12 = Static98.method1971(8, arg0);
		local12.method1799();
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method1836() {
		Static17.method257(Static248.anInt5206);
		@Pc(16) int local16 = (Static166.anInt3804 >> 10) + (Static150.anInt3453 >> 3);
		@Pc(24) int local24 = (Static287.anInt5776 >> 3) + (Static51.anInt879 >> 10);
		Static291.anInt5263 = Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 = 0;
		Static177.aClass1_Sub2_Sub3_Sub1_1.method2970(8, 8);
		Static351.anIntArray518 = new int[18];
		Static238.aByteArrayArray12 = new byte[18][];
		Static348.anIntArray219 = new int[18];
		Static121.aByteArrayArray8 = new byte[18][];
		Static77.aByteArrayArray2 = new byte[18][];
		Static25.anIntArray50 = new int[18];
		Static356.anIntArray525 = new int[18];
		Static107.anIntArray176 = new int[18];
		Static84.aByteArrayArray4 = new byte[18][];
		Static80.aByteArrayArray3 = new byte[18][];
		Static307.anIntArrayArray53 = new int[18][4];
		Static134.anIntArray230 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local16 - (Static66.anInt1177 >> 4)) / 8; local88 <= ((Static66.anInt1177 >> 4) + local16) / 8; local88++) {
			for (local99 = (local24 - (Static12.anInt213 >> 4)) / 8; local99 <= ((Static12.anInt213 >> 4) + local24) / 8; local99++) {
				@Pc(108) int local108 = (local88 << 8) + local99;
				Static25.anIntArray50[local79] = local108;
				Static134.anIntArray230[local79] = Static63.aClass104_43.method2769("m" + local88 + "_" + local99);
				Static348.anIntArray219[local79] = Static63.aClass104_43.method2769("l" + local88 + "_" + local99);
				Static107.anIntArray176[local79] = Static63.aClass104_43.method2769("n" + local88 + "_" + local99);
				Static356.anIntArray525[local79] = Static63.aClass104_43.method2769("um" + local88 + "_" + local99);
				Static351.anIntArray518[local79] = Static63.aClass104_43.method2769("ul" + local88 + "_" + local99);
				if (Static107.anIntArray176[local79] == -1) {
					Static134.anIntArray230[local79] = -1;
					Static348.anIntArray219[local79] = -1;
					Static356.anIntArray525[local79] = -1;
					Static351.anIntArray518[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static107.anIntArray176.length; local99++) {
			Static107.anIntArray176[local99] = -1;
			Static134.anIntArray230[local99] = -1;
			Static348.anIntArray219[local99] = -1;
			Static356.anIntArray525[local99] = -1;
			Static351.anIntArray518[local99] = -1;
		}
		Static266.method4676(local24, true, false, local16);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIB)Z")
	public static boolean method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(19) Interface8 local19 = (Interface8) Static356.method5687(arg0, arg2, arg1);
		if (local19 != null) {
			local13 = Static250.method4416(local19) & true;
		}
		local19 = (Interface8) Static109.method2112(arg0, arg2, arg1, rc.class);
		if (local19 != null) {
			local13 &= Static250.method4416(local19);
		}
		local19 = (Interface8) Static217.method4135(arg0, arg2, arg1);
		if (local19 != null) {
			local13 &= Static250.method4416(local19);
		}
		return local13;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(CI)Z")
	public static boolean method1839(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
