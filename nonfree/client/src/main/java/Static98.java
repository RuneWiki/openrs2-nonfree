import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "Lclient!ln;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_13 = new Class305(16);

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
	public static int anInt2324 = -1;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "Lclient!oe;")
	public static Class236 aClass236_1 = new Class236();

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Z")
	public static boolean method2096() {
		try {
			if (Static463.anInt8569 == 2) {
				if (Static27.aClass6_Sub3_1 == null) {
					Static27.aClass6_Sub3_1 = Static584.method667(Static329.aClass168_79, Static538.anInt9265, Static350.anInt5888);
					if (Static27.aClass6_Sub3_1 == null) {
						return false;
					}
				}
				if (Static445.aClass276_1 == null) {
					Static445.aClass276_1 = new Class276(Static554.aClass168_120, Static316.aClass168_75);
				}
				if (Static258.aClass6_Sub10_Sub1_2.method1539(Static27.aClass6_Sub3_1, Static518.aClass168_119, Static445.aClass276_1)) {
					Static258.aClass6_Sub10_Sub1_2.method1538();
					Static258.aClass6_Sub10_Sub1_2.method1544(Static179.anInt3992);
					Static258.aClass6_Sub10_Sub1_2.method1537(Static27.aClass6_Sub3_1, Static193.aBoolean341);
					Static445.aClass276_1 = null;
					Static463.anInt8569 = 0;
					Static329.aClass168_79 = null;
					Static27.aClass6_Sub3_1 = null;
					return true;
				}
			}
		} catch (@Pc(70) Exception local70) {
			local70.printStackTrace();
			Static258.aClass6_Sub10_Sub1_2.method1532();
			Static329.aClass168_79 = null;
			Static463.anInt8569 = 0;
			Static445.aClass276_1 = null;
			Static27.aClass6_Sub3_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZI)V")
	public static void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static265.aLong249 = 0;
		@Pc(11) int local11 = Static298.method4852();
		if (arg0 == 3 || local11 == 3) {
			arg2 = true;
		}
		if (!Static323.aClass9_8.method5437()) {
			arg2 = true;
		}
		Static373.method5922(local11, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILclient!jo;)Lclient!ob;")
	public static Class6_Sub4_Sub12 method2098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2) {
		@Pc(16) Class6_Sub26 local16 = new Class6_Sub26(arg2.method4435(arg0, arg1));
		@Pc(51) Class6_Sub4_Sub12 local51 = new Class6_Sub4_Sub12(arg0, local16.method4941(), local16.method4941(), local16.method5000(), local16.method5000(), local16.method4966() == 1, local16.method4966(), local16.method4966());
		@Pc(55) int local55 = local16.method4966();
		for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
			local51.aClass211_57.method5173(new Class6_Sub20(local16.method4966(), local16.method4999(), local16.method4999(), local16.method4999(), local16.method4999(), local16.method4999(), local16.method4999(), local16.method4999(), local16.method4999()));
		}
		local51.method5810();
		return local51;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ap;BZ[III)Lclient!hea;")
	public static Class132_Sub1_Sub1 method2102(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0.aBoolean69 || Static85.method1890(arg2) && Static85.method1890(arg3)) {
			return new Class132_Sub1_Sub1(arg0, 3553, arg2, arg3, false, arg1);
		} else if (arg0.aBoolean60) {
			return new Class132_Sub1_Sub1(arg0, 34037, arg2, arg3, false, arg1);
		} else {
			return new Class132_Sub1_Sub1(arg0, arg2, arg3, Static247.method4363(arg2), Static247.method4363(arg3), arg1);
		}
	}
}
