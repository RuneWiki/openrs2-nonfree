import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!bf;")
	public static Class11 aClass11_48;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	public static int anInt2106;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	public static int anInt2107;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
	public static int anInt2111;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lclient!bf;")
	public static Class11 aClass11_49;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
	public static int anInt2099 = -1;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "Lclient!ae;")
	public static Class5 aClass5_961 = Static56.method972("Die Verbindung konnte");

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	public static int anInt2100 = -1;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "Lclient!ae;")
	public static Class5 aClass5_962 = Static56.method972("@red@");

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Lclient!ae;")
	public static Class5 aClass5_963 = Static56.method972("headicons_prayer");

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "Lclient!ae;")
	public static Class5 aClass5_964 = Static56.method972("gr-Un:");

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_965 = Static56.method972("p12_full");

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "Lclient!ae;")
	public static Class5 aClass5_966 = Static56.method972("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "Lclient!ae;")
	public static Class5 aClass5_967 = null;

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
	public static int anInt2114 = -1;

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "Lclient!ae;")
	private static Class5 aClass5_968 = Static56.method972("flash2:");

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_969 = Static56.method972("blinken2:");

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lclient!ae;")
	public static Class5 aClass5_970 = Static56.method972("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_971 = aClass5_968;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V")
	public static void method1367() {
		aClass5_963 = null;
		aClass11_48 = null;
		aClass5_962 = null;
		aClass5_964 = null;
		aClass5_966 = null;
		aClass5_970 = null;
		aClass5_965 = null;
		aClass5_971 = null;
		aClass5_967 = null;
		aClass5_968 = null;
		aClass11_49 = null;
		aClass5_961 = null;
		aClass5_969 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!vb;IZIBB)V")
	public static void method1368(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte arg5) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(16) Class3_Sub1_Sub5 local16 = (Class3_Sub1_Sub5) Static35.aClass21_6.method459(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub5) Static7.aClass21_1.method459(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub5) Static47.aClass21_7.method459(local10);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class3_Sub1_Sub5) Static23.aClass21_5.method459(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub5();
			local16.aByte3 = arg5;
			local16.anInt882 = arg4;
			local16.aClass11_Sub1_31 = arg1;
			if (arg3) {
				Static35.aClass21_6.method452(local10, local16);
				Static44.anInt1250++;
			} else {
				Static48.aClass56_2.method1546(local16);
				Static47.aClass21_7.method452(local10, local16);
				Static62.anInt1664++;
			}
		} else if (arg3) {
			local16.method1931();
			Static35.aClass21_6.method452(local10, local16);
			Static44.anInt1250++;
			Static62.anInt1664--;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!bf;Lclient!ae;Lclient!ae;)Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 method1369(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(8) int local8 = arg0.method1880(arg1);
		@Pc(21) int local21 = arg0.method1860(local8, arg2);
		return Static42.method803(arg0, local21, local8);
	}
}
