import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Lclient!tf;")
	public static final Class319 aClass319_1 = new Class319();

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
	public static int anInt2311 = 1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!vr;I)Lclient!ar;")
	public static Class16 method2074(@OriginalArg(0) Class9_Sub1_Sub1 arg0) {
		@Pc(14) Class16 local14;
		if (Static50.aClass16_2 == null) {
			local14 = new Class16();
		} else {
			local14 = Static50.aClass16_2;
			Static50.aClass16_2 = Static50.aClass16_2.aClass16_1;
			Static527.anInt8333--;
			local14.aClass16_1 = null;
		}
		local14.aClass9_Sub1_Sub1_1 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method2075(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method2077(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static29.aClass139Array6 == Static168.aClass139Array22) {
			return;
		}
		@Pc(10) int local10 = Static374.aClass139Array17[arg1].method6890(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class139 local23 = Static374.aClass139Array17[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method6890(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
