import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
	public static int anInt4430;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "Z")
	public static boolean aBoolean314 = false;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString160 = "slide:";

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3725(@OriginalArg(1) long arg0) {
		Static302.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static302.aCalendar2.get(7);
		@Pc(17) int local17 = Static302.aCalendar2.get(5);
		@Pc(26) int local26 = Static302.aCalendar2.get(2);
		@Pc(30) int local30 = Static302.aCalendar2.get(1);
		@Pc(34) int local34 = Static302.aCalendar2.get(11);
		@Pc(38) int local38 = Static302.aCalendar2.get(12);
		@Pc(42) int local42 = Static302.aCalendar2.get(13);
		return Static299.aStringArray40[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static47.aStringArray41[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method3726(@OriginalArg(1) Class3_Sub26 arg0) {
		if (arg0.aByteArray64.length - arg0.anInt4615 < 1) {
			return;
		}
		@Pc(23) int local23 = arg0.method3915();
		if (local23 < 0 || local23 > 11) {
			return;
		}
		@Pc(40) byte local40;
		if (local23 == 11) {
			local40 = 33;
		} else if (local23 == 10) {
			local40 = 32;
		} else if (local23 == 9) {
			local40 = 31;
		} else if (local23 == 8) {
			local40 = 30;
		} else if (local23 == 7) {
			local40 = 29;
		} else if (local23 == 6) {
			local40 = 28;
		} else if (local23 == 5) {
			local40 = 28;
		} else if (local23 == 4) {
			local40 = 24;
		} else if (local23 == 3) {
			local40 = 23;
		} else if (local23 == 2) {
			local40 = 22;
		} else if (local23 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray64.length - arg0.anInt4615) {
			return;
		}
		Static251.anInt5174 = arg0.method3915();
		if (Static251.anInt5174 < 1) {
			Static251.anInt5174 = 1;
		} else if (Static251.anInt5174 > 4) {
			Static251.anInt5174 = 4;
		}
		Static48.method761(arg0.method3915() == 1);
		Static76.aBoolean127 = arg0.method3915() == 1;
		Static201.aBoolean280 = arg0.method3915() == 1;
		Static258.aBoolean367 = arg0.method3915() == 1;
		Static40.aBoolean431 = arg0.method3915() == 1;
		Static315.aBoolean435 = arg0.method3915() == 1;
		Static241.aBoolean341 = arg0.method3915() == 1;
		Static199.aBoolean275 = arg0.method3915() == 1;
		Static86.anInt1599 = arg0.method3915();
		if (Static86.anInt1599 > 2) {
			Static86.anInt1599 = 2;
		}
		if (local23 >= 2) {
			Static67.aBoolean95 = arg0.method3915() == 1;
		} else {
			Static67.aBoolean95 = arg0.method3915() == 1;
			arg0.method3915();
		}
		Static66.aBoolean94 = arg0.method3915() == 1;
		Static218.aBoolean307 = arg0.method3915() == 1;
		Static120.anInt2254 = arg0.method3915();
		if (Static120.anInt2254 > 2) {
			Static120.anInt2254 = 2;
		}
		Static268.anInt5481 = Static120.anInt2254;
		Static110.aBoolean160 = arg0.method3915() == 1;
		Static177.anInt3306 = arg0.method3915();
		if (Static177.anInt3306 > 127) {
			Static177.anInt3306 = 127;
		}
		Static220.anInt5204 = arg0.method3915();
		Static305.anInt6006 = arg0.method3915();
		if (Static305.anInt6006 > 127) {
			Static305.anInt6006 = 127;
		}
		if (local23 >= 1) {
			Static187.anInt3701 = arg0.method3948();
			Static132.anInt2491 = arg0.method3948();
		}
		if (local23 >= 3 && local23 < 6) {
			arg0.method3915();
		}
		if (local23 >= 4) {
			@Pc(408) int local408 = arg0.method3915();
			if (Static258.anInt5304 < 96) {
				local408 = 0;
			}
			Static71.method1077(local408);
		}
		if (local23 >= 5) {
			Static27.anInt489 = arg0.method3896();
		}
		if (local23 >= 6) {
			Static255.anInt5254 = arg0.method3915();
		}
		if (local23 >= 7) {
			Static19.aBoolean34 = arg0.method3915() == 1;
		}
		if (local23 >= 8) {
			Static247.aBoolean348 = arg0.method3915() == 1;
		}
		if (local23 >= 9) {
			Static224.anInt6084 = arg0.method3915();
		}
		if (local23 >= 10) {
			Static17.aBoolean31 = arg0.method3915() != 0;
		}
		if (local23 >= 11) {
			Static57.aBoolean82 = arg0.method3915() != 0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIZZIII)V")
	public static void method3727(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 <= arg5) {
			return;
		}
		@Pc(10) int local10 = arg5;
		@Pc(16) int local16 = (arg3 + arg5) / 2;
		@Pc(20) Class87_Sub1 local20 = Static100.aClass87_Sub1Array1[local16];
		Static100.aClass87_Sub1Array1[local16] = Static100.aClass87_Sub1Array1[arg3];
		Static100.aClass87_Sub1Array1[arg3] = local20;
		for (@Pc(32) int local32 = arg5; local32 < arg3; local32++) {
			if (Static175.method2881(arg4, arg1, arg0, arg2, local20, Static100.aClass87_Sub1Array1[local32]) <= 0) {
				@Pc(54) Class87_Sub1 local54 = Static100.aClass87_Sub1Array1[local32];
				Static100.aClass87_Sub1Array1[local32] = Static100.aClass87_Sub1Array1[local10];
				Static100.aClass87_Sub1Array1[local10++] = local54;
			}
		}
		Static100.aClass87_Sub1Array1[arg3] = Static100.aClass87_Sub1Array1[local10];
		Static100.aClass87_Sub1Array1[local10] = local20;
		method3727(arg0, arg1, arg2, local10 - 1, arg4, arg5);
		method3727(arg0, arg1, arg2, arg3, arg4, local10 + 1);
	}
}
