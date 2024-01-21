import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!qf;")
	public static Class4_Sub4_Sub3_Sub4 aClass4_Sub4_Sub3_Sub4_5;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public static int anInt2046;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_837 = Static121.method2047("sl_flags");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public static int[] anIntArray206 = new int[50];

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
	public static int[] anIntArray207 = new int[50];

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	public static int anInt2044 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1500() {
		aClass4_Sub4_Sub3_Sub4_5 = null;
		anIntArray206 = null;
		anIntArray207 = null;
		aClass60_837 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(JZ)Lclient!qc;")
	public static Class60 method1501(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(47) byte[] local47 = new byte[local31];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local31--;
				local47[local31] = Static14.aByteArray127[(int) (local56 - arg0 * 37L)];
			}
			@Pc(83) Class60 local83 = new Class60();
			local83.aByteArray89 = local47;
			local83.anInt2310 = local47.length;
			return local83;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)Z")
	public static boolean method1502(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!lc;IB)[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] method1503(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		return Static13.method279(arg2, arg1, arg0) ? Static24.method468() : null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
	public static void method1504(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub12 local12 = (Class4_Sub12) Static111.aClass66_13.method1834((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray149.length; local17++) {
				local12.anIntArray149[local17] = -1;
				local12.anIntArray151[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)I")
	public static int method1505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub12 local15 = (Class4_Sub12) Static111.aClass66_13.method1834((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && local15.anIntArray149.length > arg1) {
			return local15.anIntArray149[arg1];
		} else {
			return -1;
		}
	}
}
