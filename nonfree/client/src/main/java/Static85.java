import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!j", name = "F", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_685 = Static161.method2452(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	public static int anInt1875 = 0;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "[I")
	public static final int[] anIntArray183 = new int[4096];

	@OriginalMember(owner = "client!j", name = "M", descriptor = "I")
	public static int anInt1876 = 0;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	public static int anInt1879 = 0;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_686 = Static161.method2452("headicons_pk");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
	public static void method1452() {
		Static3.anIntArray9 = null;
		Static146.anIntArray320 = null;
		Static153.anIntArray337 = null;
		Static210.anIntArray84 = null;
		Static5.anIntArray10 = null;
		Static191.aByteArrayArray9 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!mf;I)Lclient!dc;")
	public static Class20 method1453(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1) {
		if (!Static118.method2465(Static94.method1538(arg1), arg0) && arg1.anObjectArray27 == null) {
			return null;
		} else if (arg1.aClass20Array19 == null || arg0 >= arg1.aClass20Array19.length || arg1.aClass20Array19[arg0] == null || arg1.aClass20Array19[arg0].method580().method582() == 0) {
			return Static148.aBoolean130 ? Static70.method1166(new Class20[] { Static88.aClass20_694, Static132.method2805(arg0) }) : null;
		} else {
			return arg1.aClass20Array19[arg0];
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method1454(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static50.method886(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local37);
			return Static79.method1390(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!wa;II)Lclient!jc;")
	public static Class47 method1456(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1) {
		return Static167.method2532(arg1, arg0, 0) ? Static17.method287() : null;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(Z)V")
	public static void method1457() {
		Static154.aClass5_Sub11_Sub2_2.method1632();
		Static172.aClass23_68 = null;
		Static92.anInt1963 = 1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!mf;I)Lclient!mf;")
	public static Class69 method1458(@OriginalArg(0) Class69 arg0) {
		@Pc(7) Class69 local7 = Static8.method191(arg0);
		if (local7 == null) {
			local7 = arg0.aClass69_10;
		}
		return local7;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V")
	public static void method1459() {
		Static133.anIntArray302 = new int[104];
		Static56.anInt1162 = 99;
		Static58.anIntArray126 = new int[104];
		Static8.anIntArray15 = new int[104];
		Static110.anIntArray256 = new int[104];
		Static76.anIntArray149 = new int[104];
		Static128.aByteArrayArrayArray10 = new byte[4][104][104];
		Static83.aByteArrayArrayArray5 = new byte[4][104][104];
		Static168.aByteArrayArrayArray14 = new byte[4][104][104];
		Static93.aByteArrayArrayArray11 = new byte[4][104][104];
		Static105.anIntArrayArrayArray8 = new int[4][105][105];
		Static165.aByteArrayArrayArray9 = new byte[4][105][105];
	}
}
