import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!qa", name = "mb", descriptor = "Lclient!sb;")
	public static Class65 aClass65_34;

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "J")
	public static long aLong98;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1299 = Static106.method1849("::errortest");

	@OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1300 = Static106.method1849("weiss:");

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1301 = Static106.method1849("headicons_pk");

	@OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1303 = Static106.method1849("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1302 = aClass66_1303;

	@OriginalMember(owner = "client!qa", name = "zb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1306 = Static106.method1849("Loaded sprites");

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1304 = aClass66_1306;

	@OriginalMember(owner = "client!qa", name = "lb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1305 = Static106.method1849("Error connecting to server)3");

	@OriginalMember(owner = "client!qa", name = "nb", descriptor = "I")
	public static int anInt2343 = 0;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "Z")
	public static final boolean aBoolean97 = false;

	@OriginalMember(owner = "client!qa", name = "Bb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1307 = aClass66_1305;

	@OriginalMember(owner = "client!qa", name = "Db", descriptor = "Lclient!rb;")
	public static Class60 aClass60_71 = new Class60(100);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V")
	public static void method1645(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub24 local16 = (Class1_Sub24) Static38.aClass65_43.method1802((long) arg0);
		if (local16 != null) {
			for (@Pc(21) int local21 = 0; local21 < local16.anIntArray501.length; local21++) {
				local16.anIntArray501[local21] = -1;
				local16.anIntArray502[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Lclient!vc;")
	public static Class1_Sub1_Sub17 method1646(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static44.aClass60_46.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static19.aClass5_20.method107(arg0, 14);
		local10 = new Class1_Sub1_Sub17();
		if (local20 != null) {
			local10.method2008(new Class1_Sub12(local20));
		}
		Static44.aClass60_46.method1741((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method1648() {
		aClass66_1299 = null;
		aClass66_1306 = null;
		aClass66_1302 = null;
		aClass66_1301 = null;
		aClass66_1304 = null;
		aClass60_71 = null;
		aClass65_34 = null;
		aClass1_Sub1_Sub2_Sub3_2 = null;
		aClass66_1305 = null;
		aClass66_1303 = null;
		aClass66_1307 = null;
		aClass66_1300 = null;
	}
}
