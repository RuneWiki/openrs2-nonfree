import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!hj", name = "wb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!hj", name = "Cb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "Lclient!jd;")
	public static Class61 aClass61_29 = new Class61(50);

	@OriginalMember(owner = "client!hj", name = "ib", descriptor = "I")
	public static int anInt1851 = 2;

	@OriginalMember(owner = "client!hj", name = "vb", descriptor = "[I")
	public static int[] anIntArray191 = new int[25];

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
	public static void method1435() {
		if (!Static155.method412() && Static191.anInt4237 != Static166.anInt4347) {
			Static76.method1342(Static220.anInt4826, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], Static191.anInt4237, Static123.anInt2686, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0]);
		} else if (Static191.anInt4237 != Static18.anInt383) {
			Static18.anInt383 = Static191.anInt4237;
			Static196.method3170(Static191.anInt4237);
			Static182.method2999();
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
	public static void method1436() {
		Static77.anInt1732 = Static146.anInt3163;
		Static154.method2516(false);
		Static191.method3118();
		Static222.method2941(Static77.anInt1732);
		Static204.aClass5_Sub5_Sub1_2 = new Class5_Sub5_Sub1();
		Static204.aClass5_Sub5_Sub1_2.anInt3044 = 3000;
		Static204.aClass5_Sub5_Sub1_2.anInt3021 = 3000;
		Static180.method3733(Static169.aClass28_Sub1_97);
		Static52.method1046(10);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method1440(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static180.aBoolean444) {
			try {
				@Pc(25) Class16 local25 = (Class16) Class.forName("Class16_Sub1").getDeclaredConstructor().newInstance();
				local25.method1726(arg0);
				return local25;
			} catch (@Pc(34) Throwable local34) {
				Static180.aBoolean444 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1 method1459() {
		@Pc(9) byte[] local9 = Static158.aByteArrayArray7[0];
		@Pc(17) int local17 = Static172.anIntArray329[0] * Static141.anIntArray266[0];
		@Pc(70) Class1_Sub2_Sub2_Sub1 local70;
		if (Static169.aBooleanArray23[0]) {
			@Pc(76) byte[] local76 = Static159.aByteArrayArray8[0];
			@Pc(79) int[] local79 = new int[local17];
			for (@Pc(81) int local81 = 0; local81 < local17; local81++) {
				local79[local81] = (local76[local81] & 0xFF) << 24 | Static169.anIntArray324[local9[local81] & 0xFF];
			}
			local70 = new Class1_Sub2_Sub2_Sub1_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[0], Static223.anIntArray373[0], Static141.anIntArray266[0], Static172.anIntArray329[0], local79);
		} else {
			@Pc(29) int[] local29 = new int[local17];
			for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
				local29[local31] = Static169.anIntArray324[local9[local31] & 0xFF];
			}
			local70 = new Class1_Sub2_Sub2_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[0], Static223.anIntArray373[0], Static141.anIntArray266[0], Static172.anIntArray329[0], local29);
		}
		Static158.method2564();
		return local70;
	}
}
