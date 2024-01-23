import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!hg", name = "bb", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array5;

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray57 = new boolean[100];

	@OriginalMember(owner = "client!hg", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_412 = Static199.method3560("null");

	@OriginalMember(owner = "client!hg", name = "db", descriptor = "Lclient!he;")
	public static Class44 aClass44_18 = new Class44();

	@OriginalMember(owner = "client!hg", name = "eb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_413 = Static199.method3560("document)3cookie=(R");

	@OriginalMember(owner = "client!hg", name = "gb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_415 = Static199.method3560("FULL");

	@OriginalMember(owner = "client!hg", name = "fb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_414 = aClass78_415;

	@OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
	public static int anInt1809 = -1;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZ)V")
	public static void method1460() {
		@Pc(7) byte[][] local7 = Static7.aByteArrayArray2;
		@Pc(12) int local12 = local7.length;
		@Pc(27) int local27;
		@Pc(38) int local38;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			local27 = (Static171.anIntArray653[local14] >> 8) * 64 - Static28.anInt497;
			local38 = (Static171.anIntArray653[local14] & 0xFF) * 64 - Static57.anInt628;
			@Pc(42) byte[] local42 = local7[local14];
			if (local42 != null) {
				Static41.method565();
				Static180.method3306(local38, local27, local42, Static225.anInt4878 * 8 - 48, Static90.anInt2014 * 8 - 48, Static202.aClass90Array1);
			}
		}
		for (local27 = 0; local27 < local12; local27++) {
			@Pc(86) int local86 = (Static171.anIntArray653[local27] & 0xFF) * 64 - Static57.anInt628;
			local38 = (Static171.anIntArray653[local27] >> 8) * 64 - Static28.anInt497;
			@Pc(101) byte[] local101 = local7[local27];
			if (local101 == null && Static225.anInt4878 < 800) {
				Static41.method565();
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					Static149.method1480(local112, local86, 64, 64, local38);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLclient!oe;Lclient!oe;)V")
	public static void method1461(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class72 arg1) {
		Static226.aClass72_286 = arg0;
		Static40.aClass72_49 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!oe;ZILclient!oe;)Lclient!oj;")
	public static Class2_Sub3_Sub22 method1465(@OriginalArg(1) Class72 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class72 arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(6) int[] local6 = arg0.method3189(arg1);
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(17) byte[] local17 = arg0.method3195(local6[local8], arg1);
			if (local17 == null) {
				local1 = false;
			} else {
				@Pc(36) int local36 = local17[1] & 0xFF | (local17[0] & 0xFF) << 8;
				@Pc(51) byte[] local51 = arg2.method3195(0, local36);
				if (local51 == null) {
					local1 = false;
				}
			}
		}
		if (!local1) {
			return null;
		}
		try {
			return new Class2_Sub3_Sub22(arg0, arg2, arg1, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}
}
