import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[[[Lclient!sq;")
	public static Class194[][][] aClass194ArrayArrayArray2;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!c;")
	public static Class5 aClass5_13;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "[Lclient!bn;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt2288;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt2289;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public static final int[] anIntArray213 = new int[14];

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
	public static final int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_72 = new Class34("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	public static final int[] anIntArray216 = new int[14];

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
	public static final int[] anIntArray217 = new int[2500];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Lclient!ti;")
	public static Class195 method1962(@OriginalArg(0) int arg0) {
		@Pc(10) Class195 local10 = (Class195) Static36.aClass87_9.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static203.aClass216_68.method5648(1, arg0);
		local10 = new Class195();
		local10.anInt6007 = arg0;
		if (local20 != null) {
			local10.method5132(new Class1_Sub8(local20));
		}
		local10.method5124();
		if (local10.anInt6010 == 2 && Static77.aClass197_7.method5157((long) arg0) == null) {
			Static77.aClass197_7.method5166(new Class1_Sub13(Static28.anInt1031), (long) arg0);
			Static40.aClass195Array1[Static28.anInt1031++] = local10;
		}
		Static36.aClass87_9.method2481(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)I")
	public static int method1963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local15 * arg1;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)Lclient!u;")
	public static Class201 method1965(@OriginalArg(1) int arg0) {
		@Pc(10) Class201 local10 = (Class201) Static312.aClass87_39.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static16.aClass216_3.method5648(30, arg0);
		local10 = new Class201();
		if (local20 != null) {
			local10.method5180(new Class1_Sub8(local20), arg0);
		}
		Static312.aClass87_39.method2481(local10, (long) arg0);
		return local10;
	}
}
