import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!ma;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_4;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!le;")
	public static Class50 aClass50_4;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!lf;")
	public static Class7 aClass7_14;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_944 = Static78.method1313("rot:");

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!fc;")
	private static Class25 aClass25_952 = Static78.method1313("World");

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_945 = aClass25_952;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public static int anInt1970 = 0;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "[Lclient!v;")
	public static Class1_Sub2_Sub3_Sub4_Sub2[] aClass1_Sub2_Sub3_Sub4_Sub2Array1 = new Class1_Sub2_Sub3_Sub4_Sub2[2048];

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!fc;")
	private static Class25 aClass25_949 = Static78.method1313("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_946 = aClass25_949;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_947 = Static78.method1313("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!fc;")
	public static Class25 aClass25_948 = Static78.method1313("p12_full");

	@OriginalMember(owner = "client!od", name = "z", descriptor = "[Lclient!mf;")
	public static Class56_Sub1[] aClass56_Sub1Array1 = new Class56_Sub1[256];

	@OriginalMember(owner = "client!od", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_950 = aClass25_952;

	@OriginalMember(owner = "client!od", name = "I", descriptor = "I")
	public static int anInt1984 = 0;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "Lclient!fc;")
	public static Class25 aClass25_951 = Static78.method1313("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public static int anInt1986 = 0;

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_953 = Static78.method1313("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1441() {
		try {
			@Pc(6) Graphics local6 = Static119.aCanvas1.getGraphics();
			Static10.aClass7_1.method1095(local6, 17, 357);
		} catch (@Pc(14) Exception local14) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public static void method1444() {
		aClass25_948 = null;
		aClass25_953 = null;
		aClass25_945 = null;
		aClass25_947 = null;
		aClass25_944 = null;
		aClass56_Sub1Array1 = null;
		aClass1_Sub2_Sub2_Sub3_4 = null;
		aClass25_950 = null;
		aClass25_949 = null;
		anIntArray349 = null;
		aClass7_14 = null;
		aClass1_Sub2_Sub3_Sub4_Sub2Array1 = null;
		aClass25_951 = null;
		aClass50_4 = null;
		aClass25_946 = null;
		aClass25_952 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method1445(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static94.anIntArray381[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 4;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!dc;I)Lclient!fc;")
	public static Class25 method1448(@OriginalArg(1) Class1_Sub5 arg0) {
		try {
			@Pc(7) Class25 local7 = new Class25();
			local7.anInt956 = arg0.method674();
			if (local7.anInt956 > 32767) {
				local7.anInt956 = 32767;
			}
			local7.aByteArray15 = new byte[local7.anInt956];
			arg0.anInt792 += Static129.aClass76_1.method1857(local7.anInt956, local7.aByteArray15, arg0.anInt792, arg0.aByteArray13, 0);
			return local7;
		} catch (@Pc(48) Exception local48) {
			return Static58.aClass25_582;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!oc;ILclient!fc;Lclient!fc;)[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] method1453(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(13) int local13 = arg0.method1278(arg2);
		@Pc(19) int local19 = arg0.method1264(arg1, local13);
		return Static106.method1719(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZI)Lclient!fc;")
	public static Class25 method1457(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) int local3 = 1;
		for (@Pc(23) int local23 = arg0 / 10; local23 != 0; local23 /= 10) {
			local3++;
		}
		@Pc(37) int local37 = local3;
		if (arg0 < 0 || arg1) {
			local37 = local3 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local37];
		if (arg0 < 0) {
			local48[0] = 45;
		} else if (arg1) {
			local48[0] = 43;
		}
		for (@Pc(67) int local67 = 0; local67 < local3; local67++) {
			@Pc(73) int local73 = arg0 % 10;
			arg0 /= 10;
			if (local73 < 0) {
				local73 = -local73;
			}
			if (local73 > 9) {
				local73 += 39;
			}
			local48[local37 - local67 - 1] = (byte) (local73 + 48);
		}
		@Pc(107) Class25 local107 = new Class25();
		local107.anInt956 = local37;
		local107.aByteArray15 = local48;
		return local107;
	}
}
