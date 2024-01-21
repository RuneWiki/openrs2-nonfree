import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_858 = Static161.method2971(": ");

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "Lclient!ld;")
	public static Class47 aClass47_19 = new Class47(64);

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_859 = Static161.method2971("<col=ffff00>");

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	public static void method1916() {
		aClass13_858 = null;
		aClass13_859 = null;
		aClass47_19 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!oa;Z)V")
	public static void method1917(@OriginalArg(1) Class62 arg0, @OriginalArg(2) boolean arg1) {
		if (Static25.aClass62_2 != null) {
			try {
				Static25.aClass62_2.method2277();
			} catch (@Pc(8) Exception local8) {
			}
			Static25.aClass62_2 = null;
		}
		Static25.aClass62_2 = arg0;
		Static138.method2477(arg1);
		Static24.aClass1_Sub8_2 = null;
		Static59.anInt1837 = 0;
		Static173.aClass1_Sub8_5.anInt2195 = 0;
		Static129.aClass1_Sub2_Sub12_1 = null;
		while (true) {
			@Pc(37) Class1_Sub2_Sub12 local37 = (Class1_Sub2_Sub12) Static4.aClass45_1.method1982();
			if (local37 == null) {
				while (true) {
					local37 = (Class1_Sub2_Sub12) Static8.aClass45_2.method1982();
					if (local37 == null) {
						if (Static39.aByte3 != 0) {
							try {
								@Pc(92) Class1_Sub8 local92 = new Class1_Sub8(4);
								local92.method1643(4);
								local92.method1643(Static39.aByte3);
								local92.method1650(0);
								Static25.aClass62_2.method2281(4, local92.aByteArray27);
							} catch (@Pc(115) IOException local115) {
								try {
									Static25.aClass62_2.method2277();
								} catch (@Pc(120) Exception local120) {
								}
								Static30.anInt1095++;
								Static25.aClass62_2 = null;
							}
						}
						Static46.anInt1505 = 0;
						Static136.aLong116 = Static169.method2888();
						return;
					}
					Static70.aClass79_1.method2671(local37);
					Static101.aClass45_10.method1981(local37, local37.aLong158);
					Static94.anInt2744++;
					Static110.anInt3013--;
				}
			}
			Static29.aClass45_5.method1981(local37, local37.aLong158);
			Static118.anInt3129++;
			Static133.anInt3347--;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[[[I)V")
	public static void method1918(@OriginalArg(3) int[][][] arg0) {
		Static4.anInt118 = 4;
		Static101.anInt2832 = 104;
		Static90.anInt2623 = 104;
		Static170.aClass1_Sub10ArrayArrayArray35 = new Class1_Sub10[4][104][104];
		Static51.anIntArrayArrayArray2 = new int[4][105][105];
		Static114.anIntArrayArrayArray4 = arg0;
		Static168.method2879();
	}
}
