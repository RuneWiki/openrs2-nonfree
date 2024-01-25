import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
	public static int anInt1622;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILclient!kr;)Lclient!mj;")
	public static Class1_Sub31 method1480(@OriginalArg(0) int arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(15) byte[] local15 = arg1.method4361(arg0);
		return local15 == null ? null : new Class1_Sub31(local15);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
	public static int method1481() {
		if (Static86.aClass156_4 == null) {
			if (!Static15.aBoolean16 && Static16.anInt415 > 0) {
				if (Static546.aBoolean183 && Static149.aClass66_1.method1582(81) && Static16.anInt415 > 2) {
					return ((Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283.aClass1_283).anInt3167;
				}
				return ((Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283).anInt3167;
			}
			@Pc(24) int local24 = Static498.aClass5_1.method7052();
			@Pc(28) int local28 = Static498.aClass5_1.method7042();
			@Pc(30) int local30 = Static13.anInt305;
			@Pc(32) int local32 = Static188.anInt3359;
			@Pc(34) int local34 = Static541.anInt9145;
			if (local30 < local24 && local34 + local30 > local24) {
				@Pc(44) int local44 = -1;
				@Pc(64) int local64;
				for (@Pc(46) int local46 = 0; local46 < Static16.anInt415; local46++) {
					if (Static541.aBoolean640) {
						local64 = local32 + (Static16.anInt415 - local46 - 1) * 16 + 33;
						if (local64 - 13 < local28 && local64 + 3 >= local28) {
							local44 = local46;
						}
					} else {
						local64 = local32 + (Static16.anInt415 + -1 + -local46) * 16 + 31;
						if (local64 - 13 < local28 && local64 + 3 >= local28) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local64 = 0;
					@Pc(122) Class106 local122 = new Class106(Static248.aClass37_30);
					for (@Pc(129) Class1_Sub24 local129 = (Class1_Sub24) local122.method2484(); local129 != null; local129 = (Class1_Sub24) local122.method2485()) {
						if (local44 == local64++) {
							return local129.anInt3167;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZIII)V")
	public static void method1482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static50.aFloat13 = local3;
		Static404.aFloat156 = local15;
		if (Static448.anInt7701 == 2) {
			Static305.anInt5631 = local15;
			Static381.anInt6946 = local3;
			Static363.anInt6440 = 0;
		}
		Static486.method6644();
		Static282.aBoolean555 = true;
	}
}
