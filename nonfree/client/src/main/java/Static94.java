import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	public static int anInt2085 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method2038(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static227.anInt4597 > 0) {
			local19 = Static296.aByteArrayArray17[--Static227.anInt4597];
			Static296.aByteArrayArray17[Static227.anInt4597] = null;
			return local19;
		} else if (arg0 == 5000 && Static275.anInt5356 > 0) {
			local19 = Static181.aByteArrayArray11[--Static275.anInt5356];
			Static181.aByteArrayArray11[Static275.anInt5356] = null;
			return local19;
		} else if (arg0 == 30000 && Static22.anInt6732 > 0) {
			local19 = Static119.aByteArrayArray7[--Static22.anInt6732];
			Static119.aByteArrayArray7[Static22.anInt6732] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method2040() {
		Static226.aClass21_123.method851();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIII)I")
	public static int method2041(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub26 local10 = Static65.method5281(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray256.length; local23++) {
				if (local10.anIntArray255[local23] == arg2) {
					local21 += local10.anIntArray256[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)V")
	public static void method2042() {
		@Pc(9) Class21 local9 = Static102.aClass21_181;
		synchronized (Static102.aClass21_181) {
			Static102.aClass21_181.method844(5);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Lclient!og;")
	public static Class155 method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static105.aClass155ArrayArrayArray3[0][arg1][arg2] != null && Static105.aClass155ArrayArrayArray3[0][arg1][arg2].aClass155_1 != null;
			if (local28 && arg0 >= Static263.anInt5201 - 1) {
				return null;
			}
			Static85.method1806(arg0, arg1, arg2);
		}
		return Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V")
	public static void method2044() {
		Static190.method3566();
	}
}
