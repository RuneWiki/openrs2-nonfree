import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_18;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "I")
	public static int anInt1845;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!pe;")
	private static Class65 aClass65_800 = Static119.method1462("Loaded wordpack");

	@OriginalMember(owner = "client!p", name = "i", descriptor = "[Lclient!ha;")
	public static Class2_Sub1_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub1_Sub4_Sub1Array1 = new Class2_Sub1_Sub1_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!pe;")
	public static Class65 aClass65_801 = aClass65_800;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!pe;")
	private static Class65 aClass65_802 = Static119.method1462("Error connecting to server)3");

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_803 = Static119.method1462("Benutzen");

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_804 = Static119.method1462("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt1844 = 0;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!pe;")
	private static Class65 aClass65_805 = Static119.method1462("Loaded title screen");

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!pe;")
	private static Class65 aClass65_806 = Static119.method1462("Existing User");

	@OriginalMember(owner = "client!p", name = "q", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array43 = new Class65[1000];

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_807 = aClass65_802;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_808 = aClass65_805;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_809 = aClass65_806;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_810 = Static119.method1462("headicons_pk");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1384() {
		aClass65_802 = null;
		aClass65_801 = null;
		aClass65_804 = null;
		aClass65_808 = null;
		aClass65_810 = null;
		aClass65_806 = null;
		aCalendar1 = null;
		aClass65_800 = null;
		aClass65_807 = null;
		aClass65_803 = null;
		aClass2_Sub1_Sub1_Sub4_Sub1Array1 = null;
		aClass65_805 = null;
		aClass56_Sub1_18 = null;
		aClass65Array43 = null;
		aClass65_809 = null;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method1385() {
		Static3.aClass8_7.method171();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!fb;IILclient!re;)V")
	public static void method1386(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class56_Sub1 arg2) {
		@Pc(3) Class2_Sub19 local3 = new Class2_Sub19();
		local3.aClass24_3 = arg0;
		local3.aLong100 = arg1;
		local3.anInt2511 = 1;
		local3.aClass56_Sub1_28 = arg2;
		@Pc(26) Class13 local26 = Static9.aClass13_4;
		synchronized (Static9.aClass13_4) {
			Static9.aClass13_4.method263(local3);
		}
		Static35.method643();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([III[I[Lclient!ue;I)V")
	public static void method1387(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class79[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 <= arg4) {
			return;
		}
		@Pc(12) int local12 = arg1 + 1;
		@Pc(16) int local16 = arg4 - 1;
		@Pc(23) int local23 = (arg4 + arg1) / 2;
		@Pc(27) Class79 local27 = arg3[local23];
		arg3[local23] = arg3[arg4];
		arg3[arg4] = local27;
		while (local12 > local16) {
			@Pc(41) boolean local41 = true;
			@Pc(44) int local44;
			@Pc(56) int local56;
			@Pc(59) int local59;
			do {
				local12--;
				for (local44 = 0; local44 < 4; local44++) {
					if (arg2[local44] == 2) {
						local56 = arg3[local12].anInt2608;
						local59 = local27.anInt2608;
					} else if (arg2[local44] == 1) {
						local59 = local27.anInt2609;
						if (local59 == -1 && arg0[local44] == 1) {
							local59 = 2001;
						}
						local56 = arg3[local12].anInt2609;
						if (local56 == -1 && arg0[local44] == 1) {
							local56 = 2001;
						}
					} else if (arg2[local44] == 3) {
						local59 = local27.aBoolean104 ? 1 : 0;
						local56 = arg3[local12].aBoolean104 ? 1 : 0;
					} else {
						local56 = arg3[local12].anInt2604;
						local59 = local27.anInt2604;
					}
					if (local59 != local56) {
						if ((arg0[local44] != 1 || local56 <= local59) && (arg0[local44] != 0 || local56 >= local59)) {
							local41 = false;
						}
						break;
					}
					if (local44 == 3) {
						local41 = false;
					}
				}
			} while (local41);
			local41 = true;
			do {
				local16++;
				for (local44 = 0; local44 < 4; local44++) {
					if (arg2[local44] == 2) {
						local59 = local27.anInt2608;
						local56 = arg3[local16].anInt2608;
					} else if (arg2[local44] == 1) {
						local59 = local27.anInt2609;
						if (local59 == -1 && arg0[local44] == 1) {
							local59 = 2001;
						}
						local56 = arg3[local16].anInt2609;
						if (local56 == -1 && arg0[local44] == 1) {
							local56 = 2001;
						}
					} else if (arg2[local44] == 3) {
						local56 = arg3[local16].aBoolean104 ? 1 : 0;
						local59 = local27.aBoolean104 ? 1 : 0;
					} else {
						local59 = local27.anInt2604;
						local56 = arg3[local16].anInt2604;
					}
					if (local59 != local56) {
						if ((arg0[local44] != 1 || local56 >= local59) && (arg0[local44] != 0 || local59 >= local56)) {
							local41 = false;
						}
						break;
					}
					if (local44 == 3) {
						local41 = false;
					}
				}
			} while (local41);
			if (local16 < local12) {
				@Pc(324) Class79 local324 = arg3[local16];
				arg3[local16] = arg3[local12];
				arg3[local12] = local324;
			}
		}
		method1387(arg0, local12, arg2, arg3, arg4);
		method1387(arg0, arg1, arg2, arg3, local12 + 1);
	}
}
