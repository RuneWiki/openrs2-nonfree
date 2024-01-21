import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "Lclient!ed;")
	private static Class23 aClass23_871 = Static169.method2903(" ");

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_872 = aClass23_871;

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_873 = Static169.method2903("M");

	@OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
	public static int anInt2338 = 0;

	@OriginalMember(owner = "client!kf", name = "hb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_874 = Static169.method2903("flash1:");

	@OriginalMember(owner = "client!kf", name = "lb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_875 = aClass23_874;

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_876 = aClass23_874;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)I")
	public static int method1545(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] method1546() {
		@Pc(8) Class1_Sub1_Sub12_Sub4[] local8 = new Class1_Sub1_Sub12_Sub4[Static110.anInt2830];
		for (@Pc(10) int local10 = 0; local10 < Static110.anInt2830; local10++) {
			@Pc(16) Class1_Sub1_Sub12_Sub4 local16 = new Class1_Sub1_Sub12_Sub4();
			local16.anInt3903 = Static71.anInt1936;
			local16.anInt3908 = Static62.anInt1654;
			local16.anInt3904 = Static103.anIntArray346[local10];
			local16.anInt3906 = Static59.anIntArray226[local10];
			local16.anInt3905 = Static27.anIntArray109[local10];
			local16.anInt3907 = Static47.anIntArray152[local10];
			local16.anIntArray535 = Static14.anIntArray63;
			local16.aByteArray44 = Static1.aByteArrayArray1[local10];
			local8[local10] = local16;
		}
		Static54.method996();
		return local8;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
	public static void method1547() {
		aClass23_876 = null;
		aClass23_875 = null;
		aClass23_873 = null;
		aClass23_874 = null;
		aClass23_872 = null;
		aClass23_871 = null;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)Z")
	public static boolean method1548(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static37.anIntArray124[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1004;
	}
}
