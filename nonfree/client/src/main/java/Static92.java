import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
	public static int anInt1788;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_12 = new Class132(10);

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "[I")
	public static final int[] anIntArray138 = new int[100];

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_45 = new Class211(78, 6);

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "Z")
	public static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method1460(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(4, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!i;III[Z)Z")
	public static boolean method1462(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static345.aClass162Array3 != Static109.aClass162Array1) {
			@Pc(11) int local11 = Static314.aClass162Array2[arg1].ca(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class162 local18 = Static314.aClass162Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.ca(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3273(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1463(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static284.method3771(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static209.anInt3494; local32++) {
			@Pc(38) String local38 = Static290.aStringArray29[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static284.method3771(local38);
			if (local38 != null && local38.equals(local22)) {
				Static209.anInt3494--;
				for (@Pc(62) int local62 = local32; local62 < Static209.anInt3494; local62++) {
					Static290.aStringArray29[local62] = Static290.aStringArray29[local62 + 1];
					Static312.aStringArray31[local62] = Static312.aStringArray31[local62 + 1];
					Static158.anIntArray186[local62] = Static158.anIntArray186[local62 + 1];
					Static14.aStringArray1[local62] = Static14.aStringArray1[local62 + 1];
					Static259.anIntArray361[local62] = Static259.anIntArray361[local62 + 1];
					Static240.aBooleanArray16[local62] = Static240.aBooleanArray16[local62 + 1];
				}
				Static336.anInt5710 = Static234.anInt3754;
				Static29.method451(Static148.aClass102_85);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(arg0));
				Static456.aClass2_Sub13_Sub2_2.method3590(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!sv;B)Lclient!qd;")
	public static Class57_Sub3 method1465(@OriginalArg(0) Class2_Sub13 arg0) {
		return new Class57_Sub3(arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3563(), arg0.method3580());
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)Lclient!de;")
	public static Class50 method1466(@OriginalArg(1) int arg0) {
		@Pc(8) Class50[] local8 = Static272.method3659();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt1350 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}
}
